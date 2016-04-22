package org.kemsa.kws.service.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.model.Model;
import org.innobuilt.wicket.rest.JsonWebServicePage;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.model.C_UOM;
import org.kemsa.kws.model.M_Warehouse;

import com.google.inject.Inject;

public class WarehouseJsonRestService extends JsonWebServicePage {

	public static final String ID_KEY = "id";
	public static final String NAME_KEY = "name";

	@Inject
	private HCRUD hcrud;

	public WarehouseJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
		Long warehouseId = params.getAsLong(ID_KEY);
		M_Warehouse warehouse = (M_Warehouse) hcrud.retrieveById(
				M_Warehouse.class, warehouseId);
		// hcrud.delete(uom);

	}

	@Override
	public void doGet(PageParameters params) {
		M_Warehouse warehouse = null;
		// return all if no params
		if (params.isEmpty()) {
			List<M_Warehouse> warehouses = hcrud.retrieveAll(M_Warehouse.class);
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(warehouses)));
			return;
		}

		Long warehouseId = params.getAsLong(ID_KEY);
		String name = params.getString(NAME_KEY);

		if (warehouseId != null) {
			warehouse = (M_Warehouse) hcrud.retrieveById(M_Warehouse.class,
					warehouseId);
		}

		if (warehouse == null && name != null) {
			warehouse = (M_Warehouse) hcrud.retrieveByName(M_Warehouse.class,
					name);
		}

		if (warehouse != null) {
			this.setDefaultModel(new Model(warehouse));
		}

	}

	@Override
	public void doPost(PageParameters params) {
		// hcrud.create((C_UOM) this.getDefaultModelObject());
	}

	@Override
	public void doPut(PageParameters params) {
		M_Warehouse warehouse = (M_Warehouse) this.getDefaultModelObject();
		// Ensure that the id is null
		warehouse.setMWarehouseId(null);
		// hcrud.create(uom);
	}

}
