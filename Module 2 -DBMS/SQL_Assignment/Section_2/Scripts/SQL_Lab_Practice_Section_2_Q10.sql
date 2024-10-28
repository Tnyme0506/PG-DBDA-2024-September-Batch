# 10. List the number of employees working for either ‘accounts’ or ‘personal’ or ‘purchase’ departments

select count(emp.empname) as 'Number_of_Employees'
from emp
where emp.deptcode = 'ACCT'or 'PRCH'or'PERS'
