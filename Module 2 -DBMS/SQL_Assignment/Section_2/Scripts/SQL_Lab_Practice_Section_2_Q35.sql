# 35. List the employees who got promoted in the year 1991. 

select emp.empcode, emp.empname
from emp
join  history 
on emp.empcode = history.empcode 
where year(history.changedate) = 1991