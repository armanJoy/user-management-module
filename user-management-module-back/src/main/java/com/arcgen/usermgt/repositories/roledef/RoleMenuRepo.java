package com.arcgen.usermgt.repositories.roledef;

import com.arcgen.usermgt.models.domain.roledef.RoleMenu;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMenuRepo extends CrudRepository<RoleMenu, String> {

    RoleMenu findByRoleMenuId(String roleMenuId);

    RoleMenu findByRoleDefId(String roleDefId);

    @Override
    List<RoleMenu> findAll();

}
