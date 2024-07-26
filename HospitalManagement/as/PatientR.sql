use Management
create table Patient
(
Id int not null,
F_name varchar(20),
L_name varchar(20),
R_Date varchar(20),
Age varchar(20),
B_group varchar(20),
Gender varchar(20),
P_Address varchar(100),
Email varchar(20),
Contact varchar(20),
Cons_name varchar(20),
Room_no varchar(20),

constraint pk2 primary key (id)
)
select * from Patient
delete from Patient