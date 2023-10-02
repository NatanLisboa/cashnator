CREATE TABLE user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(255),
    identification VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255),
    type VARCHAR(255),
    balance DECIMAL(19, 4) DEFAULT 0.0000
);