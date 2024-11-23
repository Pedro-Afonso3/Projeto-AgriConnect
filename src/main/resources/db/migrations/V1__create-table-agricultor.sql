CREATE TABLE agricultor(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    localizacao VARCHAR(100) NOT NULL,
    produtosDisponiveis VARCHAR(200) NOT NULL,
    quantidade INTEGER NOT NULL,
    contaAgricultor_id UUID,
    entrega_id UUID,
    CONSTRAINT fk_contaAgricultor FOREIGN KEY (contaAgricultor_id) REFERENCES contaAgricultor (id) ON DELETE CASCADE,
    CONSTRAINT fk_entrega FOREIGN KEY (entrega_id) REFERENCES entregas (id) ON DELETE CASCADE
);