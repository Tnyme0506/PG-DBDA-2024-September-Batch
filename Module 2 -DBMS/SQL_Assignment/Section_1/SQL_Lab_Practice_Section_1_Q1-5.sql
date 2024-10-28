create table dept(
	deptcode varchar(15), 
    deptname varchar(60), 
    budget integer,
    primary key (deptcode));

create table grade(
	gradecode varchar(15), 
    gradelevel varchar(30), 
    gradedescription varchar(60), 
    basic integer,
    primary key (gradecode, gradelevel));

create table desig(
	desigcode varchar(15), 
    designame varchar(15),
    primary key (desigcode));

create table emp(
	empcode varchar(15), 
    empname varchar(60), 
    deptcode varchar(15),
    birthdate date not null, 
    joindate date not null, 
    sex char(1) check (sex in  ('M', 'F', 'T')),
    desigcode varchar(15), 
    supcode varchar(15), 
    gradecode varchar(15),
    gradelevel varchar(30), 
    basicpay integer,
    primary key (empcode),
	foreign key (deptcode) references dept(deptcode),
    foreign key (desigcode) references desig(desigcode),
	foreign key (supcode) references emp(empcode),
	foreign key (gradecode, gradelevel) references grade (gradecode, gradelevel));

create table salary(
	empcode varchar(15), 
    salmonth date not null, 
    basic int, 
	allow int, 
    deduct int,
    primary key (empcode, salmonth),
	foreign key (empcode) references emp(empcode));

create table history(
	empcode varchar(15), 
    changedate date not null, 
    desigcode varchar(15), 
    gradecode varchar(15), 
    gradelevel varchar(30), 
    basicpay int,
    primary key (empcode, changedate, desigcode, gradecode, gradelevel),
	foreign key (empcode) references emp (empcode),
    foreign key (desigcode) references desig(desigcode),
	foreign key (gradecode, gradelevel) references grade(gradecode, gradelevel));
    
   