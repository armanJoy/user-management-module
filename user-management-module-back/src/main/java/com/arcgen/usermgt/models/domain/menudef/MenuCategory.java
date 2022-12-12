package com.arcgen.usermgt.models.domain.menudef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MenuCategory")
public class MenuCategory {

    @Id
    @Column(name = "menuCategoryId")
    private String menuCategoryId;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;

    public MenuCategory() {
    }

    public String getMenuCategoryId() {
        return menuCategoryId;
    }

    public void setMenuCategoryId(String menuCategoryId) {
        this.menuCategoryId = menuCategoryId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
