CREATE DATABASE IF NOT EXISTS hospital
  DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
  
USE hospital;

CREATE TABLE IF NOT EXISTS appointment(
 
 casetype varchar(10) not null,
 patient_id varchar(10) not null, 
 firstname varchar(15) not null, 
 surname varchar(15) not null, 
 middlename varchar(15) not null, 
 age varchar(15) not null, 
 address1 varchar(30) not null, 
 address2 varchar(10),
 address3 varchar(10),
 city varchar(10), 
 taluka varchar(10),
 states varchar(10) not null,
 area varchar(10),
 pin varchar(10),
 district varchar(10),
 country varchar(10) not null, 
 tel_no_Home varchar(15) not null,
 mob_num varchar(15) not null, 
 tel_no_office varchar(10),
 fax_no varchar(10),
 email varchar(20) not null,
 primary key(patient_id)
)

CREATE TABLE IF NOT EXISTS blooddonate(
 idcard_no varchar(15) not null, 
 blood_group varchar(15) not null,
 rh varchar(15) not null, 
 donor_number varchar(15) not null,
 dob varchar(15) not null, 
 sex varchar(15) not null, 
 telphone varchar(15) not null,
 email varchar(15) not null,
 occupation,
 firstname varchar(15) not null, 
 lastname varchar(15) not null,
 dob,
 weight varchar(15) not null,
 height,
 address varchar(15) not null,
 donor_type varchar(15) not null
  primary key(idcard_no)
 )
 
 
CREATE TABLE IF NOT EXISTS employee(
 firstname varchar(15) not null,
 lastname varchar(15) not null, 
 middlename varchar(15),
 birthdate varchar(15) not null,
 address varchar(30),
 gender varchar(15) not null, 
 contact_by varchar(15),
 ssn varchar(15) not null, 
 email varchar(15) not null, 
 officephone varchar(15), 
 home_loc varchar(15),
 marital_status varchar(15),
 race varchar(15) not null,
 language_ varchar(15),
 employment_status varchar(30),
 level_ varchar(15) not null,
 start_salary varchar(15) not null,
 allowances varchar(15) not null, 
 present_salary varchar(15) not null, 
 others_ varchar(15) not null, 
 total varchar(15) not null
 primary key(ssn)
 )
 
 CREATE TABLE IF NOT EXISTS patient(
 firstname varchar(15) not null, 
 lastname varchar(15) not null, 
 middlename, 
 birthdate varchar(15) not null, 
 address, 
 gendervarchar(15) not null, 
 ssn varchar(15) not null, 
 email varchar(15) not null, 
 homephone varchar(15) not null, 
 home_loc varchar(15) not null, 
 marital_status varchar(15) not null, 
 race  varchar(15), 
 language_ varchar(15), 
 nok_fullname varchar(15), 
 nok_relationship varchar(15), 
 nok_address varchar(15), 
 nok_city varchar(15), 
 nok_state varchar(15), 
 nok_state varchar(15), 
 nok_zip varchar(15), 
 nok_homephone  varchar(15), 
 nok_workphone varchar(15), 
 accident_date varchar(40), 
 accident_time varchar(40), 
 accident_type varchar(40), 
 accident_other_infos varchar(40), 
 other_information varchar(40), 
 physical_performance varchar(40), 
 vital_signs varchar(40), 
 skin varchar(40), 
 neck varchar(40), 
 heart varchar(40), 
 abdomen varchar(40), 
 pelvic_rectal varchar(40), 
 impression varchar(40)
 primary key(ssn)
 )
 
  CREATE TABLE IF NOT EXISTS reviewDoctor(
  doctors_name VARCHAR(20), 
  value_gotten CHAR(3),
  primary key(doctors_name)
  ) 