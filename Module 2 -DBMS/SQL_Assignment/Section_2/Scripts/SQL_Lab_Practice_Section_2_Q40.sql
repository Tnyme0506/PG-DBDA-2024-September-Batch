# 40. List all the employees who have greater than average pay. Display the result in the increasing order of the salary.

select *
from emp
where emp.basicpay > (select avg(emp.basicpay) from emp)
order by emp.basicpay