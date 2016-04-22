package org.kemsa.kws.service.json;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.RequestCycle;
import org.apache.wicket.request.handler.*;
import org.apache.wicket.model.Model;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.jdbc.Work;
import org.innobuilt.wicket.rest.JsonWebServicePage;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.kemsa.kws.annotations.ErpDB;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.model.LMIS_Batch;
import org.kemsa.kws.model.LMIS_Order;
import org.kemsa.kws.model.LMIS_OrderLine;
import org.kemsa.kws.model.M_Product;
import org.kemsa.kws.util.SendMail;

import com.google.inject.Inject;

import org.apache.log4j.Logger;

public class LMISBatchJsonRestService extends JsonWebServicePage {

	public static final String ID_KEY = "id";
	public static final String BATCHNO_KEY = "batchno";
	public static final String BOOKINGNO_KEY = "bookingno";
	public static final String COUNTY_KEY = "countyid";

	@Inject
	private HCRUD hcrud;

	@Inject
	@ErpDB
	private SessionFactory sessionFactory;
	private Long lmisBatchId;
	private Long orderId = null;
	private Long orderlineId = null;
	private static final Logger logger = Logger.getLogger(LMISBatchJsonRestService.class);
	private String errMessage = null;

	public LMISBatchJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
		Long lmisBatchId = params.getAsLong(ID_KEY);
		LMIS_Batch lmisBatch = (LMIS_Batch) hcrud.retrieveById(LMIS_Batch.class, lmisBatchId);
		// hcrud.delete(corder);

	}

	@Override
	public void doGet(PageParameters params) {
		LMIS_Batch order = null;
		// return all if no params
		if (params.isEmpty()) {
			List<LMIS_Batch> orders = hcrud.retrieveAll(LMIS_Batch.class);
			this.setDefaultModel(new Model(new ArrayList(orders)));
			
			return;
		}

		Long llmisBatchId = params.getAsLong(ID_KEY);
		String documentno = params.getString(BATCHNO_KEY);
		if (llmisBatchId != null) {
			order = (LMIS_Batch) hcrud.retrieveById(LMIS_Batch.class, lmisBatchId);
		}

		if (order == null && documentno != null) {
			order = (LMIS_Batch) hcrud.retrieveByDocNo(LMIS_Batch.class, documentno);
		}

		if (order != null) {
			this.setDefaultModel(new Model(order));
			return;
		}

	}

	@Override
	public void doPost(PageParameters params) {

		LMIS_Batch batch = new LMIS_Batch();
		boolean save = true;
		JSONObject batchJson = null;
		try {
			batchJson = new JSONObject(params.getString("LMIS_Batch"));
		} catch (JSONException e) {
			e.printStackTrace();
			errMessage = e.getMessage();
		}

		// Predefined variables
		Double zero = new Double(0);
		Long ad_org_id = 1000000L;
		Long ad_client_id = 1000000L;
		Timestamp now = new Timestamp(new Date().getTime());
		Long atl_county_id = null;
		Long atlSourceOfFundsId = null;
		String description = null;
		String ordertype = null;
		char ispaidbythirdparty = 'N';
		String poreference = null;
		String documentno = null;
		String bookingno = null;
		Double grandtotal = null;
		Long m_warehouse_id = null;
		
		try {
			atl_county_id = batchJson.getLong("atl_county_id");
			atlSourceOfFundsId = batchJson.getLong("atl_sourceoffunds_id");
			description = batchJson.getString("description");
			BigDecimal bd = new BigDecimal(batchJson.getDouble("lpo_value")).setScale(2, RoundingMode.HALF_EVEN);
			grandtotal = bd.doubleValue();
			poreference = (batchJson.getString("lpo_no")=="")?null:batchJson.getString("lpo_no");
			ordertype = batchJson.getString("order_type");
			documentno = batchJson.getString("batch_no");
			bookingno = (batchJson.getString("booking_no")=="")?null:batchJson.getString("booking_no");
			m_warehouse_id = batchJson.getLong("m_warehouse_id");
			ispaidbythirdparty = batchJson.getString("is_third_party").charAt(0);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			errMessage = e1.getMessage();
		}
		if (atl_county_id == null 
				|| ordertype == null) {
			save = false;
			errMessage = "County ID is null";
		} else {
			if (atl_county_id.equals(zero)) {
				save = false;
				errMessage = "County ID = 0";
			}
		} 

		JSONArray orderArray = batchJson.optJSONArray("orders");
		if (orderArray.length() == 0) {
			save = false;
			errMessage = "The batch is empty";
		}

		if (save) {
			// Get OrderId and docno from adempiere sequence table to avoid
			// conflicts
			Session sess = sessionFactory.openSession();
			Transaction tx = sess.beginTransaction();
			sess.doWork(new Work() {

				public void execute(Connection connection) throws SQLException {
					// TODO Auto-generated method stub
					PreparedStatement st = connection.prepareStatement("SELECT nextid(1000530,'N');");

					ResultSet rs = st.executeQuery();
					if (rs.next()) {
						lmisBatchId = rs.getLong(1);
					}
				}
			});
			tx.commit();
			sess.close();
			sessionFactory.close();

			/* Populate order */
			batch.setLmisBatchId(lmisBatchId);
			batch.setAdClientId(ad_client_id);
			batch.setAdOrgId(ad_org_id);
			batch.setDocumentNo(documentno.toString());
			batch.setBookingNo(bookingno.toString());
			batch.setAtlSourceOffundsId(atlSourceOfFundsId);
			batch.setCreatedby(100L);// LMIS user
			batch.setCreated(now);
			batch.setUpdatedby(100L);// LMIS user
			batch.setUpdated(now);
			batch.setIsactive('Y');
			batch.setIssotrx('Y');
			batch.setDocstatus("DR");
			batch.setProcessed('N');
			batch.setProcessing('N');
			batch.setDocaction("CO");
			batch.setDateordered(now);
			batch.setIsClosed('N');
			batch.setDateReceived(now);
			batch.setDescription(description);
			batch.setGrandtotal(new BigDecimal(grandtotal));
			batch.setIsPaidByThirdParty(ispaidbythirdparty);
			batch.setPoreference(poreference);
			batch.setAtlCountyId(atl_county_id);
			batch.setOrdertype(ordertype);
			hcrud.create(batch);

			// Save Orders
			logger.warn("######### No of Orders available: " + orderArray.length());
			
			for (int i = 0; i < orderArray.length(); i++) {
				JSONObject orderJson = orderArray.optJSONObject(i);
				
				LMIS_Order order = new LMIS_Order();

				boolean saveLine = true;

				sess = sessionFactory.openSession();
				tx = sess.beginTransaction();
				sess.doWork(new Work() {

					public void execute(Connection connection){
						// TODO Auto-generated method stub
						try{
							PreparedStatement st = connection
									.prepareStatement("SELECT nextid(1000528,'N');");
	
							ResultSet rs = st.executeQuery();
							if (rs.next()) {
								orderId = rs.getLong(1);
							}
						}
						catch (SQLException sqle){
							sqle.printStackTrace();
							errMessage = sqle.getMessage();
						}
					}
				});
				tx.commit();
				sess.close();
				sessionFactory.close();

				Long c_bpartner_id = null;
				Double ordertotal = null;
				String odescription = null;
				String externalno = null;
				
				JSONArray orderLineArray = orderJson.optJSONArray("orderLines");
				logger.warn("Lines: " + orderLineArray.toString());
				if (orderLineArray.length() == 0) {
					saveLine = false;
					logger.warn("############################### Sorry, no orderlines found...");
					errMessage = "No lines found for one of the orders";
				}

				try {
					c_bpartner_id = orderJson.getLong("c_bpartner_id");
					ordertotal = orderJson.getDouble("order_value");
					externalno = orderJson.getString("external_no");
					
				} catch (JSONException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					errMessage = e1.getMessage();
				}

				if (c_bpartner_id == null 
						|| externalno == null 
						|| ordertotal == null) {
					saveLine = false;
					errMessage = "Fill mandatory fields : Orders";
				} else {
					if (c_bpartner_id.equals(zero) || ordertotal.equals(zero)) {
						saveLine = false;
						errMessage = "Fill mandatory fields: Orders";
					}
				}

				if (saveLine) {
					order.setLmisOrderId(orderId);
					order.setLmisBatchId(batch.getLmisBatchId());
					order.setAdClientId(ad_client_id);
					order.setAdOrgId(ad_org_id);
					order.setCreatedby(100L);
					order.setCreated(now);
					order.setUpdatedby(100L);
					order.setUpdated(now);
					order.setIsactive('Y');
					order.setIssotrx('Y');
					order.setCurrencyId(226L);
					order.setDocumentno(externalno);
					order.setcBpartnerId(c_bpartner_id);
					order.setMwarehouseId(m_warehouse_id);
					order.setGrandtotal(grandtotal);
					order.setDocaction("CO");
					order.setDocstatus("DR");
					order.setProcessing('N');
					order.setProcessed('N');
					
					// save order
					hcrud.create(order);
					
					// Now do the orderlines
					// Save OrderLines
					
					for (int x = 0; x < orderLineArray.length(); x++) {
						JSONObject lineJson = orderLineArray.optJSONObject(x);

						LMIS_OrderLine line = new LMIS_OrderLine();

						sess = sessionFactory.openSession();
						tx = sess.beginTransaction();
						sess.doWork(new Work() {

							public void execute(Connection connection)
									throws SQLException {
								// TODO Auto-generated method stub
								PreparedStatement st = connection
										.prepareStatement("SELECT nextid(1000529,'N');");

								ResultSet rs = st.executeQuery();
								if (rs.next()) {
									orderlineId = rs.getLong(1);
								}
							}
						});
						tx.commit();
						sess.close();
						sessionFactory.close();

						Long m_product_id = null;
						Long c_uom_id = null;
						Double qtyordered = null;
						Double priceactual = null;
						Long lineno = i*10L;
						Double lineNetAmt = null;

						try {
							m_product_id = lineJson.getLong("m_product_id");
							c_uom_id = lineJson.getLong("c_uom_id");
							qtyordered = lineJson.getDouble("qty");
							priceactual = lineJson.getDouble("unitprice");
						} catch (JSONException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
							errMessage =e1.getMessage(); 
						}

						if (m_product_id == null 
								|| c_uom_id == null 
								|| qtyordered == null) {
							saveLine = false;
						} else {
							if (m_product_id.equals(zero) || c_uom_id.equals(zero)) {
								saveLine = false;
								errMessage = "Fill mandatory fields : Order Lines";
							}
						}

						if (saveLine) {
							M_Product product = (M_Product) hcrud.retrieveById(M_Product.class, m_product_id);

							/* Populate orderline */
							line.setLmisOrderlineId(orderlineId);
							line.setLine((i + 1) * 10L);
							line.setLmisOrderId(order.getLmisOrderId());
							line.setAdClientId(ad_client_id);
							line.setAdOrgId(ad_org_id);
							line.setCreatedby(100L);
							line.setCreated(now);
							line.setUpdatedby(100L);
							line.setUpdated(now);
							line.setIsactive('Y');
							line.setProduct(product);
							line.setCuomId(c_uom_id);
							line.setQtyordered(new BigDecimal(qtyordered));
							line.setPriceactual(new BigDecimal(priceactual));
							line.setProcessed('N');
							BigDecimal linenetamt = new BigDecimal(Double.toString(qtyordered*priceactual));
							linenetamt = linenetamt.setScale(2, BigDecimal.ROUND_HALF_UP);
							line.setLineNetAmt(linenetamt);
							
							// save line
							hcrud.create(line);
						}

					}

				}
				if(atlSourceOfFundsId==100014){
					Session sess2 = sessionFactory.openSession();
					Transaction tx2 = sess2.beginTransaction();
					sess2.doWork(new Work() {
	
						public void execute(Connection connection) throws SQLException {
							// TODO Auto-generated method stub
							PreparedStatement st = connection.prepareStatement("SELECT lmis_engine(lmisBatchId);");
	
							ResultSet rs = st.executeQuery();
							if (rs.next()) {
								int noorders = rs.getInt(1);
								SendMail mail = new SendMail();
								mail.send("davis.okoth@kemsa.co.ke", "New LMIS Orders", 
										"A new LMIS order has been created and is awaiting processing");
							}
						}
					});
					tx2.commit();
					sess2.close();
					sessionFactory.close();
				}
			}
		} else {
			RequestCycle.get().scheduleRequestHandlerAfterCurrent(new TextRequestHandler("application/json","utf-8","Help!"));
		}
	}

	@Override
	public void doPut(PageParameters params) {
		
	}

}
