package org.kemsa.kws.service.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.model.Model;
import org.innobuilt.wicket.rest.JsonWebServicePage;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.model.M_Productprice;

import com.google.inject.Inject;

public class MProductPriceJsonRestService extends JsonWebServicePage {

	@Inject
	private HCRUD hcrud;

	public MProductPriceJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
	}

	@Override
	public void doGet(PageParameters params) {
		M_Productprice prodcutPrice = null;
		// return all if no params
		if (params.isEmpty()) {
			List<M_Productprice> prices = hcrud
					.retrieveAll(M_Productprice.class);
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(prices)));
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
