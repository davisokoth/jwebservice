package org.kemsa.kws.service.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.model.Model;
import org.hibernate.SessionFactory;
import org.innobuilt.wicket.rest.JsonWebServicePage;
import org.kemsa.kws.annotations.ErpDB;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.model.C_Order;
import org.kemsa.kws.model.M_InOut;

import com.google.inject.Inject;

public class MInOutJsonRestService extends JsonWebServicePage {

	public static final String ID_KEY = "id";
	public static final String DOCUMENTNO_KEY = "documentno";
	public static final String PARTNER_KEY = "partnerid";

	public static final String ORDERNO_KEY = "orderno";

	@Inject
	private HCRUD hcrud;

	@Inject
	@ErpDB
	private SessionFactory sessionFactory;

	public MInOutJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {

	}

	@Override
	public void doGet(PageParameters params) {
		M_InOut minout = null;
		// return all if no params
		if (params.isEmpty()) {

			return;
		}

		Long partnerId = params.getAsLong(PARTNER_KEY);
		if (partnerId != null) {
			List<M_InOut> lstAllDNotes = hcrud.retrieveAll(M_InOut.class);

			List<M_InOut> lstFacilityDNotes = new ArrayList<M_InOut>();
			for (int i = 0; i < lstAllDNotes.size(); i++) {
				M_InOut dNoteLocal = lstAllDNotes.get(i);
				if (dNoteLocal.getcBpartnerId() == partnerId.longValue()) {
					lstFacilityDNotes.add(dNoteLocal);
				}

			}
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(lstFacilityDNotes)));
			return;

		}

		String orderno = params.getString(ORDERNO_KEY);
		C_Order order = null;
		if (orderno != null) {
			order = (C_Order) hcrud.retrieveByDocNo(C_Order.class, orderno);
		}
		if (order != null) {
			List<M_InOut> lstOrderDNotes = hcrud.retrieveByOrder(M_InOut.class,
					order.getCOrderId().longValue());			
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(lstOrderDNotes)));
			
			return;

		}

		Long mInOutId = params.getAsLong(ID_KEY);
		String documentno = params.getString(DOCUMENTNO_KEY);

		if (mInOutId != null) {
			minout = (M_InOut) hcrud.retrieveById(C_Order.class, mInOutId);
		}

		if (minout == null && documentno != null) {
			minout = (M_InOut) hcrud.retrieveByDocNo(M_InOut.class, documentno);
		}

		if (minout != null) {
			this.setDefaultModel(new Model(minout));
			return;
		}

	}

	@Override
	public void doPost(PageParameters params) {

	}

	@Override
	public void doPut(PageParameters params) {

	}
}
