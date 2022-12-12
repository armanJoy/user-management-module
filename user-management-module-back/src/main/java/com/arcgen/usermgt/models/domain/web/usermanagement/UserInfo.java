package com.arcgen.usermgt.models.domain.web.usermanagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "UserInfo")
public class UserInfo {

    @Id
    @Column(name = "userInfoId")
    private String userInfoId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "userEmail")
    private String userEmail;

    @Column(name = "userContact")
    private String userContact;

    @Column(name = "userAddress")
    private String userAddress;

    @Column(name = "departmentTitle")
    private String departmentTitle;

    @Column(name = "userCompanyId")
    private String userCompanyId;

    @Column(name = "userAuthId")
    private String userAuthId;

    //Add columns 2022-02-09
    @Column(name = "jobTitle")
    private String jobTitle;

    @Column(name = "drivingLicenseNo")
    private String drivingLicenseNo;

    @Transient
    private String drivingLicenseFile;

    @Column(name = "drivingLicenseBytes")
    private byte[] drivingLicenseBytes = new byte[1];

    @Column(name = "userCategoryId")
    private String userCategoryId;

    //Add columns 2022-02-21
    @Column(name = "officeName")
    private String officeName;

    @Column(name = "officeAddress")
    private String officeAddress;

    @Column(name = "officeContactNo")
    private String officeContactNo;

    @Column(name = "userId")
    private String userId;

    @Column(name = "remarks")
    private String remarks;

    //2022-03-15
    @Transient
    private String userSealFile;

    @Column(name = "userSealBytes")
    private byte[] userSealBytes = new byte[1];

    @Column(name = "searchContent")
    private String searchContent = "";

    @Column(name = "active")
    private String active = "1";

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getSearchContent() {
        return searchContent;
    }

    public void setSearchContent(String searchContent) {
        this.searchContent = searchContent;
    }

    public UserInfo() {

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

    public String getUserAuthId() {
        return userAuthId;
    }

    public void setUserAuthId(String userAuthId) {
        this.userAuthId = userAuthId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDrivingLicenseNo() {
        return drivingLicenseNo;
    }

    public void setDrivingLicenseNo(String drivingLicenseNo) {
        this.drivingLicenseNo = drivingLicenseNo;
    }

    public String getUserCategoryId() {
        return userCategoryId;
    }

    public void setUserCategoryId(String userCategoryId) {
        this.userCategoryId = userCategoryId;
    }

    public String getDrivingLicenseFile() {
        try {
            if (this.drivingLicenseBytes != null) {
                return new String(this.drivingLicenseBytes, "UTF-8");
            }
        } catch (Exception ex) {
            // Logger.getLogger(UserInfo.class.getName()).log(Level.SEVERE, null, ex);

        }

        return "";
    }

    public void setDrivingLicenseFile(String drivingLicenseFile) {
        if (drivingLicenseFile != null) {
            this.drivingLicenseFile = drivingLicenseFile;
            try {
                this.drivingLicenseBytes = drivingLicenseFile.getBytes("UTF-8");
            } catch (Exception ex) {
                // Logger.getLogger(UserInfo.class.getName()).log(Level.SEVERE, null, ex);
                this.drivingLicenseBytes = new byte[1];
            }
        }

    }

    public byte[] getDrivingLicenseBytes() {
        return drivingLicenseBytes;
    }

    public void setDrivingLicenseBytes(byte[] drivingLicenseBytes) {
        this.drivingLicenseBytes = drivingLicenseBytes;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getOfficeContactNo() {
        return officeContactNo;
    }

    public void setOfficeContactNo(String officeContactNo) {
        this.officeContactNo = officeContactNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getUserSealFile() {

        try {
            if (this.userSealBytes != null) {
                return new String(this.userSealBytes, "UTF-8");
            }
        } catch (Exception ex) {
            // Logger.getLogger(UserInfo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "";
    }

    public void setUserSealFile(String userSealFile) {
        this.userSealFile = userSealFile;

        try {
            this.userSealBytes = userSealFile.getBytes("UTF-8");
        } catch (Exception ex) {
            // Logger.getLogger(UserInfo.class.getName()).log(Level.SEVERE, null, ex);
            this.userSealBytes = new byte[1];
        }
    }

    public byte[] getUserSealBytes() {
        return userSealBytes;
    }

    public void setUserSealBytes(byte[] userSealBytes) {
        this.userSealBytes = userSealBytes;
    }

}
