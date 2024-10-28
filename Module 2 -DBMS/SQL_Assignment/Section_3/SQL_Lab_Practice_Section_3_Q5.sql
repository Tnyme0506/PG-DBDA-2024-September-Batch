# 5. Write a view to display the total number of employees in each department

create view emp_by_dept as 
select emp.deptcode as 'Department', count(emp.empcode)
from emp
group by emp.deptcode