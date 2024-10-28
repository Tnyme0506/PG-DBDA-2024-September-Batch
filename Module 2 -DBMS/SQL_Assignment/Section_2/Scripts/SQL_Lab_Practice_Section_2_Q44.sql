# 44. List the employee(s) getting second highest salary 
with ranked_salaries as(
							select *, dense_rank() over (order by emp.basicpay desc) as ranking
                            from emp
						)

select * 
from emp
where emp.empcode = (select empcode from ranked_salaries where ranking = 2)
