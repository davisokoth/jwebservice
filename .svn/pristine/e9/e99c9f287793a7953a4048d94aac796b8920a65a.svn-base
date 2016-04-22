package org.kemsa.kws.service.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.model.Model;
import org.innobuilt.wicket.rest.JsonWebServicePage;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.model.ATL_SourceOfFunds;
import org.kemsa.kws.model.C_UOM;
import org.kemsa.kws.model.M_Warehouse;

import com.google.inject.Inject;

public class SourceOfFundsJsonRestService extends JsonWebServicePage {

	public static final String ID_KEY = "id";
	public static final String NAME_KEY = "name";

	@Inject
	private HCRUD hcrud;

	public SourceOfFundsJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
		Long sourceOfFundsId = params.getAsLong(ID_KEY);
		ATL_SourceOfFunds sof = (ATL_SourceOfFunds) hcrud.retrieveById(
				ATL_SourceOfFunds.class, sourceOfFundsId);
		// hcrud.delete(uom);

	}

	@Override
	public void doGet(PageParameters params) {
		ATL_SourceOfFunds sof = null;
		// return all if no params
		if (params.isEmpty()) {
			List<ATL_SourceOfFunds> sofs = hcrud
					.retrieveAll(ATL_SourceOfFunds.class);
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(sofs)));
			return;
		}

		Long sofId = params.getAsLong(ID_KEY);
		String name = params.getString(NAME_KEY);

		if (sofId != null) {
			sof = (ATL_SourceOfFunds) hcrud.retrieveById(
					ATL_SourceOfFunds.class, sofId);
		}

		if (sof == null && name != null) {
			sof = (ATL_SourceOfFunds) hcrud.retrieveByName(
					ATL_SourceOfFunds.class, name);
		}

		if (sof != null) {
			this.setDefaultModel(new Model(sof));
		}

	}

	@Override
	public void doPost(PageParameters params) {
		// hcrud.create((C_UOM) this.getDefaultModelObject());
	}

	@Override
	public void doPut(PageParameters params) {
		ATL_SourceOfFunds warehouse = (ATL_SourceOfFunds) this
				.getDefaultModelObject();
		// Ensure that the id is null
		warehouse.setAtlSourceoffundsId(null);
		// hcrud.create(uom);
	}

}
