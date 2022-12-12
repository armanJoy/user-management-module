package com.arcgen.usermgt.models.domain.web.subscription;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SubscriptionStatus")
public class SubscriptionStatus {

    @Id
    @Column(name = "subscription_status_id")
    private String subscriptionStatusId;

    @Column(name = "status_title")
    private String statusTitle;

    @Column(name = "status_code")
    private String statusCode;

    public String getSubscriptionStatusId() {
        return subscriptionStatusId;
    }

    public void setSubscriptionStatusId(String subscriptionStatusId) {
        this.subscriptionStatusId = subscriptionStatusId;
    }

    public String getStatusTitle() {
        return statusTitle;
    }

    public void setStatusTitle(String statusTitle) {
        this.statusTitle = statusTitle;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

}
