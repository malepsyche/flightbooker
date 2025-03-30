CREATE DATABASE IF NOT EXISTS user_db;
USE user_db;

CREATE TABLE IF NOT EXISTS user_table (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS role_table (
    role_id INT AUTO_INCREMENT PRIMARY KEY,
    role_name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS order_table (
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    order_name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS user_role_table (
    user_id INT NOT NULL REFERENCES user_table(user_id),
    role_id INT NOT NULL REFERENCES role_table(role_id),
    PRIMARY KEY (user_id, role_id)
);

CREATE TABLE IF NOT EXISTS user_order_table (
    user_id INT NOT NULL REFERENCES user_table(user_id),
    order_id INT NOT NULL REFERENCES order_table(order_id),
    PRIMARY KEY (user_id, order_id)
);