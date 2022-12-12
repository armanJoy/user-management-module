package com.arcgen.usermgt.models.view.web.roledef;

import com.arcgen.usermgt.models.view.web.menudef.MenuAccessInfoVM;
import com.arcgen.usermgt.models.view.web.menudef.MenuItem;
import java.util.List;

public class RoleWiseMenuAcccessInfoUpdate {

    private String roleDefId;
    private List<MenuAccessInfoVM> accessibleMenuListOfRole;

    public RoleWiseMenuAcccessInfoUpdate() {
    }

    public String getRoleDefId() {
        return roleDefId;
    }

    public void setRoleDefId(String roleDefId) {
        this.roleDefId = roleDefId;
    }

    public List<MenuAccessInfoVM> getAccessibleMenuListOfRole() {
        return accessibleMenuListOfRole;
    }

    public void setAccessibleMenuListOfRole(List<MenuAccessInfoVM> accessibleMenuListOfRole) {
        this.accessibleMenuListOfRole = accessibleMenuListOfRole;
    }

}
