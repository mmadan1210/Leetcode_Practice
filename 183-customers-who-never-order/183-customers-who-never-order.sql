# Write your MySQL query statement below
Select c.name as Customers from Customers c where c.id not in (select customerId from Orders)