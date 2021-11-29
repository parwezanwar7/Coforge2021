SELECT title
FROM film WHERE title 
LIKE 'K%' OR title LIKE 'Q%'
AND title IN 
(
SELECT title 
FROM film 
WHERE language_id = 1
);