CREATE TABLE DXRADMIN.company_preference (
    company_preference_id VARCHAR(255) NOT NULL,
    user_identification_pk VARCHAR(255),
    prefer_company_id VARCHAR(255),
    active VARCHAR(255),
    PRIMARY KEY (company_preference_id)
);

ALTER TABLE DXRADMIN.company_preference ADD FOREIGN KEY (user_identification_pk) REFERENCES DXRADMIN.user_identification (user_identification_id);

ALTER TABLE DXRADMIN.company_preference ADD FOREIGN KEY (prefer_company_id) REFERENCES DXRADMIN.company_info (company_info_id);

-- ALTER TABLE DXRADMIN.company_preference ADD COLUMN active VARCHAR(255);