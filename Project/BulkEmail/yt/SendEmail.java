package Mail.hit.day41;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public static void sendMail(String recepient) throws Exception{
		System.out.println("Preparing to send mail");
		Properties properties =new Properties();
		
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable","true");
		properties.put("mail.smtp.host","smtp.gmail.com");
		properties.put("mail.smtp.port","587");
		
		String myAccountEmail = "xxxxxxxxx@gmail.com";
		String password = "xxxxxxxxx";
		
		Session session = Session.getInstance(properties, new Authenticator() {
		@Override
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(myAccountEmail, password);
		}
		});
		
		Message message = prepareMessage(session, myAccountEmail, recepient);
		
		Transport.send(message);
		System.out.println("Email Sent Successfully...");

	}
	
	private static Message prepareMessage(Session session,String myAccountEmail,String recepient) {
		try {
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(myAccountEmail) );
		message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
		message.setSubject("My First Email Program....");
		message.setText("Hello There....");
		return message;
		
	}catch (Exception ex) {
		Logger.getLogger(SendEmail.class.getName()).log(Level.SEVERE,null,ex);
	}
	return null;
	}	
}
	