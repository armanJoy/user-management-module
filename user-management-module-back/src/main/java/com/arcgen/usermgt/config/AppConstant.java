package com.arcgen.usermgt.config;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.HashMap;
import java.util.Map;

public class AppConstant {

    public static final String OTP_MAIL_SUBJECT = "Arcgen Login OTP";
    public static final String OTP_MAIL_CONTENT = "Your temporary OTP is - ";
    public static final Integer OTP_LENGHT = 6;

    public static final String PRODUCTION_ENVIRONMENT = "production";

    public static final String ALLOW_ORIGINS = "*";
    public static final String ALLOW_ORIGIN_HEADER = "Access-Control-Allow-Origin";

    public static final String TRUE_VALUE = "1";
    public static final String FALSE_VALUE = "0";

    public static final String ORG_ID = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqWV9jSRh/Rm9MYMdnCfneNWIS8qB04vGtXlWqbEzvnlJkeTd908Nz/u0ZAAqWusLnrfO5ndp32QmyrbnM9TPrw2Dn+BeeXWVb2v2VM7hEJ35H+UMEJvTZNuE/udg9pIsc+u465xvUXbMbPe3/1jGQaXpTsRDoShjLPDEIYvfsXOxYTW2ZZ3P7mKQBJcEthcbcwWjbm2JnD4sRBZo6CY+5l8pCXrtZoYmRmcZO0E9YiDDvhfRbLfwnsuuSsAc5/nSirBzS0hf9DzOBRCZQfBZauZlhosQm/uFToEKs2NkwAVuhC/AZqPJcmt/8vo6VNZSF4uQ1rstqkKWcIGWgw8iXQIDAQABMIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCpZX2NJGH9Gb0xgx2cJ+d41YhLyoHTi8a1eVapsTO+eUmR5N33Tw3P+7RkACpa6wuet87md2nfZCbKtucz1M+vDYOf4F55dZVva/ZUzuEQnfkf5QwQm9Nk24T+52D2kixz67jrnG9Rdsxs97f/WMZBpelOxEOhKGMs8MQhi9+xc7FhNbZlnc/uYpAElwS2FxtzBaNubYmcPixEFmjoJj7mXykJeu1mhiZGZxk7QT1iIMO+F9Fst/Cey65KwBzn+dKKsHNLSF/0PM4FEJlB8Flq5mWGixCb+4VOgQqzY2TABW6EL8Bmo8lya3/y+jpU1lIXi5DWuy2qQpZwgZaDDyJdAgMBAAECggEAMECEnuu6LcpjJfNfP9fuC3FnvY8VpBiwpYjGsteTEbKizjgPMh8GpDPikomphvRk/vUEroldUxDIK/4lpZH9BrQmxie3QYnI41Axfr7fRUh6aidoZGK+uH//RkzKRfIlT2/Z4ONSojXgzTlS5B15e8Gyz4kAaquCdI6wj420TmtbPfzRCGO5o1BrEzSTzWuoHBXyUIIaYewYXL2CFbZ1De72unkypKNmvKzxPXLD8hYwCgeHM+lhPWZi5jVITASDN5QbsKRPAly6z9BRVSManQCaMKQh70fiN6kf1sJv48u089npNtxjE6l6fJWNSIXfYphNKMUfUx9wRPcB9+Ap0QKBgQDeCL6o28Uk4s6iKNeLYSeKwvCtEg921BRrIpdV703rW6lTuEfkj536aLMqyvfYTPCs5HqN++mu5smZWaIyrjvU5y6EC3CrReelnB9LvC59JwbD8n95OyiFVP62Akd9GJBajnd0CkHV/qAgx79Sk9K35hdWWczuLZle39kqaqP1twKBgQDDT1vN5GYNTO9IJubRO+4eNnGvrRsO1QUGumbKTV3NF1qMZcUz+9mWxh7QZq/zhmAqmCAgV56875RfCljK/wnA6jj9ZCfL2Ob/GRaWWP21bXaLIFP2VlKDWrfR0EoOE1vx5uzVQ5EnLaEpAB1saluIhibVfRBdiwysnccZjn0IiwKBgHl+hX12jGDLrs/y00cUSYPXecTqTgXytJ2PFwpR4Ow5guUpwEUkBQjhw7BV0drM9yFUAG+y+cLXzFaaQnPC/UBZpA1jCSrfHIt1a3aQqUuYUE5mYjRfF6Qlxx6nDqE4EL1MmbaoajADnXFye5FfC/3O7NQ2XTmzP+o3SOi546/vAoGANwXBaETDF1YoRxxmhGWs1Kgj6QkMiWYrz1RuJuoa1e+RW+JD5zw5dYeFINL9GM8vgnBvBI2Ks9GO7CN/Flk5Rzb1LTWtHHmTwiQwP9T8TMN01QcbgFebUVQaWyqh4ktD6OdUq1QorW/maiWVJHjmJpUclaJxHNlSjcK5V5LT2LcCgYBm4kgmzc1pK6cu3j7rF7eWCLVPaZrdygm0cdL/i1vAMry0A//7YiZX4lbHG0GaN0VvF8tJMKkxCTuinoin5ldbUBM7jkhFMwn6dvzOPicG0ZijuTdE3L/ILNQ1YFL7kfSamBuTfwLyzp2YnZOJh0LIFccqV79Xe3JJoYVbWvvKmg==";
    public static final String SALT = "msbd";
    public static final byte[] IV = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static final String USER_NAME = "email2arjoy@gmail.com";
    public static final String PASSWORD = "CnNNnYbnYPin/ls/YsmqI34KEirdL3iXUNnubwPmj4u4fry7YKMvmlr3Up7IsCv/uuWTE7W63qRYsz+yjiOkrn+cnqRNUoKg6PcXLek9mC/LxsuNirvaEBNWdeYVKMFp/H71kPFI+4gMeOoM+fFz5Zi7LXFmz8mglmvcyP+rjpoE5BVnWY1NjhZkLgsX0GXCd9XEz+7rYAJKLr6GM+gvyw/gcv2I8JpAY9gWhrpRYnDCIIND1W5OOemea0CTo0PIqYCgaHFwyD8RQPs+YL+iqxY1FUE1qzoR7tlilXuMh0ojyBWseYO9ZorKdDOZekuLLR4BBgTp/d+o7WNjI32baA==";

    public static final String BACK_END_TYPE_DATE = "BACK_END";
    public static final String FRONT_END_TYPE_DATE = "FRONT_END";
    public static final String BACK_END_TO_FRONT_END = "B2F";
    public static final String FRONT_END_TO_BACK_END = "F2B";

    public static final String BASE_DATE_FORMAT_YMD = "Year-Month-Day";
    public static final String BASE_DATE_FORMAT_MDY = "Month-Day-Year";
    public static final String BASE_DATE_FORMAT_DMY = "Day-Month-Year";

    public static final String ZERO_STRING = "0";

    public static final String JAN_MONTH_VALUE = "01";
    public static final String FEB_MONTH_VALUE = "02";
    public static final String MAR_MONTH_VALUE = "03";
    public static final String APR_MONTH_VALUE = "04";
    public static final String MAY_MONTH_VALUE = "05";
    public static final String JUN_MONTH_VALUE = "06";
    public static final String JUL_MONTH_VALUE = "07";
    public static final String AUG_MONTH_VALUE = "08";
    public static final String SEP_MONTH_VALUE = "09";
    public static final String OCT_MONTH_VALUE = "10";
    public static final String NOV_MONTH_VALUE = "11";
    public static final String DEC_MONTH_VALUE = "12";

    public static final String JAN_MONTH_STRING = "jan";
    public static final String FEB_MONTH_STRING = "feb";
    public static final String MAR_MONTH_STRING = "mar";
    public static final String APR_MONTH_STRING = "apr";
    public static final String MAY_MONTH_STRING = "may";
    public static final String JUN_MONTH_STRING = "jun";
    public static final String JUL_MONTH_STRING = "jul";
    public static final String AUG_MONTH_STRING = "aug";
    public static final String SEP_MONTH_STRING = "sep";
    public static final String OCT_MONTH_STRING = "oct";
    public static final String NOV_MONTH_STRING = "nov";
    public static final String DEC_MONTH_STRING = "dec";

    public static final String YYYYMMDD = "YYYYMMdd HH:mm:ss";
    public static final String DDMMYYYY = "ddMMYYYY HH:mm:ss";
    public static final String MMDDYYYY = "MMddYYYY HH:mm:ss";
//    Year Month Day Format
    public static final String YYMD_DOT = "yy.M.d HH:mm:ss";
    public static final String YYMMD_DOT = "yy.MM.d HH:mm:ss";
    public static final String YYMDD_DOT = "yy.M.dd HH:mm:ss";
    public static final String YYMMDD_DOT = "yy.MM.dd HH:mm:ss";
    public static final String YYYYMD_DOT = "yyyy.M.d HH:mm:ss";
    public static final String YYYYMMD_DOT = "yyyy.MM.d HH:mm:ss";
    public static final String YYYYMDD_DOT = "yyyy.M.dd HH:mm:ss";
    public static final String YYYYMMDD_DOT = "yyyy.MM.dd HH:mm:ss";
    public static final String YYMD_HYPHEN = "yy-M-d HH:mm:ss";
    public static final String YYMMD_HYPHEN = "yy-MM-d HH:mm:ss";
    public static final String YYMDD_HYPHEN = "yy-M-dd HH:mm:ss";
    public static final String YYMMDD_HYPHEN = "yy-MM-dd HH:mm:ss";
    public static final String YYYYMD_HYPHEN = "yyyy-M-d HH:mm:ss";
    public static final String YYYYMMD_HYPHEN = "yyyy-MM-d HH:mm:ss";
    public static final String YYYYMDD_HYPHEN = "yyyy-M-dd HH:mm:ss";
    public static final String YYYYMMDD_HYPHEN = "yyyy-MM-dd HH:mm:ss";
    public static final String YYMD_SLASH = "yy/M/d HH:mm:ss";
    public static final String YYMMD_SLASH = "yy/MM/d HH:mm:ss";
    public static final String YYMDD_SLASH = "yy/M/dd HH:mm:ss";
    public static final String YYMMDD_SLASH = "yy/MM/dd HH:mm:ss";
    public static final String YYYYMD_SLASH = "yyyy/M/d HH:mm:ss";
    public static final String YYYYMMD_SLASH = "yyyy/MM/d HH:mm:ss";
    public static final String YYYYMDD_SLASH = "yyyy/M/dd HH:mm:ss";
    public static final String YYYYMMDD_SLASH = "yyyy/MM/dd HH:mm:ss";

//    YMD for full or short month name
    public static final String YYMMMD_COMA_SPACE_SPACE = "yy, MMM d HH:mm:ss";
    public static final String YYMMMMD_COMA_SPACE_SPACE = "yy, MMMM d HH:mm:ss";
    public static final String YYMMMDD_COMA_SPACE_SPACE = "yy, MMM dd HH:mm:ss";
    public static final String YYMMMMDD_COMA_SPACE_SPACE = "yy, MMMM dd HH:mm:ss";
    public static final String YYYYMMMD_COMA_SPACE_SPACE = "yyyy, MMM d HH:mm:ss";
    public static final String YYYYMMMMD_COMA_SPACE_SPACE = "yyyy, MMMM d HH:mm:ss";
    public static final String YYYYMMMDD_COMA_SPACE_SPACE = "yyyy, MMM dd HH:mm:ss";
    public static final String YYYYMMMMDD_COMA_SPACE_SPACE = "yyyy, MMMM dd HH:mm:ss";

//    Month Day Year Format
    public static final String MDYY_DOT = "M.d.YY HH:mm:ss";
    public static final String MMDYY_DOT = "MM.d.YY HH:mm:ss";
    public static final String MDDYY_DOT = "M.dd.YY HH:mm:ss";
    public static final String MMDDYY_DOT = "MM.dd.YY HH:mm:ss";
    public static final String MDYYYY_DOT = "M.d.YYYY HH:mm:ss";
    public static final String MMDYYYY_DOT = "MM.d.YYYY HH:mm:ss";
    public static final String MDDYYYY_DOT = "M.dd.YYYY HH:mm:ss";
    public static final String MMDDYYYY_DOT = "MM.dd.YYYY HH:mm:ss";
    public static final String MDYY_HYPHEN = "M-d-YY HH:mm:ss";
    public static final String MMDYY_HYPHEN = "MM-d-YY HH:mm:ss";
    public static final String MDDYY_HYPHEN = "M-dd-YY HH:mm:ss";
    public static final String MMDDYY_HYPHEN = "MM-dd-YY HH:mm:ss";
    public static final String MDYYYY_HYPHEN = "M-d-YYYY HH:mm:ss";
    public static final String MMDYYYY_HYPHEN = "MM-d-YYYY HH:mm:ss";
    public static final String MDDYYYY_HYPHEN = "M-dd-YYYY HH:mm:ss";
    public static final String MMDDYYYY_HYPHEN = "MM-dd-YYYY HH:mm:ss";
    public static final String MDYY_SLASH = "M/d/YY HH:mm:ss";
    public static final String MMDYY_SLASH = "MM/d/YY HH:mm:ss";
    public static final String MDDYY_SLASH = "M/dd/YY HH:mm:ss";
    public static final String MMDDYY_SLASH = "MM/dd/YY HH:mm:ss";
    public static final String MDYYYY_SLASH = "M/d/YYYY HH:mm:ss";
    public static final String MMDYYYY_SLASH = "MM/d/YYYY HH:mm:ss";
    public static final String MDDYYYY_SLASH = "M/dd/YYYY HH:mm:ss";
    public static final String MMDDYYYY_SLASH = "MM/dd/YYYY HH:mm:ss";

//    MDY for full or short month name
    public static final String MMMDYY_SPACE_COMA_SPACE = "MMM d, yy HH:mm:ss";
    public static final String MMMMDYY_SPACE_COMA_SPACE = "MMMM d, yy HH:mm:ss";
    public static final String MMMDDYY_SPACE_COMA_SPACE = "MMM dd, yy HH:mm:ss";
    public static final String MMMMDDYY_SPACE_COMA_SPACE = "MMMM dd, yy HH:mm:ss";
    public static final String MMMDYYYY_SPACE_COMA_SPACE = "MMM d, yyyy HH:mm:ss";
    public static final String MMMMDYYYY_SPACE_COMA_SPACE = "MMMM d, yyyy HH:mm:ss";
    public static final String MMMDDYYYY_SPACE_COMA_SPACE = "MMM dd, yyyy HH:mm:ss";
    public static final String MMMMDDYYYY_SPACE_COMA_SPACE = "MMMM dd, yyyy HH:mm:ss";

//    Day Month Year Format
    public static final String DMYY_DOT = "d.M.YY HH:mm:ss";
    public static final String DMMYY_DOT = "d.MM.YY HH:mm:ss";
    public static final String DDMYY_DOT = "dd.M.YY HH:mm:ss";
    public static final String DDMMYY_DOT = "dd.MM.YY HH:mm:ss";
    public static final String DMYYYY_DOT = "d.M.YYYY HH:mm:ss";
    public static final String DMMYYYY_DOT = "d.MM.YYYY HH:mm:ss";
    public static final String DDMYYYY_DOT = "dd.M.YYYY HH:mm:ss";
    public static final String DDMMYYYY_DOT = "dd.MM.YYYY HH:mm:ss";
    public static final String DMYY_HYPHEN = "d-M-YY HH:mm:ss";
    public static final String DMMYY_HYPHEN = "d-MM-YY HH:mm:ss";
    public static final String DDMYY_HYPHEN = "dd-M-YY HH:mm:ss";
    public static final String DDMMYY_HYPHEN = "dd-MM-YY HH:mm:ss";
    public static final String DMYYYY_HYPHEN = "d-M-YYYY HH:mm:ss";
    public static final String DMMYYYY_HYPHEN = "d-MM-YYYY HH:mm:ss";
    public static final String DDMYYYY_HYPHEN = "dd-M-YYYY HH:mm:ss";
    public static final String DDMMYYYY_HYPHEN = "dd-MM-YYYY HH:mm:ss";
    public static final String DMYY_SLASH = "d/M/YY HH:mm:ss";
    public static final String DMMYY_SLASH = "d/MM/YY HH:mm:ss";
    public static final String DDMYY_SLASH = "dd/M/YY HH:mm:ss";
    public static final String DDMMYY_SLASH = "dd/MM/YY HH:mm:ss";
    public static final String DMYYYY_SLASH = "d/M/YYYY HH:mm:ss";
    public static final String DMMYYYY_SLASH = "d/MM/YYYY HH:mm:ss";
    public static final String DDMYYYY_SLASH = "dd/M/YYYY HH:mm:ss";
    public static final String DDMMYYYY_SLASH = "dd/MM/YYYY HH:mm:ss";

//    DMY for full or short month name
    public static final String DMMMYY_SPACE_COMA_SPACE = "d MMM, yy HH:mm:ss";
    public static final String DMMMMYY_SPACE_COMA_SPACE = "d MMMM, yy HH:mm:ss";
    public static final String DDMMMYY_SPACE_COMA_SPACE = "dd MMM, yy HH:mm:ss";
    public static final String DDMMMMYY_SPACE_COMA_SPACE = "dd MMMM, yy HH:mm:ss";
    public static final String DMMMYYYY_SPACE_COMA_SPACE = "d MMM, yyyy HH:mm:ss";
    public static final String DMMMMYYYY_SPACE_COMA_SPACE = "d MMMM, yyyy HH:mm:ss";
    public static final String DDMMMYYYY_SPACE_COMA_SPACE = "dd MMM, yyyy HH:mm:ss";
    public static final String DDMMMMYYYY_SPACE_COMA_SPACE = "dd MMMM, yyyy HH:mm:ss";

    public static final String JAPANESE_DATE_FORMAT = "yy年MM月dd日 HH:mm:ss";
    public static final String JAPANESE_DATE_FORMAT_FROM_FRONTEND = "yyMMdd HH:mm:ss";

    public static final Map<String, DateTimeFormatterBuilder> DATE_TIME_FORMAT_OBJECT = new HashMap<String, DateTimeFormatterBuilder>() {
        {
//public static final String JAPANESE_DATE_FORMAT_FROM_FRONTEND = "yyMMdd HH:mm:ss";
            put(JAPANESE_DATE_FORMAT_FROM_FRONTEND, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendPattern("MM")
                    .appendPattern("dd")
                    .appendLiteral(" ")
                    .appendPattern("HH")
                    .appendLiteral(":")
                    .appendPattern("mm")
                    .appendLiteral(":")
                    .appendPattern("ss"));
            put(YYYYMMDD, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendPattern("MM")
                    .appendPattern("dd")
                    .appendPattern("HH")
                    .appendPattern("mm")
                    .appendPattern("ss"));
            put(DDMMYYYY, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendPattern("MM")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMDDYYYY, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendPattern("dd")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
//            YEAR MONTH DAY FORMATS
            put(YYMD_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral(".")
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("d").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYMMD_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral(".")
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("d").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYMDD_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral(".")
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("dd").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYMMDD_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral(".")
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("dd").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYYYMD_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral(".")
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("d").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYYYMMD_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral(".")
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("d").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYYYMDD_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral(".")
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("dd").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYYYMMDD_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral(".")
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("dd").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYMD_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral("-")
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("d").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYMMD_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral("-")
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("d").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYMDD_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral("-")
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("dd").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYMMDD_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral("-")
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("dd").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYYYMD_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral("-")
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("d").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYYYMMD_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral("-")
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("d").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYYYMDD_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral("-")
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("dd").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYYYMMDD_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral("-")
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("dd").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYMD_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral("/")
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("d").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYMMD_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral("/")
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("d").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYMDD_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral("/")
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("dd").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYMMDD_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral("/")
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("dd").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYYYMD_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral("/")
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("d").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYYYMMD_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral("/")
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("d").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYYYMDD_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral("/")
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("dd").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYYYMMDD_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral("/")
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("dd").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYMMMD_COMA_SPACE_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral(", ")
                    .appendPattern("MMM")
                    .appendLiteral(" ")
                    .appendPattern("d").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYMMMMD_COMA_SPACE_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral(", ")
                    .appendPattern("MMMM")
                    .appendLiteral(" ")
                    .appendPattern("d").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYMMMDD_COMA_SPACE_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral(", ")
                    .appendPattern("MMM")
                    .appendLiteral(" ")
                    .appendPattern("dd").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYMMMMDD_COMA_SPACE_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral(", ")
                    .appendPattern("MMMM")
                    .appendLiteral(" ")
                    .appendPattern("dd").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYYYMMMD_COMA_SPACE_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral(", ")
                    .appendPattern("MMM")
                    .appendLiteral(" ")
                    .appendPattern("d").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYYYMMMMD_COMA_SPACE_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral(", ")
                    .appendPattern("MMMM")
                    .appendLiteral(" ")
                    .appendPattern("d").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYYYMMMDD_COMA_SPACE_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral(", ")
                    .appendPattern("MMM")
                    .appendLiteral(" ")
                    .appendPattern("dd").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(YYYYMMMMDD_COMA_SPACE_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral(", ")
                    .appendPattern("MMMM")
                    .appendLiteral(" ")
                    .appendPattern("dd").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));

//            MONTH DAY YEAR FORMATS
            put(MDYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("d")
                    .appendLiteral(".")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMDYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("d")
                    .appendLiteral(".")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MDDYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("dd")
                    .appendLiteral(".")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMDDYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("dd")
                    .appendLiteral(".")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MDYYYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("d")
                    .appendLiteral(".")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMDYYYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("d")
                    .appendLiteral(".")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MDDYYYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("dd")
                    .appendLiteral(".")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMDDYYYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("dd")
                    .appendLiteral(".")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MDYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("d")
                    .appendLiteral("-")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMDYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("d")
                    .appendLiteral("-")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MDDYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("dd")
                    .appendLiteral("-")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMDDYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("dd")
                    .appendLiteral("-")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MDYYYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("d")
                    .appendLiteral("-")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMDYYYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("d")
                    .appendLiteral("-")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MDDYYYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("dd")
                    .appendLiteral("-")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMDDYYYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("dd")
                    .appendLiteral("-")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MDYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("d")
                    .appendLiteral("/")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMDYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("d")
                    .appendLiteral("/")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MDDYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("dd")
                    .appendLiteral("/")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMDDYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("dd")
                    .appendLiteral("/")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MDYYYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("d")
                    .appendLiteral("/")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMDYYYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("d")
                    .appendLiteral("/")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MDDYYYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("dd")
                    .appendLiteral("/")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMDDYYYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("dd")
                    .appendLiteral("/")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));

            put(MMMDYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MMM")
                    .appendLiteral(" ")
                    .appendPattern("d")
                    .appendLiteral(", ")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMMMDYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MMMM")
                    .appendLiteral(" ")
                    .appendPattern("d")
                    .appendLiteral(", ")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMMDDYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MMM")
                    .appendLiteral(" ")
                    .appendPattern("dd")
                    .appendLiteral(", ")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMMMDDYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MMMM")
                    .appendLiteral(" ")
                    .appendPattern("dd")
                    .appendLiteral(", ")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMMDYYYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MMM")
                    .appendLiteral(" ")
                    .appendPattern("d")
                    .appendLiteral(", ")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMMMDYYYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MMMM")
                    .appendLiteral(" ")
                    .appendPattern("d")
                    .appendLiteral(", ")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMMDDYYYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MMM")
                    .appendLiteral(" ")
                    .appendPattern("dd")
                    .appendLiteral(", ")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(MMMMDDYYYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MMMM")
                    .appendLiteral(" ")
                    .appendPattern("dd")
                    .appendLiteral(", ")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));

//            DAY MONTH YEAR FORMATS
            put(DMYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral(".")
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DMMYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral(".")
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DDMYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral(".")
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DDMMYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral(".")
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DMYYYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral(".")
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DMMYYYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral(".")
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DDMYYYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral(".")
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DDMMYYYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral(".")
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DMYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral("-")
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DMMYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral("-")
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DDMYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral("-")
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DDMMYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral("-")
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DMYYYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral("-")
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DMMYYYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral("-")
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DDMYYYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral("-")
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DDMMYYYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral("-")
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DMYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral("/")
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DMMYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral("/")
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DDMYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral("/")
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DDMMYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral("/")
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DMYYYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral("/")
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DMMYYYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral("/")
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DDMYYYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral("/")
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DDMMYYYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral("/")
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));

            put(DMMMYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral(" ")
                    .appendPattern("MMM")
                    .appendLiteral(", ")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DMMMMYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral(" ")
                    .appendPattern("MMMM")
                    .appendLiteral(", ")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DDMMMYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral(" ")
                    .appendPattern("MMM")
                    .appendLiteral(", ")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DDMMMMYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral(" ")
                    .appendPattern("MMMM")
                    .appendLiteral(", ")
                    .appendPattern("yy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DMMMYYYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral(" ")
                    .appendPattern("MMM")
                    .appendLiteral(", ")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DMMMMYYYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral(" ")
                    .appendPattern("MMMM")
                    .appendLiteral(", ")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DDMMMYYYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral(" ")
                    .appendPattern("MMM")
                    .appendLiteral(", ")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));
            put(DDMMMMYYYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral(" ")
                    .appendPattern("MMMM")
                    .appendLiteral(", ")
                    .appendPattern("yyyy").appendLiteral(" ").appendPattern("HH").appendLiteral(":").appendPattern("mm").appendLiteral(":").appendPattern("ss"));

        }

    };

    public static final DateTimeFormatterBuilder BACK_DATE_TIME_FORMAT_BUILDER = new DateTimeFormatterBuilder()
            .parseStrict()
            .appendPattern("yyyy")
            .appendPattern("MM")
            .appendPattern("dd")
            .appendPattern("HH")
            .appendPattern("mm")
            .appendPattern("ss");

    public static final DateTimeFormatter BACK_DATE_TIME_FORMATTER = BACK_DATE_TIME_FORMAT_BUILDER.toFormatter();

    public static final DateTimeFormatterBuilder JAPANESE_DATE_TIME_FORMAT_BUILDER = new DateTimeFormatterBuilder()
            .parseStrict()
            .appendPattern("yyyy")
            .appendLiteral("年")
            .appendPattern("MM")
            .appendLiteral("月")
            .appendPattern("dd")
            .appendLiteral("日 ")
            .appendPattern("HH")
            .appendLiteral(":")
            .appendPattern("mm")
            .appendLiteral(":")
            .appendPattern("ss");

    public static final DateTimeFormatter JAPANESE_DATE_TIME_FORMATTER = JAPANESE_DATE_TIME_FORMAT_BUILDER.toFormatter();

    public static final Map<String, DateTimeFormatterBuilder> DATE_FORMAT_OBJECT = new HashMap<String, DateTimeFormatterBuilder>() {
        {

//            YEAR MONT DAY FORMATS
            put(YYMD_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral(".")
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("d"));
            put(YYMMD_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral(".")
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("d"));
            put(YYMDD_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral(".")
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("dd"));
            put(YYMMDD_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral(".")
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("dd"));
            put(YYYYMD_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral(".")
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("d"));
            put(YYYYMMD_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral(".")
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("d"));
            put(YYYYMDD_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral(".")
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("dd"));
            put(YYYYMMDD_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral(".")
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("dd"));
            put(YYMD_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral("-")
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("d"));
            put(YYMMD_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral("-")
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("d"));
            put(YYMDD_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral("-")
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("dd"));
            put(YYMMDD_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral("-")
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("dd"));
            put(YYYYMD_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral("-")
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("d"));
            put(YYYYMMD_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral("-")
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("d"));
            put(YYYYMDD_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral("-")
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("dd"));
            put(YYYYMMDD_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral("-")
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("dd"));
            put(YYMD_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral("/")
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("d"));
            put(YYMMD_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral("/")
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("d"));
            put(YYMDD_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral("/")
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("dd"));
            put(YYMMDD_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral("/")
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("dd"));
            put(YYYYMD_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral("/")
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("d"));
            put(YYYYMMD_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral("/")
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("d"));
            put(YYYYMDD_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral("/")
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("dd"));
            put(YYYYMMDD_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral("/")
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("dd"));
            put(YYMMMD_COMA_SPACE_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral(", ")
                    .appendPattern("MMM")
                    .appendLiteral(" ")
                    .appendPattern("d"));
            put(YYMMMMD_COMA_SPACE_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral(", ")
                    .appendPattern("MMMM")
                    .appendLiteral(" ")
                    .appendPattern("d"));
            put(YYMMMDD_COMA_SPACE_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral(", ")
                    .appendPattern("MMM")
                    .appendLiteral(" ")
                    .appendPattern("dd"));
            put(YYMMMMDD_COMA_SPACE_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yy")
                    .appendLiteral(", ")
                    .appendPattern("MMMM")
                    .appendLiteral(" ")
                    .appendPattern("dd"));
            put(YYYYMMMD_COMA_SPACE_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral(", ")
                    .appendPattern("MMM")
                    .appendLiteral(" ")
                    .appendPattern("d"));
            put(YYYYMMMMD_COMA_SPACE_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral(", ")
                    .appendPattern("MMMM")
                    .appendLiteral(" ")
                    .appendPattern("d"));
            put(YYYYMMMDD_COMA_SPACE_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral(", ")
                    .appendPattern("MMM")
                    .appendLiteral(" ")
                    .appendPattern("dd"));
            put(YYYYMMMMDD_COMA_SPACE_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("yyyy")
                    .appendLiteral(", ")
                    .appendPattern("MMMM")
                    .appendLiteral(" ")
                    .appendPattern("dd"));

//            MONTH DAY YEAR FORMATS
            put(MDYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("d")
                    .appendLiteral(".")
                    .appendPattern("yy"));
            put(MMDYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("d")
                    .appendLiteral(".")
                    .appendPattern("yy"));
            put(MDDYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("dd")
                    .appendLiteral(".")
                    .appendPattern("yy"));
            put(MMDDYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("dd")
                    .appendLiteral(".")
                    .appendPattern("yy"));
            put(MDYYYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("d")
                    .appendLiteral(".")
                    .appendPattern("yyyy"));
            put(MMDYYYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("d")
                    .appendLiteral(".")
                    .appendPattern("yyyy"));
            put(MDDYYYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("dd")
                    .appendLiteral(".")
                    .appendPattern("yyyy"));
            put(MMDDYYYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("dd")
                    .appendLiteral(".")
                    .appendPattern("yyyy"));
            put(MDYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("d")
                    .appendLiteral("-")
                    .appendPattern("yy"));
            put(MMDYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("d")
                    .appendLiteral("-")
                    .appendPattern("yy"));
            put(MDDYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("dd")
                    .appendLiteral("-")
                    .appendPattern("yy"));
            put(MMDDYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("dd")
                    .appendLiteral("-")
                    .appendPattern("yy"));
            put(MDYYYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("d")
                    .appendLiteral("-")
                    .appendPattern("yyyy"));
            put(MMDYYYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("d")
                    .appendLiteral("-")
                    .appendPattern("yyyy"));
            put(MDDYYYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("dd")
                    .appendLiteral("-")
                    .appendPattern("yyyy"));
            put(MMDDYYYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("dd")
                    .appendLiteral("-")
                    .appendPattern("yyyy"));
            put(MDYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("d")
                    .appendLiteral("/")
                    .appendPattern("yy"));
            put(MMDYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("d")
                    .appendLiteral("/")
                    .appendPattern("yy"));
            put(MDDYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("dd")
                    .appendLiteral("/")
                    .appendPattern("yy"));
            put(MMDDYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("dd")
                    .appendLiteral("/")
                    .appendPattern("yy"));
            put(MDYYYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("d")
                    .appendLiteral("/")
                    .appendPattern("yyyy"));
            put(MMDYYYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("d")
                    .appendLiteral("/")
                    .appendPattern("yyyy"));
            put(MDDYYYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("dd")
                    .appendLiteral("/")
                    .appendPattern("yyyy"));
            put(MMDDYYYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("dd")
                    .appendLiteral("/")
                    .appendPattern("yyyy"));

            put(MMMDYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MMM")
                    .appendLiteral(" ")
                    .appendPattern("d")
                    .appendLiteral(", ")
                    .appendPattern("yy"));
            put(MMMMDYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MMMM")
                    .appendLiteral(" ")
                    .appendPattern("d")
                    .appendLiteral(", ")
                    .appendPattern("yy"));
            put(MMMDDYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MMM")
                    .appendLiteral(" ")
                    .appendPattern("dd")
                    .appendLiteral(", ")
                    .appendPattern("yy"));
            put(MMMMDDYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MMMM")
                    .appendLiteral(" ")
                    .appendPattern("dd")
                    .appendLiteral(", ")
                    .appendPattern("yy"));
            put(MMMDYYYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MMM")
                    .appendLiteral(" ")
                    .appendPattern("d")
                    .appendLiteral(", ")
                    .appendPattern("yyyy"));
            put(MMMMDYYYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MMMM")
                    .appendLiteral(" ")
                    .appendPattern("d")
                    .appendLiteral(", ")
                    .appendPattern("yyyy"));
            put(MMMDDYYYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MMM")
                    .appendLiteral(" ")
                    .appendPattern("dd")
                    .appendLiteral(", ")
                    .appendPattern("yyyy"));
            put(MMMMDDYYYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("MMMM")
                    .appendLiteral(" ")
                    .appendPattern("dd")
                    .appendLiteral(", ")
                    .appendPattern("yyyy"));

//            DAY MONTH YEAR FORMATS
            put(DMYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral(".")
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("yy"));
            put(DMMYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral(".")
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("yy"));
            put(DDMYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral(".")
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("yy"));
            put(DDMMYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral(".")
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("yy"));
            put(DMYYYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral(".")
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("yyyy"));
            put(DMMYYYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral(".")
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("yyyy"));
            put(DDMYYYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral(".")
                    .appendPattern("M")
                    .appendLiteral(".")
                    .appendPattern("yyyy"));
            put(DDMMYYYY_DOT, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral(".")
                    .appendPattern("MM")
                    .appendLiteral(".")
                    .appendPattern("yyyy"));
            put(DMYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral("-")
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("yy"));
            put(DMMYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral("-")
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("yy"));
            put(DDMYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral("-")
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("yy"));
            put(DDMMYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral("-")
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("yy"));
            put(DMYYYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral("-")
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("yyyy"));
            put(DMMYYYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral("-")
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("yyyy"));
            put(DDMYYYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral("-")
                    .appendPattern("M")
                    .appendLiteral("-")
                    .appendPattern("yyyy"));
            put(DDMMYYYY_HYPHEN, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral("-")
                    .appendPattern("MM")
                    .appendLiteral("-")
                    .appendPattern("yyyy")
                    .appendLiteral("T")
                    .appendPattern("HH")
                    .appendPattern(":")
                    .appendPattern("mm")
                    .appendPattern(":")
                    .appendPattern("ss"));
            put(DMYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral("/")
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("yy"));
            put(DMMYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral("/")
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("yy"));
            put(DDMYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral("/")
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("yy"));
            put(DDMMYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral("/")
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("yy"));
            put(DMYYYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral("/")
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("yyyy"));
            put(DMMYYYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral("/")
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("yyyy"));
            put(DDMYYYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral("/")
                    .appendPattern("M")
                    .appendLiteral("/")
                    .appendPattern("yyyy"));
            put(DDMMYYYY_SLASH, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral("/")
                    .appendPattern("MM")
                    .appendLiteral("/")
                    .appendPattern("yyyy"));

            put(DMMMYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral(" ")
                    .appendPattern("MMM")
                    .appendLiteral(", ")
                    .appendPattern("yy"));
            put(DMMMMYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral(" ")
                    .appendPattern("MMMM")
                    .appendLiteral(", ")
                    .appendPattern("yy"));
            put(DDMMMYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral(" ")
                    .appendPattern("MMM")
                    .appendLiteral(", ")
                    .appendPattern("yy"));
            put(DDMMMMYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral(" ")
                    .appendPattern("MMMM")
                    .appendLiteral(", ")
                    .appendPattern("yy"));
            put(DMMMYYYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral(" ")
                    .appendPattern("MMM")
                    .appendLiteral(", ")
                    .appendPattern("yyyy"));
            put(DMMMMYYYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("d")
                    .appendLiteral(" ")
                    .appendPattern("MMMM")
                    .appendLiteral(", ")
                    .appendPattern("yyyy"));
            put(DDMMMYYYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral(" ")
                    .appendPattern("MMM")
                    .appendLiteral(", ")
                    .appendPattern("yyyy"));
            put(DDMMMMYYYY_SPACE_COMA_SPACE, new DateTimeFormatterBuilder()
                    .parseStrict()
                    .appendPattern("dd")
                    .appendLiteral(" ")
                    .appendPattern("MMMM")
                    .appendLiteral(", ")
                    .appendPattern("yyyy"));

        }

    };

}
