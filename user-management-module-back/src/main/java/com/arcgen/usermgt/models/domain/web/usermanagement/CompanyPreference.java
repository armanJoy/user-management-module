package com.arcgen.usermgt.models.domain.web.usermanagement;

import com.arcgen.usermgt.config.AppConstant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CompanyPreference")
public class CompanyPreference {

    @Id
    @Column(name = "companyPreferenceId")
    private String companyPreferenceId;

    @Column(name = "userIdentificationPk")
    private String userIdentificationPk;

    @Column(name = "preferCompanyId")
    private String preferCompanyId;

    @Column(name = "active")
    private String active = AppConstant.DATA_ACTIVE_VALUE;

    public String getCompanyPreferenceId() {
        return companyPreferenceId;
    }

    public void setCompanyPreferenceId(String companyPreferenceId) {
        this.companyPreferenceId = companyPreferenceId;
    }

    public String getUserIdentificationPk() {
        return userIdentificationPk;
    }

    public void setUserIdentificationPk(String userIdentificationPk) {
        this.userIdentificationPk = userIdentificationPk;
    }

    public String getPreferCompanyId() {
        return preferCompanyId;
    }

    public void setPreferCompanyId(String preferCompanyId) {
        this.preferCompanyId = preferCompanyId;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

}
