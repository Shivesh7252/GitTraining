create database genpact;
use genpact;
CREATE TABLE Trainer_Info (
  Trainer_Id varchar(20) primary key,
  Salutation varchar(7),
  Trainer_Name varchar(30),
  Trainer_Location varchar(30),
  Trainer_Track varchar(15),
  Trainer_Qualification varchar(100),
  Trainer_Experiance integer(11),
  Trainer_Email varchar (100),
  Trainer_Password varchar (20)
);

create table Batch_Info(
  Batch_Id	varchar(20) primary key,
  Batch_Owner	varchar(30),
  Batch_BU_Name	varchar(30)
);

create table Module_Info(
  Module_Id	varchar(20) primary key,
  Module_Name	varchar(40),
  Module_Duration	Integer(11)
);

create table Associate_Info(
  Associate_Id	varchar(20) primary key,
  Salutation	varchar(7),
  Associate_Name varchar(30),
  Associate_Location	varchar(30),
  Associate_Track	varchar(15),
  Associate_Qualification	varchar(200),
  Associate_Email	varchar(100),
  Associate_Password varchar(20)
);
 
create table Questions(
  Question_Id	varchar(20) primary key,
  Module_Id	varchar(20),
  Question_Text	varchar(900)
);

create table Associate_Status(
  Associate_Id varchar(20) ,
  Module_Id	varchar(20),
  Batch_Id varchar(20),
  Trainer_Id varchar(20),
  Start_Date	varchar(20),
  End_Date	varchar(20)
 
);

create table Trainer_Feedback(
  Trainer_Id	varchar(20) primary key,
  Question_Id	varchar(20),
  Batch_Id varchar(20),
  Module_Id	varchar(20),
  Trainer_Rating Integer(11)
);

create table Associate_Feedback (
  Associate_Id varchar(20) primary key,
  Question_Id	varchar(20),
  Module_Id	varchar(20),
  Associate_Rating Integer(11)
);

create table Login_Details(
  User_Id	varchar(20) primary key,
  User_Password	varchar(20)
);
-- Assignment 2--

desc associate_status;
alter table associate_status
add constraint fk_batch foreign key(batch_id)
references batch_info(batch_id);
alter table associate_status
add constraint fk_trainer foreign key(trainer_id)
references trainer_info(trainer_id);

ALTER TABLE associate_status MODIFY start_date date;
ALTER TABLE associate_status MODIFY end_date date;

-- Exercise 2--
desc trainer_info;
insert into trainer_info
(Trainer_Id,Salutation,Trainer_Name,Trainer_Location,Trainer_Track,Trainer_Qualification,Trainer_Experiance,Trainer_Email,Trainer_Password)
values
("F001","Mr.","PANKAJ GHOSH","Pune","Java","Bachelor of Technology",12,"Pankaj.Ghosh@alliance.com","fac1@123"),
("F002","Mr.","SANJAY RADHAKRISHNAN" ,"Bangalore","DotNet","Bachelor of Technology",12,"Sanjay.Radhakrishnan@alliance.com","fac2@123"),
("F003","Mr.","VIJAY MATHUR","Chennai","Mainframe","Bachelor of Technology",10,"Vijay.Mathur@alliance.com","fac3@123");
insert into trainer_info
(Trainer_Id,Salutation,Trainer_Name,Trainer_Location,Trainer_Track,Trainer_Qualification,Trainer_Experiance,Trainer_Email,Trainer_Password)
values
("F004", "Mrs.", "NANDINI NAIR", "Kolkata", "Java", "Master of Computer Applications", 9, "Nandini.Nair@alliance.com", "fac4@123"),
("F005", "Miss.", "ANITHA PAREKH", "Hyderabad", "Testing", "Master of Computer Applications", 6, "Anitha.Parekh@alliance.com", "fac5@123"),
("F006", "Mr.", "MANOJ AGRAWAL ", "Mumbai", "Mainframe", "Bachelor of Technology", 9, "Manoj.Agrawal@alliance.com", "fac6@123"),
("F007", "Ms.", "MEENA KULKARNI", "Coimbatore", "Testing", "Bachelor of Technology", 5, "Meena.Kulkarni@alliance.com", "fac7@123"),
("F009", "Mr.", "SAGAR MENON ", "Mumbai", "Java", "Master of Science In Information Technology", 12, "Sagar.Menon@alliance.com", "fac8@123");
select * from trainer_info;
desc batch_info;
insert into batch_info
(Batch_Id,Batch_Owner,Batch_BU_Name)
values
("B001", "MRS.SWATI ROY", "MSP"),
 ("B002", "MRS.ARURNA K", "HEALTHCARE"), 
("B003", "MR.RAJESH KRISHNAN", "LIFE SCIENCES"), 
("B004", "MR.SACHIN SHETTY", "BFS"), 
("B005", "MR.RAMESH PATEL", "COMMUNICATIONS"), 
("B006", "MRS.SUSAN CHERIAN", "RETAIL & HOSPITALITY"), 
("B007", "MRS.SAMPADA JAIN", "MSP"),
 ("B008", "MRS.KAVITA REGE", "BPO"), 
("B009", "MR.RAVI SEJPAL", "MSP");
select * from batch_info;
desc module_info;
insert into module_info
(Module_Id,Module_Name,Module_Duration)
values
("O10SQL", "Oracle 10g SQL ", 16),
 ("O10PLSQL", "Oracle 10g PL/SQL ", 16),
 ("J2SE", "Core Java SE 1.6", 288), 
("J2EE", "Advanced Java EE 1.6", 80),
 ("JAVAFX", "JavaFX 2.1", 80), 
("DOTNT4", ".Net Framework 4.0 ", 50),
 ("SQL2008", "MS SQl Server 2008", 120), 
("MSBI08", "MS BI Studio 2008", 158),
 ("SHRPNT", "MS Share Point ", 80),
 ("ANDRD4", "Android 4.0", 200),
 ("EM001", "Instructor", 0), 
("EM002", "Course Material", 0), 
("EM003", "Learning Effectiveness", 0),
 ("EM004", "Environment", 0), 
("EM005", "Job Impact", 0),
 ("TM001", "Attendees", 0), 
("TM002", "Course Material", 0),
 ("TM003", "Environment", 0);
 select * from module_info;
 desc associate_info;
 insert into associate_info
 (Associate_Id,Salutation,Associate_Name,Associate_Location,Associate_Track,Associate_Qualification,Associate_Email,Associate_Password)
 values
("A001", "Miss.", "GAYATHRI NARAYANAN", "Gurgaon", "Java", "Bachelor of Technology", "Gayathri.Narayanan@hp.com", "tne1@123"),
("A002", "Mrs.", "RADHIKA MOHAN", "Kerala", "Java", "Bachelor of Engineering In Information Technology", "Radhika.Mohan@cognizant.com", "tne2@123"),
("A003", "Mr.", "KISHORE SRINIVAS", "Chennai", "Java", "Bachelor of Engineering In Computers", "Kishore.Srinivas@ibm.com", "tne3@123"),
("A004", "Mr.", "ANAND RANGANATHAN", "Mumbai", "DotNet", "Master of Computer Applications", "Anand.Ranganathan@finolex.com", "tne4@123"),
("A005", "Miss.", "LEELA MENON", "Kerala", "Mainframe", "Bachelor of Engineering In Information Technology", "Leela.Menon@microsoft.com", "tne5@123"),
("A006", "Mrs.", "ARTI KRISHNAN", "Pune", "Testing", "Master of Computer Applications", "Arti.Krishnan@cognizant.com", "tne6@123"),
("A007", "Mr.", "PRABHAKAR SHUNMUGHAM", "Mumbai", "Java", "Bachelor of Technology", "Prabhakar.Shunmugham@honda.com", "tne7@123");
select * from associate_info;
desc questions;
insert into questions
(Question_Id,Module_Id,Question_Text)
values
("Q001", "EM001", "Instructor knowledgeable and able to handle all your queries"),
("Q002", "EM001", "All the topics in a particular course handled by the trainer without any gaps or slippages"),
("Q003", "EM002", "The course materials presentation, handson,  etc. refered during the training are relevant and useful."),
("Q004", "EM002", "The Hands on session adequate enough to grasp the understanding of the topic."),
("Q005", "EM002", "The reference materials suggested for each module are adequate."),
("Q006", "EM003", "Knowledge and skills presented in this training are applicatible at your work"),
("Q007", "EM003", "This training increases my proficiency level"),
("Q008", "EM004", "The physical environment e.g. classroom space, air-conditioning was conducive to learning."),
("Q009", "EM004", "The software/hardware environment provided was sufficient for the purpose of the training."),
("Q010", "EM005", "This training will improve your job performance."),
("Q011", "EM005", "This training align with the business priorities and goals."),
("Q012", "TM001", "Participants were receptive and had attitude towards learning."),
("Q013", "TM001", "All participats gained the knowledge and the practical skills after this training."),
("Q014", "TM002", "The course materials presentation, handson, etc. available for the session covers the entire objectives of the course."),
("Q015", "TM002", "Complexity of the course is adequate for the particpate level."),
("Q016", "TM002", "Case study and practical demos helpful in understanding of the topic"),
("Q017", "TM003", "The physical environment e.g. classroom space, air-conditioning was conducive to learning."),
("Q018", "TM003", "The software/hardware environment provided was adequate for the purpose of the training.");
select * from questions;
desc associate_status;
insert into associate_status
(Associate_Id,Module_Id,Batch_Id,Trainer_Id,Start_Date,End_Date)
values
("A001", "O10SQL", "B001", "F001", "2000-12-15", "2000-12-25"),
("A002", "O10SQL", "B001", "F001", "2000-12-15", "2000-12-25"),
("A003", "O10SQL", "B001", "F001", "2000-12-15", "2000-12-25"),
("A001", "O10PLSQL", "B002", "F002", "2001-2-1", "2001-2-12"),
("A002", "O10PLSQL", "B002", "F002", "2001-2-1", "2001-2-12"),
("A003", "O10PLSQL", "B002", "F002", "2001-2-1", "2001-2-12"),
("A001", "J2SE", "B003", "F003", "2002-8-20", "2002-10-25"),
("A002", "J2SE", "B003", "F003", "2002-8-20", "2002-10-25"),
("A001", "J2EE", "B004", "F004", "2005-12-1", "2005-12-25"),
("A002", "J2EE", "B004", "F004", "2005-12-1", "2005-12-25"),
("A003", "J2EE", "B004", "F004", "2005-12-1", "2005-12-25"),
("A004", "J2EE", "B004", "F004", "2005-12-1", "2005-12-25"),
("A005", "JAVAFX", "B005", "F006", "2005-12-4", "2005-12-20"),
("A006", "JAVAFX", "B005", "F006", "2005-12-4", "2005-12-20"),
("A006", "SQL2008", "B006", "F007", "2007-6-21", "2007-6-28"),
("A007", "SQL2008", "B006", "F007", "2007-6-21", "2007-6-28"),
("A002", "MSBI08", "B007", "F006", "2009-6-26", "2009-6-29"),
("A003", "MSBI08", "B007", "F006", "2009-6-26", "2009-6-29"),
("A004", "MSBI08", "B007", "F006", "2009-6-26", "2009-6-29"),
("A002", "ANDRD4", "B008", "F005", "2010-6-5", "2010-6-28"),
("A005", "ANDRD4", "B008", "F005", "2010-6-5", "2010-6-28"),
("A003", "ANDRD4", "B009", "F005", "2011-8-1", "2011-8-20"),
("A006", "ANDRD4", "B009", "F005", "2011-8-1", "2011-8-20");
select * from associate_status;

-- Exercise 2.1--
desc trainer_info;
update trainer_info
set trainer_password="nn4@123"
where trainer_id="F004";
select * from trainer_info
where trainer_id="F004";

select * from associate_status;
delete from associate_status where associate_id ="A003";

select * from trainer_info
group by trainer_experiance 
order by trainer_experiance desc;

commit;
select * from login_details;
-- Transaction problem--
SET autocommit = 0;
start transaction;
Insert into login_details
(user_id,user_password)
values
('U001', "Admin1@123"),
('U002' ,"Admin2@123");
select * from login_details;
rollback;
select * from login_details;
-- grant and revoke last problem is pending-- 

-- Assignment- 3-- 
-- Hands-on Exercise: MySQL Operators.-- 
-- q1
select * from trainer_info
where trainer_email is null;  -- no such trainer
-- 2
select * from trainer_info;
select trainer_id,trainer_name,trainer_track,trainer_location,trainer_experiance from trainer_info
where trainer_experiance>4;
-- 3
select * from module_info
where module_duration>200;
-- 4
select trainer_id,trainer_name from trainer_info
where trainer_qualification!="Bachelor of Technology";
-- 5
select * from module_info
where module_duration between 200 and 300;
-- 6
select trainer_id, trainer_name from  trainer_info
where  trainer_name like "M%";
-- 7
select trainer_id, trainer_name from  trainer_info
where  trainer_name like "O%";
-- 8
select * from module_info
where module_name is not null;

 -- Assignment 4--
  -- Exercise 1 --
  -- q1
  select trainer_id from trainer_info where trainer_name in (select trainer_name from trainer_info where trainer_name like "%i%");
 -- q2
 select trainer_id from trainer_info where trainer_name not in (select trainer_name from trainer_info where trainer_name like "%i%");
 -- joins exercise 1--
 select * from batch_info;
 select * from associate_status;
 
 select * from associate_status inner join batch_info
 on associate_status.batch_id=batch_info.batch_id;
 
 select trainer_info.trainer_id,associate_id from trainer_info 
left outer join associate_status on 
trainer_info.trainer_id=associate_status.trainer_id;
