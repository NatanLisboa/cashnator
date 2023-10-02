CREATE TABLE transaction (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    value DECIMAL(19, 4) NOT NULL,
    payer_id BIGINT NOT NULL,
    payee_id BIGINT NOT NULL,
    FOREIGN KEY (payer_id) REFERENCES user(id),
    FOREIGN KEY (payee_id) REFERENCES user(id)
);