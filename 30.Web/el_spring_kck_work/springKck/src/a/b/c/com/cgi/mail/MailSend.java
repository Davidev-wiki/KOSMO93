package a.b.c.com.cgi.mail;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

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

public class MailSend {
	
	public void mailSend() {
		
		Properties prop = System.getProperties();
		/*
		 * Properties prop = System.getProperties();
		 * Properties 클래스는 시스템 속성을 객체로 생성하는 클래스
		 * Hashtable을 상속받는 클래스로 속성과 값은 1:1로 저장됨
		 */
		
		// Mail 처리 환경 설정
		// TLS를 사용할 것인지 설정하기
		prop.put("mail.smtp.starttls.enable", "true");
		// 이메일 발송을 처리해줄 SMTP 서버 주소
		prop.put("mail.smtp.host", "smtp.gmail.com");
		// SMTP 서버의 인증을 사용(true)
		prop.put("mail.smtp.auth", "true");
		// TLS의 포트번호 : 587, SSL의 포트번호는 456이다.
		prop.put("mail.smtp.port", "587");
		
		Authenticator auth = new MailAuth();
		Session session = Session.getDefaultInstance(prop, auth);
		/*
		 * MailAuth.java에서 Authenticator를 상속받아 생성한 
		 * MailAuth 클래스를 받아 세션을 생성한다.
		 * getDefaultInstance의 첫번째 파라미터는 20~26Line에서 정의한 값
		 * */
		
		
		// MimeMessage는 Message(추상)클래스를 상속받은 인터넷 메일을 위한 클래스
		// 31Line 생성한 세션을 담아 msg객체를 생성한다.
		MimeMessage msg = new MimeMessage(session);
		
		try {
			
			// 보내는 날짜 지정
			msg.setSentDate(new Date());
			
			// 보낸 사람
			msg.setFrom(new InternetAddress("rlacksrl88@gmail.com", "mailTest"));
			// Message 클래스의 setFrom()메소드를 사용하여 발송자를 지정한다.
			// 발송자의 메일, 발송지명 
			// InternetAddress 클래스는 이메일주소를 나타낼 때 사용하는 클래스
			
			// 수신자의 메일을 생성
			// 받는이 어디든지 가능 (google, naver, daum, ...)
			InternetAddress to = new InternetAddress("accelerator@kakao.com");
			
			msg.setRecipient(Message.RecipientType.TO, to);
			
			/* 
			 * Message 클래스의 setRecipient()메소드를 사용하여 수신자를 설정
			 * setRecipient() 메소드로 수신자, 참조, 숨은 참조 설정이 가능하다.
			 *   Message.RecipientType.TO : 받는사람
			 *   Message.RecipientType.CC : 참조
			 *   Message.RecipientType.BCC : 숨은 참조
			 */
			
			// 메일의 제목 지정, encoding Type설정
			msg.setSubject("메일 테스트입니당", "UTF-8");
			
			// 메일의 내용 입력, encoding Type설정
			msg.setText("구글 메일을 사용하여 네이버 메일로 보내기 테스트 겁나 피곤!!", "UTF-8");
			
			//Transport는 메일을 최종적으로 보내는 클래스로 메일을 보내는 부분이다.
			Transport.send(msg);
			
		} catch (AddressException ae) {
			// 주소 관련 예외처리
            System.out.println("AddressException : " + ae.getMessage());           
		} catch (MessagingException me) {
			// 메일 계정인증 관련 예외처리
            System.out.println("MessagingException : " + me.getMessage());
		} catch (UnsupportedEncodingException e) {
			// 지원되지 않은 인코딩을 사용할 경우 예외처리
            System.out.println("UnsupportedEncodingException : " + e.getMessage());		
		}
	}
}
