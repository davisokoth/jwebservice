package org.kemsa.kws.service.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.model.Model;
import org.innobuilt.wicket.rest.JsonWebServicePage;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.model.ATL_CRMCycles;

import com.google.inject.Inject;

public class CyclesJsonRestService extends JsonWebServicePage {

	public static final String ID_KEY = "id";
	@Inject
	private HCRUD hcrud;

	public CyclesJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
		Long cycleId = params.getAsLong(ID_KEY);
		ATL_CRMCycles cycle = (ATL_CRMCycles) hcrud.retrieveById(
				ATL_CRMCycles.class, cycleId);
		// hcrud.delete(cycle);

	}

	@Override
	public void doGet(PageParameters params) {
		ATL_CRMCycles cycle = null;
		// return all if no params
		if (params.isEmpty()) {
			List<ATL_CRMCycles> cycles = hcrud.retrieveAll(ATL_CRMCycles.class);
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(cycles)));
			return;
		}

		Long cycleId = params.getAsLong(ID_KEY);

		if (cycleId != null) {
			cycle = (ATL_CRMCycles) hcrud.retrieveById(ATL_CRMCycles.class,
					cycleId);
		}

		if (cycle != null) {
			this.setDefaultModel(new Model(cycle));
		}
	}

	@Override
	public void doPost(PageParameters params) {
	}

	@Override
	public void doPut(PageParameters params) {
	}

}
