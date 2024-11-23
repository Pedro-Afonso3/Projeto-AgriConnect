CREATE TABLE transportador(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    veiculo VARCHAR(100) NOT NULL,
    capacidade INTEGER NOT NULL,
    areaCobertura FLOAT NOT NULL
);