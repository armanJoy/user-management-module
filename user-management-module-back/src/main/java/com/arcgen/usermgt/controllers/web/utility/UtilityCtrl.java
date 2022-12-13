package com.arcgen.usermgt.controllers.web.utility;

import com.arcgen.usermgt.config.AppConstant;
import com.arcgen.usermgt.util.DateTimeService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/web/util")
public class UtilityCtrl {

    @Autowired
    DateTimeService dateTimeService;

    @RequestMapping(method = RequestMethod.GET, value = "/current-date")
    String getCurrentDate(@RequestHeader("langIndex") String language) {
        String date = dateTimeService.getCurrentTime();
//        String formatedDate = dateTimeService.formatDateTimeAsLanguageMode(language, date, AppConstant.FRONT_END_TO_BACK_END);
//        JSONObject jSONObject = new JSONObject();
//        jSONObject.put("date", formatedDate);
        return date;

    }

    @RequestMapping(method = RequestMethod.POST, value = "/get-date-view")
    JSONObject getCurrentDateView(@RequestHeader("langIndex") String language, @RequestBody String date) {
        String formatedBackendDate = dateTimeService.formatDateTimeAsLanguageMode(language, date, AppConstant.FRONT_END_TO_BACK_END);
        String formatedFrontendDate = dateTimeService.formatDateTimeAsLanguageMode(language, formatedBackendDate, AppConstant.BACK_END_TO_FRONT_END);
        JSONObject dateObject = new JSONObject();
        dateObject.put("date", formatedFrontendDate);
        return dateObject;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/check-serve")
    String checkServerConnectivity() {
        return "1";
    }

}
