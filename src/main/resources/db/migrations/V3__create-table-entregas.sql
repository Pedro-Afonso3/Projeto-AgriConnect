CREATE TABLE entregas(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    produto VARCHAR(100) NOT NULL,
    quantidade INTEGER NOT NULL,
    dataHoraEntregar TIMESTAMP NOT NULL,
    localEntrega VARCHAR(200) NOT NULL
);