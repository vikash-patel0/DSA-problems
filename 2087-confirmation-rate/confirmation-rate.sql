# Write your MySQL query statement below
select s.user_id, Round(Coalesce(COUNT(CASE WHEN c.action = 'confirmed' THEN 1 END)*1.0/nullif(count(c.action),0),0),2) as confirmation_rate
from Signups as s
left join Confirmations as c
on s.user_id=c.user_id
group by user_id;


/*
COUNT(CASE WHEN c.action = 'confirmed' THEN 1 END)
instead of
SUM(CASE WHEN action = 'confirmed' THEN 1 ELSE 0 END)
count confirm rate/ count(all action)

*/