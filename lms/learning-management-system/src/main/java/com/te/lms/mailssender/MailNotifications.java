package com.te.lms.mailssender;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MailNotifications {

	@Bean
	public MailNotifications getNotify() {
		MailNotifications notify = new MailNotifications();
		return notify;
	}

	public void sendEmail(String message, String employeeEmail, String subject) {

		String host = "smtp.gmail.com";

		Properties properties = System.getProperties();

		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", true);
		properties.put("mail.smtp.auth", true);

		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("demoemail256.a@gmail.com", "rnnvritpxhcbayqc");
			}
		});

		session.setDebug(true);

		MimeMessage m = new MimeMessage(session);
		try {
			m.setFrom("tejavasa0987@gmail.com");
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(employeeEmail));
			m.setSubject(subject);
			m.setText(message);
			Transport.send(m);
		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}

}

