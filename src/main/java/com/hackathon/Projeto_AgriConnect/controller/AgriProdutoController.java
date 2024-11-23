package com.hackathon.Projeto_AgriConnect.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.Projeto_AgriConnect.domain.produtos.AgriProduto;
import com.hackathon.Projeto_AgriConnect.domain.produtos.Produtos;
import com.hackathon.Projeto_AgriConnect.repository.ProdutosRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
public class AgriProdutoController {
  @Autowired
  private ProdutosRepository produtosRepository;

  @PostMapping("/produtos")
  public ResponseEntity<Produtos> saveProdutos(@RequestBody @Valid AgriProduto agriProduto){
    var produtos = new Produtos();
    BeanUtils.copyProperties(agriProduto, produtos);
    return ResponseEntity.status(HttpStatus.CREATED).body(produtosRepository.save(produtos));
  }
}
