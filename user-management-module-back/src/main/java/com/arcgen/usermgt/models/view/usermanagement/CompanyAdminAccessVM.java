package com.arcgen.usermgt.models.view.usermanagement;

import com.arcgen.usermgt.config.AppConstant;

public class CompanyAdminAccessVM {

    private String companyAdminAccessId = AppConstant.COMPANY_ADMIN_ACCESS_ID;

    private String companyAdminAccess;

    public String getCompanyAdminAccessId() {
        return companyAdminAccessId;
    }

    public String getCompanyAdminAccess() {
        return companyAdminAccess;
    }

    public void setCompanyAdminAccess(String companyAdminAccess) {
        this.companyAdminAccess = companyAdminAccess;
    }

}
