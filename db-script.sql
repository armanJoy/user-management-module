
CREATE TABLE IF NOT EXISTS arcgen.user_identification(
    user_identification_id VARCHAR(255) NOT NULL,
    user_id VARCHAR(255),
    user_auth VARCHAR(512),
    CONSTRAINT user_identification_pkey PRIMARY KEY (user_identification_id)
);


CREATE TABLE IF NOT EXISTS arcgen.user_category(
    user_category_id VARCHAR(255) NOT NULL,
    user_category_title VARCHAR(255),
    user_category_code VARCHAR(255),
    user_category_description VARCHAR(255),
    CONSTRAINT user_category_pkey PRIMARY KEY (user_category_id)
);


INSERT INTO arcgen.user_category(
	user_category_id, user_category_title, user_category_code, user_category_description)
	VALUES ('usercategory0001', 'Admin User', 'U-0001', 'Admin User');

INSERT INTO arcgen.user_category(
	user_category_id, user_category_title, user_category_code, user_category_description)
	VALUES ('usercategory0002', 'General User', 'U-0002', 'General User');


CREATE TABLE IF NOT EXISTS arcgen.user_info(
    user_info_id VARCHAR(255) NOT NULL,
    user_name VARCHAR(255),
    user_email VARCHAR(255),
    user_contact VARCHAR(255),
    user_address VARCHAR(255),
    department_title VARCHAR(255),
    -- user_company_id VARCHAR(255),
    user_auth_id VARCHAR(255),
    user_category_id VARCHAR(255),
    -- job_title VARCHAR(255) DEFAULT '',
    -- driving_license_no VARCHAR(255) DEFAULT '',
    -- driving_license_bytes bytea,
    -- office_name VARCHAR(255) DEFAULT '',
    -- office_address VARCHAR(255) DEFAULT '',
    -- office_contact_no VARCHAR(255) DEFAULT '',
    user_id VARCHAR(255),
    -- remarks VARCHAR(255) DEFAULT '',
    -- user_seal_bytes bytea,
    -- search_content character varying(10485760) DEFAULT '',
    -- active character varying(10) DEFAULT '1',
    CONSTRAINT user_info_pkey PRIMARY KEY (user_info_id),
    CONSTRAINT user_info_user_auth_id_fkey FOREIGN KEY (user_auth_id)
        REFERENCES arcgen.user_identification (user_identification_id),
    CONSTRAINT user_info_user_category_id_fkey FOREIGN KEY (user_category_id)
        REFERENCES arcgen.user_category (user_category_id)
    -- CONSTRAINT user_info_user_company_id_fkey FOREIGN KEY (user_company_id)
    --     REFERENCES arcgen.company_info (company_info_id)
);

-- CREATE TABLE IF NOT EXISTS arcgen.company_info (
--     company_info_id VARCHAR(255) NOT NULL,
--     company_name VARCHAR(255),
--     company_address VARCHAR(255),
--     company_email VARCHAR(255),
--     company_contact VARCHAR(255),
--     representative_name VARCHAR(255),
--     representative_mail VARCHAR(255),
--     company_fax_number VARCHAR(255),
--     corporate_reg_no VARCHAR(255),
--     waste_processing_licence_no VARCHAR(255),
--     waste_processing_licence_bytes bytea,
--     accountant_name VARCHAR(255),
--     accountant_email VARCHAR(255),
--     notification_id VARCHAR(255),
--     subscription_id VARCHAR(255),
--     frontend_date VARCHAR(255),
--     backend_date VARCHAR(255),
--     zipcode VARCHAR(255),
--     remarks VARCHAR(255),
--     company_seal bytea,
--     search_content character varying(10485760) DEFAULT '',
--     requester_mail VARCHAR(255) DEFAULT '',
--     approval_status VARCHAR(255) DEFAULT '',
--     CONSTRAINT company_info_pkey PRIMARY KEY (company_info_id),
--     CONSTRAINT company_info_notification_id_fkey FOREIGN KEY (notification_id)
--         REFERENCES arcgen.notification (notification_id),
--     CONSTRAINT company_info_subscription_id_fkey FOREIGN KEY (subscription_id)
--         REFERENCES arcgen.subscription_info (subscription_info_id)  
-- );