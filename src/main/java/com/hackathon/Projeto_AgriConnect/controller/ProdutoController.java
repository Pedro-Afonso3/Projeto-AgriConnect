package com.hackathon.Projeto_AgriConnect.controller;

import com.hackathon.Projeto_AgriConnect.domain.produtos.Produtos;
import com.hackathon.Projeto_AgriConnect.services.ProdutosServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutosServices produtosServices;

    @GetMapping
    public ResponseEntity<Iterable<Produtos>> showAllProdutos(){
        return ResponseEntity.ok(produtosServices.showAll());
    }

    @PostMapping
    public ResponseEntity<Produtos> insertProdutos(@RequestBody @Valid Produtos produtos){
        produtosServices.insertProdutos(produtos);
        return ResponseEntity.ok(produtos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produtos> updateProdutos(@PathVariable Long id, @RequestBody Produtos produtos) throws Exception {
        produtosServices.updateProdutos(id,produtos);
        return ResponseEntity.ok(produtos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Produtos> deleteProdutos(@PathVariable Long id){
        produtosServices.deleteProduts(id);
        return ResponseEntity.ok().build();
    }
}
