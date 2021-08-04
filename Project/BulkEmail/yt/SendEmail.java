package Mail.hit.day41;

import java.util.Properties;
import java.util.StringTokenizer;
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
		
		
		String myAccountEmail = "xxxxxxxxxxx@gmail.com";
		String password = "xxxxxxxxxx";
		
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
		    StringTokenizer st = new StringTokenizer(recepient, "@");
		    String recepientname = st.nextToken();
		    System.out.println("Fetching Username..........."+"\nSent to "+recepientname+"");
		  
		message.setSubject("My First Email Program....");
		message.setText("Dear "+ recepientname +".\n"
		+"\t Greetings to you. I hope you are at the best of your health."
		+"\n Welcome to My Github Account - https://github.com/Aslam-web/EmailApplication"
		+"\n\n\n\n Thanks & Regards"+"\n Mr.M.N Aslam,"
		+"\n Java Developer Trainer,"
		+"\n Haaris Infotech Institutions,"
		+"\n Email : aslam1qqqq@gmail.com,"
		+"\n Phone: +91 63799 71782." );
		return message;
		
	}catch (Exception ex) {
		Logger.getLogger(SendEmail.class.getName()).log(Level.SEVERE,null,ex);
	}
	return null;
	}	
}
	
