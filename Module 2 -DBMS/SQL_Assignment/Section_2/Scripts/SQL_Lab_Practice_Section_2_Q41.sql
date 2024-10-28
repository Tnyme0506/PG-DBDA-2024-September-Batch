# 41. List the employees who draws highest salary 

select * 
from emp
where basicpay = (select max(basicpay) from emp)
