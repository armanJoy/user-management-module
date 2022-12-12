package com.arcgen.usermgt.repositories.web.roledef;

import com.arcgen.usermgt.models.domain.web.roledef.RoleDef;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface RoleDefRepo extends CrudRepository<RoleDef, String> {

    RoleDef findByRoleDefId(String id);

    RoleDef findByRoleName(String roleName);

    @Override
    List<RoleDef> findAll();

//    RoleDef findByRoleDefId(String id);
}
