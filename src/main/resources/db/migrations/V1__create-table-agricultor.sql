CREATE TABLE agricultor(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    localizacao VARCHAR(100) NOT NULL,
    produtosDisponiveis VARCHAR(200) NOT NULL,
    quantidade INTEGER NOT NULL
);