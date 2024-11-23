package com.hackathon.Projeto_AgriConnect.domain.produtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

//NotBlank e NotNull não podemoa deixa os campos vazios
public record AgriProduto(@NotBlank String name, @NotNull BigDecimal preco, @NotNull Integer quantidade) {

}
