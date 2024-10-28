# 1. Write a view to compute the employee age of the organization

create view Employee_Age as 
select emp.empcode, emp.empname, timestampdiff(year, emp.birthdate,curdate()) as 'Age'
from emp ; 