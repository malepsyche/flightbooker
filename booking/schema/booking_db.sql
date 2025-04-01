CREATE DATABASE IF NOT EXISTS booking_db;
USE booking_db;

CREATE TABLE IF NOT EXISTS booking_table (
    booking_id BINARY(16) PRIMARY KEY,
    booking_time DATETIME,
    booking_status BOOLEAN,
    user_id BINARY(16),
    payment_id BINARY(16)
)
