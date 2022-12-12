package com.arcgen.usermgt.models.view.usermanagement;

public class UserIdentificationView {

    private String userId;

    private String userAuth;

    private String oneTimeAccessFlag;

    public UserIdentificationView() {

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
