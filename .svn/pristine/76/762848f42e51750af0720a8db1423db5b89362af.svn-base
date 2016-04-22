package org.kemsa.kws.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.kemsa.kws.util.Util;

import com.google.inject.Provider;

public class HSFProviderERP implements Provider<SessionFactory> {

	public SessionFactory get() {
		SessionFactory sessionFactory;
		AnnotationConfiguration cfg;
		Properties props = Util.getHibernateERPProps();
		cfg = new AnnotationConfiguration();
		cfg.addPackage("org.kemsa.erp.model");
		cfg.addAnnotatedClass(org.kemsa.kws.model.C_UOM.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.C_Order.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.C_OrderLine.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.M_Product.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.C_BPartner.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.M_Productprice.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.ATL_FacilityDrights.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.ATL_FacilityDrightsLine.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.M_Storage.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.ATL_CRMCycles.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.ATL_CRMCyclesLine.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.M_Warehouse.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.ATL_SourceOfFunds.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.C_BPartner_Location.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.M_InOut.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.M_InOutLine.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.ATL_District.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.ATL_County.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.LMIS_OrderData.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.LMIS_Batch.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.LMIS_Order.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.LMIS_OrderLine.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.KEM_StocksByProduct_v.class);
		cfg.addAnnotatedClass(org.kemsa.kws.model.KEM_DCounties.class);
		cfg.setProperty("hibernate.dialect",
				props.getProperty("hibernate.dialect"));
		cfg.setProperty("hibernate.connection.url",
				props.getProperty("hibernate.connection.url"));
		cfg.setProperty("hibernate.connection.username",
				props.getProperty("hibernate.connection.username"));
		cfg.setProperty("hibernate.connection.password",
				props.getProperty("hibernate.connection.password"));
		cfg.setProperty("hibernate.connection.driver_class",
				props.getProperty("hibernate.connection.driver_class"));
		cfg.setProperty("hibernate.hbm2ddl.auto",
				props.getProperty("hibernate.hbm2ddl.auto"));
		sessionFactory = cfg.buildSessionFactory();
		return sessionFactory;
	}

}
