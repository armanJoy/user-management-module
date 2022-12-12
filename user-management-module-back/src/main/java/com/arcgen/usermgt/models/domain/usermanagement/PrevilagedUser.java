package com.arcgen.usermgt.models.domain.usermanagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PrevilagedUser")
public class PrevilagedUser {

    @Id
    @Column(name = "previlagedUserId")
    private String previlagedUserId;

    @Column(name = "companyId")
    private String companyId;

//    userIdentificationPk
    @Column(name = "userId")
    private String userId;

    @Column(name = "adminType")
    private String adminType;

    @Column(name = "active")
    private String active = "1";

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public PrevilagedUser() {
    }

    public String getPrevilagedUserId() {
        return previlagedUserId;
    }

    public void setPrevilagedUserId(String previlagedUserId) {
        this.previlagedUserId = previlagedUserId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAdminType() {
        return adminType;
    }

    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }

}
