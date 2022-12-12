package com.arcgen.usermgt.models.view.web.roledef;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.arcgen.usermgt.models.view.web.menudef.MenuAccessInfoVM;
import java.util.List;

public class RoleWiseMenuAccessVM {

    private String roleDefId;
    private String roleName;
    private String companyCategoryId;
    private String companyCategoryName;
    private List<MenuAccessInfoVM> accessibleMenuListOfRole;

    public String getRoleDefId() {
        return roleDefId;
    }

    public void setRoleDefId(String roleDefId) {
        this.roleDefId = roleDefId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getCompanyCategoryId() {
        return companyCategoryId;
    }

    public void setCompanyCategoryId(String companyCategoryId) {
        this.companyCategoryId = companyCategoryId;
    }

    public String getCompanyCategoryName() {
        return companyCategoryName;
    }

    public void setCompanyCategoryName(String companyCategoryName) {
        this.companyCategoryName = companyCategoryName;
    }

    public List<MenuAccessInfoVM> getAccessibleMenuListOfRole() {
        return accessibleMenuListOfRole;
    }

    public void setAccessibleMenuListOfRole(String accessibleMenuListOfRole) {
        Gson jsonParser = new Gson();
        this.accessibleMenuListOfRole = (List<MenuAccessInfoVM>) jsonParser.fromJson(accessibleMenuListOfRole, new TypeToken<List<MenuAccessInfoVM>>() {
        }.getType());
    }

    public void setAccessibleMenuListOfRole(List<MenuAccessInfoVM> accessibleMenuListOfRole) {
        this.accessibleMenuListOfRole = accessibleMenuListOfRole;
    }

}
