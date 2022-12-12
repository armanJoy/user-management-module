package com.arcgen.usermgt.repositories.web.menudef;

import com.arcgen.usermgt.models.domain.web.menudef.MenuRoleDef;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface MenuRoleDefRepo extends CrudRepository<MenuRoleDef, String> {

    MenuRoleDef findByMenuId(String menuId);

    @Override
    List<MenuRoleDef> findAll();

}
