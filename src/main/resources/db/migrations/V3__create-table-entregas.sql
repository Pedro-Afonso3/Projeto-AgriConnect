CREATE TABLE entregas(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    produto VARCHAR(100) NOT NULL,
    quantidade INTEGER NOT NULL,
    cep VARCHAR(200) NOT NULL,
    logradouro VARCHAR(100),
    complemento VARCHAR(100),
    bairro VARCHAR(100),
    localidade VARCHAR(100),
    uf VARCHAR(2),
    estado VARCHAR(100),
    regiao VARCHAR(100),
    contaAgricultor_id UUID,
    transportador_id UUID,
    CONSTRAINT fk_contaAgricultor FOREIGN KEY (contaAgricultor_id) REFERENCES contaAgricultor (id) ON DELETE CASCADE,
    CONSTRAINT fk_transportador FOREIGN KEY (transportador_id) REFERENCES transportador (id) ON DELETE CASCADE

);