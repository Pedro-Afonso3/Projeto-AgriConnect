CREATE TABLE produtos(
     id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
     nome VARCHAR(100) NOT NULL,
     preco FLOAT NOT NULL,
     quantidade INTEGER NOT NULL
);