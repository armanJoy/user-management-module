package com.arcgen.usermgt.models.view.web.menudef;

import com.arcgen.usermgt.models.view.web.roledef.DxrRoleView;

public class ActiveAccess {

    private DxrRoleView roleInfo;
    private AccessDefView accessInfo;

    public ActiveAccess() {
    }

    public DxrRoleView getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(DxrRoleView roleInfo) {
        this.roleInfo = roleInfo;
    }

    public AccessDefView getAccessInfo() {
        return accessInfo;
    }

    public void setAccessInfo(AccessDefView accessInfo) {
        this.accessInfo = accessInfo;
    }

}
