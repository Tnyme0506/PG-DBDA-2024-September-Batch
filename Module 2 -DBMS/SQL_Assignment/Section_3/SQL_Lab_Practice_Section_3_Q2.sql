# 2. Write a view to compute the employee experience with the organization

create view Employee_experience as 
select emp.empcode, emp.empname, timestampdiff(year, emp.joindate,curdate()) as 'Experience'
from emp ; 