# 36. List the department budget and the total salary drawn (by the employees of this department).

select  emp.deptcode, dept.deptname, dept.budget as Budget, sum(emp.basicpay) as 'Total_Salary_Drawn'
from dept
left join emp on dept.deptcode = emp.deptcode
group by emp.deptcode, dept.deptname, dept.budget
order by sum(emp.basicpay) desc
