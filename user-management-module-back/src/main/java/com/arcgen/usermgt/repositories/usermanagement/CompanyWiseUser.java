package com.arcgen.usermgt.repositories.usermanagement;

import com.arcgen.usermgt.models.domain.usermanagement.UserInfo;
import java.util.ArrayList;
import java.util.List;

public class CompanyWiseUser {

    private String userCompanyId;

    private List<UserInfo> users = new ArrayList<>();

    public CompanyWiseUser() {
    }

    public String getUserCompanyId() {
        return userCompanyId;
    }

    public void setUserCompanyId(String userCompanyId) {
        this.userCompanyId = userCompanyId;
    }

    public List<UserInfo> getUsers() {
        return users;
    }

    public void setUsers(List<UserInfo> users) {
        this.users = users;
    }

}