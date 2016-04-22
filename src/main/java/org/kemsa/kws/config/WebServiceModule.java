package org.kemsa.kws.config;

import javax.mail.Session;

import org.hibernate.SessionFactory;
import org.kemsa.kws.annotations.ErpDB;
import org.kemsa.kws.data.HCRUD;
import org.kemsa.kws.data.HCRUDImpl;
import org.kemsa.kws.util.SendMail;

import com.google.inject.AbstractModule;


public class WebServiceModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(SessionFactory.class).annotatedWith(ErpDB.class).toProvider(HSFProviderERP.class);
		bind(Session.class).toProvider(JMSProvider.class);
		bind(HCRUD.class).to(HCRUDImpl.class);
		bind(SendMail.class);
	}

}
