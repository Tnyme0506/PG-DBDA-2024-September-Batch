# 7. Use the views in Qn No 5 & Qn No 6, to display the percentage of employees in each department

select emp_by_dept.Department, emp_by_dept.no_of_employees, 
	((emp_by_dept.no_of_employees / (select * from total_employees)) * 100) as 'Percentage_Employees'
from emp_by_dept