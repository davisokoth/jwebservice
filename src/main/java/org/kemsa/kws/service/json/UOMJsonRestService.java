package org.kemsa.kws.service.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.model.Model;
import org.innobuilt.wicket.rest.JsonWebServicePage;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.model.C_UOM;

import com.google.inject.Inject;

public class UOMJsonRestService extends JsonWebServicePage {

	public static final String ID_KEY = "id";
	public static final String NAME_KEY = "name";

	@Inject
	private HCRUD hcrud;

	public UOMJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
		Long uOMId = params.getAsLong(ID_KEY);
		C_UOM uom = (C_UOM) hcrud.retrieveById(C_UOM.class, uOMId);
		// hcrud.delete(uom);

	}

	@Override
	public void doGet(PageParameters params) {
		C_UOM uom = null;
		// return all if no params
		if (params.isEmpty()) {
			List<C_UOM> uoms = hcrud.retrieveAll(C_UOM.class);
			// Convert List to ArrayList since wicket likes only serializable objects
			this.setDefaultModel(new Model(new ArrayList(uoms)));
			return;
		}

		Long UOMId = params.getAsLong(ID_KEY);
		String name = params.getString(NAME_KEY);

		if (UOMId != null) {
			uom = (C_UOM) hcrud.retrieveById(C_UOM.class, UOMId);
		}

		if (uom == null && name != null) {
			uom = (C_UOM) hcrud.retrieveByName(C_UOM.class, name);
		}

		if (uom != null) {
			this.setDefaultModel(new Model(uom));
		}

	}

	@Override
	public void doPost(PageParameters params) {
		// hcrud.create((C_UOM) this.getDefaultModelObject());
	}

	@Override
	public void doPut(PageParameters params) {
		C_UOM uom = (C_UOM) this.getDefaultModelObject();
		// Ensure that the id is null
		uom.setCUomId(null);
		// hcrud.create(uom);
	}

}
