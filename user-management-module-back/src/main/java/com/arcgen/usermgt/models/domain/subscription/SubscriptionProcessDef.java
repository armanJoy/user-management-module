package com.arcgen.usermgt.models.domain.subscription;

import com.arcgen.usermgt.config.AppConstant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SubscriptionProcessDef")
public class SubscriptionProcessDef {

    @Id
    @Column(name = "subscriptionProcessDefId")
    private String subscriptionProcessDefId = AppConstant.SUBSCRIPTION_PROCESS_DEF_ID;

    @Column(name = "subscriptionProcessDef")
    private String subscriptionProcessDef;

    public String getSubscriptionProcessDefId() {
        return subscriptionProcessDefId;
    }

    public String getSubscriptionProcessDef() {
        return subscriptionProcessDef;
    }

    public void setSubscriptionProcessDef(String subscriptionProcessDef) {
        this.subscriptionProcessDef = subscriptionProcessDef;
    }

}
