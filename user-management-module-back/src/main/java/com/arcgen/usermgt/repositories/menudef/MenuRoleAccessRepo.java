package com.arcgen.usermgt.repositories.menudef;

import com.arcgen.usermgt.models.domain.menudef.MenuRoleAccess;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRoleAccessRepo extends CrudRepository<MenuRoleAccess, String> {

    MenuRoleAccess findByMenuRoleAccessId(String menuRoleAccessId);

}
