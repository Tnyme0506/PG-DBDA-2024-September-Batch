# 33. List the employees who have not got any promotion till now.

select empcode, count(history.empcode) as Number_of_Promotions
from history 
group by history.empcode
having count(history.empcode) = 0 ;