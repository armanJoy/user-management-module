connect 'jdbc:derby:database/dxrdb;create=true';


INSERT INTO DXRADMIN.ACCESS_DEF(ACCESS_DEF_ID, ACCESS_TITLE, ACCESS_CODE, ACCESS_DESCRIPTION) VALUES ('access0001', 'View', 'access-0001', 'View Access');

INSERT INTO DXRADMIN.ACCESS_DEF(ACCESS_DEF_ID, ACCESS_TITLE, ACCESS_CODE, ACCESS_DESCRIPTION) VALUES ('access0002', 'View and Browse', 'access-0002', 'View and Browse Access');

INSERT INTO DXRADMIN.ACCESS_DEF(ACCESS_DEF_ID, ACCESS_TITLE, ACCESS_CODE, ACCESS_DESCRIPTION) VALUES ('access0003', 'View, Browse and Edit', 'access-0003', 'View, Browse and Edit Access');





INSERT INTO DXRADMIN.AGREEMENT_PROCESS_DEF(AGREEMENT_PROCESS_DEF_ID, AGREEMENT_PROCESS_DEF) VALUES ('agreementprocessdef0001', '[
    {
        "processId": "initialCreateProcess",
        "processTitleEng": "Create",
        "processTitleJpn": "契約書を作成する",
        "initialStatus": [],
        "triggeringProcessIds": [],
        "creatorAccess": "edit",
        "partyAccess": "view",
        "resultantStatusId": "statusNewAgreement",
        "isApprovalRequired": true,
        "processAction": [
            {
                "actionId": "saveActionId",
                "actionTitleEng": "Save",
                "actionTitleJpn": "保存する",
                "initialStatus": [],
                "viewAcess": [
                    "party"
                ],
                "editAccess": [
                    "creator"
                ],
                "agreementStatusId": "statusNewAgreement",
                "isApproval": false
            }
        ],
        "viewMode": false
    },
    {
        "processId": "editProcess",
        "processTitleEng": "Edit",
        "processTitleJpn": "編集する",
        "initialStatus": [
            {
                "statusId": "statusNewAgreement",
                "statusTitleEng": "New",
                "statusTitleJpn": "新規",
                "operationDef": {
                    "operationId": "opInUse",
                    "operationTitleEng": "In Use",
                    "operationTitleJpn": "In Use"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "edit",
        "partyAccess": "none",
        "resultantStatusId": "statusNewAgreement",
        "isApprovalRequired": true,
        "processAction": [
            {
                "actionId": "saveActionId",
                "actionTitleEng": "Update",
                "actionTitleJpn": "Update",
                "initialStatus": [
                    "statusNewAgreement"
                ],
                "viewAcess": [],
                "editAccess": [
                    "creator"
                ],
                "agreementStatusId": "statusNewAgreement",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "sendForApprovalProcess",
        "processTitleEng": "Send for Approval",
        "processTitleJpn": "送信する",
        "initialStatus": [
            {
                "statusId": "statusNewAgreement",
                "statusTitleEng": "New",
                "statusTitleJpn": "新規",
                "operationDef": {
                    "operationId": "opInUse",
                    "operationTitleEng": "In Use",
                    "operationTitleJpn": "In Use"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "view",
        "partyAccess": "none",
        "resultantStatusId": "statusWaitingForAproval",
        "isApprovalRequired": false,
        "processAction": [
            {
                "actionId": "sendForApprovalActionId",
                "actionTitleEng": "Send",
                "actionTitleJpn": "承認用に送信する",
                "initialStatusId": [
                    "statusNewAgreement"
                ],
                "viewAcess": [
                    "creator"
                ],
                "editAccess": [],
                "agreementStatusId": "statusWaitingForAproval",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "approvalProcess",
        "processTitleEng": "Approve",
        "processTitleJpn": "承認する",
        "initialStatus": [
            {
                "statusId": "statusWaitingForAproval",
                "statusTitleEng": "Waiting for Approval",
                "statusTitleJpn": "承認待ち",
                "operationDef": {
                    "operationId": "opInUse",
                    "operationTitleEng": "In Use",
                    "operationTitleJpn": "In Use"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "none",
        "partyAccess": "view",
        "resultantStatusId": "statusAgreementInUse",
        "isApprovalRequired": false,
        "processAction": [
            {
                "actionId": "approveActionId",
                "actionTitleEng": "Approve",
                "actionTitleJpn": "承認する",
                "initialStatus": [
                    "statusWaitingForAproval"
                ],
                "viewAcess": [
                    "party"
                ],
                "editAccess": [],
                "agreementStatusId": "statusAgreementInUse",
                "isApproval": true
            }
        ]
    },
    {
        "processId": "agreementCancelationProcess",
        "processTitleEng": "Cancel",
        "processTitleJpn": "契約書をキャンセルする",
        "initialStatus": [
            {
                "statusId": "statusAgreementInUse",
                "statusTitleEng": "In Use",
                "statusTitleJpn": "使用中",
                "operationDef": {
                    "operationId": "opInUse",
                    "operationTitleEng": "In Use",
                    "operationTitleJpn": "In Use"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "view",
        "partyAccess": "none",
        "resultantStatusId": "statusCancelationReadyForSend",
        "isApprovalRequired": false,
        "processAction": [
            {
                "actionId": "cancelAgreementActionId",
                "actionTitleEng": "Confirm Cancel",
                "actionTitleJpn": "キャンセルを確認する",
                "initialStatus": [
                    "statusAgreementInUse",
                    "statusNewVersionInOperation"
                ],
                "viewAcess": [
                    "creator"
                ],
                "editAccess": [],
                "agreementStatusId": "statusCancelationReadyForSend",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "agreementCancelationSendProcess",
        "processTitleEng": "Send Cancelation Request",
        "processTitleJpn": "キャンセルを送信する",
        "initialStatus": [
            {
                "statusId": "statusCancelationReadyForSend",
                "statusTitleEng": "Ready For Send",
                "statusTitleJpn": "送信可能なキャンセル",
                "operationDef": {
                    "operationId": "opCancelation",
                    "operationTitleEng": "Cancelation",
                    "operationTitleJpn": "Cancelation"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "view",
        "partyAccess": "none",
        "resultantStatusId": "statusCancelationReadyForApprove",
        "isApprovalRequired": false,
        "processAction": [
            {
                "actionId": "sendCancelationActionId",
                "actionTitleEng": "Send",
                "actionTitleJpn": "キャンセルを送信する",
                "initialStatus": [
                    "statusCancelationReadyForSend"
                ],
                "viewAcess": [
                    "party"
                ],
                "editAccess": [],
                "agreementStatusId": "statusCancelationReadyForApprove",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "agreementCancelationApproveProcess",
        "processTitleEng": "Approve Cancelation",
        "processTitleJpn": "キャンセルを承認する",
        "initialStatus": [
            {
                "statusId": "statusCancelationReadyForApprove",
                "statusTitleEng": "Waiting For Approval",
                "statusTitleJpn": "Waiting For Approval",
                "operationDef": {
                    "operationId": "opCancelation",
                    "operationTitleEng": "Cancelation",
                    "operationTitleJpn": "Cancelation"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "none",
        "partyAccess": "view",
        "resultantStatusId": "statusAgreementReadyForCancelation",
        "isApprovalRequired": false,
        "processAction": [
            {
                "actionId": "approveCancelationActionId",
                "actionTitleEng": "Approve Cancelation",
                "actionTitleJpn": "キャンセルを承認する",
                "initialStatus": [
                    "statusCancelationReadyForApprove"
                ],
                "viewAcess": [
                    "creator"
                ],
                "editAccess": [],
                "agreementStatusId": "statusAgreementReadyForCancelation",
                "isApproval": true
            }
        ]
    },
    {
        "processId": "agreementCancelationActivationProcess",
        "processTitleEng": "Activate Cancelation",
        "processTitleJpn": "キャンセルをアクティブにする",
        "initialStatus": [
            {
                "statusId": "statusAgreementReadyForCancelation",
                "statusTitleEng": "Ready for Cancel",
                "statusTitleJpn": "キャンセル準備完了の契約書",
                "operationDef": {
                    "operationId": "opCancelation",
                    "operationTitleEng": "Cancelation",
                    "operationTitleJpn": "Cancelation"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "view",
        "partyAccess": "none",
        "resultantStatusId": "statusAgreementCanceled",
        "isApprovalRequired": false,
        "processAction": [
            {
                "actionId": "approveCancelationActionId",
                "actionTitleEng": "Activate Cancelation",
                "actionTitleJpn": "キャンセルをアクティブにする",
                "initialStatus": [
                    "statusAgreementReadyForCancelation"
                ],
                "viewAcess": [
                    "creator"
                ],
                "editAccess": [],
                "agreementStatusId": "statusAgreementCanceled",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "agreementSuspensionProcess",
        "processTitleEng": "Suspend",
        "processTitleJpn": "保留契約書",
        "initialStatus": [
            {
                "statusId": "statusAgreementInUse",
                "statusTitleEng": "In Use",
                "statusTitleJpn": "使用中",
                "operationDef": {
                    "operationId": "opInUse",
                    "operationTitleEng": "In Use",
                    "operationTitleJpn": "In Use"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "view",
        "partyAccess": "none",
        "resultantStatusId": "statusSuspensionReadyForSend",
        "isApprovalRequired": false,
        "processAction": [
            {
                "actionId": "cancelAgreementActionId",
                "actionTitleEng": "Confirm Suspend",
                "actionTitleJpn": "保留契約書",
                "initialStatus": [
                    "statusAgreementInUse",
                    "statusNewVersionInOperation"
                ],
                "viewAcess": [
                    "creator"
                ],
                "editAccess": [],
                "agreementStatusId": "statusSuspensionReadyForSend",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "agreementSuspensionSendProcess",
        "processTitleEng": "Send Suspension Request",
        "processTitleJpn": "保留を送信する",
        "initialStatus": [
            {
                "statusId": "statusSuspensionReadyForSend",
                "statusTitleEng": "Ready For Send",
                "statusTitleJpn": "送信準備完了の保留",
                "operationDef": {
                    "operationId": "opSuspension",
                    "operationTitleEng": "Suspension",
                    "operationTitleJpn": "Suspension"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "view",
        "partyAccess": "none",
        "resultantStatusId": "statusSuspensionReadyForApprove",
        "isApprovalRequired": false,
        "processAction": [
            {
                "actionId": "sendSuspensionActionId",
                "actionTitleEng": "Send",
                "actionTitleJpn": "保留を送信する",
                "initialStatus": [
                    "statusSuspensionReadyForSend"
                ],
                "viewAcess": [
                    "creator"
                ],
                "editAccess": [],
                "agreementStatusId": "statusSuspensionReadyForApprove",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "agreementSuspensionApproveProcess",
        "processTitleEng": "Approve Suspension",
        "processTitleJpn": "保留を承認する",
        "initialStatus": [
            {
                "statusId": "statusSuspensionReadyForApprove",
                "statusTitleEng": "Waiting For Approval",
                "statusTitleJpn": "Waiting For Approval",
                "operationDef": {
                    "operationId": "opSuspension",
                    "operationTitleEng": "Suspension",
                    "operationTitleJpn": "Suspension"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "none",
        "partyAccess": "view",
        "resultantStatusId": "statusAgreementReadyForSuspension",
        "isApprovalRequired": false,
        "processAction": [
            {
                "actionId": "approveSuspensionActionId",
                "actionTitleEng": "Approve Suspension",
                "actionTitleJpn": "保留を承認する",
                "initialStatus": [
                    "statusSuspensionReadyForApprove"
                ],
                "viewAcess": [
                    "creator"
                ],
                "editAccess": [],
                "agreementStatusId": "statusAgreementReadyForSuspension",
                "isApproval": true
            }
        ]
    },
    {
        "processId": "agreementSuspensionActivationProcess",
        "processTitleEng": "Activate Suspension",
        "processTitleJpn": "保留をアクティブにする",
        "initialStatus": [
            {
                "statusId": "statusAgreementReadyForSuspension",
                "statusTitleEng": "Ready for Suspend",
                "statusTitleJpn": "Ready for Suspend",
                "operationDef": {
                    "operationId": "opSuspension",
                    "operationTitleEng": "Suspension",
                    "operationTitleJpn": "Suspension"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "view",
        "partyAccess": "none",
        "resultantStatusId": "statusAgreementSuspended",
        "isApprovalRequired": false,
        "processAction": [
            {
                "actionId": "approveSuspensionActionId",
                "actionTitleEng": "Activate Suspension",
                "actionTitleJpn": "保留をアクティブにする",
                "initialStatus": [
                    "statusAgreementReadyForSuspension"
                ],
                "viewAcess": [
                    "creator"
                ],
                "editAccess": [],
                "agreementStatusId": "statusAgreementSuspended",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "agreementReviveProcess",
        "processTitleEng": "Revive",
        "processTitleJpn": "契約内容を復活させる",
        "initialStatus": [
            {
                "statusId": "statusAgreementCanceled",
                "statusTitleEng": "Canceled",
                "statusTitleJpn": "キャンセル済み契約書",
                "operationDef": {
                    "operationId": "opCancelation",
                    "operationTitleEng": "Cancelation",
                    "operationTitleJpn": "Cancelation"
                }
            },
            {
                "statusId": "statusAgreementSuspended",
                "statusTitleEng": "Suspended",
                "statusTitleJpn": "保留済み契約書",
                "operationDef": {
                    "operationId": "opSuspension",
                    "operationTitleEng": "Suspension",
                    "operationTitleJpn": "Suspension"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "view",
        "partyAccess": "none",
        "resultantStatusId": "statusReviveReadyForSend",
        "isApprovalRequired": false,
        "processAction": [
            {
                "actionId": "cancelAgreementActionId",
                "actionTitleEng": "Confirm Revive",
                "actionTitleJpn": "契約内容を復活させる",
                "initialStatus": [
                    "statusAgreementCanceled",
                    "statusAgreementSuspended"
                ],
                "viewAcess": [
                    "creator"
                ],
                "editAccess": [],
                "agreementStatusId": "statusReviveReadyForSend",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "agreementReviveSendProcess",
        "processTitleEng": "Send Revive Request",
        "processTitleJpn": "復活要請を送信する",
        "initialStatus": [
            {
                "statusId": "statusReviveReadyForSend",
                "statusTitleEng": "Ready For Send",
                "statusTitleJpn": "送信準備完了の復活させる契約書",
                "operationDef": {
                    "operationId": "opRevive",
                    "operationTitleEng": "Revive",
                    "operationTitleJpn": "Revive"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "view",
        "partyAccess": "none",
        "resultantStatusId": "statusReviveReadyForApprove",
        "isApprovalRequired": false,
        "processAction": [
            {
                "actionId": "sendReviveActionId",
                "actionTitleEng": "Send",
                "actionTitleJpn": "復活要請を送信する",
                "initialStatus": [
                    "statusReviveReadyForSend"
                ],
                "viewAcess": [
                    "creator"
                ],
                "editAccess": [],
                "agreementStatusId": "statusReviveReadyForApprove",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "agreementReviveApproveProcess",
        "processTitleEng": "Approve Revive",
        "processTitleJpn": "復活を承認する",
        "initialStatus": [
            {
                "statusId": "statusReviveReadyForApprove",
                "statusTitleEng": "Waiting For Approval",
                "statusTitleJpn": "承認準備完了の復活させる契約書",
                "operationDef": {
                    "operationId": "opRevive",
                    "operationTitleEng": "Revive",
                    "operationTitleJpn": "Revive"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "none",
        "partyAccess": "view",
        "resultantStatusId": "statusAgreementInUse",
        "isApprovalRequired": false,
        "processAction": [
            {
                "actionId": "approveReviveActionId",
                "actionTitleEng": "Approve Revive",
                "actionTitleJpn": "復活を承認する",
                "initialStatus": [
                    "statusReviveReadyForApprove"
                ],
                "viewAcess": [
                    "party"
                ],
                "editAccess": [],
                "agreementStatusId": "statusAgreementInUse",
                "isApproval": true
            }
        ]
    }
]');





INSERT INTO DXRADMIN.CARBON_EMISSION_METHOD_INFO(EMISSION_METHOD_ID, METHOD_TITLE, CODE, DESCRIPTIONS, EMISSION_QUNTITY, OPERATION_TYPE_ID) VALUES ('emid0001', 'Cutting Method', '#0001', 'This is Cutting Method', 0.23, 'emimissionTypeId001');

INSERT INTO DXRADMIN.CARBON_EMISSION_METHOD_INFO(EMISSION_METHOD_ID, METHOD_TITLE, CODE, DESCRIPTIONS, EMISSION_QUNTITY, OPERATION_TYPE_ID) VALUES ('emid0002', 'Cutting Method', '#0002', 'This is Cutting Method', 0.3, 'emimissionTypeId002');

INSERT INTO DXRADMIN.CARBON_EMISSION_METHOD_INFO(EMISSION_METHOD_ID, METHOD_TITLE, CODE, DESCRIPTIONS, EMISSION_QUNTITY, OPERATION_TYPE_ID) VALUES ('emid0003', 'Harvasting Method', '#0003', 'This is Harvasting Method', 0.15, 'emimissionTypeId001');

INSERT INTO DXRADMIN.CARBON_EMISSION_METHOD_INFO(EMISSION_METHOD_ID, METHOD_TITLE, CODE, DESCRIPTIONS, EMISSION_QUNTITY, OPERATION_TYPE_ID) VALUES ('emid0004', 'Harvasting Method', '#0004', 'This is Harvasting Method', 0.5, 'emimissionTypeId002');






INSERT INTO DXRADMIN.COMPANY_ADMIN_ACCESS(COMPANY_ADMIN_ACCESS_ID, COMPANY_ADMIN_ACCESS, UPDATE_DATE) VALUES ('companyadminaccess0001', '[
            {
                "menuId": "menudef0001",
                "menuTitleEng": "Company Management",
                "menuTitleJpn": "Company Management",
                "menuUrl": "/company-admin",
                "parentSegment": "",
                "menuParent": "",
                "menuTypeId": "menutype0001",
                "companyCategoryId": "",
                "accessInfo": {
                    "accessDefId": "accessdefid0003",
                    "accessTitle": "View, Browse, Edit"
                },
                "child": []
            },
            {
                "menuId": "menudef00011",
                "menuTitleEng": "Company Settings",
                "menuTitleJpn": "Company Settings",
                "menuUrl": "company-settings",
                "parentSegment": "/company-admin",
                "menuParent": "menudef0001|",
                "menuTypeId": "menutype0002",
                "companyCategoryId": "",
                "accessInfo": {
                    "accessDefId": "accessdefid0003",
                    "accessTitle": "View, Browse, Edit"
                },
                "child": []
            },
            {
                "menuId": "menudef00012",
                "menuTitleEng": "User Management",
                "menuTitleJpn": "User Management",
                "menuUrl": "user-management",
                "parentSegment": "/company-admin",
                "menuParent": "menudef0001|",
                "menuTypeId": "menutype0002",
                "companyCategoryId": "",
                "accessInfo": {
                    "accessDefId": "accessdefid0003",
                    "accessTitle": "View, Browse, Edit"
                },
                "child": []
            }
        ]', null);





INSERT INTO DXRADMIN.COMPANY_CATEGORY(COMPANY_CATEGORY_ID, CATEGORY_NAME, CATEGORY_CODE, CATEGORY_DESCRIPTION) VALUES ('companyCategoryNA', '00000', '00000', '00000');

INSERT INTO DXRADMIN.COMPANY_CATEGORY(COMPANY_CATEGORY_ID, CATEGORY_NAME, CATEGORY_CODE, CATEGORY_DESCRIPTION) VALUES ('1', 'Dumper', '1', 'We work as dumping station');

INSERT INTO DXRADMIN.COMPANY_CATEGORY(COMPANY_CATEGORY_ID, CATEGORY_NAME, CATEGORY_CODE, CATEGORY_DESCRIPTION) VALUES ('2', 'Processor', '2', 'We work for Processing');

INSERT INTO DXRADMIN.COMPANY_CATEGORY(COMPANY_CATEGORY_ID, CATEGORY_NAME, CATEGORY_CODE, CATEGORY_DESCRIPTION) VALUES ('3', 'Transporter', '3', 'We work for Transporting');



INSERT INTO DXRADMIN.SUBSCRIPTION_INFO(SUBSCRIPTION_INFO_ID, COMPANY_NAME, ADDRESS, CONTACT_NO, EMAIL, AGREED_TERMS, DATE_TIME, SUBSCRIPTION_STATUS, IS_HUMAN, IS_AGREE, SUBSCRIBER_NAME, SUBSCRIBER_MAIL, ZIP_CODE, SUBSCRIBER_PASSWORD, STATUS_ID) VALUES ('subscriptionInfoNA', '00000', '00000', '00000', '00000', '00000', '00000', 'subcriptionStatusNA', '00000', '00000', '00000', '00000', '8180011', '1000:778a48f795181156d1cbc043298f9915:797aacd887b273dfad0c8b707b46cadc18c2e978ffc624d2c654e6ee1d84451576278be519a34a1e1bbbb0dd6af853e0546c0999c002842867fab324bf004f97', 'statusInUse');


INSERT INTO DXRADMIN.SUBSCRIPTION_STATUS(SUBSCRIPTION_STATUS_ID, STATUS_TITLE, STATUS_CODE) VALUES ('subcriptionStatusNA', '00000', '00000');


INSERT INTO DXRADMIN.SUBSCRIPTION_COMPANY_CATAGORY( SUBSCRIPTION_INFO, COMPANY_CATEGORY_ID_LIST) VALUES ('subscriptionInfoNA', '');




INSERT INTO DXRADMIN.COMPANY_INFO(COMPANY_INFO_ID, COMPANY_NAME, COMPANY_ADDRESS, COMPANY_EMAIL, COMPANY_CONTACT, REPRESENTATIVE_NAME, REPRESENTATIVE_MAIL, COMPANY_FAX_NUMBER, CORPORATE_REG_NO, WASTE_PROCESSING_LICENCE_NO, WASTE_PROCESSING_LICENCE_BYTES, ACCOUNTANT_NAME, ACCOUNTANT_EMAIL, NOTIFICATION_ID, SUBSCRIPTION_ID, FRONTEND_DATE, BACKEND_DATE, ZIPCODE, REMARKS, COMPANY_SEAL) VALUES ('dxr00001', 'DX-R', '00000', '00000', '00000', '00000', '00000', '00000', '00000', '00000', null, '00000', '00000', 'notification0001', 'subscriptionInfoNA', '00000', '00000', '00000', '00000', null);




INSERT INTO DXRADMIN.COMPANY_TYPE_INFO(COMPANY_TYPE_INFO_ID, COMPANY_ID, COMPANY_CATEGORY_ID_LIST) VALUES ('cti001', 'dxr00001', '00000');





INSERT INTO DXRADMIN.DXR_ADMIN_ACCESS(DXR_ADMIN_ACCESS_ID, DXR_ADMIN_ACCESS, UPDATE_DATE) VALUES ('dxradminaccess0001', '[
            {
                "menuId": "menudefSystemAdmin",
                "menuTitleEng": "DXR Admin",
                "menuTitleJpn": "DXR 管理者",
                "menuUrl": "/system-admin",
                "parentSegment": "",
                "menuParent": "",
                "menuTypeId": "menutype0001",
                "companyCategoryId": "",
                "accessInfo": {
                    "accessDefId": "accessdefid0003",
                    "accessTitle": "View, Browse, Edit"
                },
                "child": []
            },
            {
                "menuId": "sysAdminSystemOverview",
                "menuTitleEng": "System Overview",
                "menuTitleJpn": "システム概要",
                "menuUrl": "system-overview-admin",
                "parentSegment": "/system-admin",
                "menuParent": "menudefSystemAdmin|",
                "menuTypeId": "menutype0002",
                "companyCategoryId": "",
                "accessInfo": {
                    "accessDefId": "accessdefid0003",
                    "accessTitle": "View, Browse, Edit"
                },
                "child": []
            },
            {
                "menuId": "sysAdminSubscription",
                "menuTitleEng": "Subscription",
                "menuTitleJpn": "利用申込",
                "menuUrl": "subscription-admin",
                "parentSegment": "/system-admin",
                "menuParent": "menudefSystemAdmin|",
                "menuTypeId": "menutype0002",
                "companyCategoryId": "",
                "accessInfo": {
                    "accessDefId": "accessdefid0003",
                    "accessTitle": "View, Browse, Edit"
                },
                "child": []
            },
            {
                "menuId": "sysAdminFaq",
                "menuTitleEng": "FAQ",
                "menuTitleJpn": "よくある質問",
                "menuUrl": "faq-admin",
                "parentSegment": "/system-admin",
                "menuParent": "menudefSystemAdmin|",
                "menuTypeId": "menutype0002",
                "companyCategoryId": "",
                "accessInfo": {
                    "accessDefId": "accessdefid0003",
                    "accessTitle": "View, Browse, Edit"
                },
                "child": []
            },
            {
                "menuId": "sysAdminInquiry",
                "menuTitleEng": "Inquiry",
                "menuTitleJpn": "問合せ",
                "menuUrl": "inquiry-admin",
                "parentSegment": "/system-admin",
                "menuParent": "menudefSystemAdmin|",
                "menuTypeId": "menutype0002",
                "companyCategoryId": "",
                "accessInfo": {
                    "accessDefId": "accessdefid0003",
                    "accessTitle": "View, Browse, Edit"
                },
                "child": []
            },
            {
                "menuId": "sysAdminRoleDef",
                "menuTitleEng": "Role Definition",
                "menuTitleJpn": "役割の定義",
                "menuUrl": "role-def-admin",
                "parentSegment": "/system-admin",
                "menuParent": "menudefSystemAdmin|",
                "menuTypeId": "menutype0002",
                "companyCategoryId": "",
                "accessInfo": {
                    "accessDefId": "accessdefid0003",
                    "accessTitle": "View, Browse, Edit"
                },
                "child": []
            },
            {
                "menuId": "sysAdminWasteDef",
                "menuTitleEng": "Waste Def",
                "menuTitleJpn": "Waste Def",
                "menuUrl": "waste-def-admin",
                "parentSegment": "/system-admin",
                "menuParent": "menudefSystemAdmin|",
                "menuTypeId": "menutype0002",
                "companyCategoryId": "",
                "accessInfo": {
                    "accessDefId": "accessdefid0003",
                    "accessTitle": "View, Browse, Edit"
                },
                "child": []
            },
            {
                "menuId": "sysAdminWasteRequest",
                "menuTitleEng": "Waste Request",
                "menuTitleJpn": "Waste Request",
                "menuUrl": "waste-request-admin",
                "parentSegment": "/system-admin",
                "menuParent": "menudefSystemAdmin|",
                "menuTypeId": "menutype0002",
                "companyCategoryId": "",
                "accessInfo": {
                    "accessDefId": "accessdefid0003",
                    "accessTitle": "View, Browse, Edit"
                },
                "child": []
            },
            {
                "menuId": "vehicleSetup",
                "menuTitleEng": "Vehicle Setup",
                "menuTitleJpn": "Vehicle Setup",
                "menuUrl": "vehicle-setup",
                "parentSegment": "/system-admin",
                "menuParent": "menudefSystemAdmin|",
                "menuTypeId": "menutype0002",
                "companyCategoryId": "",
                "accessInfo": {
                    "accessDefId": "accessdefid0003",
                    "accessTitle": "View, Browse, Edit"
                },
                "child": []
            }
        ]', null);




INSERT INTO DXRADMIN.GASOLINE_TYPE(GASOLINE_TYPE_ID, TITLE, MEASUREMENT_UNIT, CARBON_EMISSION_QUANTITY, FUEL_QUANTITY) VALUES ('gti0001', 'Petrol', 'Liter', 0.5, 1.0);

INSERT INTO DXRADMIN.GASOLINE_TYPE(GASOLINE_TYPE_ID, TITLE, MEASUREMENT_UNIT, CARBON_EMISSION_QUANTITY, FUEL_QUANTITY) VALUES ('gti0002', 'Disel', 'Liter', 0.6, 1.0);

INSERT INTO DXRADMIN.GASOLINE_TYPE(GASOLINE_TYPE_ID, TITLE, MEASUREMENT_UNIT, CARBON_EMISSION_QUANTITY, FUEL_QUANTITY) VALUES ('gti0003', 'Octen', 'Liter', 0.7, 1.0);




INSERT INTO DXRADMIN.INVOICE_PROCESS_DEF(INVOICE_PROCESS_DEF_ID, INVOICE_PROCESS_DEF) VALUES ('invoiceprocessdef0001', '[

        {
            "processId": "initialInvoiceProcess",
            "processTitleEng": "Send",
            "processTitleJpn": "Send",
            "initialStatus": [
                {
                    "statusId": "statusNewInvoice",
                    "statusTitleEng": "New",
                    "statusTitleJpn": "新規",
                    "operationDef": {
                        "operationId": "opInUse",
                        "operationTitleEng": "In Use",
                        "operationTitleJpn": "In Use"
                    }
                }
            ],
            "triggeringProcessIds": [],
            "creatorAccess": "none",
            "partyAccess": "view",
            "resultantStatusId": "statusWaitingForAccept",
            "isApprovalRequired": true,
            "processAction": [
                {
                    "actionId": "sendActionId",
                    "actionTitleEng": "Send",
                    "actionTitleJpn": "Send",
                    "initialStatus": [
                        "statusNewInvoice"
                    ],
                    "viewAcess": [
                        "party"
                    ],
                    "editAccess": [],
                    "agreementStatusId": "statusWaitingForAccept",
                    "isApproval": false
                }
            ],
            "viewMode": false
        },
        {
            "processId": "acceptProcess",
            "processTitleEng": "Payment",
            "processTitleJpn": "Payment",
            "initialStatus": [
                {
                    "statusId": "statusWaitingForAccept",
                    "statusTitleEng": "Waiting For Payment",
                    "statusTitleJpn": "Waiting For Payment",
                    "operationDef": {
                        "operationId": "opInUse",
                        "operationTitleEng": "In Use",
                        "operationTitleJpn": "In Use"
                    }
                }
            ],
            "triggeringProcessIds": [],
            "creatorAccess": "view",
            "partyAccess": "none",
            "resultantStatusId": "statusPaymentClear",
            "isApprovalRequired": true,
            "processAction": [
                {
                    "actionId": "acceptActionId",
                    "actionTitleEng": "Payment",
                    "actionTitleJpn": "Payment",
                    "initialStatus": [
                        "statusWaitingForAccept"
                    ],
                    "viewAcess": [
                        "creator"
                    ],
                    "editAccess": [],
                    "agreementStatusId": "statusPaymentClear",
                    "isApproval": false
                }
            ]
        },
        {
            "processId": "paymentClearProcess",
            "processTitleEng": "",
            "processTitleJpn": "",
            "initialStatus": [
                {
                    "statusId": "statusPaymentClear",
                    "statusTitleEng": "Payment Complated",
                    "statusTitleJpn": "Payment Complated",
                    "operationDef": {
                        "operationId": "opInUse",
                        "operationTitleEng": "In Use",
                        "operationTitleJpn": "In Use"
                    }
                }
            ],
            "triggeringProcessIds": [],
            "creatorAccess": "none",
            "partyAccess": "none",
            "resultantStatusId": "",
            "isApprovalRequired": true,
            "processAction": [
                {
                    "actionId": "",
                    "actionTitleEng": "",
                    "actionTitleJpn": "",
                    "initialStatus": [],
                    "viewAcess": [],
                    "editAccess": [],
                    "agreementStatusId": "",
                    "isApproval": false
                }
            ]
        }
    ]');




    

INSERT INTO DXRADMIN.MENU_CATEGORY(MENU_CATEGORY_ID, CODE, DESCRIPTION) VALUES ('menucat001', '#001', 'Company management');

INSERT INTO DXRADMIN.MENU_CATEGORY(MENU_CATEGORY_ID, CODE, DESCRIPTION) VALUES ('menucat002', '#002', 'Company Operations');




INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('menudef0001', 'Company Management', 'Company Management', 'company-admin/settings', '', '', 'menutype0001', 'menucat001');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('menudef00011', 'Company Settings', 'Company Settings', 'company-settings', '/company-admin/settings', 'menudef0001|', 'menutype0002', 'menucat001');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('menudef000111', 'Branch Info', 'Branch Info', 'branch-info', '/company-management', 'menudef0001|menudef00011|', 'menutype0002', 'menucat001');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('menudef000112', 'Vehicle Info', 'Vehicle Info', '/vehicle-info', '/company-management', 'menudef0001|menudef00011|', 'menutype0002', 'menucat001');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('menudef000113', 'Accountant Info', 'Accountant Info', '', '/company-management/settings', 'menudef0001|menudef00011|', 'menutype0002', 'menucat001');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('menudef000114', 'Bank Account Info', 'Bank Account Info', '', '/company-management/settings', 'menudef0001|menudef00011|', 'menutype0002', 'menucat001');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('menudef000115', 'Company Accountant Info', 'Company Accountant Info', '', '/company-management/settings', 'menudef0001|menudef00011|', 'menutype0002', 'menucat001');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('menudef00012', 'User Management', 'User Management', 'user-management', '/company-admin/settings', 'menudef0001|', 'menutype0002', 'menucat001');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('menudef000121', 'User List', 'User List', '', '/company-management/user-management', 'menudef0001|menudef00012|', 'menutype0002', 'menucat001');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('menudef000122', 'Define Role', 'Define Role', '', '/company-management/user-management', 'menudef0001|menudef00012|', 'menutype0002', 'menucat001');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('menudef0002', 'Company Operations', 'Company Operations', 'company-admin/project', '', '', 'menutype0001', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('menudefBusinessAgreement', 'Agreement', 'Agreement', 'business-agreement', '/company-admin/project', 'menudef0002|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('initiateProject', 'Initiate Project', 'Initiate Project', 'initiate-project', '/company-admin/project', 'menudef0002|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('projectScheduleMenu', 'Create Schedule', 'Create Schedule', 'create-schedule', '/company-admin/project', 'menudef0002|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('loadMenu', 'Load', 'Load', 'load', '', '', 'menutype0001', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('loadDashboardMenu', 'Dashboard', 'Dashboard', 'driver-dashboard', '/load', 'loadMenu|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('pickListMenu', 'Pick List', 'Pick List', 'driver-pick-list', '/load', 'loadMenu|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('wasteLoadMenu', 'Waste Load', 'Waste Load', 'driver-waste-load', '/load', 'loadMenu|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('tripScanMenu', 'Trip Scan', 'Trip Scan', 'dumper-trip-scan', '/load', 'loadMenu|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('wasteListMenu', 'Waste List', 'Waste List', 'dumper-scanned-waste', '/load', 'loadMenu|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('packageDefMenu', 'Package Def', 'Package Def', 'dumper-package-def', '/load', 'loadMenu|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('handoverMenu', 'Handover', 'Handover', 'dumper-handover', '/load', 'loadMenu|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('unloadMenu', 'Unload', 'Unload', 'unload', '', '', 'menutype0001', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('unloadDashboardMenu', 'Dashboard', 'Dashboard', 'driver-dashboard', '/unload', 'unloadMenu|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('handoverByDriverMenu', 'Handover', 'Handover', 'driver-handover', '/unload', 'unloadMenu|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('tripCompletionMenu', 'Trip Completion', 'Trip Completion', 'driver-trip-completion', '/unload', 'unloadMenu|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('tripInfoScanByProcessorMenu', 'Trip Info', 'Trip Info', 'processor-trip-scan', '/unload', 'unloadMenu|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('verificationMenu', 'Trip Verification', 'Trip Verification', 'processor-trip-verify', '/unload', 'unloadMenu|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('weightDeclarationMenu', 'Weight Declaration', 'Weight Declaration', 'processor-weight-dclr', '/unload', 'unloadMenu|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('wasteReceiveMenu', 'Waste Receive', 'Waste Receive', 'processor-waste-receive', '/unload', 'unloadMenu|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('menifestoMenu', 'Menifesto', 'Menifesto', 'menifesto', '/company-admin/project', 'menudef0002|', 'menutype0002', 'menucat002');

INSERT INTO DXRADMIN.MENU_DEF(MENU_ID, MENU_TITLE_ENG, MENU_TITLE_JPN, MENU_URL, PARENT_SEGMENT, PARENT_DEF, MENU_TYPE_ID, MENU_CATEGORY_ID) VALUES ('invoiceMenu', 'Invoice', 'Invoice', 'invoice', '/company-admin/project', 'menudef0002|', 'menutype0002', 'menucat002');




INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef0001', 'menudef0001', 'roleaccessdef00013|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef0002', 'menudef00012', 'roleaccessdef00012|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('2d281c13-f8df-4c23-9423-592c5e8027fb', 'menudef00011', 'roleaccessdef00013|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('be96eb92-36a5-4163-99ba-74506832e9d5', 'menudef0002', 'roleaccessdef00013|roleaccessdef00021|roleaccessdef00031|roleaccessdef00041|roleaccessdef00051|roleaccessdef00061|roleaccessdef00071|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('221e6846-a4c5-4f45-ad46-5c3f8f6c1942', 'menudef000111', 'roleaccessdef00012|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('b358a324-aa23-441a-b98b-0d0f10792f10', 'menudef000112', 'roleaccessdef00013|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('c35668ed-09af-43d4-ae59-97ba32fed758', 'menudef00023', 'roleaccessdef00051|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('22c6e1a5-e669-42cc-8244-9d18fbc61dc9', 'menudef000113', 'roleaccessdef00013|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('658cc837-0f23-4bc8-95b2-df80370ced76', 'menudefBusinessAgreement', 'roleaccessdef00013|roleaccessdef00023|roleaccessdef00033|roleaccessdef00043|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDefInitiateProject', 'initiateProject', 'roleaccessdef00013|roleaccessdef00023|roleaccessdef00033|roleaccessdef00043|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-projectScheduleMenu', 'projectScheduleMenu', 'roleaccessdef00013|roleaccessdef00023|roleaccessdef00033|roleaccessdef00043|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-loadMenu', 'loadMenu', 'roleaccessdef00053|roleaccessdef00023|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-loadDashboardMenu', 'loadDashboardMenu', 'roleaccessdef00053|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-pickListMenu', 'pickListMenu', 'roleaccessdef00053|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-wasteLoadMenu', 'wasteLoadMenu', 'roleaccessdef00053|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-tripScanMenu', 'tripScanMenu', 'roleaccessdef00023|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-wasteListMenu', 'wasteListMenu', 'roleaccessdef00023|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-packageDefMenu', 'packageDefMenu', 'roleaccessdef00023|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-handoverMenu', 'handoverMenu', 'roleaccessdef00023|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-unloadMenu', 'unloadMenu', 'roleaccessdef00053|roleaccessdef00063|roleaccessdef00083|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-unloadDashboardMenu', 'unloadDashboardMenu', 'roleaccessdef00053|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-handoverByDriverMenu', 'handoverByDriverMenu', 'roleaccessdef00053|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-tripCompletionMenu', 'tripCompletionMenu', 'roleaccessdef00053|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-tripInfoScanByProcessorMenu', 'tripInfoScanByProcessorMenu', 'roleaccessdef00063|roleaccessdef00083|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-verificationMenu', 'verificationMenu', 'roleaccessdef00063|roleaccessdef00083|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-weightDeclarationMenu', 'weightDeclarationMenu', 'roleaccessdef00063|roleaccessdef00083|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-wasteReceiveMenu', 'wasteReceiveMenu', 'roleaccessdef00063|roleaccessdef00083|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-menifestoMenu', 'menifestoMenu', 'roleaccessdef00013|roleaccessdef00023|roleaccessdef00033|roleaccessdef00043|');

INSERT INTO DXRADMIN.MENU_ROLE_DEF(MENU_ROLE_DEF_ID, MENU_ID, ROLE_DEF_LIST) VALUES ('menuRoleDef-invoiceMenu', 'invoiceMenu', 'roleaccessdef00013|roleaccessdef00023|roleaccessdef00033|roleaccessdef00043|');






INSERT INTO DXRADMIN.MENU_TYPE(MENU_TYPE_ID, MENU_TYPE_TITLE, MENU_TYPE_CODE, MENU_TYPE_DESCRIPTION) VALUES ('menutype0001', 'Primary Menu', 'menu#0001', 'Primary Menu');

INSERT INTO DXRADMIN.MENU_TYPE(MENU_TYPE_ID, MENU_TYPE_TITLE, MENU_TYPE_CODE, MENU_TYPE_DESCRIPTION) VALUES ('menutype0002', 'Secondary Menu', 'menu#0002', 'Secondary Menu');





INSERT INTO DXRADMIN.NOTIFICATION(NOTIFICATION_ID, NOTIFICATION_STATE, NOTIFICATION_CODE) VALUES ('notification0001', '0', 'N001');

INSERT INTO DXRADMIN.NOTIFICATION(NOTIFICATION_ID, NOTIFICATION_STATE, NOTIFICATION_CODE) VALUES ('notification0002', '1', 'N002');






INSERT INTO DXRADMIN.OPERATION_TYPE(OPERATION_TYPE_ID, CODE, OPERATION_TITLE) VALUES ('emimissionTypeId001', '#0001', 'Dumper Operation');

INSERT INTO DXRADMIN.OPERATION_TYPE(OPERATION_TYPE_ID, CODE, OPERATION_TITLE) VALUES ('emimissionTypeId002', '#0002', 'Processing Operation');





INSERT INTO DXRADMIN.PROJECT_PROCESS_DEF(PROJECT_PROCESS_DEF_ID, PROJECT_PROCESS_DEF) VALUES ('projectProcessdef0001', '[
    {
        "processId": "initialCreateProcess",
        "processTitleEng": "Create",
        "processTitleJpn": "Create",
        "initialStatus": [],
        "triggeringProcessIds": [],
        "creatorAccess": "edit",
        "partyAccess": "view",
        "resultantStatusId": "statusNewProject",
        "isApprovalRequired": true,
        "processAction": [
            {
                "actionId": "saveActionId",
                "actionTitleEng": "Save",
                "actionTitleJpn": "Save",
                "initialStatus": [],
                "viewAcess": [
                    "party"
                ],
                "editAccess": [
                    "creator"
                ],
                "agreementStatusId": "statusNewProject",
                "isApproval": false
            }
        ],
        "viewMode": false
    },
    {
        "processId": "editProcess",
        "processTitleEng": "Edit",
        "processTitleJpn": "編集する",
        "initialStatus": [
            {
                "statusId": "statusNewProject",
                "statusTitleEng": "New",
                "statusTitleJpn": "新規",
                "operationDef": {
                    "operationId": "opInUse",
                    "operationTitleEng": "In Use",
                    "operationTitleJpn": "In Use"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "edit",
        "partyAccess": "none",
        "resultantStatusId": "statusNewProject",
        "isApprovalRequired": true,
        "processAction": [
            {
                "actionId": "saveActionId",
                "actionTitleEng": "Update",
                "actionTitleJpn": "Update",
                "initialStatus": [
                    "statusNewProject"
                ],
                "viewAcess": [],
                "editAccess": [
                    "creator"
                ],
                "agreementStatusId": "statusNewProject",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "sendForApprovalProcess",
        "processTitleEng": "Send for Approval",
        "processTitleJpn": "送信する",
        "initialStatus": [
            {
                "statusId": "statusNewProject",
                "statusTitleEng": "New",
                "statusTitleJpn": "新規",
                "operationDef": {
                    "operationId": "opInUse",
                    "operationTitleEng": "In Use",
                    "operationTitleJpn": "In Use"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "view",
        "partyAccess": "none",
        "resultantStatusId": "statusWaitingForAproval",
        "isApprovalRequired": true,
        "processAction": [
            {
                "actionId": "sendForApprovalActionId",
                "actionTitleEng": "Send",
                "actionTitleJpn": "承認用に送信する",
                "initialStatusId": [
                    "statusNewProject"
                ],
                "viewAcess": [
                    "creator"
                ],
                "editAccess": [],
                "agreementStatusId": "statusWaitingForAproval",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "approvalProcess",
        "processTitleEng": "Approve",
        "processTitleJpn": "承認する",
        "initialStatus": [
            {
                "statusId": "statusWaitingForAproval",
                "statusTitleEng": "New Project Waiting for Approval",
                "statusTitleJpn": "New Project Waiting for Approval",
                "operationDef": {
                    "operationId": "opInUse",
                    "operationTitleEng": "In Use",
                    "operationTitleJpn": "In Use"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "none",
        "partyAccess": "view",
        "resultantStatusId": "statusApproved",
        "isApprovalRequired": true,
        "processAction": [
            {
                "actionId": "approveActionId",
                "actionTitleEng": "Approve",
                "actionTitleJpn": "承認する",
                "initialStatus": [
                    "statusWaitingForAproval"
                ],
                "viewAcess": [
                    "party"
                ],
                "editAccess": [],
                "agreementStatusId": "statusApproved",
                "isApproval": true
            }
        ]
    },
    {
        "processId": "activateNewProjectProcess",
        "processTitleEng": "Activate",
        "processTitleJpn": "契約書をアクティブにする",
        "initialStatus": [
            {
                "statusId": "statusApproved",
                "statusTitleEng": "Approved",
                "statusTitleJpn": "承認済み",
                "operationDef": {
                    "operationId": "opInUse",
                    "operationTitleEng": "In Use",
                    "operationTitleJpn": "In Use"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "view",
        "partyAccess": "none",
        "resultantStatusId": "statusProjectInUse",
        "isApprovalRequired": true,
        "processAction": [
            {
                "actionId": "activateActionId",
                "actionTitleEng": "Confirm Activation",
                "actionTitleJpn": "契約書をアクティブにする",
                "initialStatus": [
                    "statusApproved"
                ],
                "viewAcess": [
                    "creator"
                ],
                "editAccess": [],
                "agreementStatusId": "statusProjectInUse",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "agreementTerminationProcess",
        "processTitleEng": "Terminate",
        "processTitleJpn": "Terminate",
        "initialStatus": [
            {
                "statusId": "statusProjectInUse",
                "statusTitleEng": "Project in Use",
                "statusTitleJpn": "Project in Use",
                "operationDef": {
                    "operationId": "opInUse",
                    "operationTitleEng": "In Use",
                    "operationTitleJpn": "In Use"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "view",
        "partyAccess": "none",
        "resultantStatusId": "statusTerminationReadyForSend",
        "isApprovalRequired": true,
        "processAction": [
            {
                "actionId": "cancelAgreementActionId",
                "actionTitleEng": "Confirm Terminate",
                "actionTitleJpn": "Confirm Terminate",
                "initialStatus": [
                    "statusProjectInUse"
                ],
                "viewAcess": [
                    "creator"
                ],
                "editAccess": [],
                "agreementStatusId": "statusTerminationReadyForSend",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "projectTerminationSendProcess",
        "processTitleEng": "Send Termination Request",
        "processTitleJpn": "Send Termination Request",
        "initialStatus": [
            {
                "statusId": "statusTerminationReadyForSend",
                "statusTitleEng": "Termination Ready For Send",
                "statusTitleJpn": "Termination Ready For Send",
                "operationDef": {
                    "operationId": "opTermination",
                    "operationTitleEng": "Termination",
                    "operationTitleJpn": "Termination"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "view",
        "partyAccess": "none",
        "resultantStatusId": "statusTerminationReadyForApprove",
        "isApprovalRequired": true,
        "processAction": [
            {
                "actionId": "sendTerminationActionId",
                "actionTitleEng": "Send",
                "actionTitleJpn": "Send",
                "initialStatus": [
                    "statusTerminationReadyForSend"
                ],
                "viewAcess": [
                    "party"
                ],
                "editAccess": [],
                "agreementStatusId": "statusTerminationReadyForApprove",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "projectTerminationApproveProcess",
        "processTitleEng": "Approve Termination",
        "processTitleJpn": "Approve Termination",
        "initialStatus": [
            {
                "statusId": "statusTerminationReadyForApprove",
                "statusTitleEng": "Termination Waiting For Approval",
                "statusTitleJpn": "Termination Waiting For Approval",
                "operationDef": {
                    "operationId": "opTermination",
                    "operationTitleEng": "Termination",
                    "operationTitleJpn": "Termination"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "none",
        "partyAccess": "view",
        "resultantStatusId": "statusProjectReadyForTermination",
        "isApprovalRequired": true,
        "processAction": [
            {
                "actionId": "approveCancelationActionId",
                "actionTitleEng": "Approve Termination",
                "actionTitleJpn": "Approve Termination",
                "initialStatus": [
                    "statusTerminationReadyForApprove"
                ],
                "viewAcess": [
                    "creator"
                ],
                "editAccess": [],
                "agreementStatusId": "statusProjectReadyForTermination",
                "isApproval": true
            }
        ]
    },
    {
        "processId": "projectTerminationConfirmProcess",
        "processTitleEng": "Activate Termination",
        "processTitleJpn": "Activate Termination",
        "initialStatus": [
            {
                "statusId": "statusProjectReadyForTermination",
                "statusTitleEng": "Project Ready for Termination",
                "statusTitleJpn": "Project Ready for Termination",
                "operationDef": {
                    "operationId": "opTermination",
                    "operationTitleEng": "Termination",
                    "operationTitleJpn": "Termination"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "view",
        "partyAccess": "none",
        "resultantStatusId": "statusProjectTerminated",
        "isApprovalRequired": true,
        "processAction": [
            {
                "actionId": "activateTerminationActionId",
                "actionTitleEng": "Activate Termination",
                "actionTitleJpn": "Activate Termination",
                "initialStatus": [
                    "statusProjectReadyForTermination"
                ],
                "viewAcess": [
                    "creator"
                ],
                "editAccess": [],
                "agreementStatusId": "statusProjectTerminated",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "",
        "processTitleEng": "",
        "processTitleJpn": "",
        "initialStatus": [
            {
                "statusId": "statusProjectTerminated",
                "statusTitleEng": "Terminated",
                "statusTitleJpn": "Terminated",
                "operationDef": {
                    "operationId": "opTermination",
                    "operationTitleEng": "Termination",
                    "operationTitleJpn": "Termination"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "none",
        "partyAccess": "none",
        "resultantStatusId": "",
        "isApprovalRequired": true,
        "processAction": []
    },
    {
        "processId": "projectCompletionSendProcess",
        "processTitleEng": "Send Completion Request",
        "processTitleJpn": "Send Completion Request",
        "initialStatus": [
            {
                "statusId": "statusProjectInUse",
                "statusTitleEng": "Project in Use",
                "statusTitleJpn": "Project in Use",
                "operationDef": {
                    "operationId": "opInUse",
                    "operationTitleEng": "In Use",
                    "operationTitleJpn": "In Use"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "view",
        "partyAccess": "none",
        "resultantStatusId": "statusCompletionWaitingForApproval",
        "isApprovalRequired": true,
        "processAction": [
            {
                "actionId": "sendCompletionActionId",
                "actionTitleEng": "Send",
                "actionTitleJpn": "Send",
                "initialStatus": [
                    "statusProjectInUse"
                ],
                "viewAcess": [
                    "creator"
                ],
                "editAccess": [],
                "agreementStatusId": "statusCompletionWaitingForApproval",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "projectCompletionApproveProcess",
        "processTitleEng": "Approve Completion",
        "processTitleJpn": "Approve Completion",
        "initialStatus": [
            {
                "statusId": "statusCompletionWaitingForApproval",
                "statusTitleEng": "Completion Waiting For Approval",
                "statusTitleJpn": "Completion Waiting For Approval",
                "operationDef": {
                    "operationId": "opCompletion",
                    "operationTitleEng": "Completion",
                    "operationTitleJpn": "Completion"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "none",
        "partyAccess": "view",
        "resultantStatusId": "statusProjectReadyForCompletion",
        "isApprovalRequired": true,
        "processAction": [
            {
                "actionId": "approveCompletionActionId",
                "actionTitleEng": "Approve Completion",
                "actionTitleJpn": "Approve Completion",
                "initialStatus": [
                    "statusCompletionWaitingForApproval"
                ],
                "viewAcess": [
                    "party"
                ],
                "editAccess": [],
                "agreementStatusId": "statusProjectReadyForCompletion",
                "isApproval": true
            }
        ]
    },
    {
        "processId": "projectCompletionActivationProcess",
        "processTitleEng": "Confirm Completion",
        "processTitleJpn": "Confirm Completion",
        "initialStatus": [
            {
                "statusId": "statusProjectReadyForCompletion",
                "statusTitleEng": "Project Ready for Completion",
                "statusTitleJpn": "Project Ready for Completion",
                "operationDef": {
                    "operationId": "opCompletion",
                    "operationTitleEng": "Completion",
                    "operationTitleJpn": "Completion"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "view",
        "partyAccess": "none",
        "resultantStatusId": "statusProjectCompleted",
        "isApprovalRequired": true,
        "processAction": [
            {
                "actionId": "confirmCompletionActionId",
                "actionTitleEng": "Confirm Completion",
                "actionTitleJpn": "Confirm Completion",
                "initialStatus": [
                    "statusProjectReadyForCompletion"
                ],
                "viewAcess": [
                    "creator"
                ],
                "editAccess": [],
                "agreementStatusId": "statusProjectCompleted",
                "isApproval": false
            }
        ]
    },
    {
        "processId": "",
        "processTitleEng": "",
        "processTitleJpn": "",
        "initialStatus": [
            {
                "statusId": "statusProjectCompleted",
                "statusTitleEng": "Project Completed",
                "statusTitleJpn": "Project Completed",
                "operationDef": {
                    "operationId": "opCompletion",
                    "operationTitleEng": "Completion",
                    "operationTitleJpn": "Completion"
                }
            }
        ],
        "triggeringProcessIds": [],
        "creatorAccess": "none",
        "partyAccess": "none",
        "resultantStatusId": "",
        "isApprovalRequired": true,
        "processAction": []
    }
]');





INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00011', 'roledef0001', 'access0001');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00012', 'roledef0001', 'access0002');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00013', 'roledef0001', 'access0003');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00021', 'roledef0002', 'access0001');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00022', 'roledef0002', 'access0002');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00023', 'roledef0002', 'access0003');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00031', 'roledef0003', 'access0001');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00032', 'roledef0003', 'access0002');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00033', 'roledef0003', 'access0003');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00041', 'roledef0004', 'access0001');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00042', 'roledef0004', 'access0002');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00043', 'roledef0004', 'access0003');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00051', 'roledef0005', 'access0001');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00052', 'roledef0005', 'access0002');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00053', 'roledef0005', 'access0003');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00061', 'roledef0006', 'access0001');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00062', 'roledef0006', 'access0002');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00063', 'roledef0006', 'access0003');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00071', 'roledef0007', 'access0001');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00072', 'roledef0007', 'access0002');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00073', 'roledef0007', 'access0003');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00081', 'roledef0008', 'access0001');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00082', 'roledef0008', 'access0002');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00083', 'roledef0008', 'access0003');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00091', 'roledef0009', 'access0001');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00092', 'roledef0009', 'access0002');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef00093', 'roledef0009', 'access0003');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef000101', 'roledef0010', 'access0001');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef000102', 'roledef0010', 'access0002');

INSERT INTO DXRADMIN.ROLE_ACCESS_DEF(ROLE_ACCESS_DEF_ID, ROLE_ID, ACCESS_DEF_ID) VALUES ('roleaccessdef000103', 'roledef0010', 'access0003');





INSERT INTO DXRADMIN.ROLE_DEF(ROLE_DEF_ID, ROLE_NAME, ROLE_CODE, ROLE_DESCRIPTION, COMPANY_CATEGORY_ID) VALUES ('roledef0001', 'Company Admin', 'Role#0001', 'Admin', '1');

INSERT INTO DXRADMIN.ROLE_DEF(ROLE_DEF_ID, ROLE_NAME, ROLE_CODE, ROLE_DESCRIPTION, COMPANY_CATEGORY_ID) VALUES ('roledef0002', 'Person In charge (Dumper)', 'Role#0002', 'Dumper Person In charge', '1');

INSERT INTO DXRADMIN.ROLE_DEF(ROLE_DEF_ID, ROLE_NAME, ROLE_CODE, ROLE_DESCRIPTION, COMPANY_CATEGORY_ID) VALUES ('roledef0003', 'Person In charge (Transporter)', 'Role#0003', 'Transporter Person In charge', '1');

INSERT INTO DXRADMIN.ROLE_DEF(ROLE_DEF_ID, ROLE_NAME, ROLE_CODE, ROLE_DESCRIPTION, COMPANY_CATEGORY_ID) VALUES ('roledef0004', 'Person In charge (Processor)', 'Role#0004', 'Processor Person In charge', '1');

INSERT INTO DXRADMIN.ROLE_DEF(ROLE_DEF_ID, ROLE_NAME, ROLE_CODE, ROLE_DESCRIPTION, COMPANY_CATEGORY_ID) VALUES ('roledef0005', 'Driver', 'Role#0005', 'Driver', '1');

INSERT INTO DXRADMIN.ROLE_DEF(ROLE_DEF_ID, ROLE_NAME, ROLE_CODE, ROLE_DESCRIPTION, COMPANY_CATEGORY_ID) VALUES ('roledef0006', 'Reception Manager (Processor)', 'Role#0006', 'Reception Manager', '1');

INSERT INTO DXRADMIN.ROLE_DEF(ROLE_DEF_ID, ROLE_NAME, ROLE_CODE, ROLE_DESCRIPTION, COMPANY_CATEGORY_ID) VALUES ('roledef0007', 'Company Accountant', 'Role#0007', 'Accountant', '1');

INSERT INTO DXRADMIN.ROLE_DEF(ROLE_DEF_ID, ROLE_NAME, ROLE_CODE, ROLE_DESCRIPTION, COMPANY_CATEGORY_ID) VALUES ('roledef0008', 'Receiving Manager (Processor)', 'Role#0010', 'Receiving Manager', '1');

INSERT INTO DXRADMIN.ROLE_DEF(ROLE_DEF_ID, ROLE_NAME, ROLE_CODE, ROLE_DESCRIPTION, COMPANY_CATEGORY_ID) VALUES ('roledef0009', 'Temporary User', 'Role#0009', 'Temporary User', '1');

INSERT INTO DXRADMIN.ROLE_DEF(ROLE_DEF_ID, ROLE_NAME, ROLE_CODE, ROLE_DESCRIPTION, COMPANY_CATEGORY_ID) VALUES ('roledef0010', 'Reference User', 'Role#0008', 'Reference User', '1');






INSERT INTO DXRADMIN.ROLE_MENU(ROLE_MENU_ID, ROLE_DEF_ID, MENU_ID_LIST) VALUES ('6c731914-43ea-42f9-9537-5a955baca74c', 'roledef0001', 'menudef0001|menudef00011|menudef000111|menudef000112|menudef000113|menudef00012|menudef0002|menudefBusinessAgreement|initiateProject|projectScheduleMenu|menifestoMenu|invoiceMenu|');

INSERT INTO DXRADMIN.ROLE_MENU(ROLE_MENU_ID, ROLE_DEF_ID, MENU_ID_LIST) VALUES ('7ee010b5-2ab8-4dcd-bd00-a87e2c552890', 'roledef0002', 'menudef0002|menudefBusinessAgreement|initiateProject|projectScheduleMenu|menifestoMenu|invoiceMenu|loadMenu|tripScanMenu|wasteListMenu|packageDefMenu|handoverMenu|');

INSERT INTO DXRADMIN.ROLE_MENU(ROLE_MENU_ID, ROLE_DEF_ID, MENU_ID_LIST) VALUES ('44a66923-958b-4867-af06-4a16d22800b6', 'roledef0003', 'menudef0002|menudefBusinessAgreement|initiateProject|projectScheduleMenu|menifestoMenu|invoiceMenu|');

INSERT INTO DXRADMIN.ROLE_MENU(ROLE_MENU_ID, ROLE_DEF_ID, MENU_ID_LIST) VALUES ('d4a3dd86-0ba7-480e-a188-be56cdb1455c', 'roledef0004', 'menudef0002|menudefBusinessAgreement|initiateProject|projectScheduleMenu|menifestoMenu|invoiceMenu|');

INSERT INTO DXRADMIN.ROLE_MENU(ROLE_MENU_ID, ROLE_DEF_ID, MENU_ID_LIST) VALUES ('e976dbe5-7bbd-4fdb-9a6f-869f3424c1c9', 'roledef0005', 'menudef0002|loadMenu|loadDashboardMenu|pickListMenu|wasteLoadMenu|unloadMenu|unloadDashboardMenu|handoverByDriverMenu|tripCompletionMenu|');

INSERT INTO DXRADMIN.ROLE_MENU(ROLE_MENU_ID, ROLE_DEF_ID, MENU_ID_LIST) VALUES ('aff7dce8-838c-4448-9692-dee07f5bd4d2', 'roledef0006', 'menudef0002|unloadMenu|tripInfoScanByProcessorMenu|verificationMenu|weightDeclarationMenu|wasteReceiveMenu|');

INSERT INTO DXRADMIN.ROLE_MENU(ROLE_MENU_ID, ROLE_DEF_ID, MENU_ID_LIST) VALUES ('d3d08734-701d-4696-a50d-1e6a092221f9', 'roledef0007', 'menudef0002|');

INSERT INTO DXRADMIN.ROLE_MENU(ROLE_MENU_ID, ROLE_DEF_ID, MENU_ID_LIST) VALUES ('66597fb0-b8c2-4075-8b8a-384b6f6be36a', 'roledef0008', 'unloadMenu|tripInfoScanByProcessorMenu|verificationMenu|weightDeclarationMenu|wasteReceiveMenu|');

INSERT INTO DXRADMIN.ROLE_MENU(ROLE_MENU_ID, ROLE_DEF_ID, MENU_ID_LIST) VALUES ('ef510ca8-82b8-4a36-8656-38e2cdd1d7d9', 'roledef0009', '');

INSERT INTO DXRADMIN.ROLE_MENU(ROLE_MENU_ID, ROLE_DEF_ID, MENU_ID_LIST) VALUES ('749025e2-43c8-46a7-9b7c-077c20f023d3', 'roledef0010', '');






INSERT INTO DXRADMIN.STATIC_PAGE(STATIC_PAGE_ID, BACKEND_DATE, FRONTEND_DATE, STATIC_CONTENT_BYTES) VALUES ('staticcontent0001', '20220227164244', '20220227164244', cast(X'e5b08ee585a5e4ba8be4be8be4b880e8a6a73c62723ee383bbe5b08ee585a5e58ab9e69e9c3c62723ee38388e383a9e382a4e382a2e383abe381aee7b590e69e9ce38081e382a2e383b3e382b1e383bce38388e381aae381a9e381abe38288e3828ae5b08ee585a5e58ab9e69e9ce38292e382b0e383a9e38395e381a7e8a1a8e7a4ba3c62723e3c62723e3c62723ee383bbe5b08ee585a5e4bc9ae7a4be3c62723ee5b08ee585a5e381abe38288e3828be58ab9e69e9cefbc88e4b880e79baee381a7e3828fe3818be3828befbc893c62723ee382afe383aae38383e382afe381a7e8a9b3e7b4b0e381abe9a39be381b6efbc88e3839ae383bce382b8e4b88be983a8e5b08ee585a5e4ba8be4be8be8a9b3e7b4b0efbc893c62723e3c62723e3c62723ee383bbe5b08ee585a5e4ba8be4be8be8a9b3e7b4b03c62723ee4bc9ae7a4bee5908de38081e5b08ee585a5e58ab9e69e9ce38081e8a9b3e7b4b0efbc88e382a4e383b3e382bfe38393e383a5e383bce381aae381a9efbc893c62723e' as BLOB));

INSERT INTO DXRADMIN.STATIC_PAGE(STATIC_PAGE_ID, BACKEND_DATE, FRONTEND_DATE, STATIC_CONTENT_BYTES) VALUES ('staticcontent0002', '20220227164244', '20220227164244', cast(X'e4bdbfe794a8e696b9e6b3953c62723e3c62723ee383bbe587bae69da5e3828be4ba8be38292e8a1a8e7a4ba3c62723ee5bb83e6a384e789a9e381aee4be9de9a0bc3c62723ee5bb83e6a384e789a9e381aee9818be690ace382b9e382b1e382b8e383a5e383bce383ab3c62723ee5bb83e6a384e789a9e381aee587a6e58886e799bbe98cb2e383bbe8ab8be6b1823c62723e' as BLOB));

INSERT INTO DXRADMIN.STATIC_PAGE(STATIC_PAGE_ID, BACKEND_DATE, FRONTEND_DATE, STATIC_CONTENT_BYTES) VALUES ('staticcontent0003', '20220227164244', '20220227164244', cast(X'496e74726f64756374696f6e20466c6f7720636f6f6e74656e74' as BLOB));

INSERT INTO DXRADMIN.STATIC_PAGE(STATIC_PAGE_ID, BACKEND_DATE, FRONTEND_DATE, STATIC_CONTENT_BYTES) VALUES ('staticcontent0004', '20220227164244', '20220227164244', cast(X'3c696d67207372633d22646174613a696d6167652f706e673b6261736536342c6956424f5277304b47676f414141414e53556845556741414141554141414146434159414141434e6279626c4141414148456c4551565149313250342f2f382f773338474941584449424b4530444878676c6a4e4241414f3954584c3059344f487741414141424a52553545726b4a6767673d3d2220616c743d2250696e656170706c6522207374796c653d2277696474683a31373070783b6865696768743a31373070783b666c6f61743a206c6566743b2070616464696e673a203070782031307078203130707820313070783b223ee38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be380823c2f703e3c6834207374796c653d2270616464696e673a2032307078203070782030707820313070783b223ee5afbee8b1a1e4ba8be6a5ade880853c2f68343e3c70207374796c653d22746578742d616c69676e3a206a7573746966793b70616464696e673a20313070783b223e3c696d67207372633d22646174613a696d6167652f706e673b6261736536342c6956424f5277304b47676f414141414e53556845556741414141554141414146434159414141434e6279626c4141414148456c4551565149313250342f2f382f773338474941584449424b4530444878676c6a4e4241414f3954584c3059344f487741414141424a52553545726b4a6767673d3d2220616c743d2250696e656170706c6522207374796c653d2277696474683a31373070783b6865696768743a31373070783b666c6f61743a2072696768743b2070616464696e673a203070782031307078203130707820313070783b223ee38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be380823c2f703e3c6834207374796c653d2270616464696e673a2032307078203070782030707820313070783b223ee5afbee8b1a1e4ba8be6a5ade880853c2f68343e3c70207374796c653d22746578742d616c69676e3a206a7573746966793b70616464696e673a20313070783b223e' as BLOB));

INSERT INTO DXRADMIN.STATIC_PAGE(STATIC_PAGE_ID, BACKEND_DATE, FRONTEND_DATE, STATIC_CONTENT_BYTES) VALUES ('staticcontent0005', '20220227164244', '20220227164244', cast(X'3c6832207374796c653d2270616464696e673a3230707820307078203070782032307078223e44756d6d7920416e642044756d6d7920436f6e74656e743c2f68323e' as BLOB));

INSERT INTO DXRADMIN.STATIC_PAGE(STATIC_PAGE_ID, BACKEND_DATE, FRONTEND_DATE, STATIC_CONTENT_BYTES) VALUES ('staticcontent0006', '20220227164244', '20220227164244', cast(X'3c696d67207372633d22646174613a696d6167652f706e673b6261736536342c6956424f5277304b47676f414141414e53556845556741414141554141414146434159414141434e6279626c4141414148456c4551565149313250342f2f382f773338474941584449424b4530444878676c6a4e4241414f3954584c3059344f487741414141424a52553545726b4a6767673d3d2220616c743d2250696e656170706c6522207374796c653d2277696474683a31373070783b6865696768743a31373070783b666c6f61743a206c6566743b2070616464696e673a203070782031307078203130707820313070783b223ee38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be380823c2f703e3c6834207374796c653d2270616464696e673a2032307078203070782030707820313070783b223ee5afbee8b1a1e4ba8be6a5ade880853c2f68343e3c70207374796c653d22746578742d616c69676e3a206a7573746966793b70616464696e673a20313070783b223e3c696d67207372633d22646174613a696d6167652f706e673b6261736536342c6956424f5277304b47676f414141414e53556845556741414141554141414146434159414141434e6279626c4141414148456c4551565149313250342f2f382f773338474941584449424b4530444878676c6a4e4241414f3954584c3059344f487741414141424a52553545726b4a6767673d3d2220616c743d2250696e656170706c6522207374796c653d2277696474683a31373070783b6865696768743a31373070783b666c6f61743a2072696768743b2070616464696e673a203070782031307078203130707820313070783b223ee38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be38082e38184e38184e3818be38289e38195e381a3e3818de79b97e381a3e3819fe383a2e3838ee38292e38081e382abe38390e383b3e381aee4b8ade3818be38289e587bae38197e381aae38195e38184e38082e38184e38184e8aa95e7949fe697a5e38292e8bf8ee38188e38289e3828ce381bee38199e38288e38186e381abe38082e38193e3828ce3818ce68ea2e38197e381a6e38184e3819fe38282e381aee381a0e3808de381a8e5bdbce381afe58fabe38293e381a0e3808220e382a4e383b3e38381e382ade381aae382bbe383bce383abe382b9e3839ee383b3e381abe381a0e381bee38195e3828ce381a6e38081e5bdb9e7ab8be3819fe3819ae381aee6a99fe6a2b0e38292e8b2b7e3828fe38195e3828ce3819fe381a8e382b8e383a7e383b3e381afe4b8bbe5bcb5e38197e3819fe38082e697a5e69cace4babae381aae38289e3819de38293e381aae38193e381a8e381afe38191e381a3e38197e381a6e38197e381aae38184e381a7e38197e38287e38186e38082efbc91efbc90efbc90e4b887e4babae381aee4babae38085e3818ce3819de381aee688a6e4ba89e381a7e591bde38292e890bde381a8e38197e3819fe38082e9a99ae3818be381aae38184e68980e38292e381bfe3828be381a8e79fa5e381a3e381a6e3819fe381aee381ade38082e38184e381bee381bee381a7e8aab0e38282e3819de381aee5b1b1e9a082e381abe588b0e98194e381a7e3818de381a6e38184e381aae38184e3808220e882a9e685a3e38289e38197e381abe381afe4b881e5baa6e38184e38184e3818be38282e3808220e99ba8e3818ce9998de381a3e381a6e38184e3828be380823c2f703e3c6834207374796c653d2270616464696e673a2032307078203070782030707820313070783b223ee5afbee8b1a1e4ba8be6a5ade880853c2f68343e3c70207374796c653d22746578742d616c69676e3a206a7573746966793b70616464696e673a20313070783b223e' as BLOB));

INSERT INTO DXRADMIN.STATIC_PAGE(STATIC_PAGE_ID, BACKEND_DATE, FRONTEND_DATE, STATIC_CONTENT_BYTES) VALUES ('staticcontent0007', '20220227164244', '20220227164244', cast(X'647366736668733b6b66683b6b736864666b61736a68666b3b61736a66683b616b736a6866733b616b626466' as BLOB));





INSERT INTO DXRADMIN.SUBSCRIPTION_PROCESS_DEF(SUBSCRIPTION_PROCESS_DEF_ID, SUBSCRIPTION_PROCESS_DEF) VALUES ('subscriptionProcessdef0001', '[

        {
            "processId": "acceptProcess",
            "processTitleEng": "Accept",
            "processTitleJpn": "Accept",
            "initialStatus": [
                {
                    "statusId": "statusWaitingForConfirmation",
                    "statusTitleEng": "Waiting For Confirmation",
                    "statusTitleJpn": "Waiting For Confirmation",
                    "operationDef": {
                        "operationId": "opInUse",
                        "operationTitleEng": "In Use",
                        "operationTitleJpn": "In Use"
                    }
                },
                {
                    "statusId": "statusTemporaryUse",
                    "statusTitleEng": "Temporary Use",
                    "statusTitleJpn": "Temporary Use",
                    "operationDef": {
                        "operationId": "opInUse",
                        "operationTitleEng": "In Use",
                        "operationTitleJpn": "In Use"
                    }
                }
            ],
            "triggeringProcessIds": [],
            "creatorAccess": "view",
            "partyAccess": "view",
            "resultantStatusId": "statusInUse",
            "isApprovalRequired": true,
            "processAction": [
                {
                    "actionId": "acceptActionId",
                    "actionTitleEng": "Accept",
                    "actionTitleJpn": "Accept",
                    "initialStatus": [
                        "statusWaitingForConfirmation",
                        "statusTemporaryUse"
                    ],
                    "viewAcess": [
                        "party"
                    ],
                    "editAccess": [],
                    "agreementStatusId": "statusInUse",
                    "isApproval": false
                }
            ]
        },
        {
            "processId": "suspendProcess",
            "processTitleEng": "Suspend",
            "processTitleJpn": "Suspend",
            "initialStatus": [
                {
                    "statusId": "statusInUse",
                    "statusTitleEng": "In Use",
                    "statusTitleJpn": "In Use",
                    "operationDef": {
                        "operationId": "opInUse",
                        "operationTitleEng": "In Use",
                        "operationTitleJpn": "In Use"
                    }
                }
            ],
            "triggeringProcessIds": [],
            "creatorAccess": "view",
            "partyAccess": "view",
            "resultantStatusId": "statusSuspended",
            "isApprovalRequired": true,
            "processAction": [
                {
                    "actionId": "suspendedActionId",
                    "actionTitleEng": "Suspend",
                    "actionTitleJpn": "Suspend",
                    "initialStatus": [
                        "statusInUse"
                    ],
                    "viewAcess": [
                        "party"
                    ],
                    "editAccess": [],
                    "agreementStatusId": "statusSuspended",
                    "isApproval": false
                }
            ]
        },
        {
            "processId": "suspendedProcessId",
            "processTitleEng": "",
            "processTitleJpn": "",
            "initialStatus": [
                {
                    "statusId": "statusSuspended",
                    "statusTitleEng": "Suspended",
                    "statusTitleJpn": "Suspended",
                    "operationDef": {
                        "operationId": "opInUse",
                        "operationTitleEng": "In Use",
                        "operationTitleJpn": "In Use"
                    }
                }
            ],
            "triggeringProcessIds": [],
            "creatorAccess": "none",
            "partyAccess": "none",
            "resultantStatusId": "",
            "isApprovalRequired": true,
            "processAction": [
                {
                    "actionId": "",
                    "actionTitleEng": "",
                    "actionTitleJpn": "",
                    "initialStatus": [
                        "statusSuspended"
                    ],
                    "viewAcess": [

                    ],
                    "editAccess": [],
                    "agreementStatusId": "",
                    "isApproval": false
                }
            ]
        },
        {
            "processId": "rejectProcess",
            "processTitleEng": "Reject",
            "processTitleJpn": "Reject",
            "initialStatus": [
                {
                    "statusId": "statusWaitingForConfirmation",
                    "statusTitleEng": "Waiting For Confirmation",
                    "statusTitleJpn": "Waiting For Confirmation",
                    "operationDef": {
                        "operationId": "opInUse",
                        "operationTitleEng": "In Use",
                        "operationTitleJpn": "In Use"
                    }
                },
                {
                    "statusId": "statusTemporaryUse",
                    "statusTitleEng": "Temporary Use",
                    "statusTitleJpn": "Temporary Use",
                    "operationDef": {
                        "operationId": "opInUse",
                        "operationTitleEng": "In Use",
                        "operationTitleJpn": "In Use"
                    }
                }
            ],
            "triggeringProcessIds": [],
            "creatorAccess": "view",
            "partyAccess": "view",
            "resultantStatusId": "statusRejected",
            "isApprovalRequired": true,
            "processAction": [
                {
                    "actionId": "rejectActionId",
                    "actionTitleEng": "Reject",
                    "actionTitleJpn": "Reject",
                    "initialStatus": [
                        "statusWaitingForConfirmation",
                        "statusTemporaryUse"
                    ],
                    "viewAcess": [
                        "party"
                    ],
                    "editAccess": [],
                    "agreementStatusId": "statusRejected",
                    "isApproval": false
                }
            ]
        },
        {
            "processId": "reviveProcessId",
            "processTitleEng": "",
            "processTitleJpn": "",
            "initialStatus": [
                {
                    "statusId": "statusRejected",
                    "statusTitleEng": "Rejected",
                    "statusTitleJpn": "Rejected",
                    "operationDef": {
                        "operationId": "opInUse",
                        "operationTitleEng": "In Use",
                        "operationTitleJpn": "In Use"
                    }
                }
            ],
            "triggeringProcessIds": [],
            "creatorAccess": "none",
            "partyAccess": "none",
            "resultantStatusId": "",
            "isApprovalRequired": true,
            "processAction": [
                {
                    "actionId": "",
                    "actionTitleEng": "",
                    "actionTitleJpn": "",
                    "initialStatus": [
                    ],
                    "viewAcess": [

                    ],
                    "editAccess": [],
                    "agreementStatusId": "",
                    "isApproval": false
                }
            ]
        },
        {
            "processId": "temporaryUseProcess",
            "processTitleEng": "Temporary Use",
            "processTitleJpn": "Temporary Use",
            "initialStatus": [
                {
                    "statusId": "statusWaitingForConfirmation",
                    "statusTitleEng": "Waiting For Confirmation",
                    "statusTitleJpn": "Waiting For Confirmation",
                    "operationDef": {
                        "operationId": "opInUse",
                        "operationTitleEng": "In Use",
                        "operationTitleJpn": "In Use"
                    }
                }
            ],
            "triggeringProcessIds": [],
            "creatorAccess": "view",
            "partyAccess": "view",
            "resultantStatusId": "statusTemporaryUse",
            "isApprovalRequired": true,
            "processAction": [
                {
                    "actionId": "temporaryUseActionId",
                    "actionTitleEng": "Temporary Use",
                    "actionTitleJpn": "Temporary Use",
                    "initialStatus": [
                        "statusWaitingForConfirmation"
                    ],
                    "viewAcess": [
                        "party"
                    ],
                    "editAccess": [],
                    "agreementStatusId": "statusTemporaryUse",
                    "isApproval": false
                }
            ]
        }

    ]');





INSERT INTO DXRADMIN.USER_CATEGORY(USER_CATEGORY_ID, USER_CATEGORY_TITLE, USER_CATEGORY_CODE, USER_CATEGORY_DESCRIPTION) VALUES ('usercategory0001', 'DX-R Admin', 'USER_CATEGORY_DXR_ADMIN', 'USER_CATEGORY_DXR_ADMIN');

INSERT INTO DXRADMIN.USER_CATEGORY(USER_CATEGORY_ID, USER_CATEGORY_TITLE, USER_CATEGORY_CODE, USER_CATEGORY_DESCRIPTION) VALUES ('usercategory0002', 'Company Admin', 'USER_CATEGORY_COMPANY_ADMIN', 'USER_CATEGORY_COMPANY_ADMIN');

INSERT INTO DXRADMIN.USER_CATEGORY(USER_CATEGORY_ID, USER_CATEGORY_TITLE, USER_CATEGORY_CODE, USER_CATEGORY_DESCRIPTION) VALUES ('usercategory0003', 'Company User', 'USER_CATEGORY_COMPANY_USER', 'USER_CATEGORY_COMPANY_USER');







INSERT INTO DXRADMIN.VEHICLE_TYPE(VEHICLE_TYPE_ID, VEHICLE_TITLE, CODE, DESCRIPTIONS, GASOLIN_TYPE_LIST, DEFAULT_GASOLIN_TYPE_ID) VALUES ('vti0001', 'Honda', '#0001', 'This is Honda breand', 'gti0002|gti0003|', 'gti0002');

INSERT INTO DXRADMIN.VEHICLE_TYPE(VEHICLE_TYPE_ID, VEHICLE_TITLE, CODE, DESCRIPTIONS, GASOLIN_TYPE_LIST, DEFAULT_GASOLIN_TYPE_ID) VALUES ('vti0002', 'GSXR', '#0002', 'This is Honda breand', 'gti0002|gti0003|', 'gti0002');

INSERT INTO DXRADMIN.VEHICLE_TYPE(VEHICLE_TYPE_ID, VEHICLE_TITLE, CODE, DESCRIPTIONS, GASOLIN_TYPE_LIST, DEFAULT_GASOLIN_TYPE_ID) VALUES ('vti0003', 'SF', '#0003', 'This is Honda breand', 'gti0002|gti0003|', 'gti0002');





INSERT INTO DXRADMIN.WASTE_CATEGORY(WASTE_CATEGORY_ID, WASTE_TITLE, CODE, DESCRIPTION) VALUES ('category0001', 'Category 01', '001', 'This is Category 1');

INSERT INTO DXRADMIN.WASTE_CATEGORY(WASTE_CATEGORY_ID, WASTE_TITLE, CODE, DESCRIPTION) VALUES ('category0002', 'Category 02', '002', 'This is Category 2');

INSERT INTO DXRADMIN.WASTE_CATEGORY(WASTE_CATEGORY_ID, WASTE_TITLE, CODE, DESCRIPTION) VALUES ('category0003', 'Category 03', '003', 'This is Category 3');





INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste001', 'Coal debris', 'No initial remarks', 'Ton', 'typeid0001', 'Circle', 'Debris', 'emid0001', 'emid0001|emid0003|', 'emid0002', 'emid0002|emid0004|');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste002', 'Incinerator ash', 'No initial remarks', 'Ton', 'typeid0001', 'Circle', 'Debris', 'emid0001', 'emid0001|', 'emid0002', 'emid0004|');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste003', 'Furnace cleaning waste', 'No initial remarks', 'Ton', 'typeid0001', 'Circle', 'Debris', 'emid0003', 'emid0003|', 'emid0002', 'emid0004|');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste004', 'Building pit sludge', 'No initial remarks', 'Cubic', 'typeid0002', 'Rectangle', 'Unknown', 'emid0001', 'emid0001|', 'emid0002', 'emid0004|');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste005', 'Carbide sludge', 'No initial remarks', 'Cubic', 'typeid0002', 'Rectangle', 'Unknown', 'emid0001', 'emid0001|', 'emid0002', 'emid0004|');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste006', 'Bentonite sludge', 'No initial remarks', 'Cubic', 'typeid0002', 'Rectangle', 'Unknown', 'emid0003', 'emid0003|', 'emid0002', 'emid0002|');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste007', 'Mineral oil', 'No initial remarks', 'Litter', 'typeid0003', 'Rectangle', 'Unknown', 'emid0001', 'emid0001|', 'emid0002', 'emid0002|');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste008', 'Animal and Vegetable oil', 'No initial remarks', 'Litter', 'typeid0003', 'Rectangle', 'Unknown', 'emid0003', 'emid0003|', 'emid0002', 'emid0002|');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste009', 'Lubricating oil,', 'No initial remarks', 'Litter', 'typeid0003', 'Rectangle', 'Unknown', 'emid0001', 'emid0001|', 'emid0002', 'emid0004|');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste0010', 'Photo fixing Waste liquid', 'No initial remarks', 'Litter', 'typeid0004', 'Rectangle', 'Unknown', '', '', '', '');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste0011', 'waste sulfuric acid', 'No initial remarks', 'Litter', 'typeid0004', 'Rectangle', 'Unknown', '', '', '', '');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste0012', 'Waste hydrochloric acid', 'No initial remarks', 'Litter', 'typeid0004', 'Rectangle', 'Unknown', '', '', '', '');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste0013', 'Photo development waste liquid', 'No initial remarks', 'Litter', 'typeid0005', 'Circle', 'Unknown', '', '', '', '');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste0014', 'Waste soda liquid', 'No initial remarks', 'Litter', 'typeid0005', 'Circle', 'Unknown', '', '', '', '');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste0015', 'Metal soap waste liquid', 'No initial remarks', 'Litter', 'typeid0005', 'Circle', 'Unknown', '', '', '', '');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste0016', 'Synthetic resin waste', 'No initial remarks', 'Ton', 'typeid0006', 'Circle', 'Unknown', '', '', '', '');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste0017', 'Synthetic fiber waste', 'No initial remarks', 'Ton', 'typeid0006', 'Circle', 'Unknown', '', '', '', '');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste0018', 'Synthetic rubber waste ', 'No initial remarks', 'Ton', 'typeid0006', 'Circle', 'Unknown', '', '', '', '');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste0019', 'Raw rubber', 'No initial remarks', 'Ton', 'typeid0007', 'Circle', 'Unknown', '', '', '', '');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste0020', 'Natural rubber scraps', 'No initial remarks', 'Ton', 'typeid0007', 'Circle', 'Unknown', '', '', '', '');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste0021', 'Debris of steel or non-ferrous metal', 'No initial remarks', 'Ton', 'typeid0008', 'Circle', 'Unknown', '', '', '', '');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste0022', 'Polishing scraps', 'No initial remarks', 'Ton', 'typeid0008', 'Circle', 'Unknown', '', '', '', '');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste0023', 'Cutting scraps', 'No initial remarks', 'Ton', 'typeid0008', 'Circle', 'Unknown', '', '', '', '');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste0024', 'Plate', 'No initial remarks', 'Ton', 'typeid0009', 'Circle', 'Unknown', '', '', '', '');

INSERT INTO DXRADMIN.WASTE_DEF(WASTE_DEF_ID, WASTE_ITEM, REMARKS, UNIT_DEF, WASTE_CATAGORY_ID, WASTE_SHAPE, WASTE_PACKAGE, DUMPER_EMISSION_DEFAULT_METHODE_ID, DUMPER_EMISSION_METHODE_ID_LIST, PROCESSOR_EMISSION_DEFAULT_METHODE_ID, PROCESSOR_EMISSION_METHODE_ID_LIST) VALUES ('waste0025', 'Glass', 'No initial remarks', 'Ton', 'typeid0009', 'Circle', 'Unknown', '', '', '', '');







INSERT INTO DXRADMIN.WASTE_TYPE(WASTE_TYPE_ID, WASTE_TITLE, CODE, DESCRIPTION, WASTE_CATEGORY_ID) VALUES ('typeid0001', 'Burnt husk', '001', 'This is Burnt husk type waste', 'category0001');

INSERT INTO DXRADMIN.WASTE_TYPE(WASTE_TYPE_ID, WASTE_TITLE, CODE, DESCRIPTION, WASTE_CATEGORY_ID) VALUES ('typeid0002', 'Sludge', '002', 'This is Sludge type waste', 'category0001');

INSERT INTO DXRADMIN.WASTE_TYPE(WASTE_TYPE_ID, WASTE_TITLE, CODE, DESCRIPTION, WASTE_CATEGORY_ID) VALUES ('typeid0003', 'Waste oil', '003', 'This is Waste oil type waste', 'category0001');

INSERT INTO DXRADMIN.WASTE_TYPE(WASTE_TYPE_ID, WASTE_TITLE, CODE, DESCRIPTION, WASTE_CATEGORY_ID) VALUES ('typeid0004', 'Metal scrap', '008', 'This is Metal scrap type waste', 'category0002');

INSERT INTO DXRADMIN.WASTE_TYPE(WASTE_TYPE_ID, WASTE_TITLE, CODE, DESCRIPTION, WASTE_CATEGORY_ID) VALUES ('typeid0005', 'Glass scraps', '009', 'This is Glass scraps type waste', 'category0002');

INSERT INTO DXRADMIN.WASTE_TYPE(WASTE_TYPE_ID, WASTE_TITLE, CODE, DESCRIPTION, WASTE_CATEGORY_ID) VALUES ('typeid0006', 'Concrete scraps', '010', 'This is concrete scraps type waste', 'category0002');

INSERT INTO DXRADMIN.WASTE_TYPE(WASTE_TYPE_ID, WASTE_TITLE, CODE, DESCRIPTION, WASTE_CATEGORY_ID) VALUES ('typeid0007', 'Animal Carcass', '015', 'This is Animal Carcass type waste', 'category0003');

INSERT INTO DXRADMIN.WASTE_TYPE(WASTE_TYPE_ID, WASTE_TITLE, CODE, DESCRIPTION, WASTE_CATEGORY_ID) VALUES ('typeid0008', 'Waste paper', '016', 'This is Waste paper type waste', 'category0003');

INSERT INTO DXRADMIN.WASTE_TYPE(WASTE_TYPE_ID, WASTE_TITLE, CODE, DESCRIPTION, WASTE_CATEGORY_ID) VALUES ('typeid0009', 'Wood chips', '017', 'This is Wood chips type waste', 'category0003');
