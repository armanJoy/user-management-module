package com.arcgen.usermgt.models.view.web.usermanagement;

import com.arcgen.usermgt.config.AppConstant;

public class UserInfoView {

    private String userInfoId = "";

    private String userName = "";

    private String userEmail = "";

    private String userContact = "";

    private String userAddress = "";

    private String departmentTitle = "";

    private String userCompanyId = "";

    private String userCategoryId;

    public UserInfoView() {

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

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getDepartmentTitle() {
        return departmentTitle;
    }

    public void setDepartmentTitle(String departmentTitle) {
        this.departmentTitle = departmentTitle;
    }

    public String getUserCompanyId() {
        return userCompanyId;
    }

    public void setUserCompanyId(String userCompanyId) {
        this.userCompanyId = userCompanyId;
    }

    public String getUserCategoryId() {
        return userCategoryId;
    }

    public void setUserCategoryId(String userCategoryId) {
        this.userCategoryId = userCategoryId;
    }

}