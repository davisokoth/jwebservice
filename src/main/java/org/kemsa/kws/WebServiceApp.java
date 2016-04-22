package org.kemsa.kws;

import org.apache.wicket.Request;
import org.apache.wicket.Response;
import org.apache.wicket.Session;
import org.apache.wicket.guice.GuiceComponentInjector;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.target.coding.QueryStringUrlCodingStrategy;
import org.apache.wicket.util.time.Duration;
import org.kemsa.kws.config.WebServiceModule;
import org.kemsa.kws.page.HomePage;
import org.kemsa.kws.service.json.ATLCountyJsonRestService;
import org.kemsa.kws.service.json.ATLDistrictJsonRestService;
import org.kemsa.kws.service.json.CBPartnerJsonRestService;
import org.kemsa.kws.service.json.CBPartnerLocationJsonRestService;
import org.kemsa.kws.service.json.COrderJsonRestService;
import org.kemsa.kws.service.json.CyclesJsonRestService;
import org.kemsa.kws.service.json.FacilityDRightsJsonRestService;
import org.kemsa.kws.service.json.KEMDCountiesJsonRestService;
import org.kemsa.kws.service.json.KEMStocksByProductJsonRestService;
import org.kemsa.kws.service.json.LMISBatchJsonRestService;
import org.kemsa.kws.service.json.LMISOrderDataJsonRestService;
import org.kemsa.kws.service.json.LMISOrderJsonRestService;
import org.kemsa.kws.service.json.LMISOrderLineJsonRestService;
import org.kemsa.kws.service.json.MInOutJsonRestService;
import org.kemsa.kws.service.json.MProductJsonRestService;
import org.kemsa.kws.service.json.MProductPriceJsonRestService;
import org.kemsa.kws.service.json.MStorageJsonRestService;
import org.kemsa.kws.service.json.SourceOfFundsJsonRestService;
import org.kemsa.kws.service.json.UOMJsonRestService;
import org.kemsa.kws.service.json.WarehouseJsonRestService;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

/**
 * Application object for your web application. If you want to run this
 * application without deploying, run the Start class.
 * 
 * @see org.kemsa.Start#main(String[])
 */
public class WebServiceApp extends WebApplication {
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	public Class<HomePage> getHomePage() {
		return HomePage.class;
	}

	@Override
	public void init() {
		super.init();

		getRequestCycleSettings().setTimeout(Duration.minutes(60));
		Injector inject = Guice.createInjector(Stage.PRODUCTION, new WebServiceModule());
		addComponentInstantiationListener(new GuiceComponentInjector(this, inject));

		// JSON Pages
		mount(new QueryStringUrlCodingStrategy("/json/uoms",
				UOMJsonRestService.class));

		mount(new QueryStringUrlCodingStrategy("/json/orders",
				COrderJsonRestService.class));
		
		mount(new QueryStringUrlCodingStrategy("/json/orderslines",
				COrderJsonRestService.class));
		
		mount(new QueryStringUrlCodingStrategy("/json/dnotes",
				MInOutJsonRestService.class));

		mount(new QueryStringUrlCodingStrategy("/json/products",
				MProductJsonRestService.class));

		mount(new QueryStringUrlCodingStrategy("/json/partners",
				CBPartnerJsonRestService.class));
		
		mount(new QueryStringUrlCodingStrategy("/json/prices",
				MProductPriceJsonRestService.class));
		
		mount(new QueryStringUrlCodingStrategy("/json/drights",
				FacilityDRightsJsonRestService.class));
		
		mount(new QueryStringUrlCodingStrategy("/json/stores",
				MStorageJsonRestService.class));
		
		mount(new QueryStringUrlCodingStrategy("/json/cycles",
				CyclesJsonRestService.class));
		
		mount(new QueryStringUrlCodingStrategy("/json/warehouses",
				WarehouseJsonRestService.class));
		
		mount(new QueryStringUrlCodingStrategy("/json/sofs",
				SourceOfFundsJsonRestService.class));
		
		mount(new QueryStringUrlCodingStrategy("/json/partnerlocations",
				CBPartnerLocationJsonRestService.class));
		
		mount(new QueryStringUrlCodingStrategy("/json/districts",
				ATLDistrictJsonRestService.class));
		
		mount(new QueryStringUrlCodingStrategy("/json/counties",
				ATLCountyJsonRestService.class));
		
		mount(new QueryStringUrlCodingStrategy("/json/stocks",
				KEMStocksByProductJsonRestService.class));
		
		mount(new QueryStringUrlCodingStrategy("/json/orderdata",
				LMISOrderDataJsonRestService.class));
		
		mount(new QueryStringUrlCodingStrategy("/json/lmisorder",
				LMISOrderJsonRestService.class));
		
		mount(new QueryStringUrlCodingStrategy("/json/lmisbatch",
				LMISBatchJsonRestService.class));
		
		mount(new QueryStringUrlCodingStrategy("/json/lmisorderline",
				LMISOrderLineJsonRestService.class));
		
		mount(new QueryStringUrlCodingStrategy("/json/dcounties",
				KEMDCountiesJsonRestService.class));
	}

	public static final WebServiceApp get() {
		return (WebServiceApp) WebApplication.get();
	}

	@Override
	public Session newSession(Request request, Response response) {
		return new WebServiceSession(request, response);
	}
}
