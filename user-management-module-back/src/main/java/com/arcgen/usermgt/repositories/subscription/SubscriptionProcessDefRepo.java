package com.arcgen.usermgt.repositories.subscription;

import com.arcgen.usermgt.models.domain.subscription.SubscriptionProcessDef;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionProcessDefRepo extends CrudRepository<SubscriptionProcessDef, String> {

    SubscriptionProcessDef findBySubscriptionProcessDefId(String subscriptionProcessDefId);

}
