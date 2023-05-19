drop database if exists experienceData;
drop table if exists experience;


create database resumedata;
drop database experienceData;
use PersonaPortfolio;

create table account(
id int auto_increment primary key,
first_name varchar(300),
last_name varchar(300),
email varchar(300),
password varchar(300)
);

select * from account;

create table authority(
id int auto_increment primary key,
name varchar(20)
);
create table users_roles(
account_id int references account(id),
authority_id int references authority(id)
);

create table experience(
id int auto_increment primary key,
title varchar(300),
company_name varchar(300),
location varchar(300),
working_year varchar(300),
description varchar(2000),
account_id int references account(id)
);

select * from experience;
-- experience
drop table post;

-- education 

create table education(
id int auto_increment primary key,
title varchar(300),
college varchar(300),
location varchar(300),
course_year varchar(300),
description varchar(2000),
account_id int references account(id)
);
select * from education;

drop table education;
-- education 

-- project
create table project(
id int auto_increment primary key,
title varchar (300),
url varchar(300),
details_of_project varchar(3000),
account_id int references account(id)
);

select * from project;
-- project

-- File Hendlear
create table files(
id varchar(255) primary key,
data longblob,
file_name varchar(255),
file_type varchar(255)
);

select * from files;


drop table project;
-- File Hendlear