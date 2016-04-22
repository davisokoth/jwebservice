package org.kemsa.kws.service.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.model.Model;
import org.innobuilt.wicket.rest.JsonWebServicePage;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.model.M_Storage;

import com.google.inject.Inject;

public class MStorageJsonRestService extends JsonWebServicePage {

	public static final String PRODUCT_KEY = "productid";

	@Inject
	private HCRUD hcrud;

	public MStorageJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
	}

	@Override
	public void doGet(PageParameters params) {
		// return all if no params
		if (params.isEmpty()) {
			List<M_Storage> stores = hcrud.retrieveAll(M_Storage.class);
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(stores)));
			return;
		}

		Long productId = params.getAsLong(PRODUCT_KEY);
		if (productId != null) {
			List<M_Storage> stores = hcrud.retrieveAll(M_Storage.class);

			List<M_Storage> productStores = new ArrayList<M_Storage>();
			for (int i = 0; i < stores.size(); i++) {
				M_Storage storeLocal = stores.get(i);
				if (storeLocal.getmProductId() == productId.longValue()) {
					productStores.add(storeLocal);
				}

			}
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(productStores)));
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
