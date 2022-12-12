package com.arcgen.usermgt.models.domain.web.usermanagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserSeal")
public class UserSeal {

    @Id
    @Column(name = "userSealId")
    private String userSealId;

    @Column(name = "userInfoId")
    private String userInfoId;

    @Column(name = "fileName")
    private String fileName;

    @Column(name = "fileType")
    private String fileType;

    @Column(name = "fileData")
    private byte[] fileData;

    @Column(name = "uploadDate")
    private String uploadDate;

    public UserSeal() {
    }

    public String getUserSealId() {
        return userSealId;
    }

    public void setUserSealId(String userSealId) {
        this.userSealId = userSealId;
    }

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getFileData() {
        return fileData;
    }

    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

}
