package com.arcgen.usermgt.models.domain.web.roledef;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "RoleMenuAccessInfo")
public class RoleMenuAccessInfo {

    @Id
    @Column(name = "roleMenuAccessInfoId")
    private String roleMenuAccessInfoId;

    @Column(name = "roleDefId")
    private String roleDefId;

    @Transient
    private String menuAccess;

    @Column(name = "menuAccessBlob")
    private byte[] menuAccessBlob;

    @Column(name = "updateDate")
    private String updateDate;

    public String getRoleMenuAccessInfoId() {
        return roleMenuAccessInfoId;
    }

    public void setRoleMenuAccessInfoId(String roleMenuAccessInfoId) {
        this.roleMenuAccessInfoId = roleMenuAccessInfoId;
    }

    public String getRoleDefId() {
        return roleDefId;
    }

    public void setRoleDefId(String roleDefId) {
        this.roleDefId = roleDefId;
    }

    public String getMenuAccess() {

        try {
            if (this.menuAccessBlob != null) {
                return new String(this.menuAccessBlob, "UTF-8");
            }
        } catch (Exception ex) {
            // Logger.getLogger(RoleMenuAccessInfo.class.getName()).log(Level.SEVERE, null, ex);

        }
        return "";
    }

    public void setMenuAccess(String menuAccess) {
        this.menuAccess = menuAccess;
        try {
            this.menuAccessBlob = menuAccess.getBytes("UTF-8");
        } catch (Exception ex) {
            // Logger.getLogger(RoleMenuAccessInfo.class.getName()).log(Level.SEVERE, null, ex);
            this.menuAccessBlob = new byte[1];
        }
    }

    public byte[] getMenuAccessBlob() {
        return menuAccessBlob;
    }

    public void setMenuAccessBlob(byte[] menuAccessBlob) {
        this.menuAccessBlob = menuAccessBlob;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

}
