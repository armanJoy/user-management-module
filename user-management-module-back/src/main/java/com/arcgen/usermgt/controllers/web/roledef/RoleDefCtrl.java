package com.arcgen.usermgt.controllers.web.roledef;

import com.arcgen.usermgt.models.view.web.menudef.MenuDefVM;
import com.arcgen.usermgt.models.view.web.menudef.MenuRoleAccessUpdate;
import com.arcgen.usermgt.models.view.web.roledef.RoleMenusUpdate;
import com.arcgen.usermgt.models.view.web.roledef.RoleWiseMenuAcccessInfoUpdate;
import com.arcgen.usermgt.models.view.web.menudef.UserMenuAccessView;
import com.arcgen.usermgt.models.view.web.roledef.DxrRoleView;
import com.arcgen.usermgt.models.view.web.roledef.RoleWiseMenuAccessVM;
import com.arcgen.usermgt.services.domainservices.web.roledef.RoleDefDomainService;
import com.arcgen.usermgt.util.DateTimeService;
import com.arcgen.usermgt.util.UtilService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://dxrreleases.com, https://dxr-mob-app.web.app, http://localhost:4200")
@RestController
@RequestMapping("/web/role-def")
public class RoleDefCtrl {

    @Autowired
    DateTimeService dateTimeService;

    @Autowired
    UtilService utilService;

    @Autowired
    RoleDefDomainService roleDefDomainService;

    @RequestMapping(method = RequestMethod.GET, value = "/menu-role-def")
    public List<UserMenuAccessView> getMenuRoleDef(@RequestHeader("langIndex") String language) {
        return roleDefDomainService.getMenuRoleDef(language);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/menu-repository")
    public List<MenuDefVM> getMenuRepository(@RequestHeader("langIndex") String language) {
        return roleDefDomainService.getMenuRepository(language);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/menu-tree")
    public List<UserMenuAccessView> getMenuTree(@RequestHeader("langIndex") String language) {
        return roleDefDomainService.getMenuTree(language);
    }

//    @RequestMapping(method = RequestMethod.POST, value = "/update-menu-role-def")
//    public MenuRoleDefUpdate updateMenuRoleDef(@RequestHeader("langIndex") String language, @RequestBody MenuRoleDefUpdate menuDefView) {
//        return roleDefDomainService.updateMenuRoleDef(menuDefView);
//    }
    @RequestMapping(method = RequestMethod.POST, value = "/update-roles-menu-list")
    public String saveRolesWiseMenuIdList(@RequestHeader("langIndex") String language, @RequestBody List<RoleMenusUpdate> rolesWiseMenuIdList) {
        return roleDefDomainService.saveRolesWiseMenuIdList(language, rolesWiseMenuIdList);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/update-role-menu-access-list")
    public String saveRoleWiseMenuAccessInfoList(@RequestHeader("langIndex") String language, @RequestBody List<RoleWiseMenuAcccessInfoUpdate> roleWiseMenuAccessInfoList) {
        return roleDefDomainService.saveRoleWiseMenuAccessInfoList(language, roleWiseMenuAccessInfoList);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/update-menu-role-access")
    public MenuRoleAccessUpdate saveMenuRoleAccess(@RequestHeader("langIndex") String language, @RequestBody MenuRoleAccessUpdate menuRoleAccess) {
        return roleDefDomainService.saveMenuRoleAccess(language, menuRoleAccess);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/role-wise-menu-access")
    List<RoleWiseMenuAccessVM> getRoleWiseMenuAccessList(@RequestHeader("langIndex") String language) {
        List<RoleWiseMenuAccessVM> roleWiseMenuAccessVMList = new ArrayList<>();

        roleWiseMenuAccessVMList = roleDefDomainService.getRoleWiseMenuAccessInfoList(language);

        return roleWiseMenuAccessVMList;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/dxr-role")
    List<DxrRoleView> getDxrRoles(@RequestHeader("langIndex") String language) {
        List<DxrRoleView> dxrRoleViews = new ArrayList<>();

        dxrRoleViews = roleDefDomainService.getDxrRoles(language);

        return dxrRoleViews;
    }

}
