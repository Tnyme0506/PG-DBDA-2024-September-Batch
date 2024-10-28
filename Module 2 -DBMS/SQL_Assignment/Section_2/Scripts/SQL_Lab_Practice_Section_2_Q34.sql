# 34. List the employee with maximum number of promotions. Also list the number of promotions that he/she got.

SELECT empcode, COUNT(history.empcode) AS Number_of_Promotions
FROM history
GROUP BY history.empcode
ORDER BY COUNT(history.empcode) DESC
LIMIT 1