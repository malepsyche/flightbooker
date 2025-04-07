CREATE DATABASE IF NOT EXISTS booking_db;
USE booking_db;

CREATE TABLE IF NOT EXISTS booking_table (
    booking_id BINARY(16) PRIMARY KEY,
    booking_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    version INT,
    user_id BINARY(16)
)
