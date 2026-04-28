create table department_new(did int primary key,dname varchar(20))

create table employee_new (eid int primary key auto_increment , 
ename varchar(20),
salary int,
email varchar(20),
dept_id int,
foreign key (dept_id) references department_new(did))

insert into department_new values(101,'Software'),
(102,'HR'),
(103,'marketing'),
(104,'Finanace')

insert into employee_new(ename,salary,email,dept_id) values('Krutik',12000,'kru@gmail.com',101),
('Nehal',12500,'nehal@gmail.com',104),
('urmi',13000,'Urmi@gmail.com',103),
('Bansari',22000,'bansari@gmail.com',101),
('dharmishtha',10000,'dharmitha@gmail.com',102)

alter table employee_new add city varchar(20) default 'Ahemdabad'

select * from department_new

select city,email,ename from employee_new

select * from employee_new

update employee_new set city='Surat' where eid=9

-- fetch ename ,email from employee table
select ename,email from employee_new

-- fetch all the details of employees 

select * from employee_new

-- fetch details of employee whose belongs to Surat
select * from employee_new where city='Surat'

-- fetch email,salary and emp name who are belongs to surat
select email,salary , ename from employee_new where city='surat'

-- fetch emp details who is from surat and whose salary is more than 50000
select * from employee_new where city='surat' and salary>15000

-- fetch emp details who is from surat or whose salary is more than 50000
select * from employee_new where city='surat' or salary>50000

-- fetch those employees whose salary is between 10000 to 15000
select * from employee_new where salary between 10000 and 15000

-- fetch those employee whose belongs to ahmedabad and baroda and surat
select * from employee_new where city in('Ahemdabad','baroda','surat')

-- fetch details of employees by ascending order of ename
select * from employee_new order by ename desc

-- fetch  employee details asecending ename and city 
select * from employee_new order by ename,city

-- fetch emp details among department name
select eid,ename ,salary,dname from employee_new,department_new 
where employee_new.dept_id=department_new.did

select * from employee_new