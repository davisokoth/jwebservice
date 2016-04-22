package org.kemsa.kws.service.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.model.Model;
import org.innobuilt.wicket.rest.JsonWebServicePage;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.model.KEM_DCounties;
import org.kemsa.kws.model.KEM_StocksByProduct_v;

import com.google.inject.Inject;

public class KEMDCountiesJsonRestService extends JsonWebServicePage {

	public static final String ID_KEY = "id";
	
	@Inject
	private HCRUD hcrud;

	public KEMDCountiesJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
		
	}

	@Override
	public void doGet(PageParameters params) {
		KEM_DCounties district = null;
		// return all if no params
		if (params.isEmpty()) {
			List<KEM_DCounties> districts = hcrud.retrieveAll(KEM_DCounties.class);
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(districts)));
			return;
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
