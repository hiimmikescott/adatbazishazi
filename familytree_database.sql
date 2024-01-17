-- Create the database
CREATE DATABASE IF NOT EXISTS family_tree;

-- Switch to the created database
USE family_tree;

-- Create the table 'family_members'
CREATE TABLE IF NOT EXISTS family_members (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(40) NOT NULL,
    birth_date INT,
    birth_place VARCHAR(40),
    mother_name VARCHAR(40),
    father_name VARCHAR(40)
);

-- Insert a new family member
INSERT INTO family_members (name, birth_date, birth_place, mother_name, father_name)
VALUES ('John Doe', 1990, 'Cityville', 'Jane Doe', 'Jack Doe');


