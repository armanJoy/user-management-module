package com.arcgen.usermgt.models.domain.roledef;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RoleAccessDef")
public class RoleAccessDef {

    @Id
    @Column(name = "roleAccessDefId")
    private String roleAccessDefId;

    @Column(name = "roleId")
    private String roleId;

    @Column(name = "accessDefId")
    private String accessDefId;

    public String getRoleAccessDefId() {
        return roleAccessDefId;
    }

    public void setRoleAccessDefId(String roleAccessDefId) {
        this.roleAccessDefId = roleAccessDefId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getAccessDefId() {
        return accessDefId;
    }

    public void setAccessDefId(String accessDefId) {
        this.accessDefId = accessDefId;
    }

}
