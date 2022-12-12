package com.arcgen.usermgt.models.view.web.subscription;

import com.arcgen.usermgt.models.domain.web.subscription.CompanyCategory;
import java.util.ArrayList;
import java.util.List;

public class SubscriptionInfoVM {

    private String id;

    private String companyName;

    private String address;

    private String contactNo;

    private String subscriptionEmail;

    private List<String> companyCategory = new ArrayList<>();

    private Boolean isHuman;

    private Boolean isAgree;

    private String response;

    private String frontendDate;

    private String backendDate;

    private String subscriberName;

    private String subscriberMail;

    private String zipCode;

    private String password;

    private SubscriptionStatusVM status;

    private String requesterMail;

    private String wasteProcessingLicenceNo = "";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getSubscriptionEmail() {
        return subscriptionEmail;
    }

    public void setSubscriptionEmail(String subscriptionEmail) {
        this.subscriptionEmail = subscriptionEmail;
    }

    public Boolean getIsHuman() {
        return isHuman;
    }

    public void setIsHuman(Boolean isHuman) {
        this.isHuman = isHuman;
    }

    public Boolean getIsAgree() {
        return isAgree;
    }

    public void setIsAgree(Boolean isAgree) {
        this.isAgree = isAgree;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public List<String> getCompanyCategory() {
        return companyCategory;
    }

    public void setCompanyCategory(List<String> companyCategory) {
        this.companyCategory = companyCategory;
    }

    public String getFrontendDate() {
        return frontendDate;
    }

    public void setFrontendDate(String frontendDate) {
        this.frontendDate = frontendDate;
    }

    public String getBackendDate() {
        return backendDate;
    }

    public void setBackendDate(String backendDate) {
        this.backendDate = backendDate;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SubscriptionStatusVM getStatus() {
        return status;
    }

    public void setStatus(SubscriptionStatusVM status) {
        this.status = status;
    }

    public String getRequesterMail() {
        return requesterMail;
    }

    public void setRequesterMail(String requesterMail) {
        this.requesterMail = requesterMail;
    }

    public String getWasteProcessingLicenceNo() {
        return wasteProcessingLicenceNo;
    }

    public void setWasteProcessingLicenceNo(String wasteProcessingLicenceNo) {
        this.wasteProcessingLicenceNo = wasteProcessingLicenceNo;
    }

}
