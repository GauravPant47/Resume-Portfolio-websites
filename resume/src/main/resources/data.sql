drop database if exists experienceData;
drop table if exists experience;


create database experienceData;

use experienceData;

create table experience(
experience_id int auto_increment primary key,
company_name varchar(300) not null,
years_of_experince varchar(300) not null,
location varchar(300) not null,
description varchar(2000) not null
);

select * from experience;