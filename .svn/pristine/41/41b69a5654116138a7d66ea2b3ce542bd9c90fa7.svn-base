package org.kemsa.kws;

import org.apache.wicket.Request;
import org.apache.wicket.Response;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebSession;

public class WebServiceSession extends WebSession {		

		public WebServiceSession(Request request, Response response) {
			super(request);
		}

		public static WebServiceSession get() {
			return (WebServiceSession) Session.get();
		}

}
