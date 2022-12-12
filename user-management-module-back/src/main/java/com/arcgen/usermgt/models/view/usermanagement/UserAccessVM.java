package com.arcgen.usermgt.models.view.usermanagement;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.arcgen.usermgt.models.view.menudef.MenuAccessInfoVM;
import com.arcgen.usermgt.models.view.menudef.UserMenuDef;
import java.util.List;

public class UserAccessVM {

    private String userIdentificationId;
    private String companyId;
    private List<UserMenuDef> userAccessInfo;
    private boolean isDxrAdmin;
    private boolean isCompanyAdmin;

//    public List<UserMenuDef> getUserAccessInfo() {
//        return userAccessInfo;
//    }
//
//    public void setUserAccessInfo(String userAccessInfo) {
//        //this.userAccessInfo = userAccessInfo;
//
//        Gson jsonParser = new Gson();
//        this.userAccessInfo = (List<UserMenuDef>) jsonParser.fromJson(userAccessInfo, new TypeToken<List<UserMenuDef>>() {
//        }.getType());
//    }
    public String getUserIdentificationId() {
        return userIdentificationId;
    }

    public void setUserIdentificationId(String userIdentificationId) {
        this.userIdentificationId = userIdentificationId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public List<UserMenuDef> getUserAccessInfo() {
        return userAccessInfo;
    }

    public void setUserAccessInfo(List<UserMenuDef> userAccessInfo) {
        this.userAccessInfo = userAccessInfo;
    }

    public boolean isIsDxrAdmin() {
        return isDxrAdmin;
    }

    public void setIsDxrAdmin(boolean isDxrAdmin) {
        this.isDxrAdmin = isDxrAdmin;
    }

    public boolean isIsCompanyAdmin() {
        return isCompanyAdmin;
    }

    public void setIsCompanyAdmin(boolean isCompanyAdmin) {
        this.isCompanyAdmin = isCompanyAdmin;
    }

}
