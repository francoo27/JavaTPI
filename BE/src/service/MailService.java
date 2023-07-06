package service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import entity.CompraDTO;
import util.EmailTemplateGenerator.TemplateGenerator;

public class MailService {
    String remitente = "javatpicuenta@gmail.com";
    String password = "yyozymtnyosucagc";
	// Session mailSession =  MailFactory.getMailSession();
	
	private void mailTo(String to,String content) {      

	    Properties props = System.getProperties();
	    props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
	    props.put("mail.smtp.user", remitente);
	    props.put("mail.smtp.password", password);    //La clave de la cuenta
	    props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
	    props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
	    props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google

	    Session session = Session.getDefaultInstance(props);
	    MimeMessage message = new MimeMessage(session);

	    try {
	        message.setFrom(new InternetAddress(remitente));
	        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));   //Se podrían añadir varios de la misma manera
	        message.setSubject("CineAr Tickets");
	        message.setContent(content, "text/html");
	        Transport transport = session.getTransport("smtp");
	        transport.connect("smtp.gmail.com", remitente, password);
	        transport.sendMessage(message, message.getAllRecipients());
	        transport.close();
	    }
	    catch (MessagingException me) {
	        me.printStackTrace();   //Si se produce un error
	    }
	  
	}
	
	public void mailCompra(CompraDTO compraDTO) {      
	    mailTo(compraDTO.getEmail(),TemplateGenerator.generateCompraTemplate(compraDTO));
	}
	
}
