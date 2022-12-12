package com.arcgen.usermgt.repositories.web.menudef;

import com.arcgen.usermgt.models.domain.web.menudef.MenuCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuCategoryRepo extends CrudRepository<MenuCategory, String> {

    MenuCategory findByMenuCategoryId(String menuCategoryId);

}
