CREATE TABLE transportador(
    id BIGINT SERIAL PRIMARY KEY NOT NULL,
    nome VARCHAR(100) NOT NULL,
    veiculo VARCHAR(100) NOT NULL,
    capacidade INTEGER NOT NULL,
    areaCobertura FLOAT NOT NULL,
    entrega_id BIGINT,
     CONSTRAINT fk_entrega FOREIGN KEY (entrega_id) REFERENCES entregas (id) ON DELETE CASCADE
);