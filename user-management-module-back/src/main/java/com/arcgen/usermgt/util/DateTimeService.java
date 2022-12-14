package com.arcgen.usermgt.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

public interface DateTimeService {

    String formatDateTime(String dateTime, String direction);

    String formatDate(String date, String direction);

    LocalDate stringToDateType(String date, String dataSource);

    String dateTypeToString(LocalDate date, String target);

    String dateTimeTypeToString(LocalDateTime date, String target);

    String monthNameToMonthNumber(String monthName);

    String getCurrentTime();

    String getPlainTimeFormat(String timeString);

    String formatedTime(String timeString);

}
