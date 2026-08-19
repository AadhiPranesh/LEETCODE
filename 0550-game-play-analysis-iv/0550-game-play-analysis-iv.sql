# Write your MySQL query statement below
select round(count( distinct a.player_id)/
(select count(distinct(player_id)) from Activity),2) as  fraction
from Activity a
join(
    select player_id ,min(event_date ) as min_date
    from Activity 
    group by player_id
) as last_date
on a.player_id=last_date.player_id
and a.event_date=date_add(last_date.min_date, interval 1 day);