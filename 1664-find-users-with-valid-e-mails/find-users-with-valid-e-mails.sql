SELECT *
FROM Users
WHERE REGEXP_LIKE(mail, '^[a-zA-Z][A-Za-z0-9_.-]*@leetcode\\.com$', 'c');