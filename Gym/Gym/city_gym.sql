create database city_gym

use city_gym


create table instructor
(
inst_id int constraint inst_id_pk primary key,
fname varchar(50) ,
lname varchar(50),
c_no varchar(25),
adres varchar(30),
doj varchar(50),
schedule varchar(40),
sallary varchar(50)

)


create table member
(
m_id int constraint m_id_pk primary key,
fname varchar(50),
lname varchar(50),
c_no varchar(25),
adres varchar(50),
inst_id int,
doj varchar(30),
plan_type varchar(40),
amount varchar(40),
constraint inst_id_fk foreign key(inst_id) references instructor(inst_id)

)


create table equipment
(
noi varchar(50) primary key,
company varchar(50),
t_quantity varchar(30),
ppq varchar(20),
t_price varchar(40),
date varchar(30)
)

create table plantype
(
plan_type varchar(50),
amount varchar(40)
)

create table transactions
(
m_name varchar(50),
p_type varchar(50),
doj varchar(50),
amount varchar(40)
)


