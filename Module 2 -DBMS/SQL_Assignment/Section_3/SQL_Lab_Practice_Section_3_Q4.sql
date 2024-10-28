# 4. List the employees who are older than their supervisors. 
# Hint: Use views to implement employee age

create view emp_sup_age as
select e.empcode, e.empname as 'Employee', timestampdiff(year, e.birthdate, curdate()) as 'Employee_Age' ,s.empname as 'Supervisor',timestampdiff(year, s.birthdate, curdate()) as 'Supervisor_Age'
from emp e
join emp s on e.empcode = s.supcode
where timestampdiff(year, e.birthdate, curdate()) > timestampdiff(year, s.birthdate, curdate())