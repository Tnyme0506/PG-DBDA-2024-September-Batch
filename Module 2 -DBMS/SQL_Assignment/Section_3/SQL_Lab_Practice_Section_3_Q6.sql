# 6. Write a view to display the total number of employees in the organization
create view total_employees as
select count(emp.empcode) as 'Total_Employees'
from emp