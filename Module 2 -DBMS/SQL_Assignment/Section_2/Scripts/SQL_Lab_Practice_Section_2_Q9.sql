# 9. List the employees who work as ‘manager’ to at least one department

select emp.empname as 'Employee_Name', dept.deptname as 'Department' , desig.designame as 'Designation', emp.desigcode
from emp
join dept
on emp.deptcode = dept.deptcode  
join desig
on emp.desigcode = desig.desigcode
group by dept.deptname , emp.empname , desig.designame , emp.desigcode
having emp.desigcode = 'MNGR' and count(empname) >= 1
order by deptname
