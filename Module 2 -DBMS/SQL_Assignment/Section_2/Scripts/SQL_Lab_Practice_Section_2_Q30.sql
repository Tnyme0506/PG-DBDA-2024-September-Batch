# 30. List the minimum and maximum salaries drawn in each grade code.

SELECT gradecode, MIN(basicpay) AS Minimum_Salary, MAX(basicpay) AS Maximum_Salary
FROM emp
GROUP BY gradecode;
