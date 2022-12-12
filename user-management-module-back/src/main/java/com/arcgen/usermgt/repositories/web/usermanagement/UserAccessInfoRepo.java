package com.arcgen.usermgt.repositories.web.usermanagement;

import com.arcgen.usermgt.models.domain.web.usermanagement.UserAccessInfo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface UserAccessInfoRepo extends CrudRepository<UserAccessInfo, String> {

    UserAccessInfo findByUserIdentification(String userIdentificationId);

    UserAccessInfo findByUserAccessInfoId(String userAccessInfoId);

    List<UserAccessInfo> findAll();

}
