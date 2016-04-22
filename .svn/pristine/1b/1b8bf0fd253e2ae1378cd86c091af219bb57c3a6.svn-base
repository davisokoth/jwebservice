package org.kemsa.kws.util;

import java.io.IOException;
import java.util.Properties;

import javax.ws.rs.core.MultivaluedMap;

import org.json.JSONObject;
import org.kemsa.kws.WebServiceApp;
import org.kemsa.kws.rest.RequestMethod;
import org.kemsa.kws.rest.RestClient;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class Util {

	public Util() {

	}

	public static Properties getHibernateERPProps() {
		Properties props = new Properties();
		try {
			props.load(WebServiceApp.class.getResourceAsStream("/hibernate-wms.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}

	public static Properties getJavaMailProps() {
		Properties props = new Properties();
		try {
			props.load(WebServiceApp.class.getResourceAsStream("/javamail.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
	
	public static Properties getAppConfigProps() {
		Properties props = new Properties();
		try {
			props.load(WebServiceApp.class.getResourceAsStream("/appconfig.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}

	public static String getWebResource(String url, String paramName, String paramValue) {
		
		String responseString = null;
		String baseurlString = url;
		Client client = Client.create();

		WebResource webResource = client.resource(baseurlString);
		MultivaluedMap queryParams = null;
		if (paramName != null && paramValue != null) {
			queryParams = new MultivaluedMapImpl();
			queryParams.add(paramName, paramValue);
			responseString = webResource.queryParams(queryParams)
					.accept("json").get(String.class);
		} else {
			ClientResponse response = 
				webResource.accept("application/json").get(ClientResponse.class);
			if (response.getStatus() == 404) {
				   throw new RuntimeException("Failed : HTTP error code: "
					+ response.getStatus());
			}
			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code: "
				+ response.getStatus());
			}
			responseString = response.getEntity(String.class);
		}

		return responseString;
	}

	public static String postToWebService(String url, String paramName,
			JSONObject paramVal) {
		
		System.out.println("########################"+paramVal);

		String responseString = null;

		String baseurlString = url;

		RestClient client = new RestClient(baseurlString);
		client.AddParam(paramName, paramVal.toString());

		try {
			client.Execute(RequestMethod.POST);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		responseString = client.getResponse();

		return responseString;
	}
}
