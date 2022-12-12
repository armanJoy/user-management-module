package com.arcgen.usermgt.models.view.menudef;

public class MenuItem {

    private String menuId;
    private String menuUrl;
    private String parentSegment;
    private String menuTitleEng;
    private String menuTitleJpn;
    private String menuParent;
    private String menuTypeId;
    private String companyCategoryId;
    private String accessId;

    public MenuItem() {
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
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

    public String getMenuTitleEng() {
        return menuTitleEng;
    }

    public void setMenuTitleEng(String menuTitleEng) {
        this.menuTitleEng = menuTitleEng;
    }

    public String getMenuTitleJpn() {
        return menuTitleJpn;
    }

    public void setMenuTitleJpn(String menuTitleJpn) {
        this.menuTitleJpn = menuTitleJpn;
    }

    public String getMenuParent() {
        return menuParent;
    }

    public void setMenuParent(String menuParent) {
        this.menuParent = menuParent;
    }

    public String getMenuTypeId() {
        return menuTypeId;
    }

    public void setMenuTypeId(String menuTypeId) {
        this.menuTypeId = menuTypeId;
    }

    public String getCompanyCategoryId() {
        return companyCategoryId;
    }

    public void setCompanyCategoryId(String companyCategoryId) {
        this.companyCategoryId = companyCategoryId;
    }

    public String getAccessId() {
        return accessId;
    }

    public void setAccessId(String accessId) {
        this.accessId = accessId;
    }

}
