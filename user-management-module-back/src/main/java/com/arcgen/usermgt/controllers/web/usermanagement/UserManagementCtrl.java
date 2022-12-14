package com.arcgen.usermgt.controllers.web.usermanagement;

import com.arcgen.usermgt.config.AppConstant;
import com.arcgen.usermgt.models.view.usermanagement.UserIdentificationView;
import com.arcgen.usermgt.models.view.usermanagement.UserInfoView;
import com.arcgen.usermgt.services.domainservices.usermanagement.UserManagementDomainService;
import com.arcgen.usermgt.util.UtilService;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/web/user-management")
public class UserManagementCtrl {

    @Autowired
    UtilService utilService;

    @Autowired
    UserManagementDomainService userManagementDomainService;

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String login(@RequestBody UserIdentificationView userIdentificationView) {
        String menuAccessInfoView = "";

        if (userIdentificationView != null) {
            menuAccessInfoView = userManagementDomainService.authenticateUser(userIdentificationView);
        }

        return menuAccessInfoView;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create-user")
    public UserInfoView createUser(@RequestBody UserInfoView userInfoView) {
        return userManagementDomainService.createDxrUser(userInfoView);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/get-user-info-by-mail")
    public UserInfoView getUserInfoByEmail(@RequestBody String userEmail) {
        return userManagementDomainService.getUserInfoByEmail(userEmail);
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

}
