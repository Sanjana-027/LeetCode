# Write your MySQL query statement below

SELECT p.firstName, p.lastName, a.city, a.state FROM person p, address a
WHERE p.personId = a.personId
UNION
SELECT firstName, lastName, null AS city, null as state FROM Person WHERE person.personId NOT IN (SELECT personId FROM address);
