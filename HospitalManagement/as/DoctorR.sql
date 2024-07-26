create database Management
use Management
create table Doctor
(
id int,
first_name varchar(20),
last_name varchar(20),
contact varchar(20),
adress varchar(300),
email varchar(30), 
specialization varchar(40),

);
select * from Doctor;

delete from Doctor2 where id = 101

alter table Doctor alter column id int not null
alter table Doctor add primary key (id)


create table Doctor2
(
id int not null,
first_name varchar(20),
last_name varchar(20),
contact varchar(20),
specialization varchar(40),
timing varchar(30),
constraint pk primary key (id),
);
select * from Doctor2