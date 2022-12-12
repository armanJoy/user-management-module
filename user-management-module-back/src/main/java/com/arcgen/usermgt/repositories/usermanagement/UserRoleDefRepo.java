package com.arcgen.usermgt.repositories.usermanagement;

import com.arcgen.usermgt.models.domain.usermanagement.UserRoleDef;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleDefRepo extends CrudRepository<UserRoleDef, String> {

    List<UserRoleDef> findByCompanyId(String companyId);

    UserRoleDef findByUserRoleDefId(String userRoleDefId);

    UserRoleDef findByUserIdentificationId(String userIdentificationId);

//    UserRoleDef findByUserIdentificationId(String userIdentificationId);
    @Query(value = "SELECT * FROM user_role_def WHERE user_identification_id = ?1 AND company_id = ?2 AND active='1'", nativeQuery = true)
    UserRoleDef findByUserIdentificationIdAndCompanyId(String userIdentificationId, String companyId);

    @Query(value = "UPDATE user_role_def set active='1' WHERE user_role_def_id=?1 returning *", nativeQuery = true)
    UserRoleDef restore(String id);

}
