#17. List the employees who are drawing basic salary not between 11000 and 12000
select distinct emp.empcode, emp.empname, min(salary.basic) as 'Salary'
from salary
join emp
on salary.empcode = emp.empcode
group by emp.empcode, emp.empname
having min(salary.basic)not between 11000 and 12000