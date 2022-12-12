package com.arcgen.usermgt.repositories.web.subscription;

import com.arcgen.usermgt.models.domain.web.subscription.SubscriptionInfo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionInfoRepo extends CrudRepository<SubscriptionInfo, String> {

    @Override
    List<SubscriptionInfo> findAll();

    List<SubscriptionInfo> findAllBySubscriptionInfoId(String id);

    List<SubscriptionInfo> findAllByOrderByDateTimeDesc();

    @Query(value = "SELECT * FROM subscription_info WHERE search_content LIKE %?1% AND status_id IN (?4) ORDER BY date_time DESC LIMIT ?2 OFFSET ?3", nativeQuery = true)
    List<SubscriptionInfo> getSearchItems(String searchKey, Integer pageSize, Integer pageOffset, String[] status);

    public SubscriptionInfo findByEmail(String email);

    public SubscriptionInfo findBySubscriptionInfoId(String subscriptionInfoId);

}
