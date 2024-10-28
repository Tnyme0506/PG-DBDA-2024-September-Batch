# 31. List the employees with names of their supervisors (Hint: Use Join).

select m.empname, e.empname as 'Supervisor Name'
from emp m
join emp e on e.empcode = m.supcode