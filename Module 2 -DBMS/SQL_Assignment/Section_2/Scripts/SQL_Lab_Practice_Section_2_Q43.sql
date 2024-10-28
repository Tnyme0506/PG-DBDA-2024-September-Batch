# 43. List the employees who draw highest salary in each department 

select emp.empcode as Code, emp.empname as Name, emp.deptcode as Department, emp.basicpay as Salary
from emp
join (select emp.deptcode, max(emp.basicpay) as max 
	  from emp 
      group by emp.deptcode) as max_salary
on emp.deptcode = max_salary.deptcode and emp.basicpay = max_salary.max
order by emp.deptcode
