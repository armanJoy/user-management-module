package com.arcgen.usermgt.models.domain.web.subscription;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SubscriptionInfo")
public class SubscriptionInfo {

    @Id
    @Column(name = "subscriptionInfoId")
    private String subscriptionInfoId;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "address")
    private String address;

    @Column(name = "contactNo")
    private String contactNo;

    @Column(name = "email")
    private String email;

    @Column(name = "agreedTerms")
    private String agreedTerms;

    @Column(name = "dateTime")
    private String dateTime;

    @Column(name = "subscriptionStatus")
    private String subscriptionStatus;

    @Column(name = "isHuman")
    private String isHuman;

    @Column(name = "isAgree")
    private String isAgree;

    @Column(name = "subscriberName")
    private String subscriberName;

    @Column(name = "subscriberMail")
    private String subscriberMail;

    @Column(name = "zipCode")
    private String zipCode;

    @Column(name = "subscriberPassword")
    private String subscriberPassword;

    @Column(name = "statusId")
    private String statusId;

    @Column(name = "searchContent")
    private String searchContent = "";

    @Column(name = "requesterMail")
    private String requesterMail;

    public String getSearchContent() {
        return searchContent;
    }

    public void setSearchContent(String searchContent) {
        this.searchContent = searchContent;
    }

    public String getSubscriptionInfoId() {
        return subscriptionInfoId;
    }

    public void setSubscriptionInfoId(String subscriptionInfoId) {
        this.subscriptionInfoId = subscriptionInfoId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAgreedTerms() {
        return agreedTerms;
    }

    public void setAgreedTerms(String agreedTerms) {
        this.agreedTerms = agreedTerms;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getSubscriptionStatus() {
        return subscriptionStatus;
    }

    public void setSubscriptionStatus(String subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    public String getIsHuman() {
        return isHuman;
    }

    public void setIsHuman(String isHuman) {
        this.isHuman = isHuman;
    }

    public String getIsAgree() {
        return isAgree;
    }

    public void setIsAgree(String isAgree) {
        this.isAgree = isAgree;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getSubscriberMail() {
        return subscriberMail;
    }

    public void setSubscriberMail(String subscriberMail) {
        this.subscriberMail = subscriberMail;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getSubscriberPassword() {
        return subscriberPassword;
    }

    public void setSubscriberPassword(String subscriberPassword) {
        this.subscriberPassword = subscriberPassword;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getRequesterMail() {
        return requesterMail;
    }

    public void setRequesterMail(String requesterMail) {
        this.requesterMail = requesterMail;
    }

}
