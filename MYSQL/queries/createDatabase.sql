CREATE DATABASE school;
USE school;
CREATE TABLE students (
  roll_no INT PRIMARY KEY,
  name VARCHAR(50),
  class INT CHECK (class BETWEEN 1 AND 12),
  marks FLOAT
);