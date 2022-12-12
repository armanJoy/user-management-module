package com.arcgen.usermgt.models.domain.menudef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MenuDef")
public class MenuDef {

    @Id
    @Column(name = "menuId")
    private String menuId;

    @Column(name = "menuTitleEng")
    private String menuTitleEng;

    @Column(name = "menuTitleJpn")
    private String menuTitleJpn;

    @Column(name = "menuUrl")
    private String menuUrl;

    @Column(name = "parentSegment")
    private String parentSegment;

    @Column(name = "parentDef")
    private String parentDef;

    @Column(name = "menuCategoryId")
    private String menuCategoryId;

    //Add columns 2022-02-09
    @Column(name = "menuTypeId")
    private String menuTypeId;

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

    public String getParentDef() {
        return parentDef;
    }

    public void setParentDef(String parentDef) {
        this.parentDef = parentDef;
    }

    public String getMenuCategoryId() {
        return menuCategoryId;
    }

    public void setMenuCategoryId(String menuCategoryId) {
        this.menuCategoryId = menuCategoryId;
    }

    public String getMenuTypeId() {
        return menuTypeId;
    }

    public void setMenuTypeId(String menuTypeId) {
        this.menuTypeId = menuTypeId;
    }

}
