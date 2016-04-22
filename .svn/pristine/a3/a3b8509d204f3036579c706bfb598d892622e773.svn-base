package org.kemsa.kws.service.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.model.Model;
import org.innobuilt.wicket.rest.JsonWebServicePage;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.model.C_BPartner;

import com.google.inject.Inject;

public class CBPartnerJsonRestService extends JsonWebServicePage {

	public static final String ID_KEY = "id";
	public static final String NAME_KEY = "name";
	public static final String CODE_KEY = "code";

	@Inject
	private HCRUD hcrud;

	public CBPartnerJsonRestService(PageParameters params) {
		super(params);
		// I would prefer to only expose the fields I have annotated
		getBuilder().excludeFieldsWithoutExposeAnnotation();
	}

	@Override
	public void doDelete(PageParameters params) {
		Long cBPartnerId = params.getAsLong(ID_KEY);
		C_BPartner bpartner = (C_BPartner) hcrud.retrieveById(C_BPartner.class,
				cBPartnerId);
		// hcrud.delete(bpartner);

	}

	@Override
	public void doGet(PageParameters params) {
		C_BPartner bpartner = null;
		// return all if no params
		if (params.isEmpty()) {
			List<C_BPartner> bpartners = hcrud.retrieveAll(C_BPartner.class);
			// Convert List to ArrayList since wicket likes only serializable
			// objects
			this.setDefaultModel(new Model(new ArrayList(bpartners)));
			return;
		}

		Long cBPartnerId = params.getAsLong(ID_KEY);
		String name = params.getString(NAME_KEY);
		String code = params.getString(CODE_KEY);

		if (cBPartnerId != null) {
			bpartner = (C_BPartner) hcrud.retrieveById(C_BPartner.class,
					cBPartnerId);
		}

		if (bpartner == null && name != null) {
			bpartner = (C_BPartner) hcrud
					.retrieveByName(C_BPartner.class, name);
		}

		if (bpartner == null && code != null) {
			bpartner = (C_BPartner) hcrud
					.retrieveByCode(C_BPartner.class, code);
		}

		if (bpartner != null) {
			this.setDefaultModel(new Model(bpartner));
		}

	}

	@Override
	public void doPost(PageParameters params) {
		// hcrud.create((C_BPartner) this.getDefaultModelObject());
	}

	@Override
	public void doPut(PageParameters params) {
		C_BPartner bpartner = (C_BPartner) this.getDefaultModelObject();
		// Ensure that the id is null
		bpartner.setCBpartnerId(null);
		// hcrud.create(bpartner);
	}

}
