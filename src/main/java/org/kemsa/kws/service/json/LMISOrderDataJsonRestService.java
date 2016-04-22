package org.kemsa.kws.service.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.model.Model;
import org.innobuilt.wicket.rest.JsonWebServicePage;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.model.LMIS_OrderData;

import com.google.inject.Inject;

public class LMISOrderDataJsonRestService extends JsonWebServicePage {

	public static final String ID_KEY = "id";

	@Inject
	private HCRUD hcrud;

	public LMISOrderDataJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
		
	}

	@Override
	public void doGet(PageParameters params) {
		LMIS_OrderData order = null;
		// return all if no params
		if (params.isEmpty()) {
			List<LMIS_OrderData> orders = hcrud.retrieveAll(LMIS_OrderData.class);
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(orders)));
			return;
		}

		Long orderId = params.getAsLong(ID_KEY);
		if (orderId != null) {
			List<LMIS_OrderData> products = hcrud.retrieveAll(LMIS_OrderData.class);

			List<LMIS_OrderData> mOrders = new ArrayList<LMIS_OrderData>();
			for (int i = 0; i < products.size(); i++) {
				LMIS_OrderData current = products.get(i);
				if (current.getA1orderCountyId()== orderId.longValue()) {
					mOrders.add(current);
				}

			}
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(mOrders)));
			return;

		}

		
		if (order != null) {
			this.setDefaultModel(new Model(order));
		}

	}

	@Override
	public void doPost(PageParameters params) {
		// hcrud.create((C_BPartner) this.getDefaultModelObject());
	}

	@Override
	public void doPut(PageParameters params) {
		
	}

}
