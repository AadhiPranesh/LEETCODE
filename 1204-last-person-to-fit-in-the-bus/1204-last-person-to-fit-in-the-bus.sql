# Write your MySQL query statement below
select person_name
from
(
    select person_name,person_id
    ,turn,
    sum(weight) over( order by turn) as total_weight
    from Queue
)  a
 where total_weight<=1000
order by  total_weight desc
limit 1;