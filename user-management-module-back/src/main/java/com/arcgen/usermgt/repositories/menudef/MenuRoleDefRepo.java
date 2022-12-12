package com.arcgen.usermgt.repositories.menudef;

import com.arcgen.usermgt.models.domain.menudef.MenuRoleDef;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface MenuRoleDefRepo extends CrudRepository<MenuRoleDef, String> {

    MenuRoleDef findByMenuId(String menuId);

    @Override
    List<MenuRoleDef> findAll();

}
