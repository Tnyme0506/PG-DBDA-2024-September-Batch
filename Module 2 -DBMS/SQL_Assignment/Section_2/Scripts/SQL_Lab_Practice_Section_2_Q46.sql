# 46. List the female employee who draws the highest salary higher than any other female employee 
with female_emp as (select * from emp where emp.sex = 'F')

select *
from female_emp
where female_emp.basicpay = (select max(basicpay) from female_emp) 
