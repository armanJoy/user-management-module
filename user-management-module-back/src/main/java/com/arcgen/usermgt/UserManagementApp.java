package com.arcgen.usermgt;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class UserManagementApp {

//    @Autowired
//    UtilService utilService;
    public static void main(String[] args) {
        SpringApplication.run(UserManagementApp.class, args);
        System.out.println("User Management Project BackEnd");
    }

//    public void init() {
//        utilService.generateOrgAppAccessControlItems("organization/dxr");
//    }
}
