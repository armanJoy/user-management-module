package com.arcgen.usermgt.repositories.web.subscription;

import com.arcgen.usermgt.models.domain.web.subscription.SubscriptionCompanyCatagory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionCompanyCatagoryRepo extends CrudRepository<SubscriptionCompanyCatagory, String> {

    public SubscriptionCompanyCatagory findBySubscriptionInfo(String subscriptionInfo);

}
