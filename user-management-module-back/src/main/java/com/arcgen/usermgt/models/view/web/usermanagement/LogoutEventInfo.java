package com.arcgen.usermgt.models.view.web.usermanagement;

public class LogoutEventInfo {

    private String browserSessionId;

    private String userId;

    private String companyId;

    private String logoutType;

    public LogoutEventInfo() {
    }

    public String getBrowserSessionId() {
        return browserSessionId;
    }

    public void setBrowserSessionId(String browserSessionId) {
        this.browserSessionId = browserSessionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getLogoutType() {
        return logoutType;
    }

    public void setLogoutType(String logoutType) {
        this.logoutType = logoutType;
    }

}
