package com.arcgen.usermgt.models.view.web.roledef;

import java.util.List;

public class RoleMenusUpdate {

    private String roleDefId;
    private List<String> menuIdList;

    public RoleMenusUpdate() {
    }

    public String getRoleDefId() {
        return roleDefId;
    }

    public void setRoleDefId(String roleDefId) {
        this.roleDefId = roleDefId;
    }

    public List<String> getMenuIdList() {
        return menuIdList;
    }

    public void setMenuIdList(List<String> menuIdList) {
        this.menuIdList = menuIdList;
    }

}
