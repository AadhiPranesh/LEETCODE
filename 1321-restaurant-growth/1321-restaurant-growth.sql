# Write your MySQL query statement below
select
c1.visited_on,
sum(c2.daily_amount) as amount,
round(avg(c2.daily_amount),2) as average_amount 
from (
    select visited_on,
    sum(amount) as daily_amount
    from Customer
    group by visited_on 
) c1
 join (
    select visited_on,
    sum(amount) as daily_amount
    from Customer
    group by Visited_on
 ) c2
ON c2.visited_on BETWEEN 
DATE_SUB(c1.visited_on, INTERVAL 6 DAY)
AND c1.visited_on
group by c1.visited_on
having count( c2.visited_on)=7
order by  c1.visited_on;