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

public class COrderLineJsonRestService extends JsonWebServicePage {

	public static final String ID_KEY = "id";
	public static final String ORDER_KEY = "documentnc_order_id";

	@Inject
	private HCRUD hcrud;

	@Inject
	@ErpDB
	private SessionFactory sessionFactory;

	private Long orderId;
	private Long line_id;

	public COrderLineJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
		Long cOrderlineId = params.getAsLong(ID_KEY);
		C_OrderLine corderline = (C_OrderLine) hcrud.retrieveById(C_OrderLine.class, cOrderlineId);
		// hcrud.delete(corder);

	}

	@Override
	public void doGet(PageParameters params) {
		C_OrderLine corderline = null;
		// return all if no params
		if (params.isEmpty()) {
			List<C_OrderLine> corderlines = hcrud.retrieveAll(C_OrderLine.class);
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(corderlines)));
			return;
		}

		Long orderId = params.getAsLong(ORDER_KEY);
		if (orderId != null) {
			List<C_OrderLine> lstAllOrderLines = hcrud.retrieveAll(C_OrderLine.class);

			List<C_OrderLine> lstCurrentOrderLines = new ArrayList<C_OrderLine>();
			for (int i = 0; i < lstAllOrderLines.size(); i++) {
				C_OrderLine orderLineLocal = lstAllOrderLines.get(i);
				if (orderLineLocal.getOrder().getCOrderId() == orderId.longValue()) {
					lstCurrentOrderLines.add(orderLineLocal);
				}
			}
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(lstCurrentOrderLines)));
			return;

		}

		Long cOrderLineId = params.getAsLong(ID_KEY);
		if (cOrderLineId != null) {
			corderline = (C_OrderLine) hcrud.retrieveById(C_OrderLine.class, cOrderLineId);
		}

		if (corderline != null) {
			this.setDefaultModel(new Model(corderline));
			return;
		}

	}

	@Override
	public void doPost(PageParameters params) {

		C_OrderLine orderline = new C_OrderLine();
		boolean save = true;
		JSONObject orderJson = null;
		try {
			orderJson = new JSONObject(params.getString("orderline"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void doPut(PageParameters params) {
	}

}
