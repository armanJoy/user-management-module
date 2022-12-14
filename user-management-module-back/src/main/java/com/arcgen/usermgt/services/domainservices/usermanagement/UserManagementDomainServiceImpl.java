package com.arcgen.usermgt.services.domainservices.usermanagement;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.arcgen.usermgt.config.AppConstant;
import com.arcgen.usermgt.controllers.web.utility.UtilityCtrl;
import com.arcgen.usermgt.models.domain.usermanagement.UserIdentification;
import com.arcgen.usermgt.models.domain.usermanagement.UserInfo;
import com.arcgen.usermgt.models.view.usermanagement.UserIdentificationView;
import com.arcgen.usermgt.models.view.usermanagement.UserInfoView;
import com.arcgen.usermgt.models.view.usermanagement.UserOtp;
import com.arcgen.usermgt.models.view.utility.MailVM;
import com.arcgen.usermgt.repositories.usermanagement.UserIdentificationRepo;
import com.arcgen.usermgt.repositories.usermanagement.UserInfoRepo;
import com.arcgen.usermgt.util.UtilService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagementDomainServiceImpl implements UserManagementDomainService {

    @Autowired
    UserIdentificationRepo userIdentificationRepo;

    @Autowired
    UserInfoRepo userInfoRepo;

    @Autowired
    UtilService utilService;

    @Autowired
    UtilityCtrl utilCtrl;

    private HashMap<String, String> otpStore = new HashMap<>();

    @Override
    public String authenticateUser(UserIdentificationView userIdentificationView, boolean initialLogin) {
        String authorizedUser = "";

        String decryptedPass = utilService.decryptUserAuth(userIdentificationView.getUserAuth());

        if (userIdentificationView != null && userIdentificationView.getUserId() != null && decryptedPass != null) {

            UserIdentification userIdentification = userIdentificationRepo.findByUserId(userIdentificationView.getUserId());

            try {
                boolean isAuthorized = utilService.validatePassword(decryptedPass, userIdentification.getUserAuth());

                if (userIdentification != null && isAuthorized) {
                    userIdentificationView.setUserAuth("");
                    Gson gson = new Gson();
                    authorizedUser = gson.toJson(userIdentificationView);
                }
            } catch (Exception ex) {

                System.out.println("User Id or Password Incorrect");

            }

        }

        if (authorizedUser != null && !authorizedUser.isEmpty() && initialLogin) {
            sendOtp(userIdentificationView.getUserId());
        }

        return authorizedUser;
    }

    @Override
    public String sendOtp(String userEmail) {
        String sendSuccess = AppConstant.TRUE_VALUE;
        try {
            String otp = utilService.generateRandomNumnericString(AppConstant.OTP_LENGHT);
            MailVM mailVM = new MailVM(userEmail, "", AppConstant.OTP_MAIL_CONTENT.concat(otp));

            otpStore.put(userEmail, otp);

            utilCtrl.sendMailToMailAddress(mailVM);

            clearOtpAfterExpireTime(userEmail);
        } catch (Exception e) {
            sendSuccess = AppConstant.FALSE_VALUE;

        }

        return sendSuccess;
    }

    ScheduledThreadPoolExecutor exec = new ScheduledThreadPoolExecutor(1);

    void clearOtpAfterExpireTime(String userMail) {
        exec.schedule(new Runnable() {
            public void run() {
                otpStore.remove(userMail);
            }

        }, 60, TimeUnit.SECONDS);
    }

    @Override
    public String confirmOtp(UserOtp userOtp) {
        String confirmed = "";

        if (otpStore.containsKey(userOtp.getUserMail()) && otpStore.get(userOtp.getUserMail()).equals(userOtp.getOtp())) {
            confirmed = AppConstant.TRUE_VALUE;
            otpStore.remove(userOtp.getUserMail());
        } else {
            System.out.println("Invalid or expired OTP  - Email: " + userOtp.getUserMail() + ",  OTP: " + userOtp.getOtp());
        }

        return confirmed;
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
    public UserInfoView createUser(UserInfoView userInfoView) {
        String userAuthId = createUserIdentification(userInfoView);
        userInfoView = createCompanyUser(userInfoView, userAuthId);

        return userInfoView;
    }

    public UserInfoView createCompanyUser(UserInfoView userInfoView, String userAuthId) {
        UserInfo userInfo = userInfoViewToDomain(userInfoView);
        userInfo.setUserAuthId(userAuthId);

        UserInfo savedUserInfo = userInfoRepo.findByUserAuthId(userAuthId);

        if (savedUserInfo == null) {
            userInfoRepo.save(userInfo);
        }

        userInfoView.setPass("");

        return userInfoView;
    }

    @Override
    public String createUserIdentification(UserInfoView userInfoView) {
        String userIdentificationId = "";
        try {
            UserIdentification saveduserIdentificationByMail = new UserIdentification();
            saveduserIdentificationByMail = userIdentificationRepo.findByUserId(userInfoView.getUserEmail());

            if (saveduserIdentificationByMail != null) {

                userIdentificationId = saveduserIdentificationByMail.getUserIdentificationId();

            } else {

                UserIdentification newUserIdentification = new UserIdentification();

                newUserIdentification.setUserId(userInfoView.getUserEmail());

                String userAuthPass = utilService.decryptUserAuth(userInfoView.getPass());
                String userAuthHash = utilService.generateStorngPasswordHash(userAuthPass);
                newUserIdentification.setUserAuth(userAuthHash);
                String newIdString = utilService.generateUniqueId();
                newUserIdentification.setUserIdentificationId(newIdString);

                newUserIdentification = userIdentificationRepo.save(newUserIdentification);

                userIdentificationId = newUserIdentification.getUserIdentificationId();

            }

        } catch (Exception ex) {
            System.out.println("New User Account Creation Failed");
        }

        return userIdentificationId;
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

}
