package com.arcgen.usermgt.services.domainservices.roledef;

import com.google.gson.Gson;
import com.arcgen.usermgt.config.AppConstant;
import com.arcgen.usermgt.models.domain.menudef.MenuDef;
import com.arcgen.usermgt.models.domain.menudef.MenuRoleDef;
import com.arcgen.usermgt.models.domain.roledef.RoleAccessDef;
import com.arcgen.usermgt.models.domain.roledef.RoleDef;
import com.arcgen.usermgt.models.domain.roledef.RoleDefUpdateFlag;
import com.arcgen.usermgt.models.domain.roledef.RoleMenu;
import com.arcgen.usermgt.models.domain.roledef.RoleMenuAccessInfo;
import com.arcgen.usermgt.models.domain.subscription.CompanyCategory;
import com.arcgen.usermgt.models.domain.usermanagement.AccessDef;
import com.arcgen.usermgt.models.view.menudef.AccessDefView;
import com.arcgen.usermgt.models.view.menudef.ActiveAccess;
import com.arcgen.usermgt.models.view.menudef.MenuAccessInfoVM;
import com.arcgen.usermgt.models.view.menudef.MenuDefVM;
import com.arcgen.usermgt.models.view.roledef.DxrRoleView;
import com.arcgen.usermgt.models.view.menudef.MenuRoleAccessUpdate;
import com.arcgen.usermgt.models.view.roledef.RoleAccessDefUpdate;
import com.arcgen.usermgt.models.view.roledef.RoleMenusUpdate;
import com.arcgen.usermgt.models.view.roledef.RoleWiseMenuAcccessInfoUpdate;
import com.arcgen.usermgt.models.view.menudef.UserMenuAccessView;
import com.arcgen.usermgt.models.view.menudef.UserMenuDef;
import com.arcgen.usermgt.models.view.menudef.UserMenuDefView;
import com.arcgen.usermgt.models.view.roledef.DxrRole;
import com.arcgen.usermgt.models.view.roledef.RoleWiseMenuAccessVM;
import com.arcgen.usermgt.repositories.menudef.MenuDefRepo;
import com.arcgen.usermgt.repositories.menudef.MenuRoleDefRepo;
import com.arcgen.usermgt.repositories.roledef.RoleAccessDefRepo;
import com.arcgen.usermgt.repositories.roledef.RoleDefRepo;
import com.arcgen.usermgt.repositories.roledef.RoleDefUpdateFlagRepo;
import com.arcgen.usermgt.repositories.roledef.RoleMenuAccessInfoRepo;
import com.arcgen.usermgt.repositories.roledef.RoleMenuRepo;
import com.arcgen.usermgt.repositories.subscription.CompanyCategoryRepo;
import com.arcgen.usermgt.repositories.usermanagement.AccessDefRepo;
import com.arcgen.usermgt.util.DateTimeService;
import com.arcgen.usermgt.util.UtilService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleDefDomainServiceImpl implements RoleDefDomainService {

    @Autowired
    MenuDefRepo menuDefRepo;

    @Autowired
    AccessDefRepo accessDefRepo;

    @Autowired
    MenuRoleDefRepo menuRoleDefRepo;

    @Autowired
    RoleAccessDefRepo roleAccessDefRepo;

    @Autowired
    RoleDefRepo roleDefRepo;

    @Autowired
    RoleMenuRepo roleMenuRepo;

    @Autowired
    RoleDefUpdateFlagRepo roleDefUpdateFlagRepo;

    @Autowired
    RoleMenuAccessInfoRepo roleMenuAccessInfoRepo;

    @Autowired
    UtilService utilService;

    @Autowired
    DateTimeService dateTimeService;

    @Autowired
    CompanyCategoryRepo companyCategoryRepo;

//    private static List<CompanyCategory> companyCategorys = new ArrayList<>();
//    @PostConstruct
//    void onInit() {
//        companyCategorys = companyCategoryRepo.findAll();
//    }
    public List<DxrRole> getAllRoles(String langIndex) {
        List<DxrRole> dxrRoleList = new ArrayList<>();
        List<RoleDef> roleDefList = roleDefRepo.findAll();
        if (roleDefList != null) {
            for (RoleDef roleDef : roleDefList) {
                DxrRole dxrRole = new DxrRole();
                dxrRole.setRoleDefId(roleDef.getRoleDefId());

                if (AppConstant.LANG_INDEX_ENGLISH.equals(langIndex)) {
                    dxrRole.setRoleName(roleDef.getRoleNameEng());
                } else {
                    dxrRole.setRoleName(roleDef.getRoleName());
                }

                dxrRole.setRoleCode(roleDef.getRoleCode());
                dxrRole.setRoleDescription(roleDef.getRoleDescription());
                dxrRole.setCompanyCategoryId(roleDef.getCompanyCategoryId());

                if (roleDef.getCompanyCategoryId() != null) {
                    CompanyCategory companyCategory = companyCategoryRepo.findByCompanyCategoryId(roleDef.getCompanyCategoryId());

                    if (companyCategory != null) {
                        dxrRole.setCompanyCategoryName(companyCategory.getCategoryName());
                    }
                }

                dxrRoleList.add(dxrRole);
            }

        }

        return dxrRoleList;
    }

    @Override
    public List<RoleWiseMenuAccessVM> getRoleWiseMenuAccessInfoList(String langIndex) {

        List<DxrRole> dxrRoles = getAllRoles(langIndex);
        List< RoleWiseMenuAccessVM> roleWiseMenuAccessVMList = getRoleWiseMenuAccessInfoList(dxrRoles, langIndex);

//        List<RoleMenuAccessInfo> roleMenuAccessInfoList = (List<RoleMenuAccessInfo>) roleMenuAccessInfoRepo.findAll();
//        if (roleMenuAccessInfoList != null) {
//
//            for (int i = 0; i < roleMenuAccessInfoList.size(); i++) {
//
//                RoleWiseMenuAccessVM roleWiseMenuAccessVM = new RoleWiseMenuAccessVM();
//
//                RoleMenuAccessInfo roleMenuAccessInfo = roleMenuAccessInfoList.get(i);
//
//                if (roleMenuAccessInfo.getRoleDefId() != null) {
//                    roleWiseMenuAccessVM = prepareRoleWiseMenuAccess(roleMenuAccessInfo);
//                }
//
//                roleWiseMenuAccessVMList.add(roleWiseMenuAccessVM);
//
//            }
//        }
        return roleWiseMenuAccessVMList;
    }

    public MenuAccessInfoVM MenuDefVMToMenuAccessInfoVM(MenuDefVM menuDefVM, String langIndex) {
        MenuAccessInfoVM menuAccessInfoVM = new MenuAccessInfoVM();

        menuAccessInfoVM.setMenuId(menuDefVM.getMenuId());

        if (langIndex.equals(AppConstant.LANG_INDEX_ENGLISH)) {
            menuAccessInfoVM.setMenuTitle(menuDefVM.getMenuTitleEng());
        } else {
            menuAccessInfoVM.setMenuTitle(menuDefVM.getMenuTitleJpn());
        }

        menuAccessInfoVM.setMenuTitleEng(menuDefVM.getMenuTitleEng());
        menuAccessInfoVM.setMenuTitleJpn(menuDefVM.getMenuTitleJpn());

        menuAccessInfoVM.setMenuUrl(menuDefVM.getMenuUrl());
        menuAccessInfoVM.setParentSegment(menuDefVM.getParentSegment());

        menuAccessInfoVM.setMenuGroupNameEng(menuDefVM.getMenuGroupNameEng());
        menuAccessInfoVM.setMenuGroupNameJpn(menuDefVM.getMenuGroupNameJpn());

        menuAccessInfoVM.setPrimaryMenuNameEng(menuDefVM.getPrimaryMenuNameEng());
        menuAccessInfoVM.setPrimaryMenuNameJpn(menuDefVM.getPrimaryMenuNameJpn());

        menuAccessInfoVM.setSecondaryMenuNameEng(menuDefVM.getSecondaryMenuNameEng());
        menuAccessInfoVM.setSecondaryMenuNameJpn(menuDefVM.getSecondaryMenuNameJpn());

        menuAccessInfoVM.setMenuParent(menuDefVM.getMenuParent());

        menuAccessInfoVM.setMenuTypeId(menuDefVM.getMenuTypeId());
        menuAccessInfoVM.setMenuTypeName(menuDefVM.getMenuTypeName());

        menuAccessInfoVM.setCompanyCategoryId(menuDefVM.getCompanyCategoryId());
        menuAccessInfoVM.setCompanyCategoryName(menuDefVM.getCompanyCategoryName());

        menuAccessInfoVM.setActiveAccess(new ActiveAccess());

        return menuAccessInfoVM;
    }

    ActiveAccess getActiveAccessByRoleDefId(List<ActiveAccess> allActiveAccesses, String roleDefId) {

        ActiveAccess activeAccess = new ActiveAccess();
        if (allActiveAccesses != null) {
            for (ActiveAccess eachActiveAccess : allActiveAccesses) {
                if (eachActiveAccess.getRoleInfo().getRoleDefId().equals(roleDefId)) {
                    activeAccess = eachActiveAccess;
                    break;
                }
            }
        }

        return activeAccess;
    }

    @Override
    public List<RoleWiseMenuAccessVM> getRoleWiseMenuAccessInfoList(List<DxrRole> dxrRoles, String langIndex) {
        List<RoleWiseMenuAccessVM> roleWiseMenuAccessVMList = new ArrayList<>();

        List<MenuDefVM> menuRepository = getMenuRepository(langIndex);

        if (dxrRoles != null) {
            for (DxrRole eachRole : dxrRoles) {
                RoleWiseMenuAccessVM roleWiseMenuAccessVM = new RoleWiseMenuAccessVM();
                roleWiseMenuAccessVM.setRoleDefId(eachRole.getRoleDefId());
                roleWiseMenuAccessVM.setRoleName(eachRole.getRoleName());
                roleWiseMenuAccessVM.setCompanyCategoryId(eachRole.getCompanyCategoryId());
                roleWiseMenuAccessVM.setCompanyCategoryName(eachRole.getCompanyCategoryName());

                RoleMenu roleMenu = roleMenuRepo.findByRoleDefId(eachRole.getRoleDefId());
                List<MenuAccessInfoVM> accessibleMenuList = new ArrayList<>();
                if (roleMenu != null && roleMenu.getMenuIdList() != null) {

//                    List<MenuAccessInfoVM> accessibleMenuList = new ArrayList<>();
                    List<String> menuIdsOfRole = roleMenu.getMenuIdList();
                    for (String menuId : menuIdsOfRole) {
                        if (menuRepository != null) {
                            for (MenuDefVM menuDefVM : menuRepository) {
                                if (menuDefVM.getMenuId().equals(menuId)) {
                                    MenuAccessInfoVM menuAccessInfoVM = MenuDefVMToMenuAccessInfoVM(menuDefVM, langIndex);
                                    ActiveAccess activeAccess = getActiveAccessByRoleDefId(menuDefVM.getAllActiveAccess(), eachRole.getRoleDefId());
                                    menuAccessInfoVM.setActiveAccess(activeAccess);

                                    accessibleMenuList.add(menuAccessInfoVM);
                                }
                            }
                        }
                    }
                }

                roleWiseMenuAccessVM.setAccessibleMenuListOfRole(accessibleMenuList);
                roleWiseMenuAccessVMList.add(roleWiseMenuAccessVM);

            }
        }

        return roleWiseMenuAccessVMList;
    }

    private RoleWiseMenuAccessVM prepareRoleWiseMenuAccess(RoleMenuAccessInfo roleMenuAccessInfo, String langIndex) {
        RoleWiseMenuAccessVM roleWiseMenuAccessVM = new RoleWiseMenuAccessVM();

        String roleDefId = roleMenuAccessInfo.getRoleDefId();

        RoleDef roleDef = roleDefRepo.findByRoleDefId(roleDefId);
        if (roleDef != null) {
            roleWiseMenuAccessVM.setRoleDefId(roleDef.getRoleDefId());
            roleWiseMenuAccessVM.setRoleName(roleDef.getRoleName());
            roleWiseMenuAccessVM.setCompanyCategoryId(roleDef.getCompanyCategoryId());

            if (roleDef.getCompanyCategoryId() != null) {
                CompanyCategory companyCategory = companyCategoryRepo.findByCompanyCategoryId(roleDef.getCompanyCategoryId());
                if (companyCategory != null) {
                    roleWiseMenuAccessVM.setCompanyCategoryName(companyCategory.getCategoryName());
                }
            }
        }
        roleWiseMenuAccessVM.setAccessibleMenuListOfRole(roleMenuAccessInfo.getMenuAccess());

        return roleWiseMenuAccessVM;

    }

    @Override
    public List<MenuDefVM> getMenuRepository(String langIndex) {

        List<MenuDefVM> menuRepository = new ArrayList<>();

        List<MenuDef> menuDefList = menuDefRepo.findAll();
        List<MenuRoleDef> menuRoleDef = menuRoleDefRepo.findAll();
        List<RoleAccessDef> roleAccessDefs = roleAccessDefRepo.findAll();
        List<RoleDef> roleDefs = roleDefRepo.findAll();
        List<AccessDef> accessDefs = accessDefRepo.findAll();
        menuRepository = prepareMenuDefVM(menuDefList, menuRoleDef, roleAccessDefs, roleDefs, accessDefs, langIndex);

        return menuRepository;

    }

    private List<UserMenuAccessView> getChildrenItems(String rootId, List<UserMenuAccessView> menuList, String menuType) {
        List<UserMenuAccessView> childrenList = new ArrayList<>();
        for (UserMenuAccessView eachMenuDef : menuList) {
            if (eachMenuDef.getMenuParent() != null && eachMenuDef.getMenuParent().equals(rootId)) {
                childrenList.add(eachMenuDef);
                List<UserMenuAccessView> grandChildrenList = getChildrenItems(rootId + eachMenuDef.getMenuId() + "|", menuList, menuType);
                if (grandChildrenList != null && grandChildrenList.size() > 0) {
                    eachMenuDef.setChildren(grandChildrenList);
                } else {
                    eachMenuDef.setChildren(new ArrayList<>());
                }
            }
        }

        return childrenList;
    }

    @Override
    public List<UserMenuAccessView> getMenuTree(String langIndex) {
        List<UserMenuAccessView> menuList = getMenuRoleDef(langIndex);
        List<UserMenuAccessView> rootItem = getChildrenItems("", menuList, AppConstant.MENU_TYPE_PRIMARY);
        return rootItem;
    }

    public List<MenuDefVM> prepareMenuDefVM(List<MenuDef> menuDefList, List<MenuRoleDef> menuRoleDef, List<RoleAccessDef> roleAccessDefs, List<RoleDef> roleDefs, List<AccessDef> accessDefs, String langIndex) {

        List<MenuDefVM> menuRepository = new ArrayList<>();

        for (MenuDef eachMenuDef : menuDefList) {

            if (eachMenuDef.getParentDef() == null || eachMenuDef.getParentDef().isEmpty() && eachMenuDef.getMenuTypeId().equals(AppConstant.MENU_TYPE_PRIMARY)) {
                MenuDefVM userMenuAccessViewPrimaryLevelOne = menuDefToMenuDefVM(eachMenuDef, null, null, menuRoleDef, roleAccessDefs, roleDefs, accessDefs, langIndex);

                menuRepository.add(userMenuAccessViewPrimaryLevelOne);

                String primaryParentDefLevelTwo = eachMenuDef.getMenuId().concat("|");
                List<MenuDef> primaryMenuListLevelTwo = getMenuDefListByParent(menuDefList, primaryParentDefLevelTwo, AppConstant.MENU_TYPE_PRIMARY);

                if (primaryMenuListLevelTwo != null && primaryMenuListLevelTwo.size() > 0) {

                    for (MenuDef primaryMenuLevelTwo : primaryMenuListLevelTwo) {
                        MenuDefVM userMenuAccessViewPrimaryLevelTwo = menuDefToMenuDefVM(primaryMenuLevelTwo, eachMenuDef, null, menuRoleDef, roleAccessDefs, roleDefs, accessDefs, langIndex);
                        menuRepository.add(userMenuAccessViewPrimaryLevelTwo);

                        String secondaryParentDefLevelOne = primaryMenuLevelTwo.getParentDef().concat(primaryMenuLevelTwo.getMenuId().concat("|"));

                        List<MenuDef> secondaryMenuListLevelOne = getMenuDefListByParent(menuDefList, secondaryParentDefLevelOne, AppConstant.MENU_TYPE_SECONDARY);

                        if (secondaryMenuListLevelOne != null && secondaryMenuListLevelOne.size() > 0) {
                            for (MenuDef secondaryMenuLevelOne : secondaryMenuListLevelOne) {
                                MenuDefVM userMenuAccessViewSecondaryLevelOne = menuDefToMenuDefVM(secondaryMenuLevelOne, primaryMenuLevelTwo, null, menuRoleDef, roleAccessDefs, roleDefs, accessDefs, langIndex);
                                menuRepository.add(userMenuAccessViewSecondaryLevelOne);

                                String secondaryParentDefLevelTwo = secondaryMenuLevelOne.getParentDef().concat(secondaryMenuLevelOne.getMenuId().concat("|"));

                                List<MenuDef> secondaryMenuListLevelTwo = getMenuDefListByParent(menuDefList, secondaryParentDefLevelTwo, AppConstant.MENU_TYPE_SECONDARY);
                                if (secondaryMenuListLevelTwo != null && secondaryMenuListLevelTwo.size() > 0) {
                                    for (MenuDef secondaryMenuLevelTwo : secondaryMenuListLevelTwo) {
                                        MenuDefVM userMenuAccessViewSecondaryLevelTwo = menuDefToMenuDefVM(secondaryMenuLevelTwo, primaryMenuLevelTwo, secondaryMenuLevelOne, menuRoleDef, roleAccessDefs, roleDefs, accessDefs, langIndex);
                                        menuRepository.add(userMenuAccessViewSecondaryLevelTwo);

                                    }
                                }
                            }
                        }
                    }

                } else {

                    List<MenuDef> secondaryMenuListLevelOne = getMenuDefListByParent(menuDefList, primaryParentDefLevelTwo, AppConstant.MENU_TYPE_SECONDARY);

                    if (secondaryMenuListLevelOne != null && secondaryMenuListLevelOne.size() > 0) {
                        for (MenuDef secondaryMenuLevelOne : secondaryMenuListLevelOne) {
                            MenuDefVM userMenuAccessViewSecondaryLevelOne = menuDefToMenuDefVM(secondaryMenuLevelOne, eachMenuDef, null, menuRoleDef, roleAccessDefs, roleDefs, accessDefs, langIndex);
                            menuRepository.add(userMenuAccessViewSecondaryLevelOne);

                            String secondaryParentDefLevelOne = secondaryMenuLevelOne.getParentDef().concat(secondaryMenuLevelOne.getMenuId().concat("|"));

                            List<MenuDef> secondaryMenuListLevelTwo = getMenuDefListByParent(menuDefList, secondaryParentDefLevelOne, AppConstant.MENU_TYPE_SECONDARY);
                            if (secondaryMenuListLevelTwo != null && secondaryMenuListLevelTwo.size() > 0) {
                                for (MenuDef secondaryMenuLevelTwo : secondaryMenuListLevelTwo) {
                                    MenuDefVM userMenuAccessViewSecondaryLevelTwo = menuDefToMenuDefVM(secondaryMenuLevelTwo, eachMenuDef, secondaryMenuLevelOne, menuRoleDef, roleAccessDefs, roleDefs, accessDefs, langIndex);
                                    menuRepository.add(userMenuAccessViewSecondaryLevelTwo);

                                }
                            }
                        }
                    }

                }

            }

        }

        return menuRepository;
    }

    public MenuDefVM menuDefToMenuDefVM(MenuDef menuDef, MenuDef primaryMenuParent, MenuDef secondaryMenuParent, List<MenuRoleDef> menuRoleDef, List<RoleAccessDef> roleAccessDefs, List<RoleDef> roleDefs, List<AccessDef> accessDefs, String langIndex) {
        MenuDefVM menuDefVM = new MenuDefVM();

        menuDefVM.setMenuId(menuDef.getMenuId());

        menuDefVM.setMenuTitleEng(menuDef.getMenuTitleEng());

        menuDefVM.setMenuTitleJpn(menuDef.getMenuTitleJpn());

        menuDefVM.setMenuUrl(menuDef.getMenuUrl());

        if (menuDef.getParentSegment() != null) {
            menuDefVM.setParentSegment(menuDef.getParentSegment());
        } else {
            menuDefVM.setParentSegment("");
        }

        if (menuDef.getMenuTypeId().equals(AppConstant.MENU_TYPE_PRIMARY) && primaryMenuParent != null) {
            menuDefVM.setMenuGroupNameEng(primaryMenuParent.getMenuTitleEng());
            menuDefVM.setMenuGroupNameJpn(primaryMenuParent.getMenuTitleJpn());

        } else if (menuDef.getMenuTypeId().equals(AppConstant.MENU_TYPE_SECONDARY) && secondaryMenuParent != null) {

            menuDefVM.setMenuGroupNameEng(secondaryMenuParent.getMenuTitleEng());
            menuDefVM.setMenuGroupNameJpn(secondaryMenuParent.getMenuTitleJpn());

        } else {
            menuDefVM.setMenuGroupNameEng("");
            menuDefVM.setMenuGroupNameJpn("");
        }

        if (primaryMenuParent != null) {
            menuDefVM.setPrimaryMenuNameEng(primaryMenuParent.getMenuTitleEng());
            menuDefVM.setPrimaryMenuNameJpn(primaryMenuParent.getMenuTitleJpn());

        } else {
            menuDefVM.setPrimaryMenuNameEng("");
            menuDefVM.setPrimaryMenuNameJpn("");

        }

        if (secondaryMenuParent != null) {
            menuDefVM.setSecondaryMenuNameEng(secondaryMenuParent.getMenuTitleEng());
            menuDefVM.setSecondaryMenuNameJpn(secondaryMenuParent.getMenuTitleJpn());

        } else {
            menuDefVM.setSecondaryMenuNameEng("");
            menuDefVM.setSecondaryMenuNameJpn("");

        }

        menuDefVM.setMenuParent(menuDef.getParentDef());
        menuDefVM.setMenuTypeId(menuDef.getMenuTypeId());

        if (menuDef.getMenuTypeId().equals(AppConstant.MENU_TYPE_PRIMARY)) {
            menuDefVM.setMenuTypeName(AppConstant.MENU_TYPE_NAME_PRIMARY);

        } else if (menuDef.getMenuTypeId().equals(AppConstant.MENU_TYPE_SECONDARY)) {

            menuDefVM.setMenuTypeName(AppConstant.MENU_TYPE_NAME_SECONDARY);

        }

        menuDefVM.setCompanyCategoryId(menuDef.getMenuCategoryId());

        if (menuDef.getMenuCategoryId().equals(AppConstant.DUMPER_CATEGORY_VALUE)) {
            menuDefVM.setCompanyCategoryName(AppConstant.DUMPER_CATEGORY);

        } else if (menuDef.getMenuCategoryId().equals(AppConstant.TRANSPOTER_CATEGORY_VALUE)) {
            menuDefVM.setCompanyCategoryName(AppConstant.TRANSPOTER_CATAGORY);

        } else if (menuDef.getMenuCategoryId().equals(AppConstant.PROCESSOR_CATEGORY_VALUE)) {
            menuDefVM.setCompanyCategoryName(AppConstant.PROCESSOR_CATEGORY);
        }

        List<ActiveAccess> activeAccesses = prepareActiveAccesses(menuDefVM.getMenuId(), menuRoleDef, roleAccessDefs, roleDefs, accessDefs, langIndex);
        if (activeAccesses != null) {
            menuDefVM.setAllActiveAccess(activeAccesses);
        } else {
            menuDefVM.setAllActiveAccess(new ArrayList<>());
        }

        return menuDefVM;
    }

    @Override
    public String saveRolesWiseMenuIdList(String language, List<RoleMenusUpdate> rolesWiseMenuIdList) {

        for (RoleMenusUpdate roleMenusUpdate : rolesWiseMenuIdList) {
            RoleMenu savedRoleMenu = new RoleMenu();
            savedRoleMenu = roleMenuRepo.findByRoleDefId(roleMenusUpdate.getRoleDefId());
            if (savedRoleMenu != null) {
                savedRoleMenu.setMenuIdList(roleMenusUpdate.getMenuIdList());
                roleMenuRepo.save(savedRoleMenu);
            } else {
                RoleMenu newRoleMenu = new RoleMenu();
                String newIdString = utilService.generateUniqueId();
                newRoleMenu.setRoleMenuId(newIdString);
                newRoleMenu.setRoleDefId(roleMenusUpdate.getRoleDefId());
                newRoleMenu.setMenuIdList(roleMenusUpdate.getMenuIdList());
                roleMenuRepo.save(newRoleMenu);
            }
        }

        return AppConstant.TRUE_VALUE;
    }

    @Override
    public String saveRoleWiseMenuAccessInfoList(String language, List<RoleWiseMenuAcccessInfoUpdate> roleWiseMenuAccessInfoList) {

        for (RoleWiseMenuAcccessInfoUpdate roleMenusUpdate : roleWiseMenuAccessInfoList) {

            String accessibleMenuListOfRoleString = "";
            Gson gson = new Gson();
            if (roleMenusUpdate.getAccessibleMenuListOfRole() != null) {
                accessibleMenuListOfRoleString = gson.toJson(roleMenusUpdate.getAccessibleMenuListOfRole());
            }

            RoleMenuAccessInfo savedRoleMenu = new RoleMenuAccessInfo();
            savedRoleMenu = roleMenuAccessInfoRepo.findByRoleDefId(roleMenusUpdate.getRoleDefId());
            if (savedRoleMenu != null) {

                savedRoleMenu.setMenuAccess(accessibleMenuListOfRoleString);
                roleMenuAccessInfoRepo.save(savedRoleMenu);
            } else {
                RoleMenuAccessInfo newRoleMenu = new RoleMenuAccessInfo();
                String newIdString = utilService.generateUniqueId();
                newRoleMenu.setRoleMenuAccessInfoId(newIdString);
                newRoleMenu.setRoleDefId(roleMenusUpdate.getRoleDefId());
                newRoleMenu.setMenuAccess(accessibleMenuListOfRoleString);
                roleMenuAccessInfoRepo.save(newRoleMenu);
            }
        }

        return AppConstant.TRUE_VALUE;
    }

    @Override
    public MenuRoleAccessUpdate saveMenuRoleAccess(String language, MenuRoleAccessUpdate menuRoleAccess) {
        MenuRoleAccessUpdate savedMenuRoleAccessVM = new MenuRoleAccessUpdate();
        MenuRoleDef menuRoleDef = new MenuRoleDef();
        menuRoleDef = menuRoleDefRepo.findByMenuId(menuRoleAccess.getMenuDefId());

        MenuRoleDef preparedMenuRoleDef = menuRoleAccessUpdateToMenuRoleDef(menuRoleDef, menuRoleAccess);

        if (preparedMenuRoleDef != null) {
            preparedMenuRoleDef = menuRoleDefRepo.save(preparedMenuRoleDef);
            savedMenuRoleAccessVM = menuRoleAccess;
        }

        updateRoleDefUpdateFlag();

        return savedMenuRoleAccessVM;
    }

    MenuRoleDef menuRoleAccessUpdateToMenuRoleDef(MenuRoleDef menuRoleDef, MenuRoleAccessUpdate menuRoleAccess) {
        List<String> roleAccessIdList = new ArrayList<>();

        for (RoleAccessDefUpdate roleAccessInfo : menuRoleAccess.getRoleAccessList()) {
            RoleAccessDef savedRoleAccessDef = new RoleAccessDef();
            savedRoleAccessDef = roleAccessDefRepo.findByRoleIdAndAccessDefId(roleAccessInfo.getRoleDefId(), roleAccessInfo.getAccessDefId());
            roleAccessIdList.add(savedRoleAccessDef.getRoleAccessDefId());

        }

        if (menuRoleDef != null && roleAccessIdList != null) {
            menuRoleDef.setRoleDefList(roleAccessIdList);

        } else if (menuRoleDef == null && roleAccessIdList != null) {
            String newIdString = utilService.generateUniqueId();

            menuRoleDef = new MenuRoleDef();
            menuRoleDef.setMenuRoleDefId(newIdString);
            menuRoleDef.setMenuId(menuRoleAccess.getMenuDefId());
            menuRoleDef.setRoleDefList(roleAccessIdList);

        }

        return menuRoleDef;
    }

    void updateRoleDefUpdateFlag() {
        RoleDefUpdateFlag roleDefUpdateFlag = roleDefUpdateFlagRepo.findByRoleDefUpdateFlagId(AppConstant.ROLE_DEF_UPDATE_FLAG_ID);
        roleDefUpdateFlag.setUpdateDate(dateTimeService.getCurrentTime());
        roleDefUpdateFlagRepo.save(roleDefUpdateFlag);
    }

    @Override
    public List<DxrRoleView> getDxrRoles(String langIndex) {
        List<DxrRoleView> dxrRoles = new ArrayList<>();

        List<RoleDef> roleDefs = roleDefRepo.findAll();

        if (roleDefs != null) {
            for (RoleDef roleDef : roleDefs) {
                DxrRoleView dxrRole = roleDefDomainToView(roleDef, langIndex);
                if (dxrRole != null) {
                    dxrRoles.add(dxrRole);
                }
            }
        }

        return dxrRoles;

    }

    public DxrRoleView roleDefDomainToView(RoleDef roleDef, String langIndex) {
        DxrRoleView dxrRole = new DxrRoleView();
        dxrRole.setRoleDefId(roleDef.getRoleDefId());

        if (AppConstant.LANG_INDEX_ENGLISH.equals(langIndex)) {
            dxrRole.setRoleName(roleDef.getRoleNameEng());
        } else {
            dxrRole.setRoleName(roleDef.getRoleName());
        }

        dxrRole.setRoleCode(roleDef.getRoleCode());
        dxrRole.setRoleDescription(roleDef.getRoleDescription());
        dxrRole.setCompanyCategoryId(roleDef.getCompanyCategoryId());
        dxrRole.setCompanyCategoryName(getCompanyCategoryName(roleDef.getCompanyCategoryId(), langIndex));

        return dxrRole;
    }

    String getCompanyCategoryName(String categoryId, String langIndex) {
        List<CompanyCategory> companyCategorys = companyCategoryRepo.findAll();
        String categoryName = "";
        for (CompanyCategory companyCategory : companyCategorys) {
            if (companyCategory.getCompanyCategoryId().equals(categoryId)) {
                categoryName = companyCategory.getCategoryName();
            }
        }

        return categoryName;
    }
//    
//    public List<UserMenuAccessView> getUserMenuAccessView(){
//        
//    }
//    

    public UserMenuAccessView prepareAccessDefOfMenu(UserMenuAccessView userMenuAccessView, List<MenuRoleDef> menuRoleDef, List<RoleAccessDef> roleAccessDefs, List<RoleDef> roleDefs, List<AccessDef> accessDefs, String langIndex) {
        List<ActiveAccess> menuAccesses = prepareActiveAccesses(userMenuAccessView.getMenuId(), menuRoleDef, roleAccessDefs, roleDefs, accessDefs, langIndex);
        if (menuAccesses != null) {
            userMenuAccessView.setAllActiveAccess(menuAccesses);
        }
        return userMenuAccessView;
    }

    public List<ActiveAccess> prepareActiveAccesses(String menuId, List<MenuRoleDef> menuRoleDefList, List<RoleAccessDef> roleAccessDefs, List<RoleDef> roleDefs, List<AccessDef> accessDefs, String langIndex) {
        List<ActiveAccess> menuAccesses = new ArrayList<>();
        List<String> menuRoleAccessDefIds = getMenuRoleAccessDef(menuId, menuRoleDefList);

        if (menuRoleAccessDefIds != null) {
            for (String menuRoleAccessDefId : menuRoleAccessDefIds) {
                ActiveAccess activeAccess = getActiveAccessDefByRoleAccessDef(menuRoleAccessDefId, roleAccessDefs, roleDefs, accessDefs, langIndex);
                menuAccesses.add(activeAccess);
            }
        }

        return menuAccesses;
    }

    ActiveAccess getActiveAccessDefByRoleAccessDef(String roleAccessDefId, List<RoleAccessDef> roleAccessDefs, List<RoleDef> roleDefs, List<AccessDef> accessDefs, String langIndex) {

        ActiveAccess activeAccess = new ActiveAccess();

        RoleAccessDef roleAccessDef = getRoleAccessDefByRoleAccessDefId(roleAccessDefId, roleAccessDefs);

        if (roleAccessDef != null) {
            RoleDef roleDef = getRoleDefById(roleAccessDef.getRoleId(), roleDefs);
            AccessDef accessDef = getAccessDefById(roleAccessDef.getAccessDefId(), accessDefs);
            activeAccess = prepareActiveAccessFromRoleDefAndAccessDef(roleDef, accessDef, langIndex);
        }

        return activeAccess;
    }

    ActiveAccess prepareActiveAccessFromRoleDefAndAccessDef(RoleDef roleDef, AccessDef accessDef, String langIndex) {
        ActiveAccess activeAccess = new ActiveAccess();
        DxrRoleView dxrRoleView = roleDefDomainToView(roleDef, langIndex);
        AccessDefView accessDefView = activeAccessDomainToView(accessDef);
        activeAccess.setRoleInfo(dxrRoleView);
        activeAccess.setAccessInfo(accessDefView);
        return activeAccess;
    }

    AccessDefView activeAccessDomainToView(AccessDef accessDef) {
        AccessDefView accessDefView = new AccessDefView();

        accessDefView.setAccessDefId(accessDef.getAccessDefId());
        accessDefView.setAccessTitle(accessDef.getAccessTitle());

        return accessDefView;
    }

    @Override
    public RoleDef getRoleDefById(String roleDefId, List<RoleDef> roleDefs) {
        RoleDef roleDef = new RoleDef();

        for (RoleDef roleDef1 : roleDefs) {
            if (roleDef1.getRoleDefId().equals(roleDefId)) {
                roleDef = roleDef1;
                break;
            }
        }

        return roleDef;
    }

    AccessDef getAccessDefById(String accessDefId, List<AccessDef> accessDefs) {
        AccessDef accessDef = new AccessDef();

        for (AccessDef accessDef1 : accessDefs) {
            if (accessDef1.getAccessDefId().equals(accessDefId)) {
                accessDef = accessDef1;
                break;
            }
        }

        return accessDef;
    }

    RoleAccessDef getRoleAccessDefByRoleAccessDefId(String roleAccessDefId, List<RoleAccessDef> roleAccessDefs) {
        RoleAccessDef roleAccessDef = new RoleAccessDef();

        for (RoleAccessDef roleAccessDef1 : roleAccessDefs) {
            if (roleAccessDef1.getRoleAccessDefId().equals(roleAccessDefId)) {
                roleAccessDef = roleAccessDef1;
                break;
            }
        }

        return roleAccessDef;
    }

    List<String> getMenuRoleAccessDef(String menuId, List<MenuRoleDef> menuRoleDefList) {
        List<String> menuRoleAccessDef = new ArrayList<>();

        if (menuRoleDefList != null) {
            for (MenuRoleDef menuRoleDef : menuRoleDefList) {
                if (menuRoleDef.getMenuId().equals(menuId)) {
                    if (menuRoleDef.getRoleDefList() != null) {
                        menuRoleAccessDef = menuRoleDef.getRoleDefList();
                    }

                }
            }
        }

        return menuRoleAccessDef;
    }

    @Override
    public List<UserMenuAccessView> getMenuRoleDef(String langIndex) {
        List<UserMenuAccessView> userMenuAccessViews = new ArrayList<>();
        List<MenuDef> menuRepository = menuDefRepo.findAll();
        List<MenuRoleDef> menuRoleDef = menuRoleDefRepo.findAll();
        List<RoleAccessDef> roleAccessDefs = roleAccessDefRepo.findAll();
        List<RoleDef> roleDefs = roleDefRepo.findAll();
        List<AccessDef> accessDefs = accessDefRepo.findAll();
        userMenuAccessViews = prepareUserMenuAccessView(langIndex, menuRepository, menuRoleDef, roleAccessDefs, roleDefs, accessDefs);

        return userMenuAccessViews;
    }

    public List<UserMenuAccessView> prepareUserMenuAccessView(String langIndex, List<MenuDef> menuRepository, List<MenuRoleDef> menuRoleDef, List<RoleAccessDef> roleAccessDefs, List<RoleDef> roleDefs, List<AccessDef> accessDefs) {

        List<UserMenuAccessView> userMenuAccessViews = new ArrayList<>();
        List<MenuDef> primaryMenuList = new ArrayList<>();

        for (MenuDef eachMenuDef : menuRepository) {

            if (eachMenuDef.getParentDef() == null || eachMenuDef.getParentDef().isEmpty() && eachMenuDef.getMenuTypeId().equals(AppConstant.MENU_TYPE_PRIMARY)) {
                UserMenuAccessView userMenuAccessViewPrimaryLevelOne = menuDefToUserMenuAccessView(langIndex, eachMenuDef, null, null, menuRoleDef, roleAccessDefs, roleDefs, accessDefs);

                userMenuAccessViews.add(userMenuAccessViewPrimaryLevelOne);

                String primaryParentDefLevelTwo = eachMenuDef.getMenuId().concat("|");
                List<MenuDef> primaryMenuListLevelTwo = getMenuDefListByParent(menuRepository, primaryParentDefLevelTwo, AppConstant.MENU_TYPE_PRIMARY);

                if (primaryMenuListLevelTwo != null && primaryMenuListLevelTwo.size() > 0) {

                    for (MenuDef primaryMenuLevelTwo : primaryMenuListLevelTwo) {
                        UserMenuAccessView userMenuAccessViewPrimaryLevelTwo = menuDefToUserMenuAccessView(langIndex, primaryMenuLevelTwo, eachMenuDef, null, menuRoleDef, roleAccessDefs, roleDefs, accessDefs);
                        userMenuAccessViews.add(userMenuAccessViewPrimaryLevelTwo);

                        String secondaryParentDefLevelOne = primaryMenuLevelTwo.getParentDef().concat(primaryMenuLevelTwo.getMenuId().concat("|"));

                        List<MenuDef> secondaryMenuListLevelOne = getMenuDefListByParent(menuRepository, secondaryParentDefLevelOne, AppConstant.MENU_TYPE_SECONDARY);

                        if (secondaryMenuListLevelOne != null && secondaryMenuListLevelOne.size() > 0) {
                            for (MenuDef secondaryMenuLevelOne : secondaryMenuListLevelOne) {
                                UserMenuAccessView userMenuAccessViewSecondaryLevelOne = menuDefToUserMenuAccessView(langIndex, secondaryMenuLevelOne, primaryMenuLevelTwo, null, menuRoleDef, roleAccessDefs, roleDefs, accessDefs);
                                userMenuAccessViews.add(userMenuAccessViewSecondaryLevelOne);

                                String secondaryParentDefLevelTwo = secondaryMenuLevelOne.getParentDef().concat(secondaryMenuLevelOne.getMenuId().concat("|"));

                                List<MenuDef> secondaryMenuListLevelTwo = getMenuDefListByParent(menuRepository, secondaryParentDefLevelTwo, AppConstant.MENU_TYPE_SECONDARY);
                                if (secondaryMenuListLevelTwo != null && secondaryMenuListLevelTwo.size() > 0) {
                                    for (MenuDef secondaryMenuLevelTwo : secondaryMenuListLevelTwo) {
                                        UserMenuAccessView userMenuAccessViewSecondaryLevelTwo = menuDefToUserMenuAccessView(langIndex, secondaryMenuLevelTwo, primaryMenuLevelTwo, secondaryMenuLevelOne, menuRoleDef, roleAccessDefs, roleDefs, accessDefs);
                                        userMenuAccessViews.add(userMenuAccessViewSecondaryLevelTwo);

                                    }
                                }
                            }
                        }
                    }

                } else {

                    List<MenuDef> secondaryMenuListLevelOne = getMenuDefListByParent(menuRepository, primaryParentDefLevelTwo, AppConstant.MENU_TYPE_SECONDARY);

                    if (secondaryMenuListLevelOne != null && secondaryMenuListLevelOne.size() > 0) {
                        for (MenuDef secondaryMenuLevelOne : secondaryMenuListLevelOne) {
                            UserMenuAccessView userMenuAccessViewSecondaryLevelOne = menuDefToUserMenuAccessView(langIndex, secondaryMenuLevelOne, eachMenuDef, null, menuRoleDef, roleAccessDefs, roleDefs, accessDefs);
                            userMenuAccessViews.add(userMenuAccessViewSecondaryLevelOne);

                            String secondaryParentDefLevelOne = secondaryMenuLevelOne.getParentDef().concat(secondaryMenuLevelOne.getMenuId().concat("|"));

                            List<MenuDef> secondaryMenuListLevelTwo = getMenuDefListByParent(menuRepository, secondaryParentDefLevelOne, AppConstant.MENU_TYPE_SECONDARY);
                            if (secondaryMenuListLevelTwo != null && secondaryMenuListLevelTwo.size() > 0) {
                                for (MenuDef secondaryMenuLevelTwo : secondaryMenuListLevelTwo) {
                                    UserMenuAccessView userMenuAccessViewSecondaryLevelTwo = menuDefToUserMenuAccessView(langIndex, secondaryMenuLevelTwo, eachMenuDef, secondaryMenuLevelOne, menuRoleDef, roleAccessDefs, roleDefs, accessDefs);
                                    userMenuAccessViews.add(userMenuAccessViewSecondaryLevelTwo);

                                }
                            }
                        }
                    }

                }

            }

        }

        return userMenuAccessViews;
    }

    List<MenuDef> getMenuDefListByParent(List<MenuDef> menuRepository, String parentDef, String menuType) {

        List<MenuDef> childMenuDefs = new ArrayList<>();

        for (MenuDef eachMenuDef : menuRepository) {
            if (eachMenuDef.getParentDef() != null && eachMenuDef.getParentDef().equals(parentDef) && eachMenuDef.getMenuTypeId().equals(menuType)) {
                childMenuDefs.add(eachMenuDef);
            }
        }

        return childMenuDefs;
    }

    public UserMenuAccessView menuDefToUserMenuAccessView(String langIndex, MenuDef menuDef, MenuDef primaryMenuParent, MenuDef secondaryMenuParent, List<MenuRoleDef> menuRoleDef, List<RoleAccessDef> roleAccessDefs, List<RoleDef> roleDefs, List<AccessDef> accessDefs) {
        UserMenuAccessView userMenuAccessView = new UserMenuAccessView();

        userMenuAccessView.setMenuId(menuDef.getMenuId());

        if (langIndex.equals(AppConstant.LANG_INDEX_ENGLISH)) {
            userMenuAccessView.setMenuTitle(menuDef.getMenuTitleEng());
        } else {
            userMenuAccessView.setMenuTitle(menuDef.getMenuTitleJpn());
        }

        userMenuAccessView.setMenuUrl(menuDef.getMenuUrl());

        if (menuDef.getParentSegment() != null) {
            userMenuAccessView.setParentSegment(menuDef.getParentSegment());
        } else {
            userMenuAccessView.setParentSegment("");
        }

        if (menuDef.getMenuTypeId().equals(AppConstant.MENU_TYPE_PRIMARY) && primaryMenuParent != null) {
            if (langIndex.equals(AppConstant.LANG_INDEX_ENGLISH)) {
                userMenuAccessView.setMenuGroupName(primaryMenuParent.getMenuTitleEng());
            } else {
                userMenuAccessView.setMenuGroupName(primaryMenuParent.getMenuTitleJpn());
            }

        } else if (menuDef.getMenuTypeId().equals(AppConstant.MENU_TYPE_SECONDARY) && secondaryMenuParent != null) {

            if (langIndex.equals(AppConstant.LANG_INDEX_ENGLISH)) {
                userMenuAccessView.setMenuGroupName(secondaryMenuParent.getMenuTitleEng());
            } else {
                userMenuAccessView.setMenuGroupName(secondaryMenuParent.getMenuTitleJpn());
            }

        } else {
            userMenuAccessView.setMenuGroupName("");
        }

        if (primaryMenuParent != null) {
            if (langIndex.equals(AppConstant.LANG_INDEX_ENGLISH)) {
                userMenuAccessView.setPrimaryMenuName(primaryMenuParent.getMenuTitleEng());
            } else {
                userMenuAccessView.setPrimaryMenuName(primaryMenuParent.getMenuTitleJpn());
            }

        } else {
            userMenuAccessView.setPrimaryMenuName("");

        }

        if (secondaryMenuParent != null) {
            if (langIndex.equals(AppConstant.LANG_INDEX_ENGLISH)) {
                userMenuAccessView.setSecondaryMenuName(secondaryMenuParent.getMenuTitleEng());
            } else {
                userMenuAccessView.setSecondaryMenuName(secondaryMenuParent.getMenuTitleJpn());
            }

        } else {
            userMenuAccessView.setSecondaryMenuName("");

        }

        userMenuAccessView.setMenuParent(menuDef.getParentDef());
        userMenuAccessView.setMenuTypeId(menuDef.getMenuTypeId());

        if (menuDef.getMenuTypeId().equals(AppConstant.MENU_TYPE_PRIMARY)) {
            userMenuAccessView.setMenuTypeName(AppConstant.MENU_TYPE_NAME_PRIMARY);

        } else if (menuDef.getMenuTypeId().equals(AppConstant.MENU_TYPE_SECONDARY)) {

            userMenuAccessView.setMenuTypeName(AppConstant.MENU_TYPE_NAME_SECONDARY);

        }

        userMenuAccessView.setCompanyCategoryId(menuDef.getMenuCategoryId());

        if (menuDef.getMenuCategoryId().equals(AppConstant.DUMPER_CATEGORY_VALUE)) {
            userMenuAccessView.setCompanyCategoryName(AppConstant.DUMPER_CATEGORY);

        } else if (menuDef.getMenuCategoryId().equals(AppConstant.TRANSPOTER_CATEGORY_VALUE)) {
            userMenuAccessView.setCompanyCategoryName(AppConstant.TRANSPOTER_CATAGORY);

        } else if (menuDef.getMenuCategoryId().equals(AppConstant.PROCESSOR_CATEGORY_VALUE)) {
            userMenuAccessView.setCompanyCategoryName(AppConstant.PROCESSOR_CATEGORY);
        }

        List<ActiveAccess> activeAccesses = prepareActiveAccesses(userMenuAccessView.getMenuId(), menuRoleDef, roleAccessDefs, roleDefs, accessDefs, langIndex);
        if (activeAccesses != null) {
            userMenuAccessView.setAllActiveAccess(activeAccesses);
        } else {
            userMenuAccessView.setAllActiveAccess(new ArrayList<>());
        }

        return userMenuAccessView;
    }

    UserMenuDef MenuAccessInfoVMToUserMenuDef(UserMenuDefView userMenuDefView) {
        UserMenuDef userMenuDef = new UserMenuDef();

        userMenuDef.setMenuId(userMenuDefView.getMenuId());
        userMenuDef.setMenuTitleEng(userMenuDefView.getMenuTitleEng());
        userMenuDef.setMenuTitleJpn(userMenuDefView.getMenuTitleJpn());
        userMenuDef.setMenuUrl(userMenuDefView.getMenuUrl());
        userMenuDef.setParentSegment(userMenuDefView.getParentSegment());
        userMenuDef.setMenuParent(userMenuDefView.getMenuParent());
        userMenuDef.setMenuTypeId(userMenuDefView.getMenuTypeId());
        userMenuDef.setCompanyCategoryId(userMenuDefView.getCompanyCategoryId());
        userMenuDef.setChild(new ArrayList<>());

        return userMenuDef;

    }

    UserMenuDefView MenuAccessInfoVMToUserMenuDefView(MenuAccessInfoVM useAccessInfoVM) {
        UserMenuDefView userMenuDef = new UserMenuDefView();

        userMenuDef.setMenuId(useAccessInfoVM.getMenuId());
        userMenuDef.setMenuTitleJpn(useAccessInfoVM.getMenuTitleEng());
        userMenuDef.setMenuTitleJpn(useAccessInfoVM.getMenuTitleJpn());
        userMenuDef.setMenuUrl(useAccessInfoVM.getMenuUrl());
        userMenuDef.setParentSegment(useAccessInfoVM.getParentSegment());
        userMenuDef.setMenuParent(useAccessInfoVM.getMenuParent());
        userMenuDef.setMenuTypeId(useAccessInfoVM.getMenuTypeId());
        userMenuDef.setCompanyCategoryId(useAccessInfoVM.getCompanyCategoryId());
        userMenuDef.setActiveAccess(useAccessInfoVM.getActiveAccess());
//        userMenuDef.setChild(new ArrayList<>());

        return userMenuDef;

    }

    List<UserMenuDefView> prepareRoleWiseMenuAcccessListForSelectedUser(List<DxrRole> selectedUserRoleList, List<RoleWiseMenuAccessVM> roleWiseMenuAcccessList) {
        List<UserMenuDefView> userRoleWiseMenuAccessList = new ArrayList<>();

        if (selectedUserRoleList != null) {
            selectedUserRoleList.forEach(element -> {
                if (roleWiseMenuAcccessList != null) {
                    roleWiseMenuAcccessList.forEach(item -> {
//                        if (element.getRoleDefId() == item.getRoleDefId()) {
                        int checkValue = 0;
                        if (item.getAccessibleMenuListOfRole() != null) {
//                                item.getAccessibleMenuListOfRole().forEach(newMenu -> 
                            for (MenuAccessInfoVM newMenu : item.getAccessibleMenuListOfRole()) {

                                boolean existFlag = false;
                                if (userRoleWiseMenuAccessList != null && userRoleWiseMenuAccessList.size() > 0) {
//                                        userRoleWiseMenuAccessList.forEach(oldMenu -> 
                                    for (UserMenuDefView oldMenu : userRoleWiseMenuAccessList) {
                                        if (oldMenu.getMenuId() == newMenu.getMenuId()) {
                                            checkValue++;
                                            existFlag = true;
                                            oldMenu.getAllActiveAccess().add(newMenu.getActiveAccess());
                                            if (oldMenu.getActiveAccess().getAccessInfo().getAccessTitle().length() < newMenu.getActiveAccess().getAccessInfo().getAccessTitle().length()) {
                                                oldMenu.setActiveAccess(newMenu.getActiveAccess());
                                            }
                                        }
                                    }
                                    if (!existFlag) {

                                        userRoleWiseMenuAccessList.add(MenuAccessInfoVMToUserMenuDefView(newMenu));

                                        checkValue++;
                                    }
                                } else {
                                    userRoleWiseMenuAccessList.add(MenuAccessInfoVMToUserMenuDefView(newMenu));

                                }
                            }
                        }

//                        }
                    });

                }

            });
        }

        return userRoleWiseMenuAccessList;

    }

    List<UserMenuDefView> getUserMenuDefViewListByParent(List<UserMenuDefView> menuRepository, String parentDef, String menuType) {

        List<UserMenuDefView> childMenuDefs = new ArrayList<>();

        for (UserMenuDefView eachMenuDef : menuRepository) {
            if (eachMenuDef.getMenuParent() != null && eachMenuDef.getMenuParent().equals(parentDef) && eachMenuDef.getMenuTypeId().equals(menuType)) {
                childMenuDefs.add(eachMenuDef);
            }
        }

        return childMenuDefs;
    }

    public List<UserMenuDef> prepareUserMenuForFrontend(List<UserMenuDefView> menuRepository) {

        List<UserMenuDef> userMenuAccessViews = new ArrayList<>();

        for (UserMenuDefView eachMenuDef : menuRepository) {

            if (eachMenuDef.getMenuParent() == null || eachMenuDef.getMenuParent().isEmpty() && eachMenuDef.getMenuTypeId().equals(AppConstant.MENU_TYPE_PRIMARY)) {

                UserMenuDef userMenuAccessViewPrimaryLevelOne = MenuAccessInfoVMToUserMenuDef(eachMenuDef);
                userMenuAccessViews.add(userMenuAccessViewPrimaryLevelOne);

                String primaryParentDefLevelTwo = eachMenuDef.getMenuId().concat("|");
                List<UserMenuDefView> primaryMenuListLevelTwo = getUserMenuDefViewListByParent(menuRepository, primaryParentDefLevelTwo, AppConstant.MENU_TYPE_PRIMARY);

                if (primaryMenuListLevelTwo != null) {

                    for (UserMenuDefView primaryMenuLevelTwo : primaryMenuListLevelTwo) {
                        UserMenuDef userMenuAccessViewPrimaryLevelTwo = MenuAccessInfoVMToUserMenuDef(primaryMenuLevelTwo);
                        userMenuAccessViewPrimaryLevelOne.getChild().add(userMenuAccessViewPrimaryLevelTwo);

                        String secondaryParentDefLevelOne = primaryMenuLevelTwo.getMenuParent().concat(primaryMenuLevelTwo.getMenuId().concat("|"));

                        List<UserMenuDefView> secondaryMenuListLevelOne = getUserMenuDefViewListByParent(menuRepository, secondaryParentDefLevelOne, AppConstant.MENU_TYPE_SECONDARY);

                        if (secondaryMenuListLevelOne != null) {
                            for (UserMenuDefView secondaryMenuLevelOne : secondaryMenuListLevelOne) {
                                UserMenuDef userMenuAccessViewSecondaryLevelOne = MenuAccessInfoVMToUserMenuDef(secondaryMenuLevelOne);
                                userMenuAccessViewPrimaryLevelTwo.getChild().add(userMenuAccessViewSecondaryLevelOne);

                                String secondaryParentDefLevelTwo = secondaryMenuLevelOne.getMenuParent().concat(secondaryMenuLevelOne.getMenuId().concat("|"));

                                List<UserMenuDefView> secondaryMenuListLevelTwo = getUserMenuDefViewListByParent(menuRepository, secondaryParentDefLevelTwo, AppConstant.MENU_TYPE_SECONDARY);
                                if (secondaryMenuListLevelTwo != null) {
                                    for (UserMenuDefView secondaryMenuLevelTwo : secondaryMenuListLevelTwo) {
                                        UserMenuDef userMenuAccessViewSecondaryLevelTwo = MenuAccessInfoVMToUserMenuDef(secondaryMenuLevelTwo);
                                        userMenuAccessViewPrimaryLevelTwo.getChild().add(userMenuAccessViewSecondaryLevelTwo);

                                    }
                                }
                            }
                        }
                    }

                } else {

                    List<UserMenuDefView> secondaryMenuListLevelOne = getUserMenuDefViewListByParent(menuRepository, primaryParentDefLevelTwo, AppConstant.MENU_TYPE_SECONDARY);

                    if (secondaryMenuListLevelOne != null) {
                        for (UserMenuDefView secondaryMenuLevelOne : secondaryMenuListLevelOne) {
                            UserMenuDef userMenuAccessViewSecondaryLevelOne = MenuAccessInfoVMToUserMenuDef(secondaryMenuLevelOne);
                            userMenuAccessViewPrimaryLevelOne.getChild().add(userMenuAccessViewSecondaryLevelOne);

                            String secondaryParentDefLevelOne = secondaryMenuLevelOne.getMenuParent().concat(secondaryMenuLevelOne.getMenuId().concat("|"));

                            List<UserMenuDefView> secondaryMenuListLevelTwo = getUserMenuDefViewListByParent(menuRepository, secondaryParentDefLevelOne, AppConstant.MENU_TYPE_SECONDARY);
                            if (secondaryMenuListLevelTwo != null) {
                                for (UserMenuDefView secondaryMenuLevelTwo : secondaryMenuListLevelTwo) {
                                    UserMenuDef userMenuAccessViewSecondaryLevelTwo = MenuAccessInfoVMToUserMenuDef(secondaryMenuLevelTwo);
                                    userMenuAccessViewSecondaryLevelOne.getChild().add(userMenuAccessViewSecondaryLevelTwo);

                                }
                            }
                        }
                    }

                }

            }

        }

        return userMenuAccessViews;
    }

}
