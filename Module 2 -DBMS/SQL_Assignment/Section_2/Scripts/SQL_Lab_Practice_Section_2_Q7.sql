# 7. List the employees who will retire from the office next.

select *,(60 -(2024 - year(birthdate))) as years_till_retirement
from emp
where (60 -(2024 - year(birthdate))) > 0
order by years_till_retirement

