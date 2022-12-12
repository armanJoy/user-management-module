package com.arcgen.usermgt.models.view.web.roledef;

public class DxrRole {

    private String roleDefId;
    private String roleName;
    private String roleCode;
    private String roleDescription;
    private String companyCategoryId;
    private String companyCategoryName;

    public DxrRole() {
    }

    public String getRoleDefId() {
        return roleDefId;
    }

    public void setRoleDefId(String roleDefId) {
        this.roleDefId = roleDefId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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

    public String getCompanyCategoryId() {
        return companyCategoryId;
    }

    public void setCompanyCategoryId(String companyCategoryId) {
        this.companyCategoryId = companyCategoryId;
    }

    public String getCompanyCategoryName() {
        return companyCategoryName;
    }

    public void setCompanyCategoryName(String companyCategoryName) {
        this.companyCategoryName = companyCategoryName;
    }

}
