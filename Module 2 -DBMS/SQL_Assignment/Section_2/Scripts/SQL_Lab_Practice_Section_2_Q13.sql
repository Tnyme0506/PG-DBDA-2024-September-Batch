# 13. List the employees working for ‘accounts’ but not for ‘personal’ department
select * 
from emp
where emp.deptcode = 'ACCT' and emp.empcode not in (select empcode from emp where emp.deptcode = 'PERS') 