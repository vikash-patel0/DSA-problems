# Write your MySQL query statement below
select 
    p.product_id,
    coalesce(round(sum(pr.price*u.units)/sum(u.units),2),0) as average_price
from (select distinct product_id from Prices) p
left join UnitsSold as u
    ON u.product_id = p.product_id
left join Prices as pr
    ON u.product_id = pr.product_id
    and u.purchase_date BETWEEN pr.start_date AND pr.end_date
group by p.product_id;

/*
coalesce -> standard 
ifnull -> mysql specific
*/