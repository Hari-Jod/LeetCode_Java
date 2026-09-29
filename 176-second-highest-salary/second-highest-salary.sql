# Write your MySQL query statement below
-- select salary,Rank() over(order by salary) as SecondHighestSalary from employee;
select max(salary) as SecondHighestSalary from employee where salary < (select max(salary) from employee);