# 3. Write a view that computes the employee pay for the current month for all the employees. 
# Hint: Compute the employee pay as the Basic+Allowance-Deduction
create view employee_pay as 
select s.empcode, emp.empname, monthname(s.salmonth) as 'Month', (s.basic + s.allow - s.deduct) as 'employee_pay'
from salary s
join emp 
on s.empcode = emp.empcode