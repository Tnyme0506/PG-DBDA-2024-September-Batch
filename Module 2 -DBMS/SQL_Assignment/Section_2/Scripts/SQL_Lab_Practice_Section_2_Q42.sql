# 42. List all the employees other than the employees who draw highest salary 

select * 
from emp
where basicpay != (select max(basicpay) from emp)
