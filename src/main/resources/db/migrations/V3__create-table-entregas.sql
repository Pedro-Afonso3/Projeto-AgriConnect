CREATE TABLE entregas(
    id BIGINT SERIAL PRIMARY KEY NOT NULL,
    nomeProduto VARCHAR(100) NOT NULL,
    quantidade INTEGER NOT NULL,
    cep VARCHAR(200) NOT NULL,
    logradouro VARCHAR(100),
    complemento VARCHAR(100),
    bairro VARCHAR(100),
    localidade VARCHAR(100),
    uf VARCHAR(2),
    estado VARCHAR(100),
    regiao VARCHAR(100),
    status VARCHAR(20),
    dataHoraAgendada TIMESTAMP NOT NULL,
    contaAgricultor_id BIGINT,
    transportador_id BIGINT,
    CONSTRAINT fk_contaAgricultor FOREIGN KEY (contaAgricultor_id) REFERENCES contaAgricultor (id) ON DELETE CASCADE,
    CONSTRAINT fk_transportador FOREIGN KEY (transportador_id) REFERENCES transportador (id) ON DELETE CASCADE

);