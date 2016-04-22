package org.kemsa.kws.service.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.model.Model;
import org.innobuilt.wicket.rest.JsonWebServicePage;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.model.ATL_District;
import org.kemsa.kws.model.M_Product;

import com.google.inject.Inject;

public class ATLDistrictJsonRestService extends JsonWebServicePage {

	public static final String ID_KEY = "id";
	public static final String NAME_KEY = "name";

	@Inject
	private HCRUD hcrud;

	public ATLDistrictJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {

	}

	@Override
	public void doGet(PageParameters params) {
		ATL_District district = null;
		// return all if no params
		if (params.isEmpty()) {
			List<ATL_District> products = hcrud.retrieveAll(ATL_District.class);
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(products)));
			return;
		}

		Long atlDistrictId = params.getAsLong(ID_KEY);
		String name = params.getString(NAME_KEY);

		if (atlDistrictId != null) {
			district = (ATL_District) hcrud.retrieveById(ATL_District.class, atlDistrictId);
		}

		if (district == null && name != null) {
			district = (ATL_District) hcrud.retrieveByName(ATL_District.class, name);
		}
		
		if (district != null) {
			this.setDefaultModel(new Model(district));
		}

	}

	@Override
	public void doPost(PageParameters params) {
		// hcrud.create((ATL_District) this.getDefaultModelObject());
	}

	@Override
	public void doPut(PageParameters params) {
		ATL_District district = (ATL_District) this.getDefaultModelObject();
		// Ensure that the id is null
		district.setAtlDistrictId(null);
		// hcrud.create(uom);
	}

}
