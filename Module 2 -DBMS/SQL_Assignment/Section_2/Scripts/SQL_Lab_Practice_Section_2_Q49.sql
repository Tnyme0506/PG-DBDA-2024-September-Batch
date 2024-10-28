# 49. List all male employees who draw salary greater than atleast one female employee 
 
 with female_emp as (select * from emp where emp.sex = 'F') , 
	  male_emp as (select * from emp where emp.sex = 'M')
 
select *
from male_emp
where male_emp.basicpay > (select min(female_emp.basicpay) from female_emp)
 


