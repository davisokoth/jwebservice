package org.kemsa.kws.service.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.model.Model;
import org.innobuilt.wicket.rest.JsonWebServicePage;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.model.M_Product;

import com.google.inject.Inject;

public class MProductJsonRestService extends JsonWebServicePage {

	public static final String ID_KEY = "id";
	public static final String NAME_KEY = "name";
	public static final String CODE_KEY = "code";

	@Inject
	private HCRUD hcrud;

	public MProductJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
		Long mProductId = params.getAsLong(ID_KEY);
		M_Product product = (M_Product) hcrud.retrieveById(M_Product.class,
				mProductId);
		// hcrud.delete(uom);

	}

	@Override
	public void doGet(PageParameters params) {
		M_Product product = null;
		// return all if no params
		if (params.isEmpty()) {
			List<M_Product> products = hcrud.retrieveAll(M_Product.class);
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(products)));
			return;
		}

		Long mProductId = params.getAsLong(ID_KEY);
		String name = params.getString(NAME_KEY);
		String code = params.getString(CODE_KEY);

		if (mProductId != null) {
			product = (M_Product) hcrud.retrieveById(M_Product.class,
					mProductId);
		}

		if (product == null && name != null) {
			product = (M_Product) hcrud.retrieveByName(M_Product.class, name);
		}

		if (product == null && code != null) {
			product = (M_Product) hcrud.retrieveByCode(M_Product.class, code);
		}

		if (product != null) {
			this.setDefaultModel(new Model(product));
		}

	}

	@Override
	public void doPost(PageParameters params) {
		// hcrud.create((M_Product) this.getDefaultModelObject());
	}

	@Override
	public void doPut(PageParameters params) {
		M_Product product = (M_Product) this.getDefaultModelObject();
		// Ensure that the id is null
		product.setMProductId(null);
		// hcrud.create(uom);
	}

}
