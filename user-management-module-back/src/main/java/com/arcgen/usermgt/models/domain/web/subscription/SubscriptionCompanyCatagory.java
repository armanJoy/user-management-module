package com.arcgen.usermgt.models.domain.web.subscription;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SubscriptionCompanyCatagory")
public class SubscriptionCompanyCatagory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subscription_company_category_id")
    private Long subscriptionCompanyCategoryId;

    @Column(name = "subscription_info")
    private String subscriptionInfo;

    @Column(name = "company_category_id_list")
    private String companyCategoryIdList;

    public Long getSubscriptionCompanyCategoryId() {
        return subscriptionCompanyCategoryId;
    }

    public void setSubscriptionCompanyCategoryId(Long subscriptionCompanyCategoryId) {
        this.subscriptionCompanyCategoryId = subscriptionCompanyCategoryId;
    }

    public String getSubscriptionInfo() {
        return subscriptionInfo;
    }

    public void setSubscriptionInfo(String subscriptionInfo) {
        this.subscriptionInfo = subscriptionInfo;
    }

    public List<String> getCompanyCategoryIdList() {
        List<String> companyCategoryIdListArr = new ArrayList<>();
        if (companyCategoryIdList != null && companyCategoryIdList.length() > 0) {
            int j = 0;
            for (int i = 0; i < companyCategoryIdList.length(); i++) {

                if (companyCategoryIdList.charAt(i) == '|') {

                    String eachCompanyCategoryString = companyCategoryIdList.substring(j, i);
                    companyCategoryIdListArr.add(eachCompanyCategoryString);
                    j = i + 1;
                }
            }
        }

        return companyCategoryIdListArr;
    }

    public void setCompanyCategoryIdList(List<String> companyCategoryIdList) {
        if (companyCategoryIdList != null && companyCategoryIdList.size() >= 0) {
            String companyCategoryIdListString = "";
            for (int i = 0; i < companyCategoryIdList.size(); i++) {
                String eachcompanyCategoryIdList = companyCategoryIdList.get(i);
                companyCategoryIdListString = companyCategoryIdListString.concat(eachcompanyCategoryIdList).concat("|");
            }
            this.companyCategoryIdList = companyCategoryIdListString;
        }
    }

}
