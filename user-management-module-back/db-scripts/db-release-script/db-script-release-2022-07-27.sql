alter table dxradmin.role_def add column role_name_eng varchar(255) default '';

UPDATE DXRADMIN.role_def set role_name_eng='Company Admin' where role_def_id='roledef0001';

UPDATE DXRADMIN.role_def set role_name_eng='Person in Charge (Dumper)' where role_def_id='roledef0002';

UPDATE DXRADMIN.role_def set role_name_eng='Person in Charge (Transporter)' where role_def_id='roledef0003';

UPDATE DXRADMIN.role_def set role_name_eng='Person in Charge (Processor)' where role_def_id='roledef0004';

UPDATE DXRADMIN.role_def set role_name_eng='Driver' where role_def_id='roledef0005';

UPDATE DXRADMIN.role_def set role_name_eng='Reception Manager' where role_def_id='roledef0006';

UPDATE DXRADMIN.role_def set role_name_eng='Accountant' where role_def_id='roledef0007';

UPDATE DXRADMIN.role_def set role_name_eng='Receiving Manager' where role_def_id='roledef0008';

UPDATE DXRADMIN.role_def set role_name_eng='Temporary User' where role_def_id='roledef0009';

UPDATE DXRADMIN.role_def set role_name_eng='Reference User' where role_def_id='roledef0010';