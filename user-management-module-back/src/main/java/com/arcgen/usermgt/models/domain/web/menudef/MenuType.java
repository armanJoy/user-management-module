package com.arcgen.usermgt.models.domain.web.menudef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MenuType")
public class MenuType {

    @Id
    @Column(name = "menuTypeId")
    private String menuTypeId;

    @Column(name = "menuTypeTitle")
    private String menuTypeTitle;

    @Column(name = "menuTypeCode")
    private String menuTypeCode;

    @Column(name = "menuTypeDescription")
    private String menuTypeDescription;

    public String getMenuTypeId() {
        return menuTypeId;
    }

    public void setMenuTypeId(String menuTypeId) {
        this.menuTypeId = menuTypeId;
    }

    public String getMenuTypeTitle() {
        return menuTypeTitle;
    }

    public void setMenuTypeTitle(String menuTypeTitle) {
        this.menuTypeTitle = menuTypeTitle;
    }

    public String getMenuTypeCode() {
        return menuTypeCode;
    }

    public void setMenuTypeCode(String menuTypeCode) {
        this.menuTypeCode = menuTypeCode;
    }

    public String getMenuTypeDescription() {
        return menuTypeDescription;
    }

    public void setMenuTypeDescription(String menuTypeDescription) {
        this.menuTypeDescription = menuTypeDescription;
    }

}
