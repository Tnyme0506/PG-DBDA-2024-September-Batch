# 47. List the department name of the female employee who draws the highest salary higher than any other female employee 

with female_emp as (select * from emp where emp.sex = 'F')

select female_emp.deptcode, dept.deptname 
from female_emp
join dept
on female_emp.deptcode = dept.deptcode
where female_emp.basicpay = (select max(basicpay) from female_emp) 
