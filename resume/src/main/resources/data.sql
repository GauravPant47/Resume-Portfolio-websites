drop database if exists experienceData;
drop table if exists experience;


create database PersonaPortfolio;
drop database experienceData;
use PersonaPortfolio;

create table experience(
experience_id int auto_increment primary key,
title varchar(300) not null,
company_name varchar(300) not null,
location varchar(300) not null,
working_year varchar(300) not null,
description varchar(2000) not null
);

select * from experience;
-- experience
drop table experience;

-- File Hendlear
create table files(
id varchar(255) primary key,
data longblob,
file_name varchar(255),
file_type varchar(255)
);

select * from files;