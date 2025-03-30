CREATE DATABASE IF NOT EXISTS booking_db;
USE booking_db;

CREATE TABLE IF NOT EXISTS booking_table (
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    booking_time DATETIME,
    booking_status BOOLEAN,
    user_id INT,
    payment_id INT
)
