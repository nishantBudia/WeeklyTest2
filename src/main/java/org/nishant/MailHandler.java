package org.nishant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
@Component
public class MailHandler {

    @Autowired
    Car car;
    public void sendMail(){
        //properties

        Properties sysprop = System.getProperties();
        //System.out.println(sysprop);

        sysprop.put("mail.smtp.host","smtp.gmail.com"); //smtp server
        sysprop.put("mail.smtp.port","465"); //port
        sysprop.put("mail.smtp.ssl.enable","true"); //ssl - Secure Socket Layer
        sysprop.put("mail.smtp.auth","true"); //authentication

        //authentication

        Authenticator auth = new MailAuth();
        Session session = Session.getInstance(sysprop,auth);

        //build the mail
        //Mime message

        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom("nishantbudia@gmail.com");
            message.setSubject("Api call has been made");
            message.setRecipient(Message.RecipientType.TO, new InternetAddress("nishantbudhia@gmail.com"));
            message.setText(car.toString());

            Transport.send(message);
        }
        catch (Exception e) {
            System.out.println("Exception while constructing mail");
            System.out.println(e.getMessage());
        }

        System.out.println("Sent");

    }
    public void sendMail(String recipient){
        //properties

        Properties sysprop = System.getProperties();
        //System.out.println(sysprop);

        sysprop.put("mail.smtp.host","smtp.gmail.com"); //smtp server
        sysprop.put("mail.smtp.port","465"); //port
        sysprop.put("mail.smtp.ssl.enable","true"); //ssl - Secure Socket Layer
        sysprop.put("mail.smtp.auth","true"); //authentication

        //authentication

        Authenticator auth = new MailAuth();
        Session session = Session.getInstance(sysprop,auth);

        //build the mail
        //Mime message

        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom("nishantbudia@gmail.com");
            message.setSubject("Api call has been made");
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            message.setText(car.toString());

            Transport.send(message);
        }
        catch (Exception e) {
            System.out.println("Exception while constructing mail");
            System.out.println(e.getMessage());
        }

        System.out.println("Sent");

    }
}