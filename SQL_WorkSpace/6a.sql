SELECT first_name,last_name,address
FROM staff s
JOIN address a
ON s.address_id=a.address_id;