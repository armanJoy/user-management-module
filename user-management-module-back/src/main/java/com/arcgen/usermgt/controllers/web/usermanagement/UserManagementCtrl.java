package com.arcgen.usermgt.controllers.web.usermanagement;

import com.arcgen.usermgt.config.AppConstant;
import com.arcgen.usermgt.models.view.web.usermanagement.ChangeUserIdentification;
import com.arcgen.usermgt.models.view.web.usermanagement.CompanyAdminAccessVM;
import com.arcgen.usermgt.models.view.web.usermanagement.DefaultCompany;
import com.arcgen.usermgt.models.view.web.usermanagement.DxrAdminAccessVM;
import com.arcgen.usermgt.models.view.web.usermanagement.UserIdentificationView;
import com.arcgen.usermgt.models.view.web.usermanagement.UserInfoView;
import com.arcgen.usermgt.services.domainservices.web.usermanagement.UserManagementDomainService;
import com.arcgen.usermgt.util.UtilService;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "https://dxrreleases.com, https://dxr-mob-app.web.app, http://localhost:4200")
@RestController
@RequestMapping("/web/user-management")
public class UserManagementCtrl {

    @Autowired
    UtilService utilService;

    @Autowired
    UserManagementDomainService userManagementDomainService;

    @RequestMapping(method = RequestMethod.POST, value = "/get-access-info")
    public String getAccessInfo(@RequestHeader("langIndex") String language, @RequestBody UserIdentificationView userIdentificationView) {
        String menuAccessInfo = "";

        if (userIdentificationView != null) {
            menuAccessInfo = userManagementDomainService.authenticateUser(userIdentificationView, language);
        }

        return menuAccessInfo;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String login(@RequestHeader("langIndex") String language, @RequestBody UserIdentificationView userIdentificationView) {
        String menuAccessInfoView = "";

        if (userIdentificationView != null) {
            menuAccessInfoView = userManagementDomainService.authenticateUser(userIdentificationView, language);
        }

        return menuAccessInfoView;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create-dxr-admin")
    public void createSystemAdmin(@RequestHeader("langIndex") String language, @RequestBody UserInfoView userInfoView) {
        userManagementDomainService.createDxrUser(userInfoView);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/get-user-info-by-mail")
    public UserInfoView getUserInfoByEmail(@RequestHeader("langIndex") String language, @RequestBody String userEmail) {
        return userManagementDomainService.getUserInfoByEmail(userEmail);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/get-user-info-by-contact")
    public UserInfoView getUserInfoByContact(@RequestHeader("langIndex") String language, @RequestBody String userContact) {
        return userManagementDomainService.getUserInfoByContact(userContact);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/resendUserAccess")
    public String resendUserAccess(@RequestHeader("langIndex") String language, @RequestBody String userInfoId) {
        boolean isSuccessfull = userManagementDomainService.regenerateUserAuthenticationCode(userInfoId);

        if (!isSuccessfull) {
            userInfoId = AppConstant.FALSE_VALUE;
        } else {
            userInfoId = AppConstant.TRUE_VALUE;
        }
        return userInfoId;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/change-password")
    public String chnagePassword(@RequestHeader("langIndex") String language, @RequestBody ChangeUserIdentification changeUserIdentification) {
        String changeResponse = "";
        boolean isSuccessfull = userManagementDomainService.changePasswordFromForgetPassword(changeUserIdentification);

        if (!isSuccessfull) {
            changeResponse = AppConstant.FALSE_VALUE;
        } else {
            changeResponse = AppConstant.TRUE_VALUE;
        }
        return changeResponse;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/change-first-login-password")
    public String chnageFirstLoginPassword(@RequestHeader("langIndex") String language, @RequestBody UserIdentificationView changeUserIdentification) {
        String changeResponse = "";
        boolean isSuccessfull = userManagementDomainService.changeFirstLoginUserPassword(changeUserIdentification);

        if (!isSuccessfull) {
            changeResponse = AppConstant.FALSE_VALUE;
        } else {
            changeResponse = AppConstant.TRUE_VALUE;
        }
        return changeResponse;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/set-dxr-access")
    public DxrAdminAccessVM saveDxrAdminAccess(@RequestHeader("langIndex") String language, @RequestBody String dxrAdminAccessString) {
        DxrAdminAccessVM dxrAdminAccessVM = new DxrAdminAccessVM();
        dxrAdminAccessVM.setDxrAdminAccess(dxrAdminAccessString);
        return userManagementDomainService.saveDxrAdminAccess(dxrAdminAccessVM);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/set-company-access")
    public CompanyAdminAccessVM saveCompanyAdminAccess(@RequestHeader("langIndex") String language, @RequestBody String companyAdminAccessString) {
        CompanyAdminAccessVM companyAdminAccessVM = new CompanyAdminAccessVM();
        companyAdminAccessVM.setCompanyAdminAccess(companyAdminAccessString);
        return userManagementDomainService.saveCompanyAdminAccess(companyAdminAccessVM);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/encryptData")
    public void returnEncryptedData(@RequestBody String data) {
        String publicOrgId = utilService.getOrgIdPublicPart();
        PublicKey publicKey = utilService.getPublicKeyFromString(publicOrgId);
        System.out.println(utilService.encryptWithAsymetricKey(data, publicKey));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/password-hash")
    public void returnEncryptedHash(@RequestBody String password) throws NoSuchAlgorithmException, InvalidKeySpecException {
        String passwordHash = utilService.generateStorngPasswordHash(password);
        String publicOrgId = utilService.getOrgIdPublicPart();
        PublicKey publicKey = utilService.getPublicKeyFromString(publicOrgId);
        System.out.println(passwordHash);
        String encryptedHash = utilService.encryptWithAsymetricKey(passwordHash, publicKey);
//        System.out.println(encryptedHash);

        String privateKeyString = utilService.getOrgIdPrivatePart();
        PrivateKey privateKey = utilService.getPrivateKeyFromString(privateKeyString);
//        System.out.println(utilService.decryptWithAsymetricKey(encryptedHash, privateKey));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/save-default-company")
    @Transactional
    public DefaultCompany saveDefaultCompany(@RequestHeader("langIndex") String language, @RequestBody DefaultCompany defaultCompany) {
        return userManagementDomainService.saveDefaultCompany(defaultCompany);
    }

}
