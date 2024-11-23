CREATE TABLE transportador(
    id BIGINT SERIAL PRIMARY KEY NOT NULL,
    nome VARCHAR(100) NOT NULL,
    veiculo VARCHAR(100) NOT NULL,
    capacidade INTEGER NOT NULL,
    areaCobertura FLOAT NOT NULL
);