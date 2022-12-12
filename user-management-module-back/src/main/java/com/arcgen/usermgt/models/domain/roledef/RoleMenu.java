package com.arcgen.usermgt.models.domain.roledef;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RoleMenu")
public class RoleMenu {

    @Id
    @Column(name = "roleMenuId")
    private String roleMenuId;

    @Column(name = "roleDefId")
    private String roleDefId;

    @Column(name = "menuIdList")
    private String menuIdList;

    public String getRoleMenuId() {
        return roleMenuId;
    }

    public void setRoleMenuId(String roleMenuId) {
        this.roleMenuId = roleMenuId;
    }

    public String getRoleDefId() {
        return roleDefId;
    }

    public void setRoleDefId(String roleDefId) {
        this.roleDefId = roleDefId;
    }

    public List<String> getMenuIdList() {
        List<String> menuIdListString = new ArrayList<>();
        if (menuIdList != null && menuIdList.length() > 0) {
            int j = 0;
            for (int i = 0; i < menuIdList.length(); i++) {

                if (menuIdList.charAt(i) == '|') {

                    String eachMenuId = menuIdList.substring(j, i);
                    menuIdListString.add(eachMenuId);
                    j = i + 1;
                }
            }
        }

        return menuIdListString;
    }

    public void setMenuIdList(List<String> menuId) {
        if (menuId != null && menuId.size() >= 0) {
            String menuIdListString = "";
            for (int i = 0; i < menuId.size(); i++) {
                String eacheRoleAccessList = menuId.get(i);
                menuIdListString = menuIdListString.concat(eacheRoleAccessList).concat("|");
            }
            this.menuIdList = menuIdListString;
        }
    }

}
