create table subjects(subjectid int, subjectname varchar(30));
insert into subjects values(1,'Java');
select * from subjects;


create table students(studentid int, studentname varchar(30), username varchar(30), password varchar(30));
insert into students values(101,'Akshay','akshay101','aksh');
insert into students values(102,'Pavithra','pavithra102','pavi');
select * from students;

create table staffs(staffid int, staffname varchar(30), department varchar(30), username varchar(30), password varchar(30));
insert into staffs values(201,'Vijay','Admin','vijay201','vijay007');
insert into staffs values(202,'Anitha','Faculty','anitha202','ani659');
select * from staffs;

create table questions(questionnumber int, subjectid int, question varchar(255));
insert into questions values(1,1,'How many primitive data types are there in Java?');
insert into questions values(2,1,'What is the size of float?');
insert into questions values(3,1,'What is the size of double?');
insert into questions values(4,1,'What is the return type of the method that does not return value?');
insert into questions values(5,1,'What is used to find and fix bugs in the Java program?');
select * from questions;


create table answersheets(studentid int, subjectid int, questionnumber int, response varchar(255));
select * from answersheets;


create table answerkeys(subjectid int, questionnumber int, answer varchar(255));
insert into answerkeys values(1,1,'8');
insert into answerkeys values(1,2,'32');
insert into answerkeys values(1,3,'64');
insert into answerkeys values(1,4,'void');
insert into answerkeys values(1,5,'JDB');
select * from answerkeys;


create table results(studentid int,subjectid int,result int);
insert into results values(101,1,0);
insert into results values(102,1,0);
select * from results;



