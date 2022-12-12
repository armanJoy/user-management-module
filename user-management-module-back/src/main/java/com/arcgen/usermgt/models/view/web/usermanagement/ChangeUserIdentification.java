package com.arcgen.usermgt.models.view.web.usermanagement;

public class ChangeUserIdentification {

    private String userId;

    private String accessCode;

    private String oneTimeAccessFlag;

    private String newAuth;

    public ChangeUserIdentification() {

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public String getOneTimeAccessFlag() {
        return oneTimeAccessFlag;
    }

    public void setOneTimeAccessFlag(String oneTimeAccessFlag) {
        this.oneTimeAccessFlag = oneTimeAccessFlag;
    }

    public String getNewAuth() {
        return newAuth;
    }

    public void setNewAuth(String newAuth) {
        this.newAuth = newAuth;
    }

}
