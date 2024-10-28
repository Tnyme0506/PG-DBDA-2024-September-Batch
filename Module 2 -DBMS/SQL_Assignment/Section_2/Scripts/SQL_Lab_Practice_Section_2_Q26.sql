# 26. List all the ‘Accounts’ department employees, first ordered by their age and then by their names.

select e.empname, (2024 - year(e.birthdate)) as Age, e.deptcode
from emp e
group by (2024 - year(e.birthdate)), e.empname, e.deptcode
having e.deptcode = 'acct'