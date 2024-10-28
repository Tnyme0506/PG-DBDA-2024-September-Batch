# 45.List the employee(s) who are getting fifth highest salary. 

with ranked_salaries as(
							select *, dense_rank() over (order by emp.basicpay desc) as ranking
                            from emp
						)

select * 
from emp
where emp.empcode in (select empcode from ranked_salaries where ranking = 5) 

