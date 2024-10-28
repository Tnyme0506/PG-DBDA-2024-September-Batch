# 32. List the number of officers reporting to each supervisor having more than 3 people working under them

select m.empname as 'Supervisor', count(e.empcode) as 'Number of Officers Reporting'
from emp m
join emp e on m.empcode = e.supcode
group by m.empname
having count(e.empcode) > 3
