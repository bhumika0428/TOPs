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

public class EmailServices {

	
	public void sendmail(String email,int num)
	{
		final String username="bhumichauhan070@gmail.com";
		final String password="jslpqjzixxwpdpim";
		
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
				return new PasswordAuthentication(username, password);
			}
		});
		
		System.out.println("Session completed");
		try {
			//System.out.println("1");
			Message message=new MimeMessage(session);
			
			//System.out.println("2");
			message.setFrom(new InternetAddress(username));
			
			//System.out.println("3");
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
			
			System.out.println("4");
			message.setSubject("Hi This Register Confirmation.");
			message.setText("Hello This Is OTP for Verify Email:"+num);
			
			//System.out.println("5");
			Transport.send(message);
			
			//System.out.println("done");
			
			
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
				
				
	}
}
