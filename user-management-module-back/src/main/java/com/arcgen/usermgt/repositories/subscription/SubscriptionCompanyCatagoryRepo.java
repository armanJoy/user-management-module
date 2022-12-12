package com.arcgen.usermgt.repositories.subscription;

import com.arcgen.usermgt.models.domain.subscription.SubscriptionCompanyCatagory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionCompanyCatagoryRepo extends CrudRepository<SubscriptionCompanyCatagory, String> {

    public SubscriptionCompanyCatagory findBySubscriptionInfo(String subscriptionInfo);

}
