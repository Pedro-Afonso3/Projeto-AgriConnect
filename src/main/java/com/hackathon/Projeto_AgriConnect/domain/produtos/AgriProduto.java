package com.hackathon.Projeto_AgriConnect.domain.produtos;

import java.math.BigDecimal;

import com.hackathon.Projeto_AgriConnect.domain.agricultor.Agricultor;


//NotBlank e NotNull não podemoa deixa os campos vazios
public record AgriProduto(String name, BigDecimal preco,Integer quantidade, Agricultor agricultor_id) {

}
