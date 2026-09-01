SELECT *
FROM Users
WHERE mail  regexp  '^[A-Za-z][A-Za-z0-9-._]*@leetcode\\.com$' 
    AND mail LIKE BINARY '%@leetcode.com'; 
