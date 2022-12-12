package com.arcgen.usermgt.repositories.web.subscription;

import com.arcgen.usermgt.models.domain.web.subscription.SubscriptionStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionStatusRepo extends CrudRepository<SubscriptionStatus, String> {

    public SubscriptionStatus findBySubscriptionStatusId(String subscriptionStatusId);

}
