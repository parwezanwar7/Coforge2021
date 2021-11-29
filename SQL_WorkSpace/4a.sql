SELECT last_name,COUNT(*)AS 'Number of Actors'
FROM actor GROUP BY last_name;