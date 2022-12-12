package com.arcgen.usermgt.repositories.web.menudef;

import com.arcgen.usermgt.models.domain.web.menudef.MenuType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuTypeRepo extends CrudRepository<MenuType, String> {

    MenuType findByMenuTypeId(String menuTypeId);

}
