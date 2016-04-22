package org.kemsa.kws.service.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.model.Model;
import org.innobuilt.wicket.rest.JsonWebServicePage;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.model.ATL_County;
import org.kemsa.kws.model.M_Product;

import com.google.inject.Inject;

public class ATLCountyJsonRestService extends JsonWebServicePage {

	public static final String ID_KEY = "id";
	public static final String NAME_KEY = "name";

	@Inject
	private HCRUD hcrud;

	public ATLCountyJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
		
	}

	@Override
	public void doGet(PageParameters params) {
		ATL_County county = null;
		// return all if no params
		if (params.isEmpty()) {
			List<ATL_County> countys = hcrud.retrieveAll(ATL_County.class);
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(countys)));
			return;
		}

		Long AtlCounty = params.getAsLong(ID_KEY);
		String name = params.getString(NAME_KEY);

		if (AtlCounty != null) {
			county = (ATL_County) hcrud.retrieveById(ATL_County.class,
					AtlCounty);
		}

		if (county == null && name != null) {
			county = (ATL_County) hcrud.retrieveByName(ATL_County.class, name);
		}

		if (county != null) {
			this.setDefaultModel(new Model(county));
		}

	}

	@Override
	public void doPost(PageParameters params) {
		// hcrud.create((ATL_County) this.getDefaultModelObject());
	}

	@Override
	public void doPut(PageParameters params) {
		
	}

}
