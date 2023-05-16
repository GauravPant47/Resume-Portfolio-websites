drop database if exists experienceData;
drop table if exists experience;


create database PersonaPortfolio;
drop database experienceData;
use PersonaPortfolio;

create table experience(
id int auto_increment primary key,
title varchar(300),
company_name varchar(300),
location varchar(300),
working_year varchar(300),
description varchar(2000)
);

select * from experience;
-- experience
drop table experience;

-- education 

create table education(
id int auto_increment primary key,
title varchar(300),
college varchar(300),
location varchar(300),
course_year varchar(300),
description varchar(2000)
);
select * from education;

drop table education;
-- education 

-- project
create table project(
id int auto_increment primary key,
title varchar (300),
url varchar(300),
details_of_project varchar(3000)
);

select * from education;
-- project

-- File Hendlear
create table files(
id varchar(255) primary key,
data longblob,
file_name varchar(255),
file_type varchar(255)
);

select * from files;


drop table files;
-- File Hendlear