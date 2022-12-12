package com.arcgen.usermgt.models.domain.web.menudef;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MenuRoleAccess")
public class MenuRoleAccess {

    @Id
    @Column(name = "menuRoleAccessId")
    private String menuRoleAccessId;

    @Column(name = "menuDefId")
    private String menuDefId;

    @Column(name = "roleAccessList")
    private String roleAccessList;

    public String getMenuRoleAccessId() {
        return menuRoleAccessId;
    }

    public void setMenuRoleAccessId(String menuRoleAccessId) {
        this.menuRoleAccessId = menuRoleAccessId;
    }

    public String getMenuDefId() {
        return menuDefId;
    }

    public void setMenuDefId(String menuDefId) {
        this.menuDefId = menuDefId;
    }

    public List<String> getRoleAccessList() {

        List<String> roleAccessListString = new ArrayList<>();
        if (roleAccessList != null && roleAccessList.length() > 0) {
            int j = 0;
            for (int i = 0; i < roleAccessList.length(); i++) {

                if (roleAccessList.charAt(i) == '|') {

                    String eachRoleAccessList = roleAccessList.substring(j, i);
                    roleAccessListString.add(eachRoleAccessList);
                    j = i + 1;
                }
            }
        }

        return roleAccessListString;
    }

    public void setRoleAccessList(List<String> roleAccess) {
        if (roleAccess != null && roleAccess.size() >= 0) {
            String roleAccessListString = "";
            for (int i = 0; i < roleAccess.size(); i++) {
                String eacheRoleAccessList = roleAccess.get(i);
                roleAccessListString = roleAccessListString.concat(eacheRoleAccessList).concat("|");
            }
            this.roleAccessList = roleAccessListString;

        }
    }

}
