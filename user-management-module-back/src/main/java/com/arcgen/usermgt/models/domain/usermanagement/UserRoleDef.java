package com.arcgen.usermgt.models.domain.usermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserRoleDef")
public class UserRoleDef {

    @Id
    @Column(name = "userRoleDefId")
    private String userRoleDefId;

    @Column(name = "userIdentificationId")
    private String userIdentificationId;

    @Column(name = "companyId")
    private String companyId;

    @Column(name = "roleIdList")
    private String roleIdList;

    @Column(name = "active")
    private String active = "1";

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getUserRoleDefId() {
        return userRoleDefId;
    }

    public void setUserRoleDefId(String userRoleDefId) {
        this.userRoleDefId = userRoleDefId;
    }

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

    public List<String> getRoleIdList() {

        List<String> roles = new ArrayList<>();
        if (roleIdList != null && roleIdList.length() > 0) {
            int j = 0;
            for (int i = 0; i < roleIdList.length(); i++) {

                if (roleIdList.charAt(i) == '|') {

                    String eachRole = roleIdList.substring(j, i);
                    roles.add(eachRole);
                    j = i + 1;
                }
            }
        }

        return roles;
    }

    public void setRoleIdList(List<String> roles) {
        if (roles != null && roles.size() >= 0) {
            String rolesString = "";
            for (int i = 0; i < roles.size(); i++) {
                String eachRole = roles.get(i);
                rolesString = rolesString.concat(eachRole).concat("|");
            }
            this.roleIdList = rolesString;

        }
    }

}
