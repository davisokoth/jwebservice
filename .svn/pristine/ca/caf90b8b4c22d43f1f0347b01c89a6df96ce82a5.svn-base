package org.kemsa.kws.service.json;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.wicket.PageParameters;
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
import org.kemsa.kws.model.C_Order;
import org.kemsa.kws.model.C_OrderLine;
import org.kemsa.kws.model.LMIS_Order;
import org.kemsa.kws.model.LMIS_OrderLine;
import org.kemsa.kws.model.M_Product;

import com.google.inject.Inject;

public class LMISOrderJsonRestService extends JsonWebServicePage {

	public static final String ID_KEY = "id";
	public static final String DOCUMENTNO_KEY = "documentno";
	public static final String EXTERNALNO_KEY = "externalno";
	public static final String PARTNER_KEY = "partnerid";

	@Inject
	private HCRUD hcrud;

	@Inject
	@ErpDB
	private SessionFactory sessionFactory;
	private Long orderId;
	private Long docno;
	private Long line_id;

	public LMISOrderJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
		Long cOrderId = params.getAsLong(ID_KEY);
		LMIS_Order corder = (LMIS_Order) hcrud.retrieveById(LMIS_Order.class, cOrderId);
		// hcrud.delete(corder);

	}

	@Override
	public void doGet(PageParameters params) {
		LMIS_Order corder = null;
		// return all if no params
		if (params.isEmpty()) {
			List<LMIS_Order> corders = hcrud.retrieveAll(LMIS_Order.class);
			this.setDefaultModel(new Model(new ArrayList(corders)));
			
			return;
		}

		Long cOrderId = params.getAsLong(ID_KEY);
		String documentno = params.getString(DOCUMENTNO_KEY);
		if (cOrderId != null) {
			corder = (LMIS_Order) hcrud.retrieveById(LMIS_Order.class, cOrderId);
		}

		if (corder == null && documentno != null) {
			corder = (LMIS_Order) hcrud.retrieveByDocNo(LMIS_Order.class, documentno);
		}

		if (corder != null) {
			this.setDefaultModel(new Model(corder));
			return;
		}

	}

	@Override
	public void doPost(PageParameters params) {

		LMIS_Order order = new LMIS_Order();
		boolean save = true;
		JSONObject orderJson = null;
		try {
			orderJson = new JSONObject(params.getString("lmis_order"));
		} catch (JSONException e) {
			e.printStackTrace();
		}

		// Predefined variables
		Double zero = new Double(0);
		BigDecimal bigZero = new BigDecimal(0);
		Long ad_org_id = 1000000L;
		Long ad_client_id = 1000000L;
		Long m_pricelist_id = null;
		Timestamp now = new Timestamp(new Date().getTime());
		Long c_tax_id = 1000000L;
		Long c_currency_id = 266L;
		Long c_bpartner_id = null;
		Long m_warehouse_id = null;
		String externalno = null;
		String description = null;
		String ordertype = null;
		char ispaidbythirdparty = 'N';
		Long bill_bpartner_id = null;
		String poreference = null;
		Double total = null;
		try {
			c_bpartner_id = orderJson.getLong("c_bpartner_id");
			total = orderJson.getDouble("order_value");
			m_warehouse_id = orderJson.getLong("m_warehouse_id");
			externalno = orderJson.getString("external_no");
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (c_bpartner_id == null
				|| total == null) {
			save = false;
		} else {
			if (c_bpartner_id.equals(zero) 
					|| total.equals(zero)) {
				save = false;
			}
		} 

		JSONArray lineArray = orderJson.optJSONArray("orderLines");
		if (lineArray.length() == 0) {
			save = false;
		}

		System.out
				.println("############################### About to get to save");
		if (save) {
			System.out.println("############################### Here in save");
			// Get OrderId and docno from adempiere sequence table to avoid
			// conflicts
			Session sess = sessionFactory.openSession();
			Transaction tx = sess.beginTransaction();
			sess.doWork(new Work() {

				public void execute(Connection connection) throws SQLException {
					// TODO Auto-generated method stub
					PreparedStatement st = connection.prepareStatement("SELECT nextid(1000528,'N');");

					ResultSet rs = st.executeQuery();
					if (rs.next()) {
						orderId = rs.getLong(1);
					}
				}
			});
			tx.commit();
			sess.close();
			sessionFactory.close();

			/* Populate order */
			order.setLmisOrderId(orderId);
			order.setAdClientId(ad_client_id);
			order.setAdOrgId(ad_org_id);
			order.setDocumentno(docno.toString());
			order.setCreatedby(100L);// LMIS user
			order.setCreated(now);
			order.setUpdatedby(100L);// LMIS user
			order.setUpdated(now);
			order.setIsactive('Y');
			order.setIssotrx('Y');
			order.setDocstatus("CO");
			order.setProcessed('Y');
			order.setCurrencyId(266L);
			order.setDocaction("CL");
			order.setcBpartnerId(c_bpartner_id);
			order.setDescription(description);
			order.setGrandtotal(total);
			hcrud.create(order);

			// Save Orderlines
			
			for (int i = 0; i < lineArray.length(); i++) {
				JSONObject lineJson = lineArray.optJSONObject(i);

				LMIS_OrderLine line = new LMIS_OrderLine();

				boolean saveLine = true;

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
							line_id = rs.getLong(1);
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

				try {
					m_product_id = lineJson.getLong("m_product_id");
					c_uom_id = lineJson.getLong("c_uom_id");
					qtyordered = lineJson.getDouble("qty");
					priceactual = lineJson.getDouble("unitprice");
				} catch (JSONException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				if (m_product_id == null 
						|| c_uom_id == null 
						|| qtyordered == null
						|| priceactual == null) {
					saveLine = false;
				} else {
					if (m_product_id.equals(zero) || c_uom_id.equals(zero)) {
						saveLine = false;
					}
				}

				if (saveLine) {
					M_Product product = (M_Product) hcrud.retrieveById(
							M_Product.class, m_product_id);

					/* Populate orderline */
					line.setLmisOrderlineId(line_id);
					line.setLine((i + 1) * 10);
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
					// line.setCurrencyId(c_currency_id);
					
					// save line
					hcrud.create(line);
				}

			}
		}
	}

	@Override
	public void doPut(PageParameters params) {
	}

}
