package org.kemsa.kws.service.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.model.Model;
import org.innobuilt.wicket.rest.JsonWebServicePage;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.model.ATL_FacilityDrights;

import com.google.inject.Inject;

public class FacilityDRightsJsonRestService extends JsonWebServicePage {

	public static final String ID_KEY = "id";
	public static final String PARTNER_KEY = "partnerid";

	@Inject
	private HCRUD hcrud;

	public FacilityDRightsJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
	}

	@Override
	public void doGet(PageParameters params) {
		ATL_FacilityDrights dright = null;
		// return all if no params
		if (params.isEmpty()) {
			List<ATL_FacilityDrights> drights = hcrud
					.retrieveAll(ATL_FacilityDrights.class);
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(drights)));
			return;
		}
		
		Long partnerId = params.getAsLong(PARTNER_KEY);
		if (partnerId != null) {
			List<ATL_FacilityDrights> drights = hcrud
					.retrieveAll(ATL_FacilityDrights.class);

			List<ATL_FacilityDrights> facilityDrights = new ArrayList<ATL_FacilityDrights>();
			for (int i = 0; i < drights.size(); i++) {
				ATL_FacilityDrights drightLocal = drights.get(i);
				if (drightLocal.getCBpartnerId() == partnerId.longValue()) {
					facilityDrights.add(drightLocal);
				}

			}
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(facilityDrights)));
			return;

		}

		Long drightId = params.getAsLong(ID_KEY);
		if (drightId != null) {
			dright = (ATL_FacilityDrights) hcrud.retrieveById(
					ATL_FacilityDrights.class, drightId);
		}

		if (dright != null) {
			this.setDefaultModel(new Model(dright));
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
