package com.arcgen.usermgt.repositories.web.roledef;

import com.arcgen.usermgt.models.domain.web.roledef.RoleMenuAccessInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMenuAccessInfoRepo extends CrudRepository<RoleMenuAccessInfo, String> {

    RoleMenuAccessInfo findByRoleMenuAccessInfoId(String roleMenuAccessInfoId);

    RoleMenuAccessInfo findByRoleDefId(String roleDefId);

}
