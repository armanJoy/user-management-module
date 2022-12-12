package com.arcgen.usermgt.models.view.web.usermanagement;

import com.arcgen.usermgt.config.AppConstant;

public class DxrAdminAccessVM {

    private String dxrAdminAccessId = AppConstant.DXR_ADMIN_ACCESS_ID;

    private String dxrAdminAccess;

    public String getDxrAdminAccessId() {
        return dxrAdminAccessId;
    }

    public String getDxrAdminAccess() {
        return dxrAdminAccess;
    }

    public void setDxrAdminAccess(String dxrAdminAccess) {
        this.dxrAdminAccess = dxrAdminAccess;
    }

}
