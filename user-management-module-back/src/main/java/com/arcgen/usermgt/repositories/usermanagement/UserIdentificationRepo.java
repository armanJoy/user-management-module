package com.arcgen.usermgt.repositories.usermanagement;

import com.arcgen.usermgt.models.domain.usermanagement.UserIdentification;
import org.springframework.data.repository.CrudRepository;

public interface UserIdentificationRepo extends CrudRepository<UserIdentification, String> {

    UserIdentification findByUserIdAndUserAuth(String userId, String userAuth);

    UserIdentification findByUserId(String userId);

//    UserIdentification findByUserId(String userId);
    UserIdentification findByUserIdentificationId(String userIdentificationId);

}
