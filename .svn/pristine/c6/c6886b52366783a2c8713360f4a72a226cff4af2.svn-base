package org.kemsa.kws.service.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.model.Model;
import org.innobuilt.wicket.rest.JsonWebServicePage;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.model.C_BPartner_Location;
import org.kemsa.kws.model.C_UOM;
import org.kemsa.kws.model.M_Warehouse;

import com.google.inject.Inject;

public class CBPartnerLocationJsonRestService extends JsonWebServicePage {

	public static final String ID_KEY = "id";
	public static final String PARTNER_ID_KEY = "name";

	@Inject
	private HCRUD hcrud;

	public CBPartnerLocationJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
		Long bplocId = params.getAsLong(ID_KEY);
		C_BPartner_Location warehouse = (C_BPartner_Location) hcrud
				.retrieveById(C_BPartner_Location.class, bplocId);
		// hcrud.delete(uom);

	}

	@Override
	public void doGet(PageParameters params) {
		C_BPartner_Location bpLoc = null;
		// return all if no params
		if (params.isEmpty()) {
			List<C_BPartner_Location> bpLocs = hcrud
					.retrieveAll(C_BPartner_Location.class);
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(bpLocs)));
			return;
		}
		Long partnerId = params.getAsLong(PARTNER_ID_KEY);
		if (partnerId != null) {
			List<C_BPartner_Location> bpLocs = hcrud.retrieveByOwner(
					C_BPartner_Location.class, partnerId);
			this.setDefaultModel(new Model(new ArrayList(bpLocs)));
			return;
		}

		Long bpLocId = params.getAsLong(ID_KEY);
		if (bpLocId != null) {
			bpLoc = (C_BPartner_Location) hcrud.retrieveById(
					C_BPartner_Location.class, bpLocId);
		}

		if (bpLoc != null) {
			this.setDefaultModel(new Model(bpLoc));
		}

	}

	@Override
	public void doPost(PageParameters params) {
		// hcrud.create((C_UOM) this.getDefaultModelObject());
	}

	@Override
	public void doPut(PageParameters params) {
		C_BPartner_Location bpLoc = (C_BPartner_Location) this
				.getDefaultModelObject();
		// Ensure that the id is null
		bpLoc.setCBpartnerLocationId(null);
		// hcrud.create(uom);
	}

}
