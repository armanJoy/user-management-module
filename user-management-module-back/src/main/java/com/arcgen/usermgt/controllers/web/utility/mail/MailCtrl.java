package com.arcgen.usermgt.controllers.web.utility.mail;

import com.arcgen.usermgt.config.AppConstant;
import com.arcgen.usermgt.models.view.utility.MailVM;
import com.arcgen.usermgt.util.UtilService;
import java.util.Properties;
import java.util.logging.Level;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/web/util")
public class MailCtrl {

    @Autowired
    UtilService utilService;

    @RequestMapping(method = RequestMethod.POST, value = "/mail")
    void mailSend(@RequestBody MailVM mailVM) {
        sendMailToMailAddress(mailVM);

    }

    public boolean sendMailToMailAddress(MailVM mailVM) {

        boolean isSuccessfull = true;

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                String decryptedPassword = utilService.decryptUserAuth(AppConstant.PASSWORD);
                return new PasswordAuthentication(AppConstant.USER_NAME, decryptedPassword);
            }

        });

        try {

            Message message = new MimeMessage(session);
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
            java.util.logging.Logger.getLogger(MailCtrl.class.getName()).log(Level.SEVERE, "Mail sent failed for " + mailVM.getMailAddress(), e);
        }

        return isSuccessfull;

    }

}
