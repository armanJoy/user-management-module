
CREATE TABLE IF NOT EXISTS usermgt.user_identification(
    user_identification_id VARCHAR(255) NOT NULL,
    user_id VARCHAR(255),
    user_auth VARCHAR(512),
    CONSTRAINT user_identification_pkey PRIMARY KEY (user_identification_id)
);


CREATE TABLE IF NOT EXISTS usermgt.user_category(
    user_category_id VARCHAR(255) NOT NULL,
    user_category_title VARCHAR(255),
    user_category_code VARCHAR(255),
    user_category_description VARCHAR(255),
    CONSTRAINT user_category_pkey PRIMARY KEY (user_category_id)
);

CREATE TABLE IF NOT EXISTS usermgt.user_info(
    user_info_id VARCHAR(255) NOT NULL,
    user_name VARCHAR(255),
    user_email VARCHAR(255),
    user_contact VARCHAR(255),
    user_address VARCHAR(255),
    department_title VARCHAR(255),
    user_auth_id VARCHAR(255),
    user_category_id VARCHAR(255),
    user_id VARCHAR(255),
    CONSTRAINT user_info_pkey PRIMARY KEY (user_info_id),
    CONSTRAINT user_info_user_auth_id_fkey FOREIGN KEY (user_auth_id) REFERENCES usermgt.user_identification (user_identification_id),
    CONSTRAINT user_info_user_category_id_fkey FOREIGN KEY (user_category_id) REFERENCES usermgt.user_category (user_category_id)
);