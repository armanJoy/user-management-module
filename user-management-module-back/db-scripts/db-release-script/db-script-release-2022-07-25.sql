DELETE  FROM DXRADMIN.dumping_emission_info;
DELETE  FROM DXRADMIN.processing_emission_info;

ALTER TABLE DXRADMIN.dumping_emission_info ADD  project_id VARCHAR(255);
ALTER TABLE DXRADMIN.processing_emission_info ADD  project_id VARCHAR(255);

ALTER TABLE DXRADMIN.waste_type ADD  emission_quantity DOUBLE PRECISION DEFAULT 0.0;


ALTER TABLE DXRADMIN.waste_def RENAME COLUMN waste_catagory_id TO waste_type_id;
ALTER TABLE DXRADMIN.waste_category RENAME COLUMN waste_title TO category_title;

DELETE  FROM dxradmin.company_waste_operation_method_info;
DELETE FROM dxradmin.carbon_emission_method_info;




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

UPDATE DXRADMIN.role_menu SET menu_id_list='menudef0001|menudef00011|menudef000111|menudef000112|menudef000113|menudef00012|menudef0002|menudefBusinessAgreement|initiateProject|projectScheduleMenu|menifestoMenu|invoiceMenu|processCompletionMenu|dataRestoreMenu|' WHERE role_def_id='roledef0001';

INSERT INTO DXRADMIN.menu_def VALUES (
    'processCompletionMenu',
    'Process Completion',
    'Process Completion',
    'process-completion',
    '/company-admin/project',
    'menudef0002|', 
    'menutype0002',
    'menucat002'
);

INSERT INTO DXRADMIN.menu_role_def VALUES (
    'menuRoleDef-processCompletionMenu',
    'processCompletionMenu',
    'roleaccessdef00013|'
);
