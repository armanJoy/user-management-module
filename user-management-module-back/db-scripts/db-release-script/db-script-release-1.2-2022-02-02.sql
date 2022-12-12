CREATE TABLE DXRADMIN.language_competency (
	language_competency_id VARCHAR(255),
	language_json VARCHAR(32000),
	backend_date VARCHAR(255),
    frontend_date VARCHAR(255),
	PRIMARY KEY (language_competency_id)
); 


ALTER TABLE DXRADMIN.static_page ADD backend_date VARCHAR(255) DEFAULT '20220202113200';
ALTER TABLE DXRADMIN.static_page ADD frontend_date VARCHAR(255) DEFAULT '20220202113200';


ALTER TABLE DXRADMIN.faq_info ADD frontend_date VARCHAR(255) DEFAULT '20220202113200';
ALTER TABLE DXRADMIN.faq_info ADD backend_date VARCHAR(255) DEFAULT '20220202113200';


ALTER TABLE DXRADMIN.faq_type ADD frontend_date VARCHAR(255) DEFAULT '20220202113200';
ALTER TABLE DXRADMIN.faq_type ADD backend_date VARCHAR(255) DEFAULT '20220202113200';

ALTER TABLE DXRADMIN.language_competency DROP language_json;

ALTER TABLE DXRADMIN.language_competency ADD language_json_bytes BLOB;