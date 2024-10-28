# 21. List the ‘Salesmen’ who have minimum 30 to 20 years of experience

select *, (2024 - year(joindate)) AS 'Experience'
from emp
where  (2024 - year(joindate)) between 20 and 30 and emp.desigcode= 'SLMN'