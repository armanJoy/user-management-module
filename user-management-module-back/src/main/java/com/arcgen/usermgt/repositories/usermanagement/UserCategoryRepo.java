package com.arcgen.usermgt.repositories.usermanagement;

import com.arcgen.usermgt.models.domain.usermanagement.UserCategory;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCategoryRepo extends CrudRepository<UserCategory, String> {

    UserCategory findByUserCategoryId(String userCategoryId);

}
