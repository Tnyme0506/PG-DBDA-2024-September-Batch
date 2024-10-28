# 23. List the employees and the latest take-home-pay of each employee. (Hint: Take-home-pay = basic + allowance - deductions)

select *, (salary.basic + salary.allow - salary.deduct) as 'Take-home-pay'
from salary 
where salmonth = (select salmonth from salary order by salmonth desc limit 1)