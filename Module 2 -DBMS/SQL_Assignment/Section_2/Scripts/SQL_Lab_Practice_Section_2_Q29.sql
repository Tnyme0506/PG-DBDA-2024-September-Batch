# 29. List the employees who have minimum 3 employees working under him/her.

select m.empcode, m.empname, desig.designame as Designation, count(e.empcode) as 'Number_of_Subordinates'
from emp m
join emp e on m.empcode = e.supcode
join desig on desig.desigcode = m.desigcode 
group by  m.empcode, m.empname, desig.designame
having count(e.empcode) >= 3
