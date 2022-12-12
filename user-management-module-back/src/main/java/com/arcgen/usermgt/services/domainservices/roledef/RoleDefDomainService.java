package com.arcgen.usermgt.services.domainservices.roledef;

import com.arcgen.usermgt.models.domain.roledef.RoleMenuAccessInfo;
import com.arcgen.usermgt.models.domain.roledef.RoleDef;
import com.arcgen.usermgt.models.view.menudef.MenuDefVM;
import com.arcgen.usermgt.models.view.roledef.DxrRoleView;
import com.arcgen.usermgt.models.view.menudef.MenuRoleAccessUpdate;
import com.arcgen.usermgt.models.view.roledef.RoleMenusUpdate;
import com.arcgen.usermgt.models.view.roledef.RoleWiseMenuAcccessInfoUpdate;
import com.arcgen.usermgt.models.view.menudef.MenuRoleDefUpdate;
import com.arcgen.usermgt.models.view.menudef.UserMenuAccessView;
import com.arcgen.usermgt.models.view.roledef.DxrRole;
import com.arcgen.usermgt.models.view.roledef.RoleWiseMenuAccessVM;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface RoleDefDomainService {

    List<UserMenuAccessView> getMenuTree(String langIndex);

    List<RoleWiseMenuAccessVM> getRoleWiseMenuAccessInfoList(String langIndex);

    List<RoleWiseMenuAccessVM> getRoleWiseMenuAccessInfoList(List<DxrRole> dxrRoles, String langIndex);

    RoleDef getRoleDefById(String roleDefId, List<RoleDef> roleDefs);

//    List<MenuDefView> getMenuDef();
//
//    MenuDefView updateMenuRoleDef(MenuDefView menuDefView);
    List<MenuDefVM> getMenuRepository(String langIndex);

    String saveRolesWiseMenuIdList(String language, List<RoleMenusUpdate> rolesWiseMenuIdList);

    String saveRoleWiseMenuAccessInfoList(String language, List<RoleWiseMenuAcccessInfoUpdate> roleWiseMenuAccessInfoList);

    MenuRoleAccessUpdate saveMenuRoleAccess(String language, MenuRoleAccessUpdate menuRoleAccess);

    List<DxrRoleView> getDxrRoles(String langIndex);

    List<UserMenuAccessView> getMenuRoleDef(String langIndex);

}
