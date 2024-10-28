# 11. List the employees working for ‘accounts’ or ‘personal’ department

select *
from emp
where emp.deptcode = 'ACCT' or 'PERS'