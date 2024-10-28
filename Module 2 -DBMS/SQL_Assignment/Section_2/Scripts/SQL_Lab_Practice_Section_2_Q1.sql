# List the name, employee code and designation of each employee of the office

select emp.empname as Name, emp.empcode as 'Employee Code', desig.designame as Designation
from emp
left join desig
on emp.desigcode = desig.desigcode