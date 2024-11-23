package com.hackathon.Projeto_AgriConnect.domain.produtos;

import com.hackathon.Projeto_AgriConnect.domain.agricultor.Agricultor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

//NotBlank e NotNull não podemoa deixa os campos vazios
public record AgriProduto(@NotBlank String name, @NotNull float preco, @NotNull Integer quantidade, Agricultor agricultor) {

}
