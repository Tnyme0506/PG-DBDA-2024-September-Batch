# 20. List the employees who have atleast 25 years of experience

select *, (2024 - year(e.joindate)) as Experience
from emp e
where (2024 - year(e.joindate)) >= 25