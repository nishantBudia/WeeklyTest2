package org.nishant;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuth extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("nishantbudia@gmail.com", "lmaaegorlyaeuxfm");
    }
}