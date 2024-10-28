# 25. List employees and their respective ages.
select emp.empcode, emp.empname, (2024 - year(emp.birthdate)) as Age
from emp