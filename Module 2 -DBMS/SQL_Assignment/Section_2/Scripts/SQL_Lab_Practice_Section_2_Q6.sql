# 6. List the employee(s) who is senior most in the office

select * 
from emp
where joindate = (select min(joindate) from emp);