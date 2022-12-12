package com.arcgen.usermgt.models.domain.web.menudef;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MenuRoleDef")
public class MenuRoleDef {

    @Id
    @Column(name = "menuRoleDefId")
    private String menuRoleDefId;

    @Column(name = "menuId")
    private String menuId;

    @Column(name = "roleDefList")
    private String roleDefList;

    public String getMenuRoleDefId() {
        return menuRoleDefId;
    }

    public void setMenuRoleDefId(String menuRoleDefId) {
        this.menuRoleDefId = menuRoleDefId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public List<String> getRoleDefList() {
        List<String> roleDefDefList = new ArrayList<>();
        if (this.roleDefList != null && this.roleDefList.length() > 0) {
            int j = 0;
            for (int i = 0; i < this.roleDefList.length(); i++) {

                if (this.roleDefList.charAt(i) == '|') {

                    String eachAccessDefString = this.roleDefList.substring(j, i);
                    roleDefDefList.add(eachAccessDefString);
                    j = i + 1;
                }
            }
        }
        return roleDefDefList;
//        return roleDefList;
    }

    public void setRoleDefList(List<String> roleDefList) {
        if (roleDefList != null && roleDefList.size() >= 0) {
            String roleDefListString = "";
            for (int i = 0; i < roleDefList.size(); i++) {
                String eachcompanyCategoryIdList = roleDefList.get(i);
                roleDefListString = roleDefListString.concat(eachcompanyCategoryIdList).concat("|");
            }
            this.roleDefList = roleDefListString;
        }
    }

}
