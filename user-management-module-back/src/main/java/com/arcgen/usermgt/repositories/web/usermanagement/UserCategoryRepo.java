package com.arcgen.usermgt.repositories.web.usermanagement;

import com.arcgen.usermgt.models.domain.web.usermanagement.UserCategory;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCategoryRepo extends CrudRepository<UserCategory, String> {

    UserCategory findByUserCategoryId(String userCategoryId);

}
