package com.arcgen.usermgt.models.domain.web.roledef;

import com.arcgen.usermgt.config.AppConstant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RoleDefUpdateFlag")
public class RoleDefUpdateFlag {

    @Id
    @Column(name = "roleDefUpdateFlagId")
    private String roleDefUpdateFlagId = AppConstant.ROLE_DEF_UPDATE_FLAG_ID;

    @Column(name = "updateDate")
    private String updateDate;

    public String getRoleDefUpdateFlagId() {
        return roleDefUpdateFlagId;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

}
