package com.arcgen.usermgt.controllers.web.utility.mail;

import com.arcgen.usermgt.config.AppConstant;
import com.arcgen.usermgt.models.view.utility.MailVM;
import com.arcgen.usermgt.util.UtilService;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    UtilService utilService;

    private MailServiceImpl() {
        this.authenticator = new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                String decryptedPassword = utilService.decryptUserAuth(AppConstant.PASSWORD);
                return new PasswordAuthentication(AppConstant.USER_NAME, decryptedPassword);
            }

        };
        prop.putAll(propMap);

        session = Session.getInstance(prop, authenticator);
    }

    @Override
    public boolean sendMailToMailAddress(MailVM mailVM) {

        boolean isSuccessfull = true;

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        try {

            Message message = new MimeMessage(this.session);
            message.setFrom(new InternetAddress("webitmangrove@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(mailVM.getMailAddress())
            );
            message.setSubject(mailVM.getMailSubject());
            message.setText(mailVM.getMailContent());

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            isSuccessfull = false;
            java.util.logging.Logger.getLogger(MailServiceImpl.class.getName()).log(Level.SEVERE, "Mail sent failed for " + mailVM.getMailAddress(), e);
        }

        return isSuccessfull;
    }

    Session session;

    private static final Map<String, String> propMap = new HashMap<String, String>() {
        {
            put("mail.smtp.host", "smtp.gmail.com");
            put("mail.smtp.port", "465");
            put("mail.smtp.auth", "true");
            put("mail.smtp.socketFactory.port", "465");
            put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        }

    };

    private static Properties prop = new Properties();

    private Authenticator authenticator;

}
