# 22. List the basic salary and half of the basic salary for each employee

select distinct salary.empcode, salary.basic, (salary.basic/2) AS 'Half basic salary'
from salary