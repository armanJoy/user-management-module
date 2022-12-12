package com.arcgen.usermgt.repositories.roledef;

import com.arcgen.usermgt.models.domain.roledef.RoleDefUpdateFlag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDefUpdateFlagRepo extends CrudRepository<RoleDefUpdateFlag, String> {

    RoleDefUpdateFlag findByRoleDefUpdateFlagId(String roleDefUpdateFlag);

}
