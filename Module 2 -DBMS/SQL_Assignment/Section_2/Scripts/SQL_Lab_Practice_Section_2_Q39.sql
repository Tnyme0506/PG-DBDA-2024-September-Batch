# 39. List all the employees who have higher salary than all the employees who draw salary in the range of 11000 to 12000. 
select emp.empcode, emp.empname, emp.basicpay
from emp
where emp.basicpay > 12000
