

insert into Passport(id,number)
 values(1,'E23342');
insert into Passport(id,number)
 values(2,'F24343');
insert into Passport(id,number)
 values(3,'H34E23');
 
 
insert into Student(id,name,passport_id)
values(11,'nuthan',1);
insert into Student(id,name,passport_id)
values(12,'kushal',2);
insert into Student(id,name,passport_id)
values(13,'rohith',3);





insert into Course(id,course)
 values(301,'java');
insert into Course(id,course)
 values(302,'DS');
insert into Course(id,course) 
values(303,'dbms');





insert into Review(id,rating,description,course_id)
 values (200,'5','Great',301);
insert into Review(id,rating,description,course_id)
 values (201,'5','Great',301);
insert into Review(id,rating,description,course_id)
 values (202,'5','Great',303);


insert into student_course(student_id,course_id) values(11,301);
insert into student_course(student_id,course_id) values(11,302);
insert into student_course(student_id,course_id) values(13,301);
insert into student_course(student_id,course_id) values(12,301);

 