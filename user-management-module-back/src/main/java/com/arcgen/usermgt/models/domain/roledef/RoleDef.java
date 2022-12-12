package com.arcgen.usermgt.models.domain.roledef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RoleDef")
public class RoleDef {

    @Id
    @Column(name = "roleDefId")
    private String roleDefId;

    @Column(name = "roleName")
    private String roleName;

    @Column(name = "roleNameEng")
    private String roleNameEng;

    @Column(name = "roleCode")
    private String roleCode;

    @Column(name = "roleDescription")
    private String roleDescription;

    //Add column 2022-02-09
    @Column(name = "companyCategoryId")
    private String companyCategoryId;

    public String getRoleDefId() {
        return roleDefId;
    }

    public void setRoleDefId(String roleDefId) {
        this.roleDefId = roleDefId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleNameEng() {
        return roleNameEng;
    }

    public void setRoleNameEng(String roleNameEng) {
        this.roleNameEng = roleNameEng;
    }

    public String getCompanyCategoryId() {
        return companyCategoryId;
    }

    public void setCompanyCategoryId(String companyCategoryId) {
        this.companyCategoryId = companyCategoryId;
    }

}
