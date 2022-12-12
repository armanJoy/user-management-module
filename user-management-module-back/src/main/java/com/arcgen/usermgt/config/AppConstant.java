package com.arcgen.usermgt.config;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.HashMap;
import java.util.Map;

public class AppConstant {

    public static final String NOT_APPLICABLE_STRING = "N/A";

    public static final String BANK_PAYMENT_MODE = "B";
    public static final String CASH_PAYMENT_MODE = "C";

    public static final String WEIGHT_CERTIFICATE_UI_COMPONENT_CODE = "UNLOAD_WEIGHT_DECLARE";
    public static final String WEIGHT_CERTIFICATE_DESIGN_FILE = "weight_certificate_report _2022-07-25.rptdesign";
    public static final String WEIGHT_CERTIFICATE_OUTPUT_NAME = "weight_certificate_report";
    public static final String WEIGHT_CERTIFICATE_FORMAT_PDF = "pdf";

    public static final String MANIFESTO_UI_COMPONENT_CODE = "menifestoList";
    public static final String MANIFESTO_REPORT_FILE_NAME = "final_manifesto_report_2022-07-25.rptdesign";
    public static final String MANIFESTO_REPORT_TYPE = "final_manifesto_report.pdf";
    public static final String REPORT_FILE_FORMAT_PDF = "pdf";

    public static final String TRANSPORTER_INVOICE = "tranporter-invoice";
    public static final String PROCESSOR_INVOICE = "processor-invoice";

    public static final String LIST_ITEM_SEPERATOR = "|";

    public static final String MULTIPLE_OVERLAPPED_TRIP_FLAG = "00000";
    public static final String TRIP_PREFIX = "Trip of - ";
    public static final String PICK_PREFIX = "Pick of - ";

    public static final String NOT_RESTORED = "0";
    public static final String RESTORED = "1";

    public static final String RESTORED_METHOD_SIGNATURE = "restore";

    public static final String VEHICLE_FROWARD_LINK_LABEL_KEY = "vehicleForwardLinkLabel";
    public static final String WEIGHT_CERTIFICATE_FORWARD_LINK_LABEL_KEY = "weightCertificateForwardLinkLable";
    public static final String TRIP_FROWARD_LINK_LABEL_KEY = "tripForwardLinkLabel";
    public static final String SCALE_FROWARD_LINK_LABEL_KEY = "scaleForwardLinkLabel";
    public static final String AGREEMENT_PERSON_IN_CHARGE_FROWARD_LINK_LABEL_KEY = "agreementPersonForwardLinkLabel";
    public static final String AGREEMENT_PAYMENT_METHOD_BANK_AC_FROWARD_LINK_LABEL_KEY = "agreementPaymentMethodForwardLinkLabel";

    public static final String WASTE_ITEM_REMOVE_OPERATION = "waste-item-remove-op";

    public static final String WASTE_CATEGORY_TABLE = "waste-category";
    public static final String WASTE_TYPE_TABLE = "waste-type";
    public static final String WASTE_DEF_TABLE = "waste-def";
    public static final String COMPANY_WASTE_DEF_TABLE = "company-waste-def";
    public static final String BASE_PRICE_TABLE = "base-price";
    public static final String COMPANY_WASTE_METHOD_TABLE = "company-waste-method";
    public static final String BRANCH_INFO_TABLE = "branch-info";
    public static final String BANK_ACCOUNT_INFO_TABLE = "bank-account";
    public static final String SCALE_INFO_TABLE = "scale-info";
    public static final String VEHICLE_INFO_TABLE = "vehicle-info";
    public static final String FAQ_TYPE_TABLE = "faq-type";
    public static final String FAQ_INFO_TABLE = "faq-info";
    public static final String AGREEMENT_INFO_TABLE = "agreement-info";
    public static final String PROJECT_INFO_TABLE = "project-info";

    public static final String USER_INFO_TABLE = "user-info";
    public static final String PREVILAGED_USER_TABLE = "previlaged-user";
    public static final String USER_ROLE_DEF_TABLE = "user-role-def";

    public static final String VEHICLE_TYPE_TABLE = "vehicle-type";
    public static final String GASOLINE_TYPE_TABLE = "gasoline-type";
    public static final String COMPANY_SUBSCRIPTION_TABLE = "company-subscription";

    public static final String PICK_INFO_TABLE = "pick-info";
    public static final String TRIP_INFO_TABLE = "trip-info";

    public static final String DATA_ACTIVE_VALUE = "1";
    public static final String DATA_INACTIVE_VALUE = "0";
    public static final String[] INVOICE_MANIFESTO_STATUS = new String[]{AppConstant.MENIFESTO_PROCESSING_COMPLETE_STATUS};

    public static final double DUMPING_DEFAULT_VALUE = 0.0;

    public static final String BASE64_STRING_PREFIX = "data:image/";
    public static final String COMPANY_SEAL_FILE_NAME_SUFFIX = "-company-seal.";
    public static final String USER_SEAL_FILE_NAME_SUFFIX = "-user-seal.";
    public static final String SEAL_FILE_SAVE_LOCATION = "/home/joy/Downloads/";

    public static final String INVOICE_SUBJECT = "Monthly Invoice";

    public static final String MANIFESTO_TYPE_GENERATED = "menifestoType0001";
    public static final String MANIFESTO_TYPE_MANUAL = "menifestoType0002";

    public static final String DISPOSE_WISE_SCHEDULE_CONFIRM_NOT_DONE = "0";
    public static final String DISPOSE_WISE_SCHEDULE_CONFIRM_DONE = "1";

    public static final String ALL_AGREEMENT_GET_STATUS = "statusNewAgreement|statusAgreementInUse|statusAgreementCanceled|statusReviveReadyForSend|statusReviveReadyForApprove";
    public static final String INVOICE_COMPONENT_CODE = "invoiceMenu";

    public static final String[] INVOICE_LABEL_KEYS = {"invoiceLabel", "generatorComNameLabel", "addressLabel", "invoiceNoLabel", "subjectLabel", "billamountLabel", "paymentDateLabel", "includedtaxLabel", "accountnoLabel", "bankLabel", "branchNameLabel", "contactNoLabel", "emailLabel", "personLabel", "headingLabel", "remarksLabel", "subTotal", "taxLabel", "totalLabel", "serialNumberLabel", "dateLabel", "wasteItemLabel", "quanitityLabel", "tableUnitLabel", "unitPricelabel", "amountlabel", "issuerCopyLabel", "receiverCopyLabel"};

    public static final String COMPANY_CATEGORY_FILTER_QUERY_KEY = "dumpertransporterprocessor";
    public static final String ANSWERED = "1";
    public static final String UN_ANSWERED = "0";

    public static final Integer DXR_LIST_VIEW_PAGE_SIZE = 10;
    public static final String DESTINATION_PREFIX = "/topic/";

    public static final String DESTINATION_POSTFIX = "/greetings";

    public static final String STATUS_LOAD_ID = "1";

    public static final String STATUS_UNLOAD_ID = "2";

    public static final String STATUS_NEW_ID = "statusNewInvoice";

    public static final String STATUS_ACCEPT_ID = "statusWaitingForAccept";

    public static final String STATUS_SEND_ID = "statusPaymentClear";

    public static final String ROLE_TYPE_DRIVER = "driver";

    public static final String ROLE_TYPE_PROJECT_PERSON_INCHARGE = "projectPersonIncharge";

    public static final String ROLE_TYPE_AGREEMENT_PERSON_INCHARGE = "agreementPersonIncharge";

    public static final String ROLE_TYPE_DXR_ADMIN = "dxradmin";

    public static final String ROLE_COMPANY_ADMIN_ID = "roledef0001";

    public static final String ROLE_PERSON_IN_CHARGE_DUMPER = "roledef0002";

    public static final String ROLE_PERSON_IN_CHARGE_TRANSPORTER = "roledef0003";

    public static final String ROLE_PERSON_IN_CHARGE_PROCESSOR = "roledef0004";

    public static final String ROLE_DRIVER = "roledef0005";

    public static final String ROLE_RECEPTION_MANAGER_PROCESSOR = "roledef0006";

    public static final String ROLE_COMPANY_ACCOUNTANT = "roledef0007";

    public static final String ROLE_RECEIVING_MANAGER_PROCESSOR = "roledef0008";

    public static final String ROLE_TEMPORARY_USER = "roledef0009";

    public static final String ROLE_REFERENCE_USER = "roledef0010";

    public static final String NOTIFICATION_PROCESS_DEF_ID = "context0001";

    public static final String SUBSCRIPTION_NOTIFICAIONT_ID = "notificationType001";

    public static final String INQUIRY_NOTIFICAIONT_ID = "notificationType002";

    public static final String WASTE_REQUEST_NOTIFICAIONT_ID = "notificationType003";

    public static final String AGREEMENT_NOTIFICAIONT_ID = "notificationType004";

    public static final String PROJECT_NOTIFICAIONT_ID = "notificationType005";

    public static final String PROJECT_SCHEDULE_NOTIFICAIONT_ID = "notificationType006";

    public static final String INVOICE_NOTIFICAIONT_ID = "notificationType007";

    public static final String MANIFESTO_NOTIFICAIONT_ID = "notificationType008";

    public static final long USER_LOGIN_SESSION_CLEAR_STEP = 3;

    public static final String PRODUCTION_ENVIRONMENT = "production";

    public static final String SUBSCRIPTION_PROCESS_DEF_ID = "subscriptionProcessdef0001";

    public static final String NA_SUBSCRIPTION_ID = "subscriptionInfoNA";

    public static final String SUBSCRIPTION_SUSPENSION_STATUS = "statusSuspended";

    public static final String SUBSCRIPTION_REJECTION_STATUS = "statusRejected";

    public static final String SUBSCRIPTION_ACCEPT_STATUS = "statusInUse";

    public static final String SUBSCRIPTION_TEMPORARY_USE_STATUS = "statusTemporaryUse";

    public static final String SUBSCRIPTION_NEW_COMPANY_STATUS = "statusInUse|statusTemporaryUse";

    public static final String SUBSCRIPTION_INITIAL_STATUS = "statusWaitingForConfirmation";

    public static final String ALLOW_ORIGINS = "https://dxrreleases.com|https://dxr-mob-app.web.app|http://localhost:4200";
    public static final String ALLOW_ORIGIN_HEADER = "Access-Control-Allow-Origin";
    public static final String SUBSCRIPTION_INVITE_MAIL_SUBJECT = "Subscribe your company to DXR system";

    public static final String SUBSCRIPTION_INVITE_MAIL_BODY = "Dear customers, Please subscribe your company to DXR system by following this link address. ";

    public static final String SUBSCRIPTION_INVITE_LINK = "https://www.dxrreleases.com/visitor/subscription";

    public static final String INVOICE_PROCESS_DEF_ID = "invoiceprocessdef0001";

    public static final String MENIFESTO_LOADED_STATUS = "1";
    public static final String MENIFESTO_UNLOADED_STATUS = "2";
    public static final String MENIFESTO_DELIVERED_STATUS = "2";
    public static final String MENIFESTO_PROCESSING_COMPLETE_STATUS = "3";

    public static final String INVOICE_NO_REMARK = "No Remark";
    public static final String INVOICE_REPORT_DESIGN_FILE = "invoice_template _2022-12-06.rptdesign";
    public static final String REPORT_FORMAT_PDF = "pdf";
    public static final String INVOICE_STATUS_NEW = "statusNewInvoice";

    public static final String PICK_UNLOADED = "2";
    public static final String PICK_LOADED = "1";
    public static final String PICK_NOT_LOADED = "0";
    public static final String DUMPING_OPERATION_TYPE_ID = "emimissionTypeId001";

    public static final String PROCESSING_OPERATION_TYPE_ID = "emimissionTypeId002";

    public static final String STATUS_WAITING_FOR_APROVAL = "statusWaitingForAproval";

    public static final String PROJECT_STATUSES_FOR_TRANSPORT_SCHEDULE = "statusWaitingForAproval|statusApproved|statusProjectInUse|";

    public static final String[] PROJECT_STATUS_FOR_TRANSPORT_SCHEDULE_ARRAY = {"statusWaitingForAproval", "statusApproved", "statusProjectInUse"};

    public static final String PROJECT_STATUS_NEW = "statusNewProject";

    public static final String PROJECT_PROCESS_DEF_ID = "projectProcessdef0001";

    public static final String INQUIRY_THREAD_MAIL_SUBJECT = "Submission successful message and code.";

    public static final String INQUIRY_THREAD_MAIL_BODY_FIRST = "Your inquiry is submitted successfully. Input your submission code ";

    public static final String INQUIRY_THREAD_MAIL_BODY_LAST_PART = " to enter in discussion thread";

    public static final String DRIVER_ROLE_DEF_ID = "roledef0005";

    public static final String TRUE_VALUE = "1";

    public static final String FALSE_VALUE = "0";

    public static final String AGREEMENT_STATUS_IN_USE = "statusAgreementInUse";

    public static final String AGREEMENT_STATUS_NEW_VERSION_IN_USE = "statusNewVersionInOperation";

    public static final Map<String, String> COMPANY_CATEGORY_ID_VALUE_MAP = new HashMap<String, String>() {
        {
            put(DUMPER_CATEGORY_VALUE, DUMPER_CATEGORY);
            put(TRANSPOTER_CATEGORY_VALUE, TRANSPOTER_CATAGORY);
            put(PROCESSOR_CATEGORY_VALUE, PROCESSOR_CATEGORY);
        }

    };

    public static final Map<String, String> COMPANY_CATEGORY_VALUE_AND_ID_MAP = new HashMap<String, String>() {
        {
            put(DUMPER_CATEGORY, DUMPER_CATEGORY_VALUE);
            put(TRANSPOTER_CATAGORY, TRANSPOTER_CATEGORY_VALUE);
            put(PROCESSOR_CATEGORY, PROCESSOR_CATEGORY_VALUE);
        }

    };

    public static final String AGREEMENT_STATUS_NEW = "statusNewAgreement";

    public static final String USE_SAVED_BANK_ACCOUNT = "savedAccount";
    public static final String USE_OTHER_BANK_ACCOUNT = "otherAccount";
    public static final String AGREEMENT_CREATE_PROCESS_ID = "creationProcess";
    public static final String AGREEMENT_CREATE_PROCESS_ACTION_ID = "saveActionId";

    public static final String AGREEMENT_PROCESS_DEF_ID = "agreementprocessdef0001";

    public static final String DXR_ADMIN_ROLE = "dxradmin";

    public static final String COMPANY_ADMIN_ROLE = "companyadmin";

    public static final String DEFAULT_COMPANY_ID = "dxr00001";

    public final static String MENU_TYPE_PRIMARY = "menutype0001";

    public final static String MENU_TYPE_SECONDARY = "menutype0002";

    public final static String MENU_TYPE_NAME_PRIMARY = "Primary Menu";

    public final static String MENU_TYPE_NAME_SECONDARY = "Secondary Menu";

    public final static String ROLE_DEF_UPDATE_FLAG_ID = "roledefupdateflag0001";

    public static final String USER_CATEGORY_DXR_ADMIN = "usercategory0001";
    public static final String USER_CATEGORY_COMPANY_ADMIN = "usercategory0002";
    public static final String USER_CATEGORY_COMPANY_USER = "usercategory0003";

    public static final String COMPANY_ADMIN_DEFAULT_PASS = "com1234";

    public static final String SYS_ADMIN_ACCESS_ID = "sysadminaccess0001";
    public static final String DXR_ADMIN_ACCESS_ID = "dxradminaccess0001";
    public static final String COMPANY_ADMIN_ACCESS_ID = "companyadminaccess0001";

    public static final String NOTIFICATION_STATUS_PK_NO = "notification0001";
    public static final String NOTIFICATION_STATUS_PK_YES = "notification0002";
    public static final String NOTIFICATION_STATUS_YES = "Yes";
    public static final String NOTIFICATION_STATUS_YES_VALUE = "1";
    public static final String NOTIFICATION_STATUS_NO = "No";
    public static final String NOTIFICATION_STATUS_NO_VALUE = "0";

    public final static String ONE_TIME_ACCESS_FLAG_TRUE = "1";
    public final static String ONE_TIME_ACCESS_FLAG_FALSE = "0";

    public static final String USER_ACCESS_MAIL_SUBJECT = "DXR Application Access";

    public static final String DXR_SYS_ADMIN_ACCESS_INFO = "[\n"
            + "    {\n"
            + "        \"companyId\": \"dxr00001\",\n"
            + "        \"userMenuDef\": [\n"
            + "            {\n"
            + "                \"menuId\": \"dxrSuperAdmin\",\n"
            + "                \"menuTitleEng\": \"System Admin Op\",\n"
            + "                \"menuTitleJpn\": \"System Admin Op\",\n"
            + "                \"menuUrl\": \"/super-admin\",\n"
            + "                \"parentSegment\": \"\",\n"
            + "                \"menuParent\": \"\",\n"
            + "                \"menuTypeId\": \"menutype0001\",\n"
            + "                \"companyCategoryId\": \"\",\n"
            + "                \"accessInfo\": {\n"
            + "                    \"accessDefId\": \"accessdefid0003\",\n"
            + "                    \"accessTitle\": \"View, Browse, Edit\"\n"
            + "                },\n"
            + "                \"child\": [\n"
            + "                    {\n"
            + "                        \"menuId\": \"createDxrAdmin\",\n"
            + "                        \"menuTitleEng\": \"Create DXR Admin\",\n"
            + "                        \"menuTitleJpn\": \"Create DXR Admin\",\n"
            + "                        \"menuUrl\": \"super-admin/create-dxr-admin\",\n"
            + "                        \"parentSegment\": \"\",\n"
            + "                        \"menuParent\": \"dxrSuperAdmin|\",\n"
            + "                        \"menuTypeId\": \"menutype0001\",\n"
            + "                        \"companyCategoryId\": \"\",\n"
            + "                        \"accessInfo\": {\n"
            + "                            \"accessDefId\": \"accessdefid0003\",\n"
            + "                            \"accessTitle\": \"View, Browse, Edit\"\n"
            + "                        },\n"
            + "                        \"child\": []\n"
            + "                    },\n"
            + "                    {\n"
            + "                        \"menuId\": \"setDxrAdminAccess\",\n"
            + "                        \"menuTitleEng\": \"Set DXR Admin Access\",\n"
            + "                        \"menuTitleJpn\": \"Set DXR Admin Access\",\n"
            + "                        \"menuUrl\": \"super-admin/set-dxr-admin-access\",\n"
            + "                        \"parentSegment\": \"\",\n"
            + "                        \"menuParent\": \"dxrSuperAdmin|\",\n"
            + "                        \"menuTypeId\": \"menutype0001\",\n"
            + "                        \"companyCategoryId\": \"\",\n"
            + "                        \"accessInfo\": {\n"
            + "                            \"accessDefId\": \"accessdefid0003\",\n"
            + "                            \"accessTitle\": \"View, Browse, Edit\"\n"
            + "                        },\n"
            + "                        \"child\": []\n"
            + "                    },\n"
            + "                    {\n"
            + "                        \"menuId\": \"setCompanyAdminAccess\",\n"
            + "                        \"menuTitleEng\": \"Set Company Admin Access\",\n"
            + "                        \"menuTitleJpn\": \"Set Company Admin Access\",\n"
            + "                        \"menuUrl\": \"super-admin/set-company-admin-access\",\n"
            + "                        \"parentSegment\": \"\",\n"
            + "                        \"menuParent\": \"dxrSuperAdmin|\",\n"
            + "                        \"menuTypeId\": \"menutype0001\",\n"
            + "                        \"companyCategoryId\": \"\",\n"
            + "                        \"accessInfo\": {\n"
            + "                            \"accessDefId\": \"accessdefid0003\",\n"
            + "                            \"accessTitle\": \"View, Browse, Edit\"\n"
            + "                        },\n"
            + "                        \"child\": []\n"
            + "                    },\n"
            + "                    {\n"
            + "                        \"menuId\": \"languageSetup\",\n"
            + "                        \"menuTitleEng\": \"Language Setup\",\n"
            + "                        \"menuTitleJpn\": \"Language Setup\",\n"
            + "                        \"menuUrl\": \"super-admin/component-list\",\n"
            + "                        \"parentSegment\": \"\",\n"
            + "                        \"menuParent\": \"dxrSuperAdmin|\",\n"
            + "                        \"menuTypeId\": \"menutype0001\",\n"
            + "                        \"companyCategoryId\": \"\",\n"
            + "                        \"accessInfo\": {\n"
            + "                            \"accessDefId\": \"accessdefid0003\",\n"
            + "                            \"accessTitle\": \"View, Browse, Edit\"\n"
            + "                        },\n"
            + "                        \"child\": []\n"
            + "                    },\n"
            + "                    {\n"
            + "                        \"menuId\": \"agreementProcessDef\",\n"
            + "                        \"menuTitleEng\": \"Set Agreement Process Def\",\n"
            + "                        \"menuTitleJpn\": \"Set Agreement Process Def\",\n"
            + "                        \"menuUrl\": \"super-admin/set-agreement-process-def\",\n"
            + "                        \"parentSegment\": \"\",\n"
            + "                        \"menuParent\": \"dxrSuperAdmin|\",\n"
            + "                        \"menuTypeId\": \"menutype0001\",\n"
            + "                        \"companyCategoryId\": \"\",\n"
            + "                        \"accessInfo\": {\n"
            + "                            \"accessDefId\": \"accessdefid0003\",\n"
            + "                            \"accessTitle\": \"View, Browse, Edit\"\n"
            + "                        },\n"
            + "                        \"child\": []\n"
            + "                    },\n"
            + "                    {\n"
            + "                        \"menuId\": \"projectProcessDef\",\n"
            + "                        \"menuTitleEng\": \"Set Project Process Def\",\n"
            + "                        \"menuTitleJpn\": \"Set Project Process Def\",\n"
            + "                        \"menuUrl\": \"super-admin/set-project-process-def\",\n"
            + "                        \"parentSegment\": \"\",\n"
            + "                        \"menuParent\": \"dxrSuperAdmin|\",\n"
            + "                        \"menuTypeId\": \"menutype0001\",\n"
            + "                        \"companyCategoryId\": \"\",\n"
            + "                        \"accessInfo\": {\n"
            + "                            \"accessDefId\": \"accessdefid0003\",\n"
            + "                            \"accessTitle\": \"View, Browse, Edit\"\n"
            + "                        },\n"
            + "                        \"child\": []\n"
            + "                    },\n"
            + "                    {\n"
            + "                        \"menuId\": \"invoiceProcessDef\",\n"
            + "                        \"menuTitleEng\": \"Set Invoice Process Def\",\n"
            + "                        \"menuTitleJpn\": \"Set Invoice Process Def\",\n"
            + "                        \"menuUrl\": \"super-admin/set-invoice-process-def\",\n"
            + "                        \"parentSegment\": \"\",\n"
            + "                        \"menuParent\": \"dxrSuperAdmin|\",\n"
            + "                        \"menuTypeId\": \"menutype0001\",\n"
            + "                        \"companyCategoryId\": \"\",\n"
            + "                        \"accessInfo\": {\n"
            + "                            \"accessDefId\": \"accessdefid0003\",\n"
            + "                            \"accessTitle\": \"View, Browse, Edit\"\n"
            + "                        },\n"
            + "                        \"child\": []\n"
            + "                    },\n"
            + "                    {\n"
            + "                        \"menuId\": \"subscriptionProcessDef\",\n"
            + "                        \"menuTitleEng\": \"Set Subscription Process Def\",\n"
            + "                        \"menuTitleJpn\": \"Set Subscription Process Def\",\n"
            + "                        \"menuUrl\": \"super-admin/set-subscription-process-def\",\n"
            + "                        \"parentSegment\": \"\",\n"
            + "                        \"menuParent\": \"dxrSuperAdmin|\",\n"
            + "                        \"menuTypeId\": \"menutype0001\",\n"
            + "                        \"companyCategoryId\": \"\",\n"
            + "                        \"accessInfo\": {\n"
            + "                            \"accessDefId\": \"accessdefid0003\",\n"
            + "                            \"accessTitle\": \"View, Browse, Edit\"\n"
            + "                        },\n"
            + "                        \"child\": []\n"
            + "                    },\n"
            + "                    {\n"
            + "                        \"menuId\": \"notificationProcessDef\",\n"
            + "                        \"menuTitleEng\": \"Set notification Process Def\",\n"
            + "                        \"menuTitleJpn\": \"Set notification Process Def\",\n"
            + "                        \"menuUrl\": \"super-admin/set-notification-process-def\",\n"
            + "                        \"parentSegment\": \"\",\n"
            + "                        \"menuParent\": \"dxrSuperAdmin|\",\n"
            + "                        \"menuTypeId\": \"menutype0001\",\n"
            + "                        \"companyCategoryId\": \"\",\n"
            + "                        \"accessInfo\": {\n"
            + "                            \"accessDefId\": \"accessdefid0003\",\n"
            + "                            \"accessTitle\": \"View, Browse, Edit\"\n"
            + "                        },\n"
            + "                        \"child\": []\n"
            + "                    }\n"
            + "                ]\n"
            + "            }\n"
            + "        ]\n"
            + "    }\n"
            + "]";

    public static final String DXR_ADMIN_MENU_ACCESS_INFO = "[\n"
            + "    {\n"
            + "        \"companyId\": \"dxr00001\",\n"
            + "        \"menuAccessInfo\": [\n"
            + "            {\n"
            + "                \"menuId\": \"systemAdmin\",\n"
            + "                \"menuTitleEng\": \"DXR Admin\",\n"
            + "                \"menuTitleJpn\": \"DXR 管理者\",\n"
            + "                \"menuUrl\": \"/system-admin\"\n"
            + "            }\n"
            + "        ]\n"
            + "    }\n"
            + "]";

    public static final String DXR_ADMIN_ACCES_STRING = "[\n"
            + "    {\n"
            + "        \"companyId\": \"dxr00001\",\n"
            + "        \"userMenuDef\": [\n"
            + "            {\n"
            + "                \"menuId\": \"systemAdmin\",\n"
            + "                \"menuTitleEng\": \"DXR Admin\",\n"
            + "                \"menuTitleJpn\": \"DXR 管理者\",\n"
            + "                \"menuUrl\": \"/system-admin\",\n"
            + "                \"parentSegment\": \"\",\n"
            + "                \"menuParent\": \"\",\n"
            + "                \"menuTypeId\": \"\",\n"
            + "                \"companyCategoryId\": \"\",\n"
            + "                \"accessInfo\": {\n"
            + "                    \"accessDefId\": \"accessdefid0003\",\n"
            + "                    \"accessTitle\": \"View, Browse, Edit\"\n"
            + "                },\n"
            + "                \"child\": []\n"
            + "            }\n"
            + "        ]\n"
            + "    }\n"
            + "]";

    public static final String DXR_SYS_ADMIN_USER_ID_ENCRYPTED = "Vn0JY0uvPKJLGtk3alHmHHPfZlR+fNUZ1GNFrWvvbXvfevG+VmQm+fzx2z3WLA1UyphqAwNekrZLDICMZUx284YmPoHtlMU/EKmxMwMiNbyJMP20C7NfvXCRAc+aRl6wN6cRvkbcbuZqFBY31/1KUfEoiSQDIScbrwqDwGhJgU7mdwNjolXKY9wfalIHi9Yrr3Vj7pLWR0wEYx1TYgqzplBagX251v4B2lFStJc/xHh8qmpTZe+ZAyLNlOF8sNWZzAVlkOR1h85rA2mbn38CQtRgVgoBvFYwu17Fw2DXix5hJSqyq/fLiMOME9mLgVspNE5wHWFlDvFudDpsr8KHpQ==";

    public static final String DXR_SYS_ADMIN_USER_AUTH_ENCRYPTED = "hB6wVAXEBsgFJOhQWS7coeljM/4JA0Z3UyuOaujXUfMpSzRsFa7PwahRm5g5WvO2cuhHuLPRKq0Szflysd+ZKEEoa/fj8gtOFLSlZ3JwCeZnU9syEhfChoj9Gr5eh8t3D7zYWeXRWoH/u+vg8r3P8kUzMc1JvQ69fPCSQ9VLaRYsgpPH6MRBWsurt3J/pDTr4wc0rmwAk4zMONucg1xfux4nRH1Xk6hoEugbBlhhGSMm1SRvuQmDb8ZTqm6CBRVdl3feWOf0DNoGmA7E8SpRbYiLoxZl5ud9LtQtpz5we9FW6c9lRtmHuvtu+mOlqE6oV3msS4r0AxMwhi/fP+jLTQ==";
    public static final String ORG_ID = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqWV9jSRh/Rm9MYMdnCfneNWIS8qB04vGtXlWqbEzvnlJkeTd908Nz/u0ZAAqWusLnrfO5ndp32QmyrbnM9TPrw2Dn+BeeXWVb2v2VM7hEJ35H+UMEJvTZNuE/udg9pIsc+u465xvUXbMbPe3/1jGQaXpTsRDoShjLPDEIYvfsXOxYTW2ZZ3P7mKQBJcEthcbcwWjbm2JnD4sRBZo6CY+5l8pCXrtZoYmRmcZO0E9YiDDvhfRbLfwnsuuSsAc5/nSirBzS0hf9DzOBRCZQfBZauZlhosQm/uFToEKs2NkwAVuhC/AZqPJcmt/8vo6VNZSF4uQ1rstqkKWcIGWgw8iXQIDAQABMIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCpZX2NJGH9Gb0xgx2cJ+d41YhLyoHTi8a1eVapsTO+eUmR5N33Tw3P+7RkACpa6wuet87md2nfZCbKtucz1M+vDYOf4F55dZVva/ZUzuEQnfkf5QwQm9Nk24T+52D2kixz67jrnG9Rdsxs97f/WMZBpelOxEOhKGMs8MQhi9+xc7FhNbZlnc/uYpAElwS2FxtzBaNubYmcPixEFmjoJj7mXykJeu1mhiZGZxk7QT1iIMO+F9Fst/Cey65KwBzn+dKKsHNLSF/0PM4FEJlB8Flq5mWGixCb+4VOgQqzY2TABW6EL8Bmo8lya3/y+jpU1lIXi5DWuy2qQpZwgZaDDyJdAgMBAAECggEAMECEnuu6LcpjJfNfP9fuC3FnvY8VpBiwpYjGsteTEbKizjgPMh8GpDPikomphvRk/vUEroldUxDIK/4lpZH9BrQmxie3QYnI41Axfr7fRUh6aidoZGK+uH//RkzKRfIlT2/Z4ONSojXgzTlS5B15e8Gyz4kAaquCdI6wj420TmtbPfzRCGO5o1BrEzSTzWuoHBXyUIIaYewYXL2CFbZ1De72unkypKNmvKzxPXLD8hYwCgeHM+lhPWZi5jVITASDN5QbsKRPAly6z9BRVSManQCaMKQh70fiN6kf1sJv48u089npNtxjE6l6fJWNSIXfYphNKMUfUx9wRPcB9+Ap0QKBgQDeCL6o28Uk4s6iKNeLYSeKwvCtEg921BRrIpdV703rW6lTuEfkj536aLMqyvfYTPCs5HqN++mu5smZWaIyrjvU5y6EC3CrReelnB9LvC59JwbD8n95OyiFVP62Akd9GJBajnd0CkHV/qAgx79Sk9K35hdWWczuLZle39kqaqP1twKBgQDDT1vN5GYNTO9IJubRO+4eNnGvrRsO1QUGumbKTV3NF1qMZcUz+9mWxh7QZq/zhmAqmCAgV56875RfCljK/wnA6jj9ZCfL2Ob/GRaWWP21bXaLIFP2VlKDWrfR0EoOE1vx5uzVQ5EnLaEpAB1saluIhibVfRBdiwysnccZjn0IiwKBgHl+hX12jGDLrs/y00cUSYPXecTqTgXytJ2PFwpR4Ow5guUpwEUkBQjhw7BV0drM9yFUAG+y+cLXzFaaQnPC/UBZpA1jCSrfHIt1a3aQqUuYUE5mYjRfF6Qlxx6nDqE4EL1MmbaoajADnXFye5FfC/3O7NQ2XTmzP+o3SOi546/vAoGANwXBaETDF1YoRxxmhGWs1Kgj6QkMiWYrz1RuJuoa1e+RW+JD5zw5dYeFINL9GM8vgnBvBI2Ks9GO7CN/Flk5Rzb1LTWtHHmTwiQwP9T8TMN01QcbgFebUVQaWyqh4ktD6OdUq1QorW/maiWVJHjmJpUclaJxHNlSjcK5V5LT2LcCgYBm4kgmzc1pK6cu3j7rF7eWCLVPaZrdygm0cdL/i1vAMry0A//7YiZX4lbHG0GaN0VvF8tJMKkxCTuinoin5ldbUBM7jkhFMwn6dvzOPicG0ZijuTdE3L/ILNQ1YFL7kfSamBuTfwLyzp2YnZOJh0LIFccqV79Xe3JJoYVbWvvKmg==";

    public static final String SALT = "msbd";
    public static final byte[] IV = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static final String LANG_INDEX_ENGLISH = "eng";
    public static final String LANG_INDEX_JAPANESE = "jpn";

    public static final String LANGUAGE_COMPETENCY_ID = "languagecompetencyid001";

    // SMS sending 
    public static final String ACCOUNT_SID = "AC7b601cd29af2d78923c02a5a505a3638";
    public static final String AUTH_TOKEN = "077d0eb6610cf85b4dafea1533f0be67";

    // mail sending
    public static final String USER_NAME = "webitmangrove@gmail.com";
    public static final String PASSWORD = "F9Z0KgQUoJxm9CFRWUfBw4b1QvR4QK4RcEiP7MdP0Sn8bbLIiVw2ohMieqXB3eRhpEZdI4Ke0KtcZ/63HvUHq5T8heLeY/ejZJM2aCJhVftBQIJ4yPfYMd5RzEHEdwjtAuYeGXk7zPjYsaYbcbLL0b6ic9vqJKKP5MR21PxAfj6zsAQuhT/dpck+Eh7/Ai5A2gVMOcDtn84IdwU3UpRk7AuN9zgVlE+ZY6zwGK05/ozi9Ib509CxqlSfKp15QbkCh4RGr8937uPaVuxHYLhbxnA1/EuEGW+qbbrJRxu8xKe2Tbua6duHervKhj9X7MJZZJ4Oj550uuDkfjRMF/8W1Q==";
    public static final String MAIL_SUBJECT_ACCEPTED = "Application accepted";
    public static final String INQUIRY_MAIL_SUBJECT = "Inquiry response";
    public static final String SUBSCRIPTION_ACCEPT_MAIL_SUBJECT = "Application status";
    public static final String SUBSCRIPTION_TEMPORARY_USE_MAIL_SUBJECT = "Application status";
    public static final String SUBSCRIPTION_REJECT_MAIL_SUBJECT = "Application status";
    public static final String SUBSCRIPTION_SUSPENSION_MAIL_SUBJECT = "Application status";
    public static final String SUBSCRIPTION_ACCEPT_MAIL_BODY = "Well-come to DX-R system. Your subscription request is accepted.";
    public static final String SUBSCRIPTION_TEMPORARY_MAIL_BODY = "Well-come to DX-R system. Your subscription request is accepted for temporary use.";
    public static final String SUBSCRIPTION_REJECT_MAIL_BODY = "We are sorry that your application is rejected. Please contact with DX-R management";
    public static final String SUBSCRIPTION_SUSPENSION_MAIL_BODY = "We are sorry that your company subscription has been suspended. Please contact with DX-R management";
    public static final String SUBSCRIPTION_REJECT_SMS_BODY = "We are sorry that your application is rejected. Please contact with DX-R management";

    public static final String STATUS_SETUP_TABLE_PK = "subcriptionStatusNA";
    public static final String EMPTY_STATUS = "00000";
    public static final String EMPTY_STRING = "";
    public static final String ACCEPT_STATUS = "Accept";
    public static final String REJECT_STATUS = "Reject";

    public static final String ACCEPT_STATUS_VALUE = "1";
    public static final String REJECT_STATUS_VALJUE = "2";

    public final static String DUMPER_CATEGORY = "Dumper";
    public final static String PROCESSOR_CATEGORY = "Processor";
    public final static String TRANSPOTER_CATAGORY = "Transporter";

    public final static String DUMPER_CATEGORY_VALUE = "1";
    public final static String PROCESSOR_CATEGORY_VALUE = "2";
    public final static String TRANSPOTER_CATEGORY_VALUE = "3";

    public final static String IS_EXIST_TRUE = "1";
    public final static String IS_EXIST_FALSE = "0";

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

//    public static final String DXR_SYS_ADMIN_ACCESS_INFO = "[\n"
//            + "    {\n"
//            + "        \"companyId\": \"dxr00001\",\n"
//            + "        \"menuAccessInfo\": [\n"
//            + "            {\n"
//            + "                \"menuId\": \"dxrSuperAdmin\",\n"
//            + "                \"menuTitleEng\": \"System Admin Op\",\n"
//            + "                \"menuTitleJpn\": \"System Admin Op\",\n"
//            + "                \"menuUrl\": \"/super-admin\",\n"
//            + "                \"child\": [\n"
//            + "                    {\n"
//            + "                        \"menuId\": \"createDxrAdmin\",\n"
//            + "                        \"menuTitleEng\": \"Create DXR Admin\",\n"
//            + "                        \"menuTitleJpn\": \"Create DXR Admin\",\n"
//            + "                        \"menuUrl\": \"super-admin/create-dxr-admin\",\n"
//            + "                        \"parentSegment\": \"\"\n"
//            + "                    },\n"
//            + "                    {\n"
//            + "                        \"menuId\": \"setDxrAdminAccess\",\n"
//            + "                        \"menuTitleEng\": \"Set DXR Admin Access\",\n"
//            + "                        \"menuTitleJpn\": \"Set DXR Admin Access\",\n"
//            + "                        \"menuUrl\": \"super-admin/set-dxr-admin-access\",\n"
//            + "                        \"parentSegment\": \"\"\n"
//            + "                    },\n"
//            + "                    {\n"
//            + "                        \"menuId\": \"setCompanyAdminAccess\",\n"
//            + "                        \"menuTitleEng\": \"Set Company Admin Access\",\n"
//            + "                        \"menuTitleJpn\": \"Set Company Admin Access\",\n"
//            + "                        \"menuUrl\": \"super-admin/set-company-admin-access\",\n"
//            + "                        \"parentSegment\": \"\"\n"
//            + "                    }\n"
//            + "                ]\n"
//            + "            }\n"
//            + "        ]\n"
//            + "    }\n"
//            + "]";
}
