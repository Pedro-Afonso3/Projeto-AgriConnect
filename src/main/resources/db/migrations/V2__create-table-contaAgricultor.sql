CREATE TABLE contaAgricultor(
    id BIGINT SERIAL PRIMARY KEY NOT NULL,
    login VARCHAR(100) NOT NULL,
    senha VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    agricultor_id BIGINT,
    CONSTRAINT fk_agricultor FOREIGN KEY (agricultor_id) REFERENCES agricultor (id) ON DELETE CASCADE,
);