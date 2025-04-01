CREATE DATABASE IF NOT EXISTS user_db;
USE user_db;

CREATE TABLE IF NOT EXISTS user_table (
    user_id BINARY(16) PRIMARY KEY,
    user_name VARCHAR(255) NOT NULL
);



