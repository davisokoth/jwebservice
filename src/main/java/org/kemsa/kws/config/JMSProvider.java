/**
 * 
 */
package org.kemsa.kws.config;

import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import org.kemsa.kws.util.Util;

import com.google.inject.Provider;

/**
 * @author laban
 * 
 */
public class JMSProvider implements Provider<Session> {
	private Properties props = Util.getJavaMailProps();

	public Session get() {

		Session mailSession = Session.getDefaultInstance(props,
				new SMTPAuthenticator());
		mailSession.setDebug(true);

		return mailSession;
	}

	class SMTPAuthenticator extends javax.mail.Authenticator {
		private final String SMTP_AUTH_USER = props
				.getProperty("mail.smtp.user");
		private final String SMTP_AUTH_PWD = props
				.getProperty("mail.smtp.password");

		public PasswordAuthentication getPasswordAuthentication() {
			String username = SMTP_AUTH_USER;
			String password = SMTP_AUTH_PWD;
			return new PasswordAuthentication(username, password);
		}
	}
}
