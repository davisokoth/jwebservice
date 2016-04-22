package org.kemsa.kws.service.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.model.Model;
import org.innobuilt.wicket.rest.JsonWebServicePage;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.model.C_BPartner;
import org.kemsa.kws.model.KEM_StocksByProduct_v;

import com.google.inject.Inject;

public class KEMStocksByProductJsonRestService extends JsonWebServicePage {

	public static final String ID_KEY = "id";
	public static final String PRODUCT_KEY = "m_product_id";
	public static final String VALUE_KEY = "value";

	@Inject
	private HCRUD hcrud;

	public KEMStocksByProductJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
		
	}

	@Override
	public void doGet(PageParameters params) {
		KEM_StocksByProduct_v stock = null;
		// return all if no params
		if (params.isEmpty()) {
			List<KEM_StocksByProduct_v> stocks = hcrud.retrieveAll(KEM_StocksByProduct_v.class);
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(stocks)));
			return;
		}

		Long mProductId = params.getAsLong(PRODUCT_KEY);
		if (mProductId != null) {
			List<KEM_StocksByProduct_v> products = hcrud.retrieveAll(KEM_StocksByProduct_v.class);

			List<KEM_StocksByProduct_v> mProducts = new ArrayList<KEM_StocksByProduct_v>();
			for (int i = 0; i < products.size(); i++) {
				KEM_StocksByProduct_v current = products.get(i);
				if (current.getMProductID() == mProductId.longValue()) {
					mProducts.add(current);
				}

			}
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(mProducts)));
			return;

		}

		String code = params.getString(VALUE_KEY);

		if (mProductId != null) {
			stock = (KEM_StocksByProduct_v) hcrud.retrieveById(KEM_StocksByProduct_v.class,
					mProductId);
		}

		if (stock == null && code != null) {
			stock = (KEM_StocksByProduct_v) hcrud
					.retrieveByCode(KEM_StocksByProduct_v.class, code);
		}

		if (stock != null) {
			this.setDefaultModel(new Model(stock));
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
