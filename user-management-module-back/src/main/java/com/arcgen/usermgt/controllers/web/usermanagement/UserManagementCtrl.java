package com.arcgen.usermgt.controllers.web.usermanagement;

import com.arcgen.usermgt.config.AppConstant;
import com.arcgen.usermgt.models.view.usermanagement.UserIdentificationView;
import com.arcgen.usermgt.models.view.usermanagement.UserInfoView;
import com.arcgen.usermgt.models.view.usermanagement.UserOtp;
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

    @RequestMapping(method = RequestMethod.POST, value = "/cookie-login")
    public String loginFromCookie(@RequestBody UserIdentificationView userIdentificationView) {
        String menuAccessInfoView = "";

        if (userIdentificationView != null) {
            menuAccessInfoView = userManagementDomainService.authenticateUser(userIdentificationView, false);
        }

        return menuAccessInfoView;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/init-login")
    public String initialLogin(@RequestBody UserIdentificationView userIdentificationView) {
        String menuAccessInfoView = "";

        if (userIdentificationView != null) {
            menuAccessInfoView = userManagementDomainService.authenticateUser(userIdentificationView, true);
        }

        return menuAccessInfoView;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/confirm-otp")
    public String confirmOtp(@RequestBody UserOtp userOtp) {
        return userManagementDomainService.confirmOtp(userOtp);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/resend-otp")
    public String resendOtp(@RequestBody String userMail) {
        return userManagementDomainService.sendOtp(userMail);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create-user")
    public UserInfoView createUser(@RequestBody UserInfoView userInfoView) {
        return userManagementDomainService.createUser(userInfoView);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/get-user-info-by-mail")
    public UserInfoView getUserInfoByEmail(@RequestBody String userEmail) {
        return userManagementDomainService.getUserInfoByEmail(userEmail);
    }

}
