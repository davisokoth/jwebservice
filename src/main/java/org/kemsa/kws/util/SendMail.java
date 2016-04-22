/**
 * 
 */
package org.kemsa.kws.util;

import java.io.UnsupportedEncodingException;

import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.google.inject.Inject;

/**
 * @author laban
 * 
 */
public class SendMail {
	@Inject
	private Session mailSession;

	public void send(String to, String subject, String text) {

		String from = Util.getJavaMailProps().getProperty("mail.smtp.user");
		Message simpleMessage = new MimeMessage(mailSession);

		InternetAddress fromAddress = null;
		InternetAddress toAddress = null;
		try {
			fromAddress = new InternetAddress(from, "kemsa");
			toAddress = new InternetAddress(to);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			simpleMessage.setFrom(fromAddress);
			simpleMessage.setRecipient(RecipientType.TO, toAddress);
			simpleMessage.setSubject(subject);
			simpleMessage.setText(text);			
			simpleMessage.saveChanges(); // don't forget this

			Transport bus = mailSession.getTransport("smtp");
			bus.connect();
			bus.send(simpleMessage);
			bus.close();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
