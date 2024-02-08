# Write your MySQL query statement below

SELECT B.name AS Department, A.name AS Employee, A.salary AS Salary
FROM (SELECT id, name, salary, departmentId, DENSE_RANK() OVER (PARTITION BY departmentId ORDER BY salary DESC) AS 'ranknum'
		FROM Employee) A
JOIN Department B ON A.departmentId = B.id
WHERE A.ranknum <= 3;