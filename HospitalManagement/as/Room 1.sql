use Management
create table Room_no_01
(
P_id int ,
P_name varchar(30),
P_R_Date varchar(30),
P_doctor varchar(30),
constraint pk5 primary key (P_id)
)
select * from Room_no_01
alter table Room_no_01 add status varchar(20)

create table Room_no_02
(
P_id int ,
P_name varchar(30),
P_R_Date varchar(30),
P_doctor varchar(30),
constraint pk6 primary key (P_id)

)
alter table Room_no_02 add status varchar(20)
select * from Room_no_02

create table Room_no_03
(
P_id int ,
P_name varchar(30),
P_R_Date varchar(30),
P_doctor varchar(30),
constraint pk7 primary key (P_id)
)
select * from Room_no_03
alter table Room_no_03 add status varchar(20)
create table Room_no_04
(
P_id int ,
P_name varchar(30),
P_R_Date varchar(30),
P_doctor varchar(30),
constraint pk8 primary key (P_id)
)
select * from Room_no_04
alter table Room_no_04 add status varchar(20)

create table Room_no_05
(
P_id int ,
P_name varchar(30),
P_R_Date varchar(30),
P_doctor varchar(30),
constraint pk9 primary key (P_id)
)
select * from Room_no_05
alter table Room_no_05 add status varchar(20)

create table Room_no_06
(
P_id int ,
P_name varchar(30),
P_R_Date varchar(30),
P_doctor varchar(30),
constraint pk10 primary key (P_id)
)
select * from Room_no_06
alter table Room_no_06 add status varchar(20)


insert into Room_no_01 values(5,'s','f','e','Available')
delete from Room_no_03
