package com.arcgen.usermgt.models.view.utility;

public class MailVM {

    private String mailAddress;

    private String mailContent;

    private String mailSubject;

    public MailVM() {

    }

    public MailVM(String mailAddress, String mailSubject, String mailContent) {
        this.mailAddress = mailAddress;
        this.mailSubject = mailSubject;
        this.mailContent = mailContent;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

}
