package com.arcgen.usermgt.repositories.usermanagement;

import com.arcgen.usermgt.models.domain.usermanagement.UserInfo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepo extends CrudRepository<UserInfo, String> {

    @Override
    List<UserInfo> findAll();

    List<UserInfo> findAllByUserInfoId(String id);

    UserInfo findByUserInfoId(String userInfoId);

    UserInfo findByUserAuthId(String userAuthId);

    List<UserInfo> findByUserEmail(String userEmail);

    List<UserInfo> findByUserContact(String userContact);

    List<UserInfo> findAllByUserCategoryId(String userCategoryId);

    List<UserInfo> findAllByUserAuthIdAndUserCategoryId(String userAuthId, String userCategoryId);

    @Query(value = "SELECT user_name FROM user_info WHERE user_info_id=?1", nativeQuery = true)
    String findUserNameById(String id);

}
