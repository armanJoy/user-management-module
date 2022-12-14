package com.arcgen.usermgt.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;
import org.springframework.stereotype.Service;
import com.arcgen.usermgt.config.AppConstant;

@Service
public class DateTimeServiceImpl implements DateTimeService {

//    @Override
//    public String formatDateTime(String dateTime, String direction) {
//        String choosedUserDateFormat = AppConstant.YYYYMMDD_SLASH;
//        String formatedDateTime = "";
//        if (direction.equals(AppConstant.FRONT_END_TO_BACK_END)) {
//
//            if (choosedUserDateFormat.equals(AppConstant.YYYYMMDD)) {
//
//                formatedDateTime = dateTime;
//
//            } else if (choosedUserDateFormat.equals(AppConstant.DDMMYYYY)) {
//
//                formatedDateTime = dateTime.substring(4, 8) + dateTime.substring(2, 4) + dateTime.substring(0, 2) + dateTime.substring(8);
//
//            } else if (choosedUserDateFormat.equals(AppConstant.MMDDYYYY)) {
//
//                formatedDateTime = dateTime.substring(4, 8) + dateTime.substring(0, 2) + dateTime.substring(2, 4) + dateTime.substring(8);
//
//            }
//
//        } else if (direction.equals(AppConstant.BACK_END_TO_FRONT_END)) {
//
//            if (choosedUserDateFormat.equals(AppConstant.YYYYMMDD)) {
//
//                formatedDateTime = dateTime;
//                LocalDate ld = LocalDate.parse(dateTime.subSequence(0, 8), DateTimeFormatter.BASIC_ISO_DATE);
////                System.out.println(ld);
//
//            } else if (choosedUserDateFormat.equals(AppConstant.DDMMYYYY)) {
//
//                formatedDateTime = dateTime.substring(6, 8) + dateTime.substring(4, 6) + dateTime.substring(0, 4) + dateTime.substring(8);
//                DateTimeFormatter dtf = DateTimeFormatter.ofPattern(AppConstant.DDMMYYYY);
//                LocalDate ld = LocalDate.parse(dateTime.subSequence(0, 8), dtf);
////                System.out.println(ld);
//
//            } else if (choosedUserDateFormat.equals(AppConstant.MMDDYYYY)) {
//
//                formatedDateTime = dateTime.substring(4, 6) + dateTime.substring(6, 8) + dateTime.substring(0, 4) + dateTime.substring(8);
//                DateTimeFormatter dtf = DateTimeFormatter.ofPattern(AppConstant.MMDDYYYY);
//                LocalDate ld = LocalDate.parse(dateTime.subSequence(0, 8), dtf);
////                System.out.println(ld);
//            }
//        }
//
//        return formatedDateTime;
//    }
//    String displayFormatedData(String data, String langIndex, String dateFormat) {
//
//    }
    @Override
    public String formatDate(String dateString, String direction) {
        String choosedUserDateFormat = AppConstant.DDMMMMYYYY_SPACE_COMA_SPACE;
        String formatedDateTime = "";
//        dateString = dateString.substring(0, 8);
        if (direction.equals(AppConstant.FRONT_END_TO_BACK_END)) {

            if (choosedUserDateFormat.equals(AppConstant.YYYYMMDD)) {

                formatedDateTime = dateString;

            } else if (choosedUserDateFormat.equals(AppConstant.DDMMYYYY)) {

                formatedDateTime = dateString.substring(4, 8) + dateString.substring(2, 4) + dateString.substring(0, 2);

            } else if (choosedUserDateFormat.equals(AppConstant.MMDDYYYY)) {

                formatedDateTime = dateString.substring(4, 8) + dateString.substring(0, 2) + dateString.substring(2, 4);

            } else if (choosedUserDateFormat.equals(AppConstant.YYMD_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYMD_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYMMD_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYMMD_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYMDD_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYMDD_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYMMDD_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYMMDD_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYYYMD_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYYYMD_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMD_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYYYMMD_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYYYMDD_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYYYMDD_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMDD_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYYYMMDD_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYMD_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYMD_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYMMD_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYMMD_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYMDD_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYMDD_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYMMDD_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYMMDD_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYYYMD_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYYYMD_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMD_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYYYMMD_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYYYMDD_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYYYMDD_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMDD_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYYYMMDD_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYMD_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYMD_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYMMD_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYMMD_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYMDD_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYMDD_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYMMDD_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYMMDD_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYYYMD_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYYYMD_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMD_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYYYMMD_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYYYMDD_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYYYMDD_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMDD_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYYYMMDD_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYMMMD_COMA_SPACE_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYMMMD_COMA_SPACE_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYMMMMD_COMA_SPACE_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYMMMMD_COMA_SPACE_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYMMMDD_COMA_SPACE_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYMMMDD_COMA_SPACE_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYMMMMDD_COMA_SPACE_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYMMMMDD_COMA_SPACE_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMMD_COMA_SPACE_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYYYMMMD_COMA_SPACE_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMMMD_COMA_SPACE_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYYYMMMMD_COMA_SPACE_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMMDD_COMA_SPACE_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYYYMMMDD_COMA_SPACE_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMMMDD_COMA_SPACE_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.YYYYMMMMDD_COMA_SPACE_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MDYY_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MDYY_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMDYY_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMDYY_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MDDYY_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MDDYY_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMDDYY_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMDDYY_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MDYYYY_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MDYYYY_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMDYYYY_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMDYYYY_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MDDYYYY_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MDDYYYY_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMDDYYYY_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMDDYYYY_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MDYY_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MDYY_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMDYY_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMDYY_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MDDYY_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MDDYY_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMDDYY_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMDDYY_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MDYYYY_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MDYYYY_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMDYYYY_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMDYYYY_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MDDYYYY_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MDDYYYY_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMDDYYYY_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMDDYYYY_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MDYY_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MDYY_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMDYY_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMDYY_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MDDYY_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MDDYY_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMDDYY_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMDDYY_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MDYYYY_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MDYYYY_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMDYYYY_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMDYYYY_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MDDYYYY_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MDDYYYY_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMDDYYYY_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMDDYYYY_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMMDYY_SPACE_COMA_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMMDYY_SPACE_COMA_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMMMDYY_SPACE_COMA_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMMMDYY_SPACE_COMA_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMMDDYY_SPACE_COMA_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMMDDYY_SPACE_COMA_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMMMDDYY_SPACE_COMA_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMMMDDYY_SPACE_COMA_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMMDYYYY_SPACE_COMA_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMMDYYYY_SPACE_COMA_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMMMDYYYY_SPACE_COMA_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMMMDYYYY_SPACE_COMA_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMMDDYYYY_SPACE_COMA_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMMDDYYYY_SPACE_COMA_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.MMMMDDYYYY_SPACE_COMA_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.MMMMDDYYYY_SPACE_COMA_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DMYY_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DMYY_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DMMYY_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DMMYY_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DDMYY_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DDMYY_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DDMMYY_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DDMMYY_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DMYYYY_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DMYYYY_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DMMYYYY_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DMMYYYY_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DDMYYYY_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DDMYYYY_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DDMMYYYY_DOT)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DDMMYYYY_DOT);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DMYY_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DMYY_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DMMYY_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DMMYY_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DDMYY_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DDMYY_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DDMMYY_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DDMMYY_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DMYYYY_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DMYYYY_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DMMYYYY_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DMMYYYY_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DDMYYYY_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DDMYYYY_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DDMMYYYY_HYPHEN)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DDMMYYYY_HYPHEN);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DMYY_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DMYY_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DMMYY_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DMMYY_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DDMYY_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DDMYY_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DDMMYY_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DDMMYY_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DMYYYY_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DMYYYY_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DMMYYYY_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DMMYYYY_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DDMYYYY_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DDMYYYY_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DDMMYYYY_SLASH)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DDMMYYYY_SLASH);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DMMMYY_SPACE_COMA_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DMMMYY_SPACE_COMA_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DMMMMYY_SPACE_COMA_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DMMMMYY_SPACE_COMA_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DDMMMYY_SPACE_COMA_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DDMMMYY_SPACE_COMA_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DDMMMMYY_SPACE_COMA_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DDMMMMYY_SPACE_COMA_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DMMMYYYY_SPACE_COMA_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DMMMYYYY_SPACE_COMA_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DMMMMYYYY_SPACE_COMA_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DMMMMYYYY_SPACE_COMA_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DDMMMYYYY_SPACE_COMA_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DDMMMYYYY_SPACE_COMA_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            } else if (choosedUserDateFormat.equals(AppConstant.DDMMMMYYYY_SPACE_COMA_SPACE)) {

                DateTimeFormatterBuilder builder = AppConstant.DATE_FORMAT_OBJECT.get(AppConstant.DDMMMMYYYY_SPACE_COMA_SPACE);
                DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                TemporalAccessor accessor = formatter.parse(dateString);
                LocalDate localDate = LocalDate.from(accessor);
                formatedDateTime = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

            }

        } else if (direction.equals(AppConstant.BACK_END_TO_FRONT_END)) {

            LocalDate lcDate = LocalDate.parse(dateString, DateTimeFormatter.BASIC_ISO_DATE);
            formatedDateTime = lcDate.format(DateTimeFormatter.ofPattern(choosedUserDateFormat));

        }

        return formatedDateTime;
    }

    @Override
    public String monthNameToMonthNumber(String monthName) {
        String monthString = "";

        if (monthName.startsWith(AppConstant.JAN_MONTH_STRING)) {
            monthString = AppConstant.JAN_MONTH_VALUE;
        } else if (monthName.startsWith(AppConstant.FEB_MONTH_STRING)) {
            monthString = AppConstant.FEB_MONTH_VALUE;
        } else if (monthName.startsWith(AppConstant.MAR_MONTH_STRING)) {
            monthString = AppConstant.MAR_MONTH_VALUE;
        } else if (monthName.startsWith(AppConstant.APR_MONTH_STRING)) {
            monthString = AppConstant.APR_MONTH_VALUE;
        } else if (monthName.startsWith(AppConstant.MAY_MONTH_STRING)) {
            monthString = AppConstant.MAY_MONTH_VALUE;
        } else if (monthName.startsWith(AppConstant.JUN_MONTH_STRING)) {
            monthString = AppConstant.JUN_MONTH_VALUE;
        } else if (monthName.startsWith(AppConstant.JUL_MONTH_STRING)) {
            monthString = AppConstant.JUL_MONTH_VALUE;
        } else if (monthName.startsWith(AppConstant.AUG_MONTH_STRING)) {
            monthString = AppConstant.AUG_MONTH_VALUE;
        } else if (monthName.startsWith(AppConstant.SEP_MONTH_STRING)) {
            monthString = AppConstant.SEP_MONTH_VALUE;
        } else if (monthName.startsWith(AppConstant.OCT_MONTH_STRING)) {
            monthString = AppConstant.OCT_MONTH_VALUE;
        } else if (monthName.startsWith(AppConstant.NOV_MONTH_STRING)) {
            monthString = AppConstant.NOV_MONTH_VALUE;
        } else if (monthName.startsWith(AppConstant.DEC_MONTH_STRING)) {
            monthString = AppConstant.DEC_MONTH_VALUE;
        }

        return monthString;
    }

    @Override
    public LocalDate stringToDateType(String date, String dataSource) {

        String formatedDate = "";
        LocalDate dateOutput = LocalDate.now();

        if (dataSource.equals(AppConstant.BACK_END_TYPE_DATE)) {

            dateOutput = LocalDate.parse(date.subSequence(0, 8), DateTimeFormatter.BASIC_ISO_DATE);

        } else if (dataSource.equals(AppConstant.FRONT_END_TYPE_DATE)) {

            formatedDate = formatDate(date, AppConstant.FRONT_END_TO_BACK_END);
            dateOutput = LocalDate.parse(formatedDate, DateTimeFormatter.BASIC_ISO_DATE);

        }

        return dateOutput;
    }

    @Override
    public String dateTypeToString(LocalDate date, String target) {
        String stringDate = "";
        String choosedUserDateFormat = AppConstant.YYYYMMDD_SLASH;
        if (target.equals(AppConstant.BACK_END_TYPE_DATE)) {

            stringDate = String.valueOf(date.getYear()) + (date.getMonthValue() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getMonthValue())) : String.valueOf(date.getMonthValue())) + (date.getDayOfMonth() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getDayOfMonth())) : String.valueOf(date.getDayOfMonth()));

        } else if (target.equals(AppConstant.FRONT_END_TYPE_DATE)) {

            stringDate = date.format(DateTimeFormatter.ofPattern(choosedUserDateFormat));

//	    if (choosedUserDateFormat.equals("YYYYMMdd")) {
//		
//		stringDate = String.valueOf(date.getYear()) + (date.getMonthValue()<10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getMonthValue())) : String.valueOf(date.getMonthValue())) + (date.getDayOfMonth()<10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getDayOfMonth())) : String.valueOf(date.getDayOfMonth()));
//		
//	    } else if (choosedUserDateFormat.equals("ddMMYYYY")) {
//		
//		stringDate = (date.getDayOfMonth()<10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getDayOfMonth())) : String.valueOf(date.getDayOfMonth())) + (date.getMonthValue()<10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getMonthValue())) : String.valueOf(date.getMonthValue())) + String.valueOf(date.getYear());
//		
//	    } else if (choosedUserDateFormat.equals("MMddYYYY")) {
//
//		stringDate = (date.getMonthValue()<10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getMonthValue())) : String.valueOf(date.getMonthValue())) + (date.getDayOfMonth()<10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getDayOfMonth())) : String.valueOf(date.getDayOfMonth())) + String.valueOf(date.getYear());
//		
//	    }
        }

        return stringDate;
    }

    @Override
    public String dateTimeTypeToString(LocalDateTime date, String target) {
        String stringDate = "";
        String choosedUserDateFormat = AppConstant.YYYYMMDD_SLASH;

        if (target.equals(AppConstant.BACK_END_TYPE_DATE)) {

            stringDate = String.valueOf(date.getYear()) + (date.getMonthValue() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getMonthValue())) : String.valueOf(date.getMonthValue())) + (date.getDayOfMonth() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getDayOfMonth())) : String.valueOf(date.getDayOfMonth())) + (date.getHour() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getHour())) : String.valueOf(date.getHour())) + (date.getMinute() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getMinute())) : String.valueOf(date.getMinute())) + (date.getSecond() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getSecond())) : String.valueOf(date.getSecond()));

        } else if (target.equals(AppConstant.FRONT_END_TYPE_DATE)) {

            if (choosedUserDateFormat.equals(AppConstant.YYYYMMDD)) {

                stringDate = String.valueOf(date.getYear()) + (date.getMonthValue() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getMonthValue())) : String.valueOf(date.getMonthValue())) + (date.getDayOfMonth() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getDayOfMonth())) : String.valueOf(date.getDayOfMonth())) + (date.getHour() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getHour())) : String.valueOf(date.getHour())) + (date.getMinute() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getMinute())) : String.valueOf(date.getMinute())) + (date.getSecond() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getSecond())) : String.valueOf(date.getSecond()));

            } else if (choosedUserDateFormat.equals(AppConstant.DDMMYYYY)) {

                stringDate = (date.getDayOfMonth() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getDayOfMonth())) : String.valueOf(date.getDayOfMonth())) + (date.getMonthValue() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getMonthValue())) : String.valueOf(date.getMonthValue())) + String.valueOf(date.getYear()) + (date.getHour() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getHour())) : String.valueOf(date.getHour())) + (date.getMinute() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getMinute())) : String.valueOf(date.getMinute())) + (date.getSecond() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getSecond())) : String.valueOf(date.getSecond()));

            } else if (choosedUserDateFormat.equals(AppConstant.MMDDYYYY)) {

                stringDate = (date.getMonthValue() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getMonthValue())) : String.valueOf(date.getMonthValue())) + (date.getDayOfMonth() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getDayOfMonth())) : String.valueOf(date.getDayOfMonth())) + String.valueOf(date.getYear()) + (date.getHour() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getHour())) : String.valueOf(date.getHour())) + (date.getMinute() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getMinute())) : String.valueOf(date.getMinute())) + (date.getSecond() < 10 ? (AppConstant.ZERO_STRING + String.valueOf(date.getSecond())) : String.valueOf(date.getSecond()));

            }
        }

        return stringDate;
    }

    @Override
    public String formatDateTime(String dateString, String direction) {
        String choosedUserDateFormat = AppConstant.DDMMMYYYY_SPACE_COMA_SPACE;
        String formatedDateTime = "";
//        dateString = dateString.substring(0, 8);

        try {
            if (direction.equals(AppConstant.FRONT_END_TO_BACK_END)) {

                if (choosedUserDateFormat.equals(AppConstant.YYYYMMDD)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMMDD);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DDMMYYYY)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DDMMYYYY);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMDDYYYY)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMDDYYYY);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYMD_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYMD_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYMMD_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYMMD_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYMDD_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYMDD_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYMMDD_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYMMDD_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYYYMD_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMD_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMD_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMMD_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYYYMDD_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMDD_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMDD_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMMDD_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYMD_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYMD_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYMMD_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYMMD_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYMDD_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYMDD_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYMMDD_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYMMDD_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYYYMD_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMD_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMD_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMMD_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYYYMDD_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMDD_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMDD_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMMDD_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYMD_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYMD_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYMMD_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYMMD_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYMDD_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYMDD_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYMMDD_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYMMDD_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYYYMD_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMD_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMD_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMMD_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYYYMDD_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMDD_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMDD_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMMDD_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYMMMD_COMA_SPACE_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYMMMD_COMA_SPACE_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYMMMMD_COMA_SPACE_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYMMMMD_COMA_SPACE_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYMMMDD_COMA_SPACE_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYMMMDD_COMA_SPACE_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYMMMMDD_COMA_SPACE_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYMMMMDD_COMA_SPACE_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMMD_COMA_SPACE_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMMMD_COMA_SPACE_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMMMD_COMA_SPACE_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMMMMD_COMA_SPACE_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMMDD_COMA_SPACE_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMMMDD_COMA_SPACE_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.YYYYMMMMDD_COMA_SPACE_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMMMMDD_COMA_SPACE_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MDYY_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MDYY_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMDYY_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMDYY_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MDDYY_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MDDYY_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMDDYY_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMDDYY_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MDYYYY_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MDYYYY_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMDYYYY_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMDYYYY_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MDDYYYY_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MDDYYYY_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMDDYYYY_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMDDYYYY_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MDYY_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MDYY_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMDYY_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMDYY_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MDDYY_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MDDYY_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMDDYY_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMDDYY_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MDYYYY_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MDYYYY_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMDYYYY_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMDYYYY_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MDDYYYY_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MDDYYYY_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMDDYYYY_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMDDYYYY_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MDYY_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MDYY_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMDYY_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMDYY_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MDDYY_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MDDYY_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMDDYY_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMDDYY_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MDYYYY_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MDYYYY_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMDYYYY_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMDYYYY_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MDDYYYY_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MDDYYYY_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMDDYYYY_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMDDYYYY_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMMDYY_SPACE_COMA_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMMDYY_SPACE_COMA_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMMMDYY_SPACE_COMA_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMMMDYY_SPACE_COMA_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMMDDYY_SPACE_COMA_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMMDDYY_SPACE_COMA_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMMMDDYY_SPACE_COMA_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMMMDDYY_SPACE_COMA_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMMDYYYY_SPACE_COMA_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMMDYYYY_SPACE_COMA_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMMMDYYYY_SPACE_COMA_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMMMDYYYY_SPACE_COMA_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMMDDYYYY_SPACE_COMA_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMMDDYYYY_SPACE_COMA_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.MMMMDDYYYY_SPACE_COMA_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.MMMMDDYYYY_SPACE_COMA_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DMYY_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DMYY_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DMMYY_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DMMYY_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DDMYY_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DDMYY_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DDMMYY_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DDMMYY_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DMYYYY_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DMYYYY_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DMMYYYY_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DMMYYYY_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DDMYYYY_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DDMYYYY_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DDMMYYYY_DOT)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DDMMYYYY_DOT);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DMYY_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DMYY_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DMMYY_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DMMYY_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DDMYY_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DDMYY_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DDMMYY_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DDMMYY_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DMYYYY_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DMYYYY_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DMMYYYY_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DMMYYYY_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DDMYYYY_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DDMYYYY_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DDMMYYYY_HYPHEN)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DDMMYYYY_HYPHEN);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDateTime localDate = LocalDateTime.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DMYY_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DMYY_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DMMYY_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DMMYY_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DDMYY_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DDMYY_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DDMMYY_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DDMMYY_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DMYYYY_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DMYYYY_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DMMYYYY_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DMMYYYY_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DDMYYYY_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DDMYYYY_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DDMMYYYY_SLASH)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DDMMYYYY_SLASH);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DMMMYY_SPACE_COMA_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DMMMYY_SPACE_COMA_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DMMMMYY_SPACE_COMA_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DMMMMYY_SPACE_COMA_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DDMMMYY_SPACE_COMA_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DDMMMYY_SPACE_COMA_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DDMMMMYY_SPACE_COMA_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DDMMMMYY_SPACE_COMA_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DMMMYYYY_SPACE_COMA_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DMMMYYYY_SPACE_COMA_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DMMMMYYYY_SPACE_COMA_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DMMMMYYYY_SPACE_COMA_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DDMMMYYYY_SPACE_COMA_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DDMMMYYYY_SPACE_COMA_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                } else if (choosedUserDateFormat.equals(AppConstant.DDMMMMYYYY_SPACE_COMA_SPACE)) {

                    DateTimeFormatterBuilder builder = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.DDMMMMYYYY_SPACE_COMA_SPACE);
                    DateTimeFormatter formatter = builder.toFormatter(Locale.US);
                    TemporalAccessor accessor = formatter.parse(dateString);
                    LocalDate localDate = LocalDate.from(accessor);
                    formatedDateTime = localDate.format(AppConstant.BACK_DATE_TIME_FORMATTER);

                }

            } else if (direction.equals(AppConstant.BACK_END_TO_FRONT_END)) {
//            DateTimeFormatter dateTimeFormatter = AppConstant.DATE_TIME_FORMAT_OBJECT.get(AppConstant.YYYYMMDD_HYPHEN).toFormatter();

                String dateFormatedToJapaneseYear = formatEnglishYearToJapaneseYear(dateString);
                LocalDateTime lcDate = LocalDateTime.parse(dateFormatedToJapaneseYear, AppConstant.BACK_DATE_TIME_FORMATTER);

                formatedDateTime = lcDate.format(DateTimeFormatter.ofPattern(AppConstant.JAPANESE_DATE_FORMAT));

            }
        } catch (Exception e) {

        }

        return formatedDateTime;
    }

    String handleEnglishYear(String dateString) throws Exception {

        if (dateString.length() == 8) {
            dateString = dateString.substring(0, 4) + "/" + dateString.substring(4, 6) + "/" + dateString.substring(6, 8) + " 00:00:00";
        }

        return dateString;
    }

    String handleJapaneseYear(String dateString) throws Exception {
//        "yy年MM月dd日 HH:mm:ss";
        if (dateString.length() == 6) {
            dateString = dateString.substring(0, 2) + "年" + dateString.substring(2, 4) + "月" + dateString.substring(4) + "日 00:00:00";
        }

        return dateString;
    }

    public String formatEnglishYearToJapaneseYear(String date) throws Exception {
        String japaneseDateTime = "";

        String englishYearSubString = date.substring(0, 4);
        Integer englishYearValue = Integer.parseInt(englishYearSubString);
        Integer japaneseYearValue = englishYearValue - 18;
        String japaneseYearSubString = japaneseYearValue.toString();

        japaneseDateTime = japaneseYearSubString.concat(date.substring(4));

        return japaneseDateTime;
    }

    public String formatJapaneseYearToEnglishYear(String date) throws Exception {
        String englishDateTime = "";

        String japaneseYearSubString = date.substring(0, 2);
        Integer japaneseYearValue = Integer.parseInt(japaneseYearSubString);
        Integer englishYearValue = japaneseYearValue + 18;
        String englishYearSubString = englishYearValue.toString();

        englishDateTime = englishYearSubString.concat(date.substring(3, 5)).concat(date.substring(6, 8)).concat(date.substring(9));

        return englishDateTime;
    }

    @Override
    public String getCurrentTime() {
        LocalDateTime localDateTime = LocalDateTime.now();

        String dateTime = localDateTime.format(AppConstant.BACK_DATE_TIME_FORMATTER);

        return dateTime;
    }

    @Override
    public String getPlainTimeFormat(String timeString) {
        timeString = timeString.replace(":", "");
        return timeString;
    }

    @Override
    public String formatedTime(String timeString) {
        return timeString.substring(0, 2).concat(":").concat(timeString.substring(2, 4));
    }

}
