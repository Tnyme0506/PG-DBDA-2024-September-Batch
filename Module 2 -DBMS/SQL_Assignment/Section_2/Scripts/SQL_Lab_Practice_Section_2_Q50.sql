# 50. List the departments in which average salary of employees is more than average salary of the company 
with avg_sal as (select avg(emp.basicpay) as 'Company_Avg' from emp)

select emp.deptcode, avg(emp.basicpay)
from emp
group by emp.deptcode
having avg(emp.basicpay) > (select * from avg_sal) 