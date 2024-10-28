# 5. List the employees who are working directly under superior most employee of the office. (Assume the superior most employee is the employee who does not have a supervisor)
select *
from emp
where supcode = '7839'