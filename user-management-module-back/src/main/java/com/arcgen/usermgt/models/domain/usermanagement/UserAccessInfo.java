package com.arcgen.usermgt.models.domain.usermanagement;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.arcgen.usermgt.models.domain.roledef.RoleMenuAccessInfo;
import com.arcgen.usermgt.models.view.menudef.UserMenuDef;
import com.arcgen.usermgt.models.view.usermanagement.UserAccessDomain;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "UserAccessInfo")
public class UserAccessInfo {

    @Id
    @Column(name = "userAccessInfoId")
    private String userAccessInfoId;

    @Column(name = "userIdentification")
    private String userIdentification;

    @Transient
    private List<UserAccessDomain> menuAccessInfoList;

    @Transient
    private String menuAccessInfo;

    //add columns 2022-02-10
    @Column(name = "accessInfoBytes")
    private byte[] accessInfoBytes;

    @Column(name = "updateDate")
    private String updateDate;

    public UserAccessInfo() {
    }

    public String getUserAccessInfoId() {
        return userAccessInfoId;
    }

    public void setUserAccessInfoId(String userAccessInfoId) {
        this.userAccessInfoId = userAccessInfoId;
    }

    public String getUserIdentification() {
        return userIdentification;
    }

    public void setUserIdentification(String userIdentification) {
        this.userIdentification = userIdentification;
    }

    public String getMenuAccessInfo() {

        try {
            if (this.accessInfoBytes != null) {
                return new String(this.accessInfoBytes, "UTF-8");
            }
        } catch (Exception ex) {
            // Logger.getLogger(UserAccessInfo.class.getName()).log(Level.SEVERE, null, ex);

        }
        return "";
    }

    public void setMenuAccessInfo(String menuAccessInfo) {
        this.menuAccessInfo = menuAccessInfo;
        try {
            this.accessInfoBytes = menuAccessInfo.getBytes("UTF-8");
        } catch (Exception ex) {
            // Logger.getLogger(UserAccessInfo.class.getName()).log(Level.SEVERE, null, ex);
            this.accessInfoBytes = new byte[1];
        }
    }

    public byte[] getAccessInfoBytes() {
        return accessInfoBytes;
    }

    public void setAccessInfoBytes(byte[] accessInfoBytes) {
        this.accessInfoBytes = accessInfoBytes;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public List<UserAccessDomain> getMenuAccessInfoList() {
        List<UserAccessDomain> userAccessDomains = new ArrayList<>();

        try {
            if (this.accessInfoBytes != null) {
                String menuAccessInfoString = new String(this.accessInfoBytes, "UTF-8");
                Gson jsonParser = new Gson();
                this.menuAccessInfoList = (List<UserAccessDomain>) jsonParser.fromJson(menuAccessInfoString, new TypeToken<List<UserAccessDomain>>() {
                }.getType());
            }
        } catch (Exception ex) {
            // Logger.getLogger(UserAccessInfo.class.getName()).log(Level.SEVERE, null, ex);

        }
        return this.menuAccessInfoList;

    }

    public void setMenuAccessInfoList(List<UserAccessDomain> menuAccessInfoList) {
        this.menuAccessInfoList = menuAccessInfoList;
        try {
            Gson gson = new Gson();
            String menuAccessInfoString = gson.toJson(menuAccessInfoList);

            this.accessInfoBytes = menuAccessInfoString.getBytes("UTF-8");
        } catch (Exception ex) {
            // Logger.getLogger(UserAccessInfo.class.getName()).log(Level.SEVERE, null, ex);
            this.accessInfoBytes = new byte[1];
        }
    }

}
