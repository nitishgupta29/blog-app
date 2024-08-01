-- Disable foreign key checks
SET REFERENTIAL_INTEGRITY FALSE;

-- Drop the child tables first
DROP TABLE IF EXISTS post_table;

-- Drop the parent table
DROP TABLE IF EXISTS user_table;

-- Enable foreign key checks again
SET REFERENTIAL_INTEGRITY TRUE;
CREATE TABLE  user_table(
   id INT PRIMARY KEY, 
   user_name VARCHAR(100) NOT NULL,
   email VARCHAR(255) NOT NULL, 
   password VARCHAR(255) NOT NULL,
   about VARCHAR(255) DEFAULT NULL
 );