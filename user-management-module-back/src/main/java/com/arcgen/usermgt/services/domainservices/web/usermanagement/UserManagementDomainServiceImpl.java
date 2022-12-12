package com.arcgen.usermgt.services.domainservices.web.usermanagement;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.arcgen.usermgt.config.AppConstant;
import com.arcgen.usermgt.models.domain.web.roledef.RoleDef;
import com.arcgen.usermgt.models.domain.web.usermanagement.CompanyAdminAccess;
import com.arcgen.usermgt.models.domain.web.usermanagement.DxrAdminAccess;
import com.arcgen.usermgt.models.domain.web.usermanagement.CompanyPreference;
import com.arcgen.usermgt.models.domain.web.usermanagement.PrevilagedUser;
import com.arcgen.usermgt.models.domain.web.usermanagement.UserAccessInfo;
import com.arcgen.usermgt.models.domain.web.usermanagement.UserIdentification;
import com.arcgen.usermgt.models.domain.web.usermanagement.UserInfo;
import com.arcgen.usermgt.models.domain.web.usermanagement.UserRoleDef;
import com.arcgen.usermgt.models.view.web.menudef.AccessDefView;
import com.arcgen.usermgt.models.view.web.menudef.ActiveAccess;
import com.arcgen.usermgt.models.view.web.menudef.MenuAccessInfoVM;
import com.arcgen.usermgt.models.view.web.menudef.UserMenuDef;
import com.arcgen.usermgt.models.view.web.menudef.UserMenuDefView;
import com.arcgen.usermgt.models.view.web.roledef.DxrRole;
import com.arcgen.usermgt.models.view.web.roledef.DxrRoleView;
import com.arcgen.usermgt.models.view.web.roledef.RoleWiseMenuAccessVM;
import com.arcgen.usermgt.models.view.web.usermanagement.ChangeUserIdentification;
import com.arcgen.usermgt.models.view.web.usermanagement.CompanyAdminAccessVM;
import com.arcgen.usermgt.models.view.web.usermanagement.DefaultCompany;
import com.arcgen.usermgt.models.view.web.usermanagement.DxrAdminAccessVM;
import com.arcgen.usermgt.models.view.web.usermanagement.UserAccessDomain;
import com.arcgen.usermgt.models.view.web.usermanagement.UserIdentificationView;
import com.arcgen.usermgt.models.view.web.usermanagement.UserInfoView;
import com.arcgen.usermgt.repositories.web.usermanagement.CompanyAdminAccessRepo;
import com.arcgen.usermgt.repositories.web.usermanagement.DxrAdminAccessRepo;
import com.arcgen.usermgt.repositories.web.roledef.RoleDefRepo;
import com.arcgen.usermgt.repositories.web.usermanagement.CompanyPreferenceRepo;
import com.arcgen.usermgt.repositories.web.usermanagement.PrevilagedUserRepo;
import com.arcgen.usermgt.repositories.web.usermanagement.UserAccessInfoRepo;
import com.arcgen.usermgt.repositories.web.usermanagement.UserIdentificationRepo;
import com.arcgen.usermgt.repositories.web.usermanagement.UserInfoRepo;
import com.arcgen.usermgt.repositories.web.usermanagement.UserRoleDefRepo;
import com.arcgen.usermgt.services.domainservices.web.roledef.RoleDefDomainService;
import com.arcgen.usermgt.util.UtilService;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagementDomainServiceImpl implements UserManagementDomainService {

    @Autowired
    UserIdentificationRepo userIdentificationRepo;

    @Autowired
    UserAccessInfoRepo userAccessInfoRepo;

    @Autowired
    UserInfoRepo userInfoRepo;

    @Autowired
    PrevilagedUserRepo previlagedUserRepo;

    @Autowired
    RoleDefRepo roleDefRepo;

    @Autowired
    UtilService utilService;

    @Autowired
    DxrAdminAccessRepo dxrAdminAccessRepo;

    @Autowired
    CompanyAdminAccessRepo companyAdminAccessRepo;

    @Autowired
    UserRoleDefRepo userRoleDefRepo;

    @Autowired
    RoleDefDomainService roleDefDomainService;

    @Autowired
    CompanyPreferenceRepo companyPreferenceRepo;

    @Override
    public DefaultCompany saveDefaultCompany(DefaultCompany defaultCompany) {

        CompanyPreference companyPreference = new CompanyPreference();

        UserIdentification userIdentification = userIdentificationRepo.findByUserId(defaultCompany.getUserId());

        if (userIdentification != null) {
            companyPreference.setUserIdentificationPk(userIdentification.getUserIdentificationId());
            companyPreference.setPreferCompanyId(defaultCompany.getDefaultCompanyId());

            CompanyPreference savedCompanyPreference = companyPreferenceRepo.findByUserIdentificationPk(userIdentification.getUserIdentificationId());

            if (savedCompanyPreference != null) {
                companyPreference.setCompanyPreferenceId(savedCompanyPreference.getCompanyPreferenceId());
            } else {
                companyPreference.setCompanyPreferenceId(utilService.generateUniqueId());
            }

            companyPreferenceRepo.save(companyPreference);

        } else {
            defaultCompany = null;
        }

        return defaultCompany;

    }

    public List<DxrRole> prepareUserRoleListForUser(String userInfoId, String companyId, String langIndex) {
        List<DxrRole> dxrRoleList = new ArrayList<>();

        return dxrRoleList;
    }

    List<UserAccessDomain> prepareUserMenuForFrontend(String userIdentificationId, String lanngIndex, String preferCompanyId) {
        List<UserAccessDomain> userAccessDomains = new ArrayList<>();
        List<UserMenuDef> userMenuDefForFrontend = new ArrayList<>();
        List<UserInfo> userInfos = userInfoRepo.findByUserAuthId(userIdentificationId);

        if (userInfos != null) {
            int index = 0;
            for (UserInfo userInfo : userInfos) {
                List<DxrRole> dxrRoles = prepareUserRoleListForUser(userInfo.getUserAuthId(), userInfo.getUserCompanyId(), lanngIndex);

                List<RoleWiseMenuAccessVM> roleWiseMenuAccessVMList = new ArrayList<>();

                roleWiseMenuAccessVMList = roleDefDomainService.getRoleWiseMenuAccessInfoList(dxrRoles, lanngIndex);

                List<PrevilagedUser> savedPrevilagedUser = previlagedUserRepo.findByCompanyIdAndUserIdAndAdminType(userInfo.getUserCompanyId(),
                        userInfo.getUserAuthId(), AppConstant.DXR_ADMIN_ROLE);

                if (savedPrevilagedUser != null && savedPrevilagedUser.size() > 0) {
                    DxrAdminAccess dxrAdminAccess = dxrAdminAccessRepo.findByDxrAdminAccessId(AppConstant.DXR_ADMIN_ACCESS_ID);

                    if (dxrAdminAccess != null) {
                        List<UserMenuDef> dxrAdminMenuDef = dxrAdminAccess.getAccessInfos();
                        addDxrCompanyAdminAccess(roleWiseMenuAccessVMList, dxrAdminMenuDef, dxrRoles, AppConstant.DXR_ADMIN_ROLE);
                    }

                }

                List<PrevilagedUser> savedCompanyPrevilagedUser = previlagedUserRepo.findByCompanyIdAndUserIdAndAdminType(userInfo.getUserCompanyId(),
                        userInfo.getUserAuthId(), AppConstant.COMPANY_ADMIN_ROLE);
                if (savedCompanyPrevilagedUser != null && savedCompanyPrevilagedUser.size() > 0) {
                    CompanyAdminAccess companyAdminAccess = companyAdminAccessRepo.findByCompanyAdminAccessId(AppConstant.COMPANY_ADMIN_ACCESS_ID);

                    if (companyAdminAccess != null) {
                        List<UserMenuDef> companyAdminMenuDef = companyAdminAccess.getCompanyAdminAccessInfos();
                        addDxrCompanyAdminAccess(roleWiseMenuAccessVMList, companyAdminMenuDef, dxrRoles, AppConstant.COMPANY_ADMIN_ROLE);
                    }

                }

                List<UserMenuDefView> userMenuDefViewForUser = prepareRoleWiseMenuAcccessListForSelectedUser(dxrRoles, roleWiseMenuAccessVMList);

                userMenuDefForFrontend = prepareUserMenuForFrontend(userMenuDefViewForUser);

                String companyId = userInfo.getUserCompanyId();
                UserAccessDomain userAccessDomain = new UserAccessDomain();
                userAccessDomain.setCompanyId(companyId);
                userAccessDomain.setUserInfoId(userInfo.getUserInfoId());
                userAccessDomain.setUserName(userInfo.getUserName());
                userAccessDomain.setUserMenuDef(userMenuDefForFrontend);

                if (preferCompanyId != null && preferCompanyId.equals(userInfo.getUserCompanyId())) {
                    userAccessDomain.setPreference(true);
                } else if (preferCompanyId == null && index == 0) {
                    userAccessDomain.setPreference(true);
                }

                userAccessDomains.add(userAccessDomain);

                index++;

            }
        }

        return userAccessDomains;

    }

    void addDxrCompanyAdminAccess(List<RoleWiseMenuAccessVM> roleWiseMenuAccessVMList, List<UserMenuDef> dxrAdminAccess, List<DxrRole> dxrRoles, String adminType) {

        RoleWiseMenuAccessVM dxrAdminRoleWiseMenuAccessVM = new RoleWiseMenuAccessVM();
        dxrAdminRoleWiseMenuAccessVM.setRoleDefId(adminType);
        dxrAdminRoleWiseMenuAccessVM.setRoleName(adminType);
        dxrAdminRoleWiseMenuAccessVM.setCompanyCategoryName(adminType);
        List<MenuAccessInfoVM> accessibleMenuListOfRole = new ArrayList<>();

        for (UserMenuDef dxrAdminAcces : dxrAdminAccess) {

            boolean found = false;

            for (MenuAccessInfoVM menuAccessInfoVM : accessibleMenuListOfRole) {
                if (menuAccessInfoVM.getMenuId().equals(dxrAdminAcces.getMenuId())) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                MenuAccessInfoVM menuAccessInfoVM = new MenuAccessInfoVM();
                menuAccessInfoVM.setMenuId(dxrAdminAcces.getMenuId());
                menuAccessInfoVM.setMenuTitleEng(dxrAdminAcces.getMenuTitleEng());
                menuAccessInfoVM.setMenuTitleJpn(dxrAdminAcces.getMenuTitleJpn());
                menuAccessInfoVM.setMenuUrl(dxrAdminAcces.getMenuUrl());
                menuAccessInfoVM.setParentSegment(dxrAdminAcces.getParentSegment());
                menuAccessInfoVM.setMenuParent(dxrAdminAcces.getMenuParent());
                menuAccessInfoVM.setMenuTypeId(dxrAdminAcces.getMenuTypeId());
                menuAccessInfoVM.setCompanyCategoryId(dxrAdminAcces.getCompanyCategoryId());
                ActiveAccess access = new ActiveAccess();
                AccessDefView accessDefView = new AccessDefView();
                accessDefView.setAccessDefId(dxrAdminAcces.getAccessInfo().getAccessDefId());
                accessDefView.setAccessTitle(dxrAdminAcces.getAccessInfo().getAccessTitle());

                access.setAccessInfo(accessDefView);

                DxrRoleView dxrRoleView = new DxrRoleView();
                dxrRoleView.setRoleDefId(adminType);
                dxrRoleView.setRoleName(adminType);
                dxrRoleView.setRoleCode(adminType);
                dxrRoleView.setRoleDescription(adminType);
                access.setRoleInfo(dxrRoleView);

                menuAccessInfoVM.setActiveAccess(access);

                accessibleMenuListOfRole.add(menuAccessInfoVM);
                dxrAdminRoleWiseMenuAccessVM.setAccessibleMenuListOfRole(accessibleMenuListOfRole);
            }
        }
        roleWiseMenuAccessVMList.add(dxrAdminRoleWiseMenuAccessVM);

    }

    @Override
    public String authenticateUser(UserIdentificationView userIdentificationView, String langIndex) {
        String accessFlag = "";

        String sysAdminUserId = utilService.decryptUserAuth(AppConstant.DXR_SYS_ADMIN_USER_ID_ENCRYPTED);

        String decryptedPass = utilService.decryptUserAuth(userIdentificationView.getUserAuth());

        if (userIdentificationView != null && userIdentificationView.getUserId() != null && decryptedPass != null) {

            if (userIdentificationView.getUserId().equals(sysAdminUserId)) {
                try {
                    String sysAdminUserAuthKey = utilService.decryptUserAuth(AppConstant.DXR_SYS_ADMIN_USER_AUTH_ENCRYPTED);

                    boolean isAuthorized = utilService.validatePassword(decryptedPass, sysAdminUserAuthKey);

                    if (isAuthorized == true) {
                        accessFlag = AppConstant.DXR_SYS_ADMIN_ACCESS_INFO;
                    }
                } catch (NoSuchAlgorithmException ex) {
                    // Logger.getLogger(UserManagementDomainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidKeySpecException ex) {
                    // Logger.getLogger(UserManagementDomainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {

                UserIdentification userIdentification = userIdentificationRepo.findByUserId(userIdentificationView.getUserId());

                try {
                    boolean isAuthorized = utilService.validatePassword(decryptedPass, userIdentification.getUserAuth());

                    if (userIdentification != null && isAuthorized) {

                        if (userIdentification.getOneTimeAccessFlag().equals(AppConstant.ONE_TIME_ACCESS_FLAG_FALSE)) {

                            CompanyPreference companyPreference = companyPreferenceRepo.findByUserIdentificationPk(userIdentification.getUserIdentificationId());

                            String preferCompanyId = (companyPreference != null && companyPreference.getPreferCompanyId() != null) ? (companyPreference.getPreferCompanyId()) : null;

                            List<UserAccessDomain> userMenuDefs = prepareUserMenuForFrontend(userIdentification.getUserIdentificationId(), langIndex, preferCompanyId);
                            Gson gson = new Gson();
                            accessFlag = gson.toJson(userMenuDefs);

                        } else {
                            accessFlag = userIdentification.getOneTimeAccessFlag();
                        }

                    }
                } catch (Exception ex) {

                    System.out.println("User Id or Password Incorrect");

                }

            }
        }

        return accessFlag;
    }
//
//
//
//    void updateExistingDxrAdminAccess() {
//
//        List<UserAccessInfo> userAccessInfos = userAccessInfoRepo.findAll();
//
//        if (userAccessInfos != null) {
//            DxrAdminAccess dxrAdminAccess = dxrAdminAccessRepo.findByDxrAdminAccessId(AppConstant.DXR_ADMIN_ACCESS_ID);
//            for (UserAccessInfo userAccessInfo : userAccessInfos) {
//                userAccessInfo.setMenuAccessInfo(dxrAdminAccess.getDxrAdminAccess());
//                userAccessInfoRepo.save(userAccessInfo);
//            }
//        }
//
//    }
//
//    String updateUserAccessInformation(String userIdentificationId) {
//        return AppConstant.DXR_ADMIN_MENU_ACCESS_INFO;
//    }
//
//    boolean isUserAccessUpdated(UserAccessInfo userAccessInfo) {
//
//        boolean isUserAccessUpdated = isRoleDefUpdated(userAccessInfo);
//
//        isUserAccessUpdated = isDxrAdminAccessUpdated(userAccessInfo) ? isDxrAdminAccessUpdated(userAccessInfo) : isUserAccessUpdated;
//
//        isUserAccessUpdated = isCompanyAdminAccessUpdated(userAccessInfo) ? isCompanyAdminAccessUpdated(userAccessInfo) : isUserAccessUpdated;
//
//        return isUserAccessUpdated;
//    }
//
//    boolean isRoleDefUpdated(UserAccessInfo userAccessInfo) {
//        boolean isUserAccessUpdated = false;
//
//        RoleDefUpdateFlag roleDefUpdateFlag = roleDefUpdateFlagRepo.findByRoleDefUpdateFlagId(AppConstant.ROLE_DEF_UPDATE_FLAG_ID);
//
//        if (roleDefUpdateFlag != null && !roleDefUpdateFlag.getUpdateDate().equals(userAccessInfo.getUpdateDate())) {
//            isUserAccessUpdated = true;
//        }
//
//        return isUserAccessUpdated;
//    }
//
//    boolean isCompanyAdminAccessUpdated(UserAccessInfo userAccessInfo) {
//        boolean isUserAccessUpdated = false;
//        List<UserInfo> userInfos = userInfoRepo.findAllByUserAuthIdAndUserCategoryId(userAccessInfo.getUserIdentification(), AppConstant.USER_CATEGORY_COMPANY_ADMIN);
//        if (userInfos != null && userInfos.size() > 0) {
//            CompanyAdminAccess companyAdminAccess = companyAdminAccessRepo.findByCompanyAdminAccessId(AppConstant.COMPANY_ADMIN_ACCESS_ID);
//
//            if (companyAdminAccess != null && !companyAdminAccess.getUpdateDate().equals(userAccessInfo.getUpdateDate())) {
//                isUserAccessUpdated = true;
//            }
//        }
//
//        return isUserAccessUpdated;
//    }
//
//    boolean isDxrAdminAccessUpdated(UserAccessInfo userAccessInfo) {
//        boolean isUserAccessUpdated = false;
//        List<UserInfo> userInfos = userInfoRepo.findAllByUserAuthIdAndUserCategoryId(userAccessInfo.getUserIdentification(), AppConstant.USER_CATEGORY_DXR_ADMIN);
//        if (userInfos != null && userInfos.size() > 0) {
//            DxrAdminAccess dxrAdminAccess = dxrAdminAccessRepo.findByDxrAdminAccessId(AppConstant.DXR_ADMIN_ACCESS_ID);
//
//            if (dxrAdminAccess != null && !dxrAdminAccess.getUpdateDate().equals(userAccessInfo.getUpdateDate())) {
//                isUserAccessUpdated = true;
//            }
//        }
//
//        return isUserAccessUpdated;
//    }
//    @Override
//    public AccessInfoView authenticateUserAndGetMenuAccessInfo(UserIdentificationView userIdentificationView) {
//        AccessInfoView menuAccessInfo = new AccessInfoView();
//        String accessInfo = "";
//        String accessFlag = "";
//
//        String sysAdminUserId = utilService.decryptUserAuth(AppConstant.DXR_SYS_ADMIN_USER_ID_ENCRYPTED);
//
//        String decryptedPass = utilService.decryptUserAuth(userIdentificationView.getUserAuth());
//
//        if (userIdentificationView != null && userIdentificationView.getUserId() != null && decryptedPass != null) {
//
////            String userAuthHash = "";
////            try {
////                userAuthHash = utilService.generateStorngPasswordHash(decryptedPass);
////            } catch (NoSuchAlgorithmException ex) {
////                // Logger.getLogger(UserManagementDomainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
////            } catch (InvalidKeySpecException ex) {
////                // Logger.getLogger(UserManagementDomainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
////            }
//            if (userIdentificationView.getUserId().equals(sysAdminUserId)) {
//                try {
//                    String sysAdminUserAuthKey = utilService.decryptUserAuth(AppConstant.DXR_SYS_ADMIN_USER_AUTH_ENCRYPTED);
//
//                    boolean isAuthorized = utilService.validatePassword(decryptedPass, sysAdminUserAuthKey);
//
//                    if (isAuthorized == true) {
//                        accessInfo = AppConstant.DXR_SYS_ADMIN_ACCESS_INFO;
//                        accessFlag = AppConstant.ONE_TIME_ACCESS_FLAG_FALSE;
//                    }
//                } catch (NoSuchAlgorithmException ex) {
//                    // Logger.getLogger(UserManagementDomainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (InvalidKeySpecException ex) {
//                    // Logger.getLogger(UserManagementDomainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//                }
//
//            } else {
//
//                UserIdentification userIdentification = userIdentificationRepo.findByUserId(userIdentificationView.getUserId());
//                try {
//                    boolean isAuthorized = utilService.validatePassword(decryptedPass, userIdentification.getUserAuth());
//
//                    if (userIdentification != null && isAuthorized) {
//
//                        UserAccessInfo userAccessInfo = userAccessInfoRepo.findByUserIdentification(userIdentification.getUserIdentificationId());
//                        if (userAccessInfo != null && userAccessInfo.getMenuAccessInfo() != null) {
//                            accessInfo = userAccessInfo.getMenuAccessInfo();
//                        }
//                        accessFlag = userIdentification.getOneTimeAccessFlag();
//                    }
//                } catch (NoSuchAlgorithmException ex) {
//                    // Logger.getLogger(UserManagementDomainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (InvalidKeySpecException ex) {
//                    // Logger.getLogger(UserManagementDomainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//                }
//
//            }
//        }
//
//        menuAccessInfo = getAccessInfoView(accessFlag, accessInfo);
//
//        return menuAccessInfo;
//    }
//
//    private AccessInfoView getAccessInfoView(String accessFlag, String accessInfo) {
//        AccessInfoView accessInfoView = new AccessInfoView();
//        accessInfoView.setAccessFlag(accessFlag);
//        accessInfoView.setAccessInfo(accessInfo);
//
//        return accessInfoView;
//    }
//    @Override
//    public String decryptUserAuth(String encryptedUserAuth) {
//        String decryptedUserAuth = "";
//        String privateKeyString = utilService.getOrgIdPrivatePart();
//        PrivateKey privateKey = utilService.getPrivateKeyFromString(privateKeyString);
//        decryptedUserAuth = utilService.decryptWithAsymetricKey(encryptedUserAuth, privateKey);
//
//        return decryptedUserAuth;
//    }

    @Override
    public boolean regenerateUserAuthenticationCode(String userId) {
        boolean isSuccessfull = false;
        List<UserInfo> userInfos = userInfoRepo.findByUserEmail(userId);

        if (userInfos != null && userInfos.size() > 0) {
            UserInfo userInfo = userInfos.get(0);
            UserInfoView userInfoView = userInfoDomainToView(userInfo);
            UserIdentification userIdentification = userIdentificationRepo.findByUserIdentificationId(userInfo.getUserAuthId());

            if (userIdentification != null) {

                try {
                    String userAuthPass = utilService.generatePassword();
                    String userAuthHash = utilService.generateStorngPasswordHash(userAuthPass);
                    userIdentification.setUserAuth(userAuthHash);
                    userIdentification.setOneTimeAccessFlag(AppConstant.ONE_TIME_ACCESS_FLAG_TRUE);

//                    userIdentification.setUserIdentificationId(userAuthHash);
                    userIdentification = userIdentificationRepo.save(userIdentification);

                } catch (NoSuchAlgorithmException ex) {
                    // Logger.getLogger(UserManagementDomainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidKeySpecException ex) {
                    // Logger.getLogger(UserManagementDomainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return isSuccessfull;

    }

    @Override
    public boolean changePasswordFromUserProfile(ChangeUserIdentification changeUserIdentification) {
        boolean isSuccessfull = false;

        if (changeUserIdentification != null && changeUserIdentification.getUserId() != null && changeUserIdentification.getAccessCode() != null && changeUserIdentification.getNewAuth() != null) {

            UserIdentification userIdentification = userIdentificationRepo.findByUserId(changeUserIdentification.getUserId());

            if (userIdentification != null && userIdentification.getUserId() != null) {

                try {
                    boolean accessCodeValidation = utilService.validatePassword(changeUserIdentification.getAccessCode(), userIdentification.getUserAuth());

                    if (accessCodeValidation) {
                        String newPass = utilService.decryptUserAuth(changeUserIdentification.getNewAuth());
                        String newPassHash = utilService.generateStorngPasswordHash(newPass);

                        userIdentification.setUserAuth(newPassHash);
                        userIdentification.setOneTimeAccessFlag(AppConstant.ONE_TIME_ACCESS_FLAG_FALSE);

                        userIdentification = userIdentificationRepo.save(userIdentification);

                        if (userIdentification != null) {
                            isSuccessfull = true;
                        } else {
                            isSuccessfull = false;
                        }
                    }

                } catch (NoSuchAlgorithmException ex) {
                    // Logger.getLogger(UserManagementDomainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidKeySpecException ex) {
                    // Logger.getLogger(UserManagementDomainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        return isSuccessfull;

    }

    @Override
    public boolean changePasswordFromForgetPassword(ChangeUserIdentification changeUserIdentification) {
        boolean isSuccessfull = false;

        if (changeUserIdentification != null && changeUserIdentification.getUserId() != null && changeUserIdentification.getAccessCode() != null && changeUserIdentification.getNewAuth() != null) {

            UserIdentification userIdentification = userIdentificationRepo.findByUserId(changeUserIdentification.getUserId());

            if (userIdentification != null && userIdentification.getUserId() != null) {

                try {
                    boolean accessCodeValidation = utilService.validatePassword(changeUserIdentification.getAccessCode(), userIdentification.getUserAuth());

                    if (accessCodeValidation) {
                        String newPass = utilService.decryptUserAuth(changeUserIdentification.getNewAuth());
                        String newPassHash = utilService.generateStorngPasswordHash(newPass);

                        userIdentification.setUserAuth(newPassHash);
                        userIdentification.setOneTimeAccessFlag(AppConstant.ONE_TIME_ACCESS_FLAG_FALSE);

                        userIdentification = userIdentificationRepo.save(userIdentification);

                        if (userIdentification != null) {
                            isSuccessfull = true;
                        } else {
                            isSuccessfull = false;
                        }
                    }

                } catch (NoSuchAlgorithmException ex) {
                    // Logger.getLogger(UserManagementDomainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidKeySpecException ex) {
                    // Logger.getLogger(UserManagementDomainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        return isSuccessfull;

    }

    @Override
    public boolean changeFirstLoginUserPassword(UserIdentificationView changeUserIdentification) {
        boolean isSuccessfull = false;

        if (changeUserIdentification != null && changeUserIdentification.getUserId() != null && changeUserIdentification.getOneTimeAccessFlag().equals(AppConstant.ONE_TIME_ACCESS_FLAG_TRUE) && changeUserIdentification.getUserAuth() != null) {

            UserIdentification userIdentification = userIdentificationRepo.findByUserId(changeUserIdentification.getUserId());

            if (userIdentification != null && userIdentification.getUserId() != null && userIdentification.getOneTimeAccessFlag().equals(AppConstant.ONE_TIME_ACCESS_FLAG_TRUE)) {

                try {

                    String newPass = utilService.decryptUserAuth(changeUserIdentification.getUserAuth());
                    String newPassHash = utilService.generateStorngPasswordHash(newPass);

                    userIdentification.setUserAuth(newPassHash);
                    userIdentification.setOneTimeAccessFlag(AppConstant.ONE_TIME_ACCESS_FLAG_FALSE);

                    userIdentification = userIdentificationRepo.save(userIdentification);

                    if (userIdentification != null) {
                        isSuccessfull = true;
                    } else {
                        isSuccessfull = false;
                    }

                } catch (NoSuchAlgorithmException ex) {
                    // Logger.getLogger(UserManagementDomainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidKeySpecException ex) {
                    // Logger.getLogger(UserManagementDomainServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        return isSuccessfull;

    }

    @Override
    public UserInfoView getUserInfoByEmail(String userEmail) {
        UserInfoView userInfoView = new UserInfoView();
        UserInfo foundUserInfo = new UserInfo();
        List<UserInfo> userInfos = new ArrayList<>();

        userInfos = userInfoRepo.findByUserEmail(userEmail);

        if (userInfos != null && userInfos.size() > 0) {
            foundUserInfo = userInfos.get(0);
            userInfoView = userInfoDomainToView(foundUserInfo);
        }

        return userInfoView;

    }

    @Override
    public UserInfoView getUserInfoByContact(String userContact) {
        UserInfo foundUserInfo = new UserInfo();
        List<UserInfo> userInfos = new ArrayList<>();

        userInfos = userInfoRepo.findByUserContact(userContact);

        if (userInfos != null) {
            foundUserInfo = userInfos.get(0);
        }

        UserInfoView userInfoView = userInfoDomainToView(foundUserInfo);

        return userInfoView;

    }

    @Override
    public void createDxrUser(UserInfoView userInfoView) {

        String userAuthId = createDxrIdentification(userInfoView);
        String companyId = userInfoView.getUserCompanyId();
        createCompanyUser(userInfoView, userAuthId);

        List<PrevilagedUser> previlagedUser = previlagedUserRepo.findByCompanyIdAndUserId(userInfoView.getUserCompanyId(), userAuthId);

        if (previlagedUser == null || previlagedUser.size() <= 0) {
            PrevilagedUser newPrevilagedUser = new PrevilagedUser();
            newPrevilagedUser.setCompanyId(companyId);
            newPrevilagedUser.setUserId(userAuthId);
            newPrevilagedUser.setAdminType(AppConstant.DXR_ADMIN_ROLE);
            String newId = utilService.generateUniqueId();
            newPrevilagedUser.setPrevilagedUserId(newId);

            previlagedUserRepo.save(newPrevilagedUser);
        }

//        createDxrAdminMenuAccessInfo(userAuthId, companyId);
    }

    public void createCompanyUser(UserInfoView userInfoView, String userAuthId) {
        UserInfo userInfo = userInfoViewToDomain(userInfoView);
        userInfo.setUserAuthId(userAuthId);

        UserInfo savedUserInfo = userInfoRepo.findByUserCompanyIdAndUserAuthId(userInfoView.getUserCompanyId(), userAuthId);

        if (savedUserInfo == null) {
            userInfoRepo.save(userInfo);
        }
    }

    public void addAsPrevilagedUser(UserInfoView userInfoView) {

    }

    @Override
    public String createDxrIdentification(UserInfoView userInfoView) {
        String userIdentificationId = "";
        try {
            UserIdentification saveduserIdentificationByMail = new UserIdentification();
            saveduserIdentificationByMail = userIdentificationRepo.findByUserId(userInfoView.getUserEmail());
            UserIdentification saveduserIdentificationByContact = new UserIdentification();
            saveduserIdentificationByContact = userIdentificationRepo.findByUserId(userInfoView.getUserContact());

            if (saveduserIdentificationByMail != null) {

                userIdentificationId = saveduserIdentificationByMail.getUserIdentificationId();

            } else if (saveduserIdentificationByContact != null) {

                userIdentificationId = saveduserIdentificationByContact.getUserIdentificationId();

            } else {

                UserIdentification newUserIdentification = new UserIdentification();

                newUserIdentification.setUserId(userInfoView.getUserEmail());
                String userAuthPass = utilService.generatePassword();
//                System.out.println("DXR Admin Email: " + userInfoView.getUserEmail() + "DXR Admin Pass" + userAuthPass);
                String userAuthHash = utilService.generateStorngPasswordHash(userAuthPass);
                newUserIdentification.setUserAuth(userAuthHash);
                String newIdString = utilService.generateUniqueId();
                newUserIdentification.setUserIdentificationId(newIdString);
                newUserIdentification.setOneTimeAccessFlag(AppConstant.ONE_TIME_ACCESS_FLAG_FALSE);

                newUserIdentification = userIdentificationRepo.save(newUserIdentification);

                userIdentificationId = newUserIdentification.getUserIdentificationId();

                saveUserCompanyPreference(userIdentificationId, userInfoView.getUserCompanyId());

            }

        } catch (Exception ex) {
            System.out.println("New User Account Creation Failed");
        }

        return userIdentificationId;
    }

    CompanyPreference saveUserCompanyPreference(String userIdentificationId, String companyId) {
        CompanyPreference userCompanyPreference = new CompanyPreference();

        userCompanyPreference.setUserIdentificationPk(userIdentificationId);
        userCompanyPreference.setPreferCompanyId(companyId);
        userCompanyPreference.setCompanyPreferenceId(utilService.generateUniqueId());

        companyPreferenceRepo.save(userCompanyPreference);

        return userCompanyPreference;
    }

    public void createDxrAdminMenuAccessInfo(String userAuthId, String companyId) {
        UserAccessInfo userAccessInfo = new UserAccessInfo();
        UserAccessInfo savedAccessInfo = userAccessInfoRepo.findByUserIdentification(userAuthId);
        if (savedAccessInfo == null || savedAccessInfo.getUserAccessInfoId() == null) {

            DxrAdminAccess dxrAdminAccess = dxrAdminAccessRepo.findByDxrAdminAccessId(AppConstant.DXR_ADMIN_ACCESS_ID);

            if (dxrAdminAccess != null && dxrAdminAccess.getDxrAdminAccess() != null) {
                String newIdString = utilService.generateUniqueId();
                userAccessInfo.setUserAccessInfoId(newIdString);
                userAccessInfo.setUserIdentification(userAuthId);

                UserAccessDomain userAccessDomain = new UserAccessDomain();
                userAccessDomain.setCompanyId(companyId);
                userAccessDomain.setUserMenuDef(dxrAdminAccess.getAccessInfos());
                List<UserAccessDomain> userAccessDomains = new ArrayList<>();
                userAccessDomains.add(userAccessDomain);

                userAccessInfo.setMenuAccessInfoList(userAccessDomains);
                userAccessInfoRepo.save(userAccessInfo);
            }

        }

    }

    public String prepareDxrAdminAccessInfo() {
        String dxrAdminAccess = "";

        return dxrAdminAccess;
    }

    @Override
    public UserInfoView userInfoDomainToView(UserInfo data) {

        Gson jsonParser = new Gson();
        String dataJson = jsonParser.toJson(data);
        UserInfoView convertedData = jsonParser.fromJson(dataJson, UserInfoView.class);
        return convertedData;
    }

    @Override
    public List<UserInfoView> userInfoDomainToView(List<UserInfo> data) {
        Gson jsonParser = new Gson();
        String dataJson = jsonParser.toJson(data);
        List<UserInfoView> convertedData = (List<UserInfoView>) jsonParser.fromJson(dataJson, new TypeToken<List<UserInfoView>>() {
        }.getType());
        return convertedData;
    }

    @Override
    public UserInfo userInfoViewToDomain(UserInfoView data) {
        UserInfo userInfo = new UserInfo();
        Gson jsonParser = new Gson();
        String dataJson = jsonParser.toJson(data);
        UserInfo convertedData = jsonParser.fromJson(dataJson, UserInfo.class);
        return convertedData;
    }

    @Override
    public List<UserInfo> userInfoViewToDomain(List<UserInfoView> data) {
        Gson jsonParser = new Gson();
        String dataJson = jsonParser.toJson(data);
        List<UserInfo> convertedData = (List<UserInfo>) jsonParser.fromJson(dataJson, new TypeToken<List<UserInfo>>() {
        }.getType());
        return convertedData;
    }

    @Override
    public DxrAdminAccessVM saveDxrAdminAccess(DxrAdminAccessVM dxrAdminAccessVM) {
        DxrAdminAccess dxrAdminAccess = new DxrAdminAccess();
        DxrAdminAccessVM savedDxrAdminAccessVM = new DxrAdminAccessVM();

        if (dxrAdminAccessVM != null && dxrAdminAccessVM.getDxrAdminAccess() != null) {
            dxrAdminAccess = dxrAdminAccessViewToDomain(dxrAdminAccessVM);
            dxrAdminAccess = dxrAdminAccessRepo.save(dxrAdminAccess);
            savedDxrAdminAccessVM = dxrAdminAccessDomainToView(dxrAdminAccess);
        }

        return savedDxrAdminAccessVM;
    }

    @Override
    public CompanyAdminAccessVM saveCompanyAdminAccess(CompanyAdminAccessVM companyAdminAccessVM) {
        CompanyAdminAccess companyAdminAccess = new CompanyAdminAccess();
        CompanyAdminAccessVM savedCompanyAdminAccessVM = new CompanyAdminAccessVM();

        if (companyAdminAccessVM != null && companyAdminAccessVM.getCompanyAdminAccess() != null) {
            companyAdminAccess = companyAdminAccessViewToDomain(companyAdminAccessVM);
            companyAdminAccess = companyAdminAccessRepo.save(companyAdminAccess);
            savedCompanyAdminAccessVM = companyAdminAccessDomainToView(companyAdminAccess);
        }

        return savedCompanyAdminAccessVM;
    }

    @Override
    public DxrAdminAccessVM dxrAdminAccessDomainToView(DxrAdminAccess data) {
        Gson jsonParser = new Gson();
        String dataJson = jsonParser.toJson(data);
        DxrAdminAccessVM convertedData = jsonParser.fromJson(dataJson, DxrAdminAccessVM.class);
        return convertedData;
    }

    @Override
    public DxrAdminAccess dxrAdminAccessViewToDomain(DxrAdminAccessVM data) {
        Gson jsonParser = new Gson();
        String dataJson = jsonParser.toJson(data);
        DxrAdminAccess convertedData = jsonParser.fromJson(dataJson, DxrAdminAccess.class);
        return convertedData;
    }

    @Override
    public CompanyAdminAccessVM companyAdminAccessDomainToView(CompanyAdminAccess data) {
        Gson jsonParser = new Gson();
        String dataJson = jsonParser.toJson(data);
        CompanyAdminAccessVM convertedData = jsonParser.fromJson(dataJson, CompanyAdminAccessVM.class);
        return convertedData;
    }

    @Override
    public CompanyAdminAccess companyAdminAccessViewToDomain(CompanyAdminAccessVM data) {
        Gson jsonParser = new Gson();
        String dataJson = jsonParser.toJson(data);
        CompanyAdminAccess convertedData = jsonParser.fromJson(dataJson, CompanyAdminAccess.class);
        return convertedData;
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
        userMenuDef.setMenuTitleEng(useAccessInfoVM.getMenuTitleEng());
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

        if (roleWiseMenuAcccessList != null) {
            roleWiseMenuAcccessList.forEach(item -> {
                for (MenuAccessInfoVM newMenu : item.getAccessibleMenuListOfRole()) {
                    boolean existFlag = false;
                    for (UserMenuDefView currentMenu : userRoleWiseMenuAccessList) {
                        if (currentMenu.getMenuId().equals(newMenu.getMenuId())) {
                            existFlag = true;
                            if (currentMenu.getActiveAccess() != null && newMenu.getActiveAccess() != null && currentMenu.getActiveAccess().getAccessInfo() != null && newMenu.getActiveAccess().getAccessInfo() != null && currentMenu.getActiveAccess().getAccessInfo().getAccessTitle() != null && newMenu.getActiveAccess().getAccessInfo().getAccessTitle() != null && currentMenu.getActiveAccess().getAccessInfo().getAccessTitle().length() < newMenu.getActiveAccess().getAccessInfo().getAccessTitle().length()) {
                                currentMenu.setActiveAccess(newMenu.getActiveAccess());
                            }
                            break;
                        }
                    }
                    if (!existFlag) {
                        userRoleWiseMenuAccessList.add(MenuAccessInfoVMToUserMenuDefView(newMenu));
                    }

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

                if (primaryMenuListLevelTwo != null && primaryMenuListLevelTwo.size() > 0) {

                    for (UserMenuDefView primaryMenuLevelTwo : primaryMenuListLevelTwo) {
                        UserMenuDef userMenuAccessViewPrimaryLevelTwo = MenuAccessInfoVMToUserMenuDef(primaryMenuLevelTwo);
                        userMenuAccessViewPrimaryLevelOne.getChild().add(userMenuAccessViewPrimaryLevelTwo);

                        String secondaryParentDefLevelOne = primaryMenuLevelTwo.getMenuParent().concat(primaryMenuLevelTwo.getMenuId().concat("|"));

                        List<UserMenuDefView> secondaryMenuListLevelOne = getUserMenuDefViewListByParent(menuRepository, secondaryParentDefLevelOne, AppConstant.MENU_TYPE_SECONDARY);

                        if (secondaryMenuListLevelOne != null && secondaryMenuListLevelOne.size() > 0) {
                            for (UserMenuDefView secondaryMenuLevelOne : secondaryMenuListLevelOne) {
                                UserMenuDef userMenuAccessViewSecondaryLevelOne = MenuAccessInfoVMToUserMenuDef(secondaryMenuLevelOne);
                                userMenuAccessViewPrimaryLevelTwo.getChild().add(userMenuAccessViewSecondaryLevelOne);

                                String secondaryParentDefLevelTwo = secondaryMenuLevelOne.getMenuParent().concat(secondaryMenuLevelOne.getMenuId().concat("|"));

                                List<UserMenuDefView> secondaryMenuListLevelTwo = getUserMenuDefViewListByParent(menuRepository, secondaryParentDefLevelTwo, AppConstant.MENU_TYPE_SECONDARY);
                                if (secondaryMenuListLevelTwo != null && secondaryMenuListLevelTwo.size() > 0) {
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

                    if (secondaryMenuListLevelOne != null && secondaryMenuListLevelOne.size() > 0) {
                        for (UserMenuDefView secondaryMenuLevelOne : secondaryMenuListLevelOne) {
                            UserMenuDef userMenuAccessViewSecondaryLevelOne = MenuAccessInfoVMToUserMenuDef(secondaryMenuLevelOne);
                            userMenuAccessViewPrimaryLevelOne.getChild().add(userMenuAccessViewSecondaryLevelOne);

                            String secondaryParentDefLevelOne = secondaryMenuLevelOne.getMenuParent().concat(secondaryMenuLevelOne.getMenuId().concat("|"));

                            List<UserMenuDefView> secondaryMenuListLevelTwo = getUserMenuDefViewListByParent(menuRepository, secondaryParentDefLevelOne, AppConstant.MENU_TYPE_SECONDARY);
                            if (secondaryMenuListLevelTwo != null && secondaryMenuListLevelTwo.size() > 0) {
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
