# Write yr MySQL query statement below
select user_id,concat(upper(left(name,1)),lower(SUBSTRING(name,2))) as name
from Users
order by user_id
