

ALTER TABLE DXRADMIN.waste_category ADD COLUMN active VARCHAR(10) DEFAULT '1';

ALTER TABLE DXRADMIN.waste_type ADD COLUMN active VARCHAR(10) DEFAULT '1';

ALTER TABLE DXRADMIN.waste_def ADD COLUMN active VARCHAR(10) DEFAULT '1';

ALTER TABLE DXRADMIN.carbon_emission_method_info ADD COLUMN active VARCHAR(10) DEFAULT '1';




ALTER TABLE DXRADMIN.company_waste_def ADD COLUMN active VARCHAR(10) DEFAULT '1';

ALTER TABLE DXRADMIN.base_price ADD COLUMN active VARCHAR(10) DEFAULT '1';

ALTER TABLE DXRADMIN.company_waste_operation_method_info ADD COLUMN active VARCHAR(10) DEFAULT '1';

ALTER TABLE DXRADMIN.scale_info ADD COLUMN active VARCHAR(10) DEFAULT '1';





ALTER TABLE DXRADMIN.bank_account_info ADD COLUMN active VARCHAR(10) DEFAULT '1';

ALTER TABLE DXRADMIN.branch_info ADD COLUMN active VARCHAR(10) DEFAULT '1';

ALTER TABLE DXRADMIN.vehicle_info ADD COLUMN active VARCHAR(10) DEFAULT '1';





ALTER TABLE DXRADMIN.user_info ADD COLUMN active VARCHAR(10) DEFAULT '1';

ALTER TABLE DXRADMIN.previlaged_user ADD COLUMN active VARCHAR(10) DEFAULT '1';

ALTER TABLE DXRADMIN.user_role_def ADD COLUMN active VARCHAR(10) DEFAULT '1';





ALTER TABLE DXRADMIN.faq_type ADD COLUMN active VARCHAR(10) DEFAULT '1';

ALTER TABLE DXRADMIN.faq_info ADD COLUMN active VARCHAR(10) DEFAULT '1';




ALTER TABLE DXRADMIN.agreement_info ADD COLUMN active VARCHAR(10) DEFAULT '1';

ALTER TABLE DXRADMIN.project_info ADD COLUMN active VARCHAR(10) DEFAULT '1';

ALTER TABLE DXRADMIN.pick_info ADD COLUMN active VARCHAR(10) DEFAULT '1';





CREATE TABLE DXRADMIN.removed_data (
    removed_data_id VARCHAR(100) NOT NULL,
    remove_time VARCHAR(20),
    data_id VARCHAR(100),
    operation_type VARCHAR(100),
    user_info_id VARCHAR(100),
    user_company_id VARCHAR(100),
    search_content VARCHAR(10485760),
    back_ward_link_id_and_table VARCHAR(10485760),
    forward_link_id_and_table VARCHAR(10485760),
    PRIMARY KEY (removed_data_id)
);

ALTER TABLE DXRADMIN.removed_data ADD COLUMN data_title VARCHAR(255) DEFAULT '', ADD COLUMN user_name VARCHAR(255) DEFAULT '', ADD COLUMN user_company_name VARCHAR(255) DEFAULT '';

ALTER TABLE DXRADMIN.removed_data ADD COLUMN restore_status VARCHAR(20) DEFAULT '0', ADD COLUMN restore_time VARCHAR(20) DEFAULT '', ADD COLUMN restore_user_info_id VARCHAR(100) DEFAULT '';




INSERT INTO DXRADMIN.menu_def VALUES (
    'dataRestoreMenu',
    'Data Restore',
    'Data Restore',
    'data-restore',
    '/company-admin/project',
    'menudef0002|', 
    'menutype0002',
    'menucat002'
);

INSERT INTO DXRADMIN.menu_role_def VALUES (
    'menuRoleDef-dataRestoreMenu',
    'dataRestoreMenu',
    'roleaccessdef00013|'
);

-- 6c731914-43ea-42f9-9537-5a955baca74c roledef0001   Company Admin  

-- SELECT menu_id_list FROM DXRADMIN.role_menu WHERE role_def_id='roledef0001';

UPDATE DXRADMIN.role_menu SET menu_id_list='menudef0001|menudef00011|menudef000111|menudef000112|menudef000113|menudef00012|menudef0002|menudefBusinessAgreement|initiateProject|projectScheduleMenu|menifestoMenu|invoiceMenu|processCompletionMenu|dataRestoreMenu|' WHERE role_def_id='roledef0001';





-- UPDATE DXRADMIN.bank_account_info SET active='0' WHERE bank_account_id=?1

-- UPDATE DXRADMIN.branch_info SET active='0' WHERE branch_info_id=?1

-- UPDATE DXRADMIN.vehicle_info SET active='0' WHERE vehicle_info_id=?1

-- UPDATE DXRADMIN.company_waste_def SET active='0' WHERE company_waste_def_id=?1

-- UPDATE DXRADMIN.scale_info SET active='0' WHERE scale_info_id=?1

-- UPDATE DXRADMIN.user_info SET active='0' WHERE user_info_id=?1

-- UPDATE DXRADMIN.agreement_info SET active='0' WHERE agreement_info_id=?1

-- UPDATE DXRADMIN.project_info SET active='0' WHERE project_info_id=?1

-- UPDATE DXRADMIN.pick_info SET active='0' WHERE pick_info_id=?1







----------------------------------------------------


-- INSERT INTO DXRADMIN.menu_def VALUES (
--     'processCompletionMenu',
--     'Process Completion',
--     'Process Completion',
--     'process-completion',
--     '/company-admin/project',
--     'menudef0002|', 
--     'menutype0002',
--     'menucat002'
-- );

-- INSERT INTO DXRADMIN.menu_role_def VALUES (
--     'menuRoleDef-processCompletionMenu',
--     'processCompletionMenu',
--     'roleaccessdef00013|'
-- );