package util;

import java.util.*;
import javax.mail.*;

public class MailFactory {
	private static Session mailSession;

	private MailFactory() {
		// private constructor to prevent instantiation
	}

	public static synchronized Session getMailSession() {
		if (mailSession == null) {
			mailSession = createMailSession();
		}
		return mailSession;
	}

	private static Session createMailSession() {

		String remitente = "javatpicuenta@gmail.com";
		String password = "buvlcyuttyeusxct";

		Properties props = System.getProperties();
		props.put("mail.smtp.host", "smtp.gmail.com"); // El servidor SMTP de Google
		props.put("mail.smtp.user", remitente);
		props.put("mail.smtp.clave", password); // La clave de la cuenta
		props.put("mail.smtp.auth", "true"); // Usar autenticación mediante usuario y clave
		props.put("mail.smtp.starttls.enable", "true"); // Para conectar de manera segura al servidor SMTP
		props.put("mail.smtp.port", "587"); // El puerto SMTP seguro de Google

		// Create the mail session
		Session session = Session.getDefaultInstance(props);

		return session;
	}
}
