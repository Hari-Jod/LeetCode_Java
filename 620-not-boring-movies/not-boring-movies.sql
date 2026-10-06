# Write your MySQL query statement below
select * from cinema where description != 'Boring' and id % 2 = 1 order by rating desc;