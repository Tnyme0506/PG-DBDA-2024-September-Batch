# 24. List the employees and the latest take-home-pay of each employee of ‘Accounts’ department.

select emp.empcode, emp.empname, (salary.basic + salary.allow - salary.deduct) as 'Take-home-pay'
from salary
join emp on salary.empcode = emp.empcode
where salmonth = (select salmonth from salary order by salmonth desc limit 1) and emp.deptcode = 'ACCT'