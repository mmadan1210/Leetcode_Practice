# Write your MySQL query statement below
SELECT Person.firstName,Person.lastName,Address.city,Address.state
from Person 
left Join Address on Person.personId = Address.personID;
