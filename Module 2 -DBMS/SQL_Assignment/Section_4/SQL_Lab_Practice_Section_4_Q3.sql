# 3. Create students table, with filed id, name, age, gender, index on id
CREATE TABLE students (
    id INT,
    name VARCHAR(100),
    age INT,
    gender VARCHAR(10),
    INDEX (id)
);
