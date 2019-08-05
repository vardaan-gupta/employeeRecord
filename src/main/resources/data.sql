DROP TABLE IF EXISTS employees;
 
CREATE TABLE employees (
  employee_id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) DEFAULT NULL,
  last_name VARCHAR(250) DEFAULT NULL,
  hire_date TIMESTAMP DEFAULT NULL,
  salary   INT DEFAULT NULL,
  date_of_birth  TIMESTAMP  DEFAULT NULL,
  department    VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO employees (first_name, last_name, hire_date, salary, date_of_birth, department) VALUES
  ('Foo1', 'Bar', '2018-11-03 17:25:00', 23456, '1987-11-30 17:25:00', 'Finance');
INSERT INTO employees (first_name, last_name, hire_date, salary, date_of_birth, department) VALUES
  ('Foo2', 'Bar', '2018-11-05 17:25:00', 223456, '1988-11-30 17:25:00', 'Technology');
INSERT INTO employees (first_name, last_name, hire_date, salary, date_of_birth, department) VALUES
  ('Foo3', 'Bar', '2018-11-05 14:25:00', 3456, '1988-11-30 17:25:00', 'Operations');