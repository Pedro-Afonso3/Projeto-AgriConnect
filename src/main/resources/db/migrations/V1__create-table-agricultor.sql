CREATE TABLE agricultor(
    id BIGINT SERIAL  PRIMARY KEY NOT NULL,
    nome VARCHAR(100) NOT NULL,
    cep VARCHAR(200) NOT NULL,
    logradouro VARCHAR(100),
    complemento VARCHAR(100),
    bairro VARCHAR(100),
    localidade VARCHAR(100),
    uf VARCHAR(2),
    estado VARCHAR(100),
    regiao VARCHAR(100),
    produtosDisponiveis VARCHAR(300) NOT NULL
    contaAgricultor_id UUID,
    CONSTRAINT fk_contaAgricultor FOREIGN KEY (contaAgricultor_id) REFERENCES contaAgricultor (id) ON DELETE CASCADE,
);