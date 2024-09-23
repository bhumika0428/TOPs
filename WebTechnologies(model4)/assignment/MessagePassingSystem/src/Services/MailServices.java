package Services;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailServices {

	public void sendmassage(String recipient, String subject, String content)
	{
	final String senderEmail="bhumichauhan070@gmail.com";
	final String senderPassword="jslpqjzixxwpdpim";
	
	Properties props = new Properties();
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.starttls.enable", "true");
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.port", "587");
	props.put("mail.debug", "true");
	props.put("mail.smtp.starttls.required", "true");
	props.put("mail.smtp.ssl.protocols", "TLSv1.2");
	
	Session session=Session.getInstance(props, new Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication()
		{
			return new PasswordAuthentication(senderEmail, senderPassword);
		}
	});
	
	System.out.println("Session completed");
	try {
		
		Message message=new MimeMessage(session);
		message.setFrom(new InternetAddress(senderEmail));
    	message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
		message.setSubject(subject);
		System.out.println(content);
		message.setText(content);
		System.out.println(message);
		Transport.send(message);
		
	} catch (MessagingException e) {
		throw new RuntimeException(e);
	}
		System.out.println("done");	
			

}

}
