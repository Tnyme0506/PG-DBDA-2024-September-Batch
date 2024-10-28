# 3. List the employees and their respective department names

SELECT emp.empname AS 'Employees', dept.deptname AS 'Department'
FROM emp
JOIN dept ON emp.deptcode = dept.deptcode;
