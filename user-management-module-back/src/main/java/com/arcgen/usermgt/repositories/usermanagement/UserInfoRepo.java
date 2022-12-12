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

    @Query(value = "SELECT * FROM user_info WHERE user_company_id = ?1 AND search_content LIKE %?2% AND active='1' LIMIT ?3 OFFSET ?4", nativeQuery = true)
    List<UserInfo> getSearchItems(String companyId, String searchKey, Integer pageSize, Integer pageOffset);

    UserInfo findByUserInfoId(String userInfoId);

    UserInfo findByUserCompanyIdAndUserAuthId(String userCompanyId, String userAuthId);

    UserInfo findByUserCompanyIdAndUserEmail(String userCompanyId, String userEmail);

//    UserInfo findByUserAuthId(String userAuthId);
    List<UserInfo> findByUserEmail(String userEmail);

    List<UserInfo> findByUserContact(String userContact);

    List<UserInfo> findAllByUserCategoryId(String userCategoryId);

    List<UserInfo> findAllByUserAuthIdAndUserCategoryId(String userAuthId, String userCategoryId);

    @Query(value = "SELECT * FROM user_info WHERE user_company_id = ?1 AND active='1' LIMIT 10 OFFSET 0", nativeQuery = true)
    List<UserInfo> findByUserCompanyId(String userCompanyId);

    @Query(value = "SELECT * FROM user_info WHERE user_auth_id = ?1 AND active='1'", nativeQuery = true)
    List<UserInfo> findByUserAuthId(String userAuthId);

//    @Query("SELECT * FROM user_info AS user WHERE user.userCategory='usercategory0002' GROUP BY user.user_company_id")
//    List<CompanyWiseUser> findAllCompanyAdminGroupedByCompany();
    @Query(value = "SELECT * FROM user_info WHERE USER_COMPANY_ID = ?1 AND active='1' AND USER_AUTH_ID IN (SELECT USER_IDENTIFICATION_ID FROM USER_ROLE_DEF WHERE ROLE_ID_LIST LIKE %?2% AND COMPANY_ID = ?1)", nativeQuery = true)
    List<UserInfo> findRolewiseActiveUserByCompany(String companyId, String role);

    @Query(value = "SELECT * FROM user_info WHERE user_info_id IN ( SELECT person_in_charge_id FROM agreement_company_info WHERE agreement_info_id= ?1 )", nativeQuery = true)
    List<UserInfo> getPersonIncharge(String agreementId);

    @Query(value = "UPDATE user_info SET active='0' WHERE user_info_id=?1", nativeQuery = true)
    Object removeItem(String id);

    @Query(value = "SELECT * FROM user_info WHERE USER_COMPANY_ID = ?1 AND USER_AUTH_ID IN (SELECT USER_IDENTIFICATION_ID FROM USER_ROLE_DEF WHERE ROLE_ID_LIST LIKE %?2% AND COMPANY_ID = ?1)", nativeQuery = true)
    List<UserInfo> findRolewiseActiveInactiveUserByCompany(String companyId, String role);

    @Query(value = "SELECT user_name FROM user_info WHERE user_info_id=?1", nativeQuery = true)
    String findUserNameById(String id);

    @Query(value = "UPDATE user_info set active='1' WHERE user_info_id=?1 returning *", nativeQuery = true)
    UserInfo restore(String id);

    List<UserInfo> findAllByUserEmailAndUserCompanyId(String userEmail, String userCompanyId);

}
