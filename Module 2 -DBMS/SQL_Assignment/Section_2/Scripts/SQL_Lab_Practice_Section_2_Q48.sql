# 48. List the department manager of the department, in which the female employee who draws the highest salary higher than any other female employee works in 

with female_emp as (select * from emp where emp.sex = 'F')

select *
from emp
where deptcode = (select female_emp.deptcode from female_emp where female_emp.basicpay = (select max(basicpay) from female_emp)) and emp.desigcode = 'MNGR'
 

