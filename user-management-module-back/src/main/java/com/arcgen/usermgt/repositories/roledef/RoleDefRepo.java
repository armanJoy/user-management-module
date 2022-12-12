package com.arcgen.usermgt.repositories.roledef;

import com.arcgen.usermgt.models.domain.roledef.RoleDef;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface RoleDefRepo extends CrudRepository<RoleDef, String> {

    RoleDef findByRoleDefId(String id);

    RoleDef findByRoleName(String roleName);

    @Override
    List<RoleDef> findAll();

//    RoleDef findByRoleDefId(String id);
}
