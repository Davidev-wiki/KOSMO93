package a.b.c.com.cgi.mail;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class GoogleMailSend {
	
	public void googleMailSend( String mailSubject
							   ,String sendMail
							   ,String sendPw
							   ,String receiveMail
							   ,String content) {
		
		System.out.println("googleMailSend()에 들어온 매개변수  mailSubject >>> : " + mailSubject);
		System.out.println("googleMailSend()에 들어온 매개변수  sendMail >>> : " + sendMail);
		System.out.println("googleMailSend()에 들어온 매개변수  sendPw >>> : " + sendPw);
		System.out.println("googleMailSend()에 들어온 매개변수  receiveMail >>> : " + receiveMail);
		System.out.println("googleMailSend()에 들어온 매개변수  content >>> : " + content);
		
		Properties prop = System.getProperties();
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.port", "587");
		
		// gmail password
		Authenticator auth = new GoogleMailAuth(sendMail, sendPw);
		Session session = Session.getDefaultInstance(prop, auth);
		MimeMessage msg = new MimeMessage(session);
		
		try {
			
			msg.setSentDate(new Date());
			msg.setFrom(new InternetAddress(sendMail, mailSubject));
			InternetAddress to = new InternetAddress(receiveMail);
			msg.setRecipient(Message.RecipientType.TO, to);
			msg.setSubject(mailSubject, "UTF-8");
			msg.setText(content, "UTF-8");;
			
			Transport.send(msg);
		} catch (AddressException ae) {
            System.out.println("AddressException : " + ae.getMessage());           
		} catch (MessagingException me) {
            System.out.println("MessagingException : " + me.getMessage());           
		} catch (UnsupportedEncodingException e) {
            System.out.println("UnsupportedEncodingException : " + e.getMessage());           
		}
	}
}
