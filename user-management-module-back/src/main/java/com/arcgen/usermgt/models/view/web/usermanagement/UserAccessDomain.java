package com.arcgen.usermgt.models.view.web.usermanagement;

import com.arcgen.usermgt.models.view.web.menudef.UserMenuDef;
import java.util.List;

public class UserAccessDomain {

    private String companyId;
    private String companyName = "";
    private String userInfoId;
    private String userName;
    private List<UserMenuDef> userMenuDef;

    private boolean preference = false;
    private String approvalStatus = "";

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<UserMenuDef> getUserMenuDef() {
        return userMenuDef;
    }

    public void setUserMenuDef(List<UserMenuDef> userMenuDef) {
        this.userMenuDef = userMenuDef;
    }

    public boolean isPreference() {
        return preference;
    }

    public void setPreference(boolean preference) {
        this.preference = preference;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

}
