package com.arcgen.usermgt.models.view.subscription;

import com.arcgen.usermgt.models.view.usermanagement.CompanyInfoVM;
import com.arcgen.usermgt.models.view.usermanagement.UserInfoView;
import java.util.ArrayList;
import java.util.List;

public class CompanyAdminVM {

    private CompanyInfoVM companyInfoVM;

    private List<UserInfoView> companyAdmins = new ArrayList<>();

    public CompanyInfoVM getCompanyInfoVM() {
        return companyInfoVM;
    }

    public void setCompanyInfoVM(CompanyInfoVM companyInfoVM) {
        this.companyInfoVM = companyInfoVM;
    }

    public List<UserInfoView> getCompanyAdmins() {
        return companyAdmins;
    }

    public void setCompanyAdmins(List<UserInfoView> companyAdmins) {
        this.companyAdmins = companyAdmins;
    }

}
