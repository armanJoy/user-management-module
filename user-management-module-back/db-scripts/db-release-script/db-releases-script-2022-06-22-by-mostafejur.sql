-- 2022-06-05
-- For postgresql
-- ALTER TABLE DXRADMIN.SUBSCRIPTION_INFO ADD COLUMN search_content VARCHAR(10485760) DEFAULT '';

-- ALTER TABLE DXRADMIN.inquiry_info ADD COLUMN search_content VARCHAR(10485760) DEFAULT '';

-- ALTER TABLE DXRADMIN.waste_request_info ADD COLUMN search_content VARCHAR(10485760) DEFAULT '';

-- ALTER TABLE DXRADMIN.vehicle_info ADD COLUMN search_content VARCHAR(10485760) DEFAULT '';

-- ALTER TABLE DXRADMIN.user_info ADD COLUMN search_content VARCHAR(10485760) DEFAULT '';

-- ALTER TABLE DXRADMIN.project_info ADD COLUMN search_content VARCHAR(10485760) DEFAULT '';

-- ALTER TABLE DXRADMIN.partner_company_info ADD COLUMN search_content VARCHAR(10485760) DEFAULT '';

-- ALTER TABLE DXRADMIN.agreement_info ADD COLUMN search_content VARCHAR(10485760) DEFAULT '';

-- ALTER TABLE DXRADMIN.invoice_info ADD COLUMN search_content VARCHAR(10485760) DEFAULT '';

-- ALTER TABLE DXRADMIN.menifesto_info ADD COLUMN search_content VARCHAR(10485760) DEFAULT '';

UPDATE DXRADMIN.ROLE_DEF SET ROLE_NAME = '管理者' WHERE ROLE_DEF_ID='roledef0001';
UPDATE DXRADMIN.ROLE_DEF SET ROLE_NAME = '管理者(排出)' WHERE ROLE_DEF_ID='roledef0002';
UPDATE DXRADMIN.ROLE_DEF SET ROLE_NAME = '管理者(排出運搬)' WHERE ROLE_DEF_ID='roledef0003';
UPDATE DXRADMIN.ROLE_DEF SET ROLE_NAME = '管理者(処理)' WHERE ROLE_DEF_ID='roledef0004';
UPDATE DXRADMIN.ROLE_DEF SET ROLE_NAME = 'ドライバー' WHERE ROLE_DEF_ID='roledef0005';
UPDATE DXRADMIN.ROLE_DEF SET ROLE_NAME = '受付管理' WHERE ROLE_DEF_ID='roledef0006';
UPDATE DXRADMIN.ROLE_DEF SET ROLE_NAME = '経理' WHERE ROLE_DEF_ID='roledef0007';
UPDATE DXRADMIN.ROLE_DEF SET ROLE_NAME = '受入担当' WHERE ROLE_DEF_ID='roledef0008';
UPDATE DXRADMIN.ROLE_DEF SET ROLE_NAME = '参照のみ' WHERE ROLE_DEF_ID='roledef0009';
UPDATE DXRADMIN.ROLE_DEF SET ROLE_NAME = '仮利用' WHERE ROLE_DEF_ID='roledef0010';


UPDATE DXRADMIN.MENU_DEF SET  MENU_TITLE_JPN= '会社管理' WHERE MENU_ID='menudef0001';
UPDATE DXRADMIN.MENU_DEF SET  MENU_TITLE_JPN= '会社情報設定' WHERE MENU_ID='menudef00011';
UPDATE DXRADMIN.MENU_DEF SET  MENU_TITLE_JPN= 'ユーザー管理' WHERE MENU_ID='menudef00012';
UPDATE DXRADMIN.MENU_DEF SET  MENU_TITLE_JPN= '案件操作' WHERE MENU_ID='menudef0002';
UPDATE DXRADMIN.MENU_DEF SET  MENU_TITLE_JPN= '契約一覧' WHERE MENU_ID='menudefBusinessAgreement';
UPDATE DXRADMIN.MENU_DEF SET  MENU_TITLE_JPN= '案件一覧' WHERE MENU_ID='initiateProject';
UPDATE DXRADMIN.MENU_DEF SET  MENU_TITLE_JPN= 'スケジュールを作成する' WHERE MENU_ID='projectScheduleMenu';
UPDATE DXRADMIN.MENU_DEF SET  MENU_TITLE_JPN= 'マニフェスト' WHERE MENU_ID='menifestoMenu';
UPDATE DXRADMIN.MENU_DEF SET  MENU_TITLE_JPN= '請求書' WHERE MENU_ID='invoiceMenu';


    -- 2022-06-10

ALTER TABLE DXRADMIN.disposal_info ADD COLUMN schedule_confirm_status VARCHAR(50) DEFAULT '0';

ALTER TABLE DXRADMIN.PROJECT_INFO ADD COLUMN confirmed_dispose_ids VARCHAR(10485760) DEFAULT '';

ALTER TABLE DXRADMIN.menifesto_info ADD COLUMN manual_manifesto VARCHAR(10485760) DEFAULT '';

ALTER TABLE DXRADMIN.menifesto_info ADD COLUMN manifesto_type VARCHAR(10485760) DEFAULT 'menifestoType0001';

CREATE TABLE DXRADMIN.menifesto_type (
    menifesto_type_id VARCHAR(255) NOT NULL,
    type_title VARCHAR(255),
    type_description VARCHAR(255),
    PRIMARY KEY (menifesto_type_id)
);

INSERT INTO DXRADMIN.menifesto_type VALUES (
    'menifestoType0001',
    'Generated',
    'System Generated'
);

INSERT INTO DXRADMIN.menifesto_type VALUES (
    'menifestoType0002',
    'Manual',
    'Manually Created'
);

ALTER TABLE DXRADMIN.menifesto_info ADD FOREIGN KEY (manifesto_type) REFERENCES DXRADMIN.menifesto_type (menifesto_type_id);



-- Load Unload Menu For Web

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('loadMenuWeb', 'Load', 'Load', 'https://dxr-mob-app.web.app/home', '', 'menudef0002|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.menu_role_def VALUES (
    'menuRoleDef-loadMenuWeb',
    'loadMenuWeb',
    'roleaccessdef00053|roleaccessdef00023|'
);



INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('unloadMenuWeb', 'Unload', 'Unload', 'https://dxr-mob-app.web.app/home', '', 'menudef0002|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.menu_role_def VALUES (
    'menuRoleDef-unloadMenuWeb',
    'unloadMenuWeb',
    'roleaccessdef00053|roleaccessdef00063|roleaccessdef00083|'
);


-- Role Wise Menu List Update

-- Person In charge (Dumper)
UPDATE DXRADMIN.role_menu SET menu_id_list = menu_id_list || 'loadMenuWeb|' WHERE role_menu_id='7ee010b5-2ab8-4dcd-bd00-a87e2c552890';

-- Driver
UPDATE DXRADMIN.role_menu SET menu_id_list = menu_id_list || 'loadMenuWeb|unloadMenuWeb|' WHERE role_menu_id='e976dbe5-7bbd-4fdb-9a6f-869f3424c1c9';

-- Reception Manager (Processor
UPDATE DXRADMIN.role_menu SET menu_id_list = menu_id_list || 'unloadMenuWeb|' WHERE role_menu_id='aff7dce8-838c-4448-9692-dee07f5bd4d2';

-- Receiving Manager (Processor)
UPDATE DXRADMIN.role_menu SET menu_id_list = menu_id_list || 'unloadMenuWeb|' WHERE role_menu_id='66597fb0-b8c2-4075-8b8a-384b6f6be36a';



CREATE TABLE DXRADMIN.weight_certificate_info (
    weight_certificate_info_id VARCHAR(255) NOT NULL,
    date VARCHAR(255),
    trip_id VARCHAR(255),
    pick_list VARCHAR(10485760),
    waste_gross_weight DOUBLE PRECISION,
    vehicle_weight DOUBLE PRECISION,
    waste_net_weight DOUBLE PRECISION,
    processor_company_info VARCHAR(10485760),
    transporter_company_info VARCHAR(10485760),
    driver_info VARCHAR(10485760),
    scale_info VARCHAR(10485760),
    waste_list VARCHAR(10485760),
    PRIMARY KEY (weight_certificate_info_id),
    FOREIGN KEY(trip_id) REFERENCES DXRADMIN.TRIP_INFO(TRIP_INFO_ID)
);


-- Mobile Menu Japanese Label

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='積み込み操作' WHERE MENU_ID='loadMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='ダッシュボード' WHERE MENU_ID='loadDashboardMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='収集リスト' WHERE MENU_ID='pickListMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='廃棄物積み込み' WHERE MENU_ID='wasteLoadMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='運行情報' WHERE MENU_ID='tripScanMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='廃棄物リスト' WHERE MENU_ID='wasteListMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='パッケージ' WHERE MENU_ID='packageDefMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='引き渡し' WHERE MENU_ID='handoverMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='荷下ろし操作' WHERE MENU_ID='unloadMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='ダッシュボード' WHERE MENU_ID='unloadDashboardMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='引き渡し' WHERE MENU_ID='handoverByDriverMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='運搬完了' WHERE MENU_ID='tripCompletionMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='運行情報' WHERE MENU_ID='tripInfoScanByProcessorMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='運行パッケージ情報' WHERE MENU_ID='verificationMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='廃棄物重量' WHERE MENU_ID='weightDeclarationMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='廃棄物受領' WHERE MENU_ID='wasteReceiveMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='積み込み操作',MENU_URL='unload-web',PARENT_SEGMENT='/company-admin/project' WHERE MENU_ID='unloadMenuWeb';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='荷下ろし操作',MENU_URL='load-web',PARENT_SEGMENT='/company-admin/project' WHERE MENU_ID='loadMenuWeb';


-- 2022-06-15
   -- Notification by mostafejur 
   CREATE TABLE DXRADMIN.notification_info(
        notification_id VARCHAR(255) NOT NULL,
        date_time VARCHAR(255),
        receiver_id VARCHAR(255),
        receiver_name VARCHAR(255),
        sender_id VARCHAR(255),
        sender_name VARCHAR(255),
        receiver_company_id VARCHAR(255),
        receiver_company_name VARCHAR(255),
        sender_company_name VARCHAR(255),
        notification_type_id VARCHAR(255),
        notification_type VARCHAR(255),
        uri VARCHAR(255),
        menu_id VARCHAR(255),
        parent_menu_id VARCHAR(255),
        content_jpn VARCHAR(10000),
        content_eng VARCHAR(10000),
       PRIMARY KEY (notification_id)
   );

   
   
   CREATE TABLE DXRADMIN.notification_process_def(
       notification_process_def_id VARCHAR(255) NOT NULL,
       full_context_json VARCHAR(30000),
       backend_date VARCHAR(255),
       PRIMARY KEY (notification_process_def_id)
   );

   ALTER TABLE DXRADMIN.notification_info ADD COLUMN sender_company_id VARCHAR(255);


--Mobile menu def by joy

UPDATE DXRADMIN.user_info SET user_id=user_email where user_email IS NOT NULL AND (user_id='' OR user_id=null);

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='積み込み操作' WHERE MENU_ID='loadMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='ダッシュボード' WHERE MENU_ID='loadDashboardMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='収集リスト' WHERE MENU_ID='pickListMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='廃棄物積み込み' WHERE MENU_ID='wasteLoadMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='運行情報' WHERE MENU_ID='tripScanMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='廃棄物リスト' WHERE MENU_ID='wasteListMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='パッケージ' WHERE MENU_ID='packageDefMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='引き渡し' WHERE MENU_ID='handoverMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='荷下ろし操作' WHERE MENU_ID='unloadMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='ダッシュボード' WHERE MENU_ID='unloadDashboardMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='引き渡し' WHERE MENU_ID='handoverByDriverMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='運搬完了' WHERE MENU_ID='tripCompletionMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='運行情報' WHERE MENU_ID='tripInfoScanByProcessorMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='運行パッケージ情報' WHERE MENU_ID='verificationMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='廃棄物重量' WHERE MENU_ID='weightDeclarationMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='廃棄物受領' WHERE MENU_ID='wasteReceiveMenu';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='積み込み操作',MENU_URL='unload-web',PARENT_SEGMENT='/company-admin/project' WHERE MENU_ID='unloadMenuWeb';

UPDATE DXRADMIN.MENU_DEF SET MENU_TITLE_JPN='荷下ろし操作',MENU_URL='load-web',PARENT_SEGMENT='/company-admin/project' WHERE MENU_ID='loadMenuWeb';


--Scale info 
ALTER TABLE DXRADMIN.scale_info ADD COLUMN responsible_person_id VARCHAR(255);

ALTER TABLE DXRADMIN.scale_info ADD FOREIGN KEY (responsible_person_id) REFERENCES DXRADMIN.user_info (user_info_id);


--  2022-06-19
 UPDATE DXRADMIN.MENU_DEF SET MENU_URL='unload-web' WHERE MENU_ID='unloadMenuWeb';

UPDATE DXRADMIN.MENU_DEF SET MENU_URL='load-web' WHERE MENU_ID='loadMenuWeb';

-- 2022-06-20
ALTER TABLE DXRADMIN.company_waste_operation_method_info ADD COLUMN emission_quantity DOUBLE PRECISION DEFAULT 0;






INSERT INTO DXRADMIN.notification_process_def VALUES ('context0001','[   
    {
        "notificationTypeId":"notificationType001",
        "notificationType":"Subscription",
        "uriLink":["/system-admin", "dxrSysAdminOutlet", "subscription-admin"],
        "menuId":"sysAdminSubscription",
        "parentMenuId":"menudefSystemAdmin",
        "contentEng":" New Subscription Request ",
        "contentJpn":" New Subscription Request ",
        "receiverRole":[],
        "receiverType":["dxradmin"]
    },
    {
        "notificationTypeId":"notificationType002",
        "notificationType":"Inquiry",
        "uriLink":["/system-admin", "dxrSysAdminOutlet", "inquiry-admin"],
        "menuId":"sysAdminInquiry",
        "parentMenuId":"menudefSystemAdmin",
        "contentEng":" New Inquiry ",
        "contentJpn":" New Inquiry ",
        "receiverRole":[],
        "receiverType":["dxradmin"]
    },
    {
        "notificationTypeId":"notificationType003",
        "notificationType":"Waste Request",
        "uriLink":["/system-admin", "dxrSysAdminOutlet", "waste-request-admin"],
        "menuId":"sysAdminWasteRequest",
        "parentMenuId":"menudefSystemAdmin",
        "contentEng":" New Waste Request ",
        "contentJpn":" New Waste Request ",
        "receiverRole":[],
        "receiverType":["dxradmin"]
    },
    {
        "notificationTypeId":"notificationType004",
        "notificationType":"Agreement",
        "uriLink":["/company-admin/project", "dumperAdminOutlet", "business-agreement"],
        "menuId":"menudefBusinessAgreement",
        "parentMenuId":"menudef0002",
        "contentEng":" Is ",
        "contentJpn":" Is ",
        "receiverRole":[],
        "receiverType":["agreementPersonIncharge"]
    },
    {
        "notificationTypeId":"notificationType005",
        "notificationType":"Project",
        "uriLink":["/company-admin/project", "dumperAdminOutlet", "initiate-project"],
        "menuId":"initiateProject",
        "parentMenuId":"menudef0002",
        "contentEng":" Is ",
        "contentJpn":"Is ",
        "receiverRole":["roledef0001"],
        "receiverType":["projectPersonIncharge"]
    },
    {
        "notificationTypeId":"notificationType006",
        "notificationType":"Project Schedule",
        "uriLink":["/company-admin/project", "dumperAdminOutlet", "create-schedule"],
        "menuId":"projectScheduleMenu",
        "parentMenuId":"menudef0002",
        "contentEng":" Confirm Schedule ",
        "contentJpn":" Confirm Schedule ",
        "receiverRole":[],
        "receiverType":["projectPersonIncharge", "driver"]
    },
    {
        "notificationTypeId":"notificationType007",
        "notificationType":"Invoice",
        "uriLink":["/company-admin/project", "dumperAdminOutlet", "invoice"],
        "menuId":"invoiceMenu",
        "parentMenuId":"menudef0002",
        "contentEng":" has been generated ",
        "contentJpn":" has been generated ",
        "receiverRole":["roledef0007", "roledef0001"],
        "receiverType":[]
    },
    {
        "notificationTypeId":"notificationType008",
        "notificationType":"Menifesto",
        "uriLink":["/company-admin/project", "dumperAdminOutlet", "menifesto"],
        "menuId":"menifestoMenu",
        "parentMenuId":"menudef0002",
        "contentEng":" Is ",
        "contentJpn":" Is ",
        "receiverRole":[],
        "receiverType":["projectPersonIncharge"]
    }
]','');

