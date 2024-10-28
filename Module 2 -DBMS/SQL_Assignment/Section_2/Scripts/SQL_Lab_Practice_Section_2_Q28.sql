# 28. List the employees who have atleast one person working under him/her and the
#number of their subordinates. List the employee with highest number of
#subordinates first, next the person with next highest number of subordinates and
#so on.

SELECT m.empcode AS manager_empcode, m.empname AS manager_empname,  desig.designame, COUNT(e.empcode) AS number_of_subordinates
FROM emp m
JOIN emp e ON m.empcode = e.supcode  
join desig on m.desigcode = desig.desigcode
GROUP BY m.empcode, m.empname
HAVING COUNT(e.empcode) > 0
ORDER BY number_of_subordinates DESC;


