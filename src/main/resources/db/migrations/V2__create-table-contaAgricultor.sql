CREATE TABLE contaAgricultor(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    login VARCHAR(100) NOT NULL,
    senha VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL

);