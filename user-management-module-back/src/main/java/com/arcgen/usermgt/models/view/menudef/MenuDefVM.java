package com.arcgen.usermgt.models.view.menudef;

import java.util.List;

public class MenuDefVM {

    private String menuId;
    private String menuTitleEng;
    private String menuTitleJpn;
    private String menuUrl;
    private String parentSegment;
    private String menuGroupNameEng;
    private String menuGroupNameJpn;
    private String primaryMenuNameEng;
    private String primaryMenuNameJpn;
    private String secondaryMenuNameEng;
    private String secondaryMenuNameJpn;
    private String menuParent;
    private String menuTypeId;
    private String menuTypeName;
    private String companyCategoryId;
    private String companyCategoryName;
    private List<ActiveAccess> allActiveAccess;

    public MenuDefVM() {

    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
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

    public String getMenuGroupNameEng() {
        return menuGroupNameEng;
    }

    public void setMenuGroupNameEng(String menuGroupNameEng) {
        this.menuGroupNameEng = menuGroupNameEng;
    }

    public String getMenuGroupNameJpn() {
        return menuGroupNameJpn;
    }

    public void setMenuGroupNameJpn(String menuGroupNameJpn) {
        this.menuGroupNameJpn = menuGroupNameJpn;
    }

    public String getPrimaryMenuNameEng() {
        return primaryMenuNameEng;
    }

    public void setPrimaryMenuNameEng(String primaryMenuNameEng) {
        this.primaryMenuNameEng = primaryMenuNameEng;
    }

    public String getPrimaryMenuNameJpn() {
        return primaryMenuNameJpn;
    }

    public void setPrimaryMenuNameJpn(String primaryMenuNameJpn) {
        this.primaryMenuNameJpn = primaryMenuNameJpn;
    }

    public String getSecondaryMenuNameEng() {
        return secondaryMenuNameEng;
    }

    public void setSecondaryMenuNameEng(String secondaryMenuNameEng) {
        this.secondaryMenuNameEng = secondaryMenuNameEng;
    }

    public String getSecondaryMenuNameJpn() {
        return secondaryMenuNameJpn;
    }

    public void setSecondaryMenuNameJpn(String secondaryMenuNameJpn) {
        this.secondaryMenuNameJpn = secondaryMenuNameJpn;
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

    public String getMenuTypeName() {
        return menuTypeName;
    }

    public void setMenuTypeName(String menuTypeName) {
        this.menuTypeName = menuTypeName;
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

    public List<ActiveAccess> getAllActiveAccess() {
        return allActiveAccess;
    }

    public void setAllActiveAccess(List<ActiveAccess> allActiveAccess) {
        this.allActiveAccess = allActiveAccess;
    }

}
