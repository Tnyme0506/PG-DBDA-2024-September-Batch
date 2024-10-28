select emp.empname as 'Employee_Name', dept.deptname as 'Department' , desig.designame as 'Designation'
from emp
join dept
on emp.deptcode = dept.deptcode  
join desig
on emp.desigcode = desig.desigcode
where emp.desigcode = 'MNGR'
ORDER BY deptname DESC