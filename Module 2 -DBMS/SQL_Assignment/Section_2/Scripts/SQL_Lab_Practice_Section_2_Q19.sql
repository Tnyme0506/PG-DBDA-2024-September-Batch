# 19. List the employees whose name ends with ‘i’ or ‘y’
select *
from emp as e
where e.empname like '%i' or e.empname like '%y'