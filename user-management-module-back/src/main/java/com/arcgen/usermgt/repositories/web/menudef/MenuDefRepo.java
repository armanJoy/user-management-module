package com.arcgen.usermgt.repositories.web.menudef;

import com.arcgen.usermgt.models.domain.web.menudef.MenuDef;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface MenuDefRepo extends CrudRepository<MenuDef, String> {

    MenuDef findByMenuId(String menuId);

    @Override
    List<MenuDef> findAll();

}
