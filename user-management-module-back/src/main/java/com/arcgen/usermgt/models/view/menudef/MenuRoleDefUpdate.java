package com.arcgen.usermgt.models.view.menudef;

import java.util.List;

public class MenuRoleDefUpdate {

    private String menuId;
    private String menuTitle;
    private String menuUrl;
    private String parentSegment;
    private String menuGroupName;
    private String entityTypeId;
    private List<String> roleAccess;

//    menuId: '8',
//            menuTitle: 'User Info',
//            menuUrl: '',
//            parentSegment: '',
//            menuGroupName: 'Processor',
//            entityTypeId: '3',
//            roleAccess: ['Admin', 'Person in Charge', 'Accounts', 'Reference User'],
    public MenuRoleDefUpdate() {
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getParentSegment() {
        return parentSegment;
    }

    public void setParentSegment(String parentSegment) {
        this.parentSegment = parentSegment;
    }

    public String getMenuGroupName() {
        return menuGroupName;
    }

    public void setMenuGroupName(String menuGroupName) {
        this.menuGroupName = menuGroupName;
    }

    public String getEntityTypeId() {
        return entityTypeId;
    }

    public void setEntityTypeId(String entityTypeId) {
        this.entityTypeId = entityTypeId;
    }

    public List<String> getRoleAccess() {
        return roleAccess;
    }

    public void setRoleAccess(List<String> roleAccess) {
        this.roleAccess = roleAccess;
    }

}
