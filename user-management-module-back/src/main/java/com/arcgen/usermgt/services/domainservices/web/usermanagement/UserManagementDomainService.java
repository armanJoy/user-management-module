package com.arcgen.usermgt.services.domainservices.web.usermanagement;

import com.arcgen.usermgt.models.domain.web.usermanagement.CompanyAdminAccess;
import com.arcgen.usermgt.models.domain.web.usermanagement.DxrAdminAccess;
import com.arcgen.usermgt.models.domain.web.menudef.MenuDef;
import com.arcgen.usermgt.models.domain.web.usermanagement.UserInfo;
import com.arcgen.usermgt.models.view.web.usermanagement.AccessInfoView;
import com.arcgen.usermgt.models.view.web.usermanagement.ChangeUserIdentification;
import com.arcgen.usermgt.models.view.web.usermanagement.CompanyAdminAccessVM;
import com.arcgen.usermgt.models.view.web.usermanagement.DxrAdminAccessVM;
import com.arcgen.usermgt.models.view.web.menudef.MenuRoleDefUpdate;
import com.arcgen.usermgt.models.view.web.usermanagement.DefaultCompany;
import com.arcgen.usermgt.models.view.web.usermanagement.UserIdentificationView;
import com.arcgen.usermgt.models.view.web.usermanagement.UserInfoView;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface UserManagementDomainService {

    String authenticateUser(UserIdentificationView userIdentificationView, String langIndex);

//    AccessInfoView authenticateUserAndGetMenuAccessInfo(UserIdentificationView userIdentificationView);
//    String decryptUserAuth(String encryptedUserAuth);
    void createDxrUser(UserInfoView userInfoView);

    String createDxrIdentification(UserInfoView userInfoView);

    boolean regenerateUserAuthenticationCode(String userId);

    boolean changePasswordFromForgetPassword(ChangeUserIdentification changeUserIdentification);

    boolean changePasswordFromUserProfile(ChangeUserIdentification changeUserIdentification);

    boolean changeFirstLoginUserPassword(UserIdentificationView changeUserIdentification);

    UserInfoView getUserInfoByEmail(String userEmail);

    UserInfoView getUserInfoByContact(String userContact);

    UserInfoView userInfoDomainToView(UserInfo data);

    List<UserInfoView> userInfoDomainToView(List<UserInfo> data);

    UserInfo userInfoViewToDomain(UserInfoView data);

    List<UserInfo> userInfoViewToDomain(List<UserInfoView> data);

    DxrAdminAccessVM saveDxrAdminAccess(DxrAdminAccessVM dxrAdminAccessVM);

    CompanyAdminAccessVM saveCompanyAdminAccess(CompanyAdminAccessVM companyAdminAccessVM);

    DxrAdminAccessVM dxrAdminAccessDomainToView(DxrAdminAccess data);

    DxrAdminAccess dxrAdminAccessViewToDomain(DxrAdminAccessVM data);

    CompanyAdminAccessVM companyAdminAccessDomainToView(CompanyAdminAccess data);

    CompanyAdminAccess companyAdminAccessViewToDomain(CompanyAdminAccessVM data);

    DefaultCompany saveDefaultCompany(DefaultCompany defaultCompany);

}
