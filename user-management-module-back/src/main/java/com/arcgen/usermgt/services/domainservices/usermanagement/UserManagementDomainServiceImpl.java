package com.arcgen.usermgt.services.domainservices.usermanagement;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.arcgen.usermgt.config.AppConstant;
import com.arcgen.usermgt.models.domain.usermanagement.UserIdentification;
import com.arcgen.usermgt.models.domain.usermanagement.UserInfo;
import com.arcgen.usermgt.models.view.usermanagement.UserIdentificationView;
import com.arcgen.usermgt.models.view.usermanagement.UserInfoView;
import com.arcgen.usermgt.repositories.usermanagement.UserIdentificationRepo;
import com.arcgen.usermgt.repositories.usermanagement.UserInfoRepo;
import com.arcgen.usermgt.util.UtilService;
import java.util.ArrayList;
import java.util.List;
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

    @Override
    public String authenticateUser(UserIdentificationView userIdentificationView, String langIndex) {
        String accessFlag = "";

        String decryptedPass = utilService.decryptUserAuth(userIdentificationView.getUserAuth());

        if (userIdentificationView != null && userIdentificationView.getUserId() != null && decryptedPass != null) {

            UserIdentification userIdentification = userIdentificationRepo.findByUserId(userIdentificationView.getUserId());

            try {
                boolean isAuthorized = utilService.validatePassword(decryptedPass, userIdentification.getUserAuth());

                if (userIdentification != null && isAuthorized) {
                    userIdentificationView.setUserAuth("");
                    Gson gson = new Gson();
                    accessFlag = gson.toJson(userIdentificationView);
                }
            } catch (Exception ex) {

                System.out.println("User Id or Password Incorrect");

            }

        }

        return accessFlag;
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
    public void createDxrUser(UserInfoView userInfoView) {
        String userAuthId = createDxrIdentification(userInfoView);
        createCompanyUser(userInfoView, userAuthId);
    }

    public void createCompanyUser(UserInfoView userInfoView, String userAuthId) {
        UserInfo userInfo = userInfoViewToDomain(userInfoView);
        userInfo.setUserAuthId(userAuthId);

        UserInfo savedUserInfo = userInfoRepo.findByUserAuthId(userAuthId);

        if (savedUserInfo == null) {
            userInfoRepo.save(userInfo);
        }
    }

    @Override
    public String createDxrIdentification(UserInfoView userInfoView) {
        String userIdentificationId = "";
        try {
            UserIdentification saveduserIdentificationByMail = new UserIdentification();
            saveduserIdentificationByMail = userIdentificationRepo.findByUserId(userInfoView.getUserEmail());

            if (saveduserIdentificationByMail != null) {

                userIdentificationId = saveduserIdentificationByMail.getUserIdentificationId();

            } else {

                UserIdentification newUserIdentification = new UserIdentification();

                newUserIdentification.setUserId(userInfoView.getUserEmail());
                String userAuthPass = utilService.generatePassword();
//                System.out.println("DXR Admin Email: " + userInfoView.getUserEmail() + "DXR Admin Pass" + userAuthPass);
                String userAuthHash = utilService.generateStorngPasswordHash(userAuthPass);
                newUserIdentification.setUserAuth(userAuthHash);
                String newIdString = utilService.generateUniqueId();
                newUserIdentification.setUserIdentificationId(newIdString);
//                newUserIdentification.setOneTimeAccessFlag(AppConstant.ONE_TIME_ACCESS_FLAG_FALSE);

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

}
