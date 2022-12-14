package com.arcgen.usermgt.services.domainservices.usermanagement;

import com.arcgen.usermgt.models.domain.usermanagement.UserInfo;
import com.arcgen.usermgt.models.view.usermanagement.UserIdentificationView;
import com.arcgen.usermgt.models.view.usermanagement.UserInfoView;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface UserManagementDomainService {

    String authenticateUser(UserIdentificationView userIdentificationView, String langIndex);

    void createDxrUser(UserInfoView userInfoView);

    String createDxrIdentification(UserInfoView userInfoView);

    UserInfoView getUserInfoByEmail(String userEmail);

    UserInfoView userInfoDomainToView(UserInfo data);

    List<UserInfoView> userInfoDomainToView(List<UserInfo> data);

    UserInfo userInfoViewToDomain(UserInfoView data);

    List<UserInfo> userInfoViewToDomain(List<UserInfoView> data);

}
