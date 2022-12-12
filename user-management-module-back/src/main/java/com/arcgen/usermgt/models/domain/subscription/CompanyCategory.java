package com.arcgen.usermgt.models.domain.subscription;

import com.arcgen.usermgt.config.AppConstant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CompanyCategory")
public class CompanyCategory {

    @Id
    @Column(name = "company_category_id")
    private String companyCategoryId;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "category_code")
    private String categoryCode;

    @Column(name = "category_description")
    private String categoryDescription;

    public String getCompanyCategoryId() {
        return companyCategoryId;
    }

    public void setCompanyCategoryId(String companyCategoryId) {
        this.companyCategoryId = companyCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

}
