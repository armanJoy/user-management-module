package com.arcgen.usermgt.models.domain.usermanagement;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.arcgen.usermgt.config.AppConstant;
import com.arcgen.usermgt.models.view.menudef.UserMenuDef;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "CompanyAdminAccess")
public class CompanyAdminAccess {

    @Id
    @Column(name = "companyAdminAccessId")
    private String companyAdminAccessId = AppConstant.COMPANY_ADMIN_ACCESS_ID;

    @Transient
    private List<UserMenuDef> companyAdminAccessInfos;

    @Column(name = "companyAdminAccess")
    private String companyAdminAccess;

    @Column(name = "updateDate")
    private String updateDate;

    public String getCompanyAdminAccessId() {
        return companyAdminAccessId;
    }

    public String getCompanyAdminAccess() {
        return companyAdminAccess;
    }

    public void setCompanyAdminAccess(String companyAdminAccess) {
        this.companyAdminAccess = companyAdminAccess;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public List<UserMenuDef> getCompanyAdminAccessInfos() {
        List<UserMenuDef> accessInfoList = new ArrayList<>();

        Gson jsonParser = new Gson();
        accessInfoList = (List<UserMenuDef>) jsonParser.fromJson(this.companyAdminAccess, new TypeToken<List<UserMenuDef>>() {
        }.getType());

        this.companyAdminAccessInfos = accessInfoList;

        return companyAdminAccessInfos;
    }

    public void setCompanyAdminAccessInfos(String companyAdminAccess) {
        this.companyAdminAccess = companyAdminAccess;

    }

}
