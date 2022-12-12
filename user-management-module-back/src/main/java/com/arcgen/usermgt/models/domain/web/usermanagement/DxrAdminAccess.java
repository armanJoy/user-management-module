package com.arcgen.usermgt.models.domain.web.usermanagement;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.arcgen.usermgt.config.AppConstant;
import com.arcgen.usermgt.models.view.web.menudef.UserMenuDef;
import com.arcgen.usermgt.models.view.web.usermanagement.UserAccessDomain;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "DxrAdminAccess")
public class DxrAdminAccess {

    @Id
    @Column(name = "dxrAdminAccessId")
    private String dxrAdminAccessId = AppConstant.DXR_ADMIN_ACCESS_ID;

    @Transient
    private List<UserMenuDef> accessInfos;

    @Column(name = "dxrAdminAccess")
    private String dxrAdminAccess;

    @Column(name = "updateDate")
    private String updateDate;

    public String getDxrAdminAccessId() {
        return dxrAdminAccessId;
    }

    public String getDxrAdminAccess() {
        return dxrAdminAccess;
    }

    public void setDxrAdminAccess(String dxrAdminAccess) {
        this.dxrAdminAccess = dxrAdminAccess;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public List<UserMenuDef> getAccessInfos() {

        List<UserMenuDef> accessInfoList = new ArrayList<>();

        Gson jsonParser = new Gson();
        accessInfoList = (List<UserMenuDef>) jsonParser.fromJson(this.dxrAdminAccess, new TypeToken<List<UserMenuDef>>() {
        }.getType());

        this.accessInfos = accessInfoList;

        return accessInfos;
    }

    public void setAccessInfo(String dxrAdminAccess) {
        this.dxrAdminAccess = dxrAdminAccess;

//        List<UserMenuDef> accessInfoList = new ArrayList<>();
//
//        Gson jsonParser = new Gson();
//        accessInfoList = (List<UserMenuDef>) jsonParser.fromJson(dxrAdminAccess, new TypeToken<List<UserMenuDef>>() {
//        }.getType());
//
//        this.accessInfos = accessInfoList;
    }

}
