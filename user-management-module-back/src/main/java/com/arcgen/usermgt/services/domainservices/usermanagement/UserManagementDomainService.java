package com.arcgen.usermgt.services.domainservices.usermanagement;

import com.arcgen.usermgt.models.domain.usermanagement.CompanyAdminAccess;
import com.arcgen.usermgt.models.domain.usermanagement.DxrAdminAccess;
import com.arcgen.usermgt.models.domain.menudef.MenuDef;
import com.arcgen.usermgt.models.domain.usermanagement.UserInfo;
import com.arcgen.usermgt.models.view.usermanagement.AccessInfoView;
import com.arcgen.usermgt.models.view.usermanagement.ChangeUserIdentification;
import com.arcgen.usermgt.models.view.usermanagement.CompanyAdminAccessVM;
import com.arcgen.usermgt.models.view.usermanagement.DxrAdminAccessVM;
import com.arcgen.usermgt.models.view.menudef.MenuRoleDefUpdate;
import com.arcgen.usermgt.models.view.usermanagement.DefaultCompany;
import com.arcgen.usermgt.models.view.usermanagement.UserIdentificationView;
import com.arcgen.usermgt.models.view.usermanagement.UserInfoView;
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
