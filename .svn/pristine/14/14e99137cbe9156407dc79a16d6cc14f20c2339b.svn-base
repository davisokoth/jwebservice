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
import org.kemsa.kws.model.M_Product;

import com.google.inject.Inject;

public class COrderJsonRestService extends JsonWebServicePage {

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

	public COrderJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
		Long cOrderId = params.getAsLong(ID_KEY);
		C_Order corder = (C_Order) hcrud.retrieveById(C_Order.class, cOrderId);
		// hcrud.delete(corder);

	}

	@Override
	public void doGet(PageParameters params) {
		C_Order corder = null;
		// return all if no params
		if (params.isEmpty()) {
			//List<C_Order> corders = hcrud.retrieveAll(C_Order.class);
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			//this.setDefaultModel(new Model(new ArrayList(corders)));
			return;
		}

		Long partnerId = params.getAsLong(PARTNER_KEY);
		if (partnerId != null) {
			List<C_Order> lstAllOrders = hcrud.retrieveAll(C_Order.class);

			List<C_Order> lstFacilityOrders = new ArrayList<C_Order>();
			for (int i = 0; i < lstAllOrders.size(); i++) {
				C_Order orderLocal = lstAllOrders.get(i);
				if (orderLocal.getcBpartnerId() == partnerId.longValue()) {
					lstFacilityOrders.add(orderLocal);
				}

			}
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(lstFacilityOrders)));
			return;

		}

		Long cOrderId = params.getAsLong(ID_KEY);
		String documentno = params.getString(DOCUMENTNO_KEY);
		String externalno = params.getString(EXTERNALNO_KEY);

		if (cOrderId != null) {
			corder = (C_Order) hcrud.retrieveById(C_Order.class, cOrderId);
		}

		if (corder == null && documentno != null) {
			corder = (C_Order) hcrud.retrieveByDocNo(C_Order.class, documentno);
		}

		if (corder == null && externalno != null) {
			corder = (C_Order) hcrud.retrieveByExtNo(C_Order.class, externalno);
		}

		if (corder != null) {
			this.setDefaultModel(new Model(corder));
			return;
		}

	}

	@Override
	public void doPost(PageParameters params) {

		C_Order order = new C_Order();
		boolean save = true;
		JSONObject orderJson = null;
		try {
			orderJson = new JSONObject(params.getString("order"));
		} catch (JSONException e) {
			e.printStackTrace();
		}

		// Predefined variables
		Double zero = new Double(0);
		BigDecimal bigZero = new BigDecimal(0);
		Long ad_org_id = 1000000L;
		Long lmis_order_id = null;
		Long ad_client_id = 1000000L;
		Long m_pricelist_id = 1000001L;
		Long ad_user_id = 1003446L;
		Timestamp now = new Timestamp(new Date().getTime());
		Long c_paymentterm_id = 1000000L;
		Long c_doctypetarget_id = 1000032L;
		Long c_tax_id = 1000000L;
		Long c_currency_id = 266L;

		Long c_bpartner_id = null;
		Long c_bpartner_location_id = null;
		Long atl_sourceoffunds_id = null;
		Long m_warehouse_id = null;
		String description = null;
		Double total = null;
		try {
			c_bpartner_id = orderJson.getLong("c_bpartner_id");
			c_bpartner_location_id = orderJson
					.getLong("c_bpartner_location_id");
			atl_sourceoffunds_id = orderJson.getLong("atl_sourceoffunds_id");
			description = orderJson.getString("description");
			lmis_order_id = orderJson.getLong("lmis_order_id");
			total = orderJson.getDouble("total");
			m_warehouse_id = orderJson.getLong("m_warehouse_id");
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (c_bpartner_id == null || c_bpartner_location_id == null
				|| lmis_order_id == null || atl_sourceoffunds_id == null
				|| total == null || m_warehouse_id == null) {
			save = false;
		} else {
			if (c_bpartner_id.equals(zero)
					|| c_bpartner_location_id.equals(zero)
					|| atl_sourceoffunds_id.equals(zero)
					|| m_warehouse_id.equals(zero)) {
				save = false;
			}
		}

		JSONArray lineArray = orderJson.optJSONArray("items");
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
					PreparedStatement st = connection
							.prepareStatement("SELECT nextid(232,'N');");

					ResultSet rs = st.executeQuery();
					if (rs.next()) {
						orderId = rs.getLong(1);
					}

					st = connection
							.prepareStatement("SELECT nextdocno(1000214,'N');");
					rs = st.executeQuery();
					if (rs.next()) {
						docno = rs.getLong(1);
					}
				}
			});
			tx.commit();
			sess.close();
			sessionFactory.close();

			/* Populate order */
			order.setCOrderId(orderId);
			order.setPricelistId(m_pricelist_id);// to be checked
			order.setAdClientId(ad_client_id);
			order.setAdOrgId(ad_org_id);
			order.setDocumentno(docno.toString());
			order.setLmisBatchId(lmis_order_id);
			order.setCreatedby(ad_user_id);// LMIS user
			order.setCreated(now);
			order.setUpdatedby(ad_user_id);// LMIS user
			order.setUpdated(now);
			order.setIsactive('Y');
			order.setPriorityrule('5');
			order.setDeliveryrule('A');
			order.setFreightcostrule('I');
			order.setDeliveryviarule('P');
			order.setIssotrx('Y');
			order.setInvoicerule('D');
			order.setPaymentTermId(c_paymentterm_id);
			order.setPaymentrule('S');
			order.setDocstatus("CO");
			order.setProcessed('Y');
			order.setCurrencyId(266L);
			order.setPaymentrule('B');
			order.setDocaction("CL");
			order.setSalesrepId(ad_user_id);
			order.setDoctypeId(0L);
			order.setDoctypeTargetId(c_doctypetarget_id);
			order.setcBpartnerId(c_bpartner_id);
			order.setDateordered(now);
			order.setDateacct(now);
			order.setcBpartnerlocationId(c_bpartner_location_id);
			order.setWarehouseId(m_warehouse_id);
			order.setSourceoffundsId(atl_sourceoffunds_id);
			order.setDescription(description);
			order.setGrandtotal(new BigDecimal(total));
			order.setTotallines(new BigDecimal(total));
			hcrud.create(order);

			// Save Orderlines
			for (int i = 0; i < lineArray.length(); i++) {
				JSONObject lineJson = lineArray.optJSONObject(i);

				C_OrderLine line = new C_OrderLine();

				boolean saveLine = true;

				sess = sessionFactory.openSession();
				tx = sess.beginTransaction();
				sess.doWork(new Work() {

					public void execute(Connection connection)
							throws SQLException {
						// TODO Auto-generated method stub
						PreparedStatement st = connection
								.prepareStatement("SELECT nextid(233,'N');");

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
				Double qty = null;
				Double unitPrice = null;
				Double lineAmt = null;

				try {
					m_product_id = lineJson.getLong("m_product_id");
					c_uom_id = lineJson.getLong("c_uom_id");
					qty = lineJson.getDouble("qty");
					unitPrice = lineJson.getDouble("unitprice");
					lineAmt = lineJson.getDouble("lineamt");
				} catch (JSONException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				if (m_product_id == null || c_uom_id == null || qty == null
						|| unitPrice == null || lineAmt == null) {
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
					line.setCOrderlineId(line_id);
					line.setLine((i + 1) * 10);
					line.setOrder(order);
					line.setAdClientId(ad_client_id);
					line.setAdOrgId(ad_org_id);
					line.setCreatedby(ad_user_id);
					line.setCreated(now);
					line.setUpdatedby(ad_user_id);
					line.setUpdated(now);
					line.setIsactive('Y');
					line.setProduct(product);
					line.setCuomId(c_uom_id);
					line.setDateordered(now);
					line.setQtyordered(new BigDecimal(qty));
					line.setQtyentered(new BigDecimal(qty));
					line.setPriceactual(new BigDecimal(unitPrice));
					line.setPriceentered(new BigDecimal(unitPrice));
					line.setLinenetamt(new BigDecimal(lineAmt));
					line.setCtaxId(c_tax_id);
					line.setCurrencyId(c_currency_id);
					line.setAtlSourceoffundsId(atl_sourceoffunds_id);
					line.setWarehouseId(m_warehouse_id);

					// Unused
					line.setQtyreserved(bigZero);
					line.setQtydelivered(bigZero);
					line.setQtyinvoiced(bigZero);
					line.setPricelist(bigZero);
					line.setPricelimit(bigZero);
					line.setFreightamt(bigZero);
					line.setPriceentered(bigZero);
					line.setQtylostsales(bigZero);

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
