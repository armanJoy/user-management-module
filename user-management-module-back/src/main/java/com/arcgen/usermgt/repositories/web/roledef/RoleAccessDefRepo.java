package com.arcgen.usermgt.repositories.web.roledef;

import com.arcgen.usermgt.models.domain.web.roledef.RoleAccessDef;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleAccessDefRepo extends CrudRepository<RoleAccessDef, String> {

    RoleAccessDef findByRoleIdAndAccessDefId(String roleId, String accessDefId);

    @Override
    List<RoleAccessDef> findAll();

}
