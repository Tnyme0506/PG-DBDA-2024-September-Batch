# 38. List all the employees drawing salary higher than the salary drawn by ‘Jain’ 
select emp.empcode, emp.empname, emp.basicpay
from emp
where emp.basicpay > (select emp.basicpay from emp where emp.empname = 'Jain')