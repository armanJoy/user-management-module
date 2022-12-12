package com.arcgen.usermgt.models.view.menudef;

import com.arcgen.usermgt.models.view.roledef.RoleAccessDefUpdate;
import java.util.List;

public class MenuRoleAccessUpdate {

    private String menuDefId;
    private List<RoleAccessDefUpdate> roleAccessList;

    public MenuRoleAccessUpdate() {
    }

    public String getMenuDefId() {
        return menuDefId;
    }

    public void setMenuDefId(String menuDefId) {
        this.menuDefId = menuDefId;
    }

    public List<RoleAccessDefUpdate> getRoleAccessList() {
        return roleAccessList;
    }

    public void setRoleAccessList(List<RoleAccessDefUpdate> roleAccessList) {
        this.roleAccessList = roleAccessList;
    }

}
