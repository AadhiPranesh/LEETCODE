# Write your MySQL query statement below
SELECT product_id, 10 AS price
FROM Products
GROUP BY product_id
HAVING MIN(change_date) > '2019-08-16'

UNION

select p.product_id ,p.new_price as price from Products p
 join (select  product_id , Max(change_date) as latest_Date
 from Products
 where change_date <= "2019-08-16"
 group by product_id
 ) t
 on  p.product_id=t.product_id
 and p.change_date=t.latest_Date

 order by   product_id asc ;
  