package readingJsonFiles;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendingEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String Recipient="maven7837@gmail.com";
		String Sender="maven7837@gmail.com";
		String host = "localhost";
		
		
		Properties propertiesobject=System.getProperties();
		propertiesobject.setProperty("mail.smtp.host", "8080");
		Session sessionobject=Session.getDefaultInstance(propertiesobject);
		
		try {
			MimeMessage messageObject= new MimeMessage(sessionobject);
			messageObject.setFrom(new InternetAddress(Sender));
			messageObject.addRecipient(Message.RecipientType.TO,new InternetAddress(Recipient));
			messageObject.setSubject("Welcome to the Future World");
			messageObject.setText("Sending the Mail Using Java Code");
			Transport.send(messageObject);
            System.out.println("Sent successfully!");
			
			
		}
		catch (MessagingException ex) {
            ex.printStackTrace();
		
		
	}

	}}
