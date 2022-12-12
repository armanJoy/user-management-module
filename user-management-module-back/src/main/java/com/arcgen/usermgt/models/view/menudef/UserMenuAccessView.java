package com.arcgen.usermgt.models.view.menudef;

import java.util.List;

public class UserMenuAccessView {

    private String menuId;
    private String menuTitle;

    private String menuUrl;
    private String parentSegment;
    private String menuGroupName;
    private String primaryMenuName;
    private String secondaryMenuName;
    private String menuParent;
    private String menuTypeId;
    private String menuTypeName;
    private String companyCategoryId;
    private String companyCategoryName;
    private List<ActiveAccess> allActiveAccess;
    private ActiveAccess activeAccess;
    private List<UserMenuAccessView> children;

    public List<UserMenuAccessView> getChildren() {
        return children;
    }

    public void setChildren(List<UserMenuAccessView> children) {
        this.children = children;
    }

    public UserMenuAccessView() {
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

    public String getPrimaryMenuName() {
        return primaryMenuName;
    }

    public void setPrimaryMenuName(String primaryMenuName) {
        this.primaryMenuName = primaryMenuName;
    }

    public String getSecondaryMenuName() {
        return secondaryMenuName;
    }

    public void setSecondaryMenuName(String secondaryMenuName) {
        this.secondaryMenuName = secondaryMenuName;
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

    public ActiveAccess getActiveAccess() {
        return activeAccess;
    }

    public void setActiveAccess(ActiveAccess activeAccess) {
        this.activeAccess = activeAccess;
    }

}