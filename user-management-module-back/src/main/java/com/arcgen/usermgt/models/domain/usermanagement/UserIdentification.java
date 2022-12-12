package com.arcgen.usermgt.models.domain.usermanagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserIdentification")
public class UserIdentification {

    @Id
    @Column(name = "userIdentificationId")
    private String userIdentificationId;

    @Column(name = "userId")
    private String userId;

    @Column(name = "userAuth")
    private String userAuth;

    @Column(name = "oneTimeAccessFlag")
    private String oneTimeAccessFlag;

    public UserIdentification() {

    }

    public String getUserIdentificationId() {
        return userIdentificationId;
    }

    public void setUserIdentificationId(String userIdentificationId) {
        this.userIdentificationId = userIdentificationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth;
    }

    public String getOneTimeAccessFlag() {
        return oneTimeAccessFlag;
    }

    public void setOneTimeAccessFlag(String oneTimeAccessFlag) {
        this.oneTimeAccessFlag = oneTimeAccessFlag;
    }

}
