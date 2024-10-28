# 18. List the employees who got salary allowance between Rs.1000 to Rs.1500 in the month of January 2012.

select emp.empcode, emp.empname, salary.allow, salmonth
from emp
join salary on emp.empcode = salary.empcode
where allow between 1000 and 1500 and month(salmonth) = 01


