package com.arcgen.usermgt.models.view.subscription;

public class SubscriptionStatusVM {

    private String statusId;
    private String statusTitle = "";

    public SubscriptionStatusVM() {
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getStatusTitle() {
        return statusTitle;
    }

    public void setStatusTitle(String statusTitle) {
        this.statusTitle = statusTitle;
    }

}
