package com.arcgen.usermgt.repositories.usermanagement;

import com.arcgen.usermgt.models.domain.usermanagement.PrevilagedUser;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrevilagedUserRepo extends CrudRepository<PrevilagedUser, String> {

    @Query(value = "SELECT * FROM previlaged_user where active='1' AND company_id=?1 AND user_id=?2", nativeQuery = true)
    List<PrevilagedUser> findByCompanyIdAndUserId(String companyId, String userId);

    List<PrevilagedUser> findByCompanyIdAndUserIdAndAdminType(String companyId, String userId, String adminType);

    @Query(value = "SELECT * FROM previlaged_user where active='1' AND company_id=?1 AND user_id=?2", nativeQuery = true)
    PrevilagedUser findByCompanyIdAndUserInfoId(String companyId, String userId);

    @Query(value = "UPDATE previlaged_user set active='1' WHERE previlaged_user_id=?1 returning *", nativeQuery = true)
    PrevilagedUser restore(String id);

}
