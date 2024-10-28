# 51. List the employees drawing salary lesser than the average salary of employees working for ‘accounts’ department 
with avg_sal as (select avg(emp.basicpay) as 'Account_Avg' from emp where emp.deptcode = 'acct')

select *
from emp
where emp.basicpay < (select * from avg_sal) and emp.deptcode = 'acct'
