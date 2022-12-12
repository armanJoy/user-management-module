package com.arcgen.usermgt.models.domain.web.usermanagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserCategory")
public class UserCategory {

    @Id
    @Column(name = "userCategoryId")
    private String userCategoryId;

    @Column(name = "userCategoryTitle")
    private String userCategoryTitle;

    @Column(name = "userCategoryCode")
    private String userCategoryCode;

    @Column(name = "userCategoryDescription")
    private String userCategoryDescription;

    public String getUserCategoryId() {
        return userCategoryId;
    }

    public void setUserCategoryId(String userCategoryId) {
        this.userCategoryId = userCategoryId;
    }

    public String getUserCategoryTitle() {
        return userCategoryTitle;
    }

    public void setUserCategoryTitle(String userCategoryTitle) {
        this.userCategoryTitle = userCategoryTitle;
    }

    public String getUserCategoryCode() {
        return userCategoryCode;
    }

    public void setUserCategoryCode(String userCategoryCode) {
        this.userCategoryCode = userCategoryCode;
    }

    public String getUserCategoryDescription() {
        return userCategoryDescription;
    }

    public void setUserCategoryDescription(String userCategoryDescription) {
        this.userCategoryDescription = userCategoryDescription;
    }

}
