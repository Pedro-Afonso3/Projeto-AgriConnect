CREATE TABLE produtos(
     id BIGINT SERIAL PRIMARY KEY NOT NULL,
     nome VARCHAR(100) NOT NULL,
     preco FLOAT NOT NULL,
     quantidade INTEGER NOT NULL,
     agricultor_id UUID,
      CONSTRAINT fk_agricultor FOREIGN KEY (agricultor_id) REFERENCES agricultor (id) ON DELETE CASCADE
);