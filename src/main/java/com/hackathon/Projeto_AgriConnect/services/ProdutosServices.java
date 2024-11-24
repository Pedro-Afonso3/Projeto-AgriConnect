package com.hackathon.Projeto_AgriConnect.services;

import com.hackathon.Projeto_AgriConnect.domain.produtos.Produtos;
import com.hackathon.Projeto_AgriConnect.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutosServices {

    @Autowired
    ProdutosRepository repository;

    public void insertProdutos(Produtos produtos){
        repository.save(produtos);
    }

    public void deleteProduts(Long id){
        repository.deleteById(id);
    }

    public Iterable<Produtos> showAll(){
        return repository.findAll();
    }

    public void updateProdutos(Long id,Produtos produtos) throws Exception {
        Optional<Produtos> produtos1 = repository.findById(id);
        if(produtos1.isPresent()){
            Produtos produtosExists = produtos1.get();

            if(produtos.getNome() != null){
                produtosExists.setNome(produtos.getNome());
            }

            if(produtos.getPreco() != null){
                produtosExists.setPreco(produtos.getPreco());
            }

            if(produtos.getQuantidade() != null){
                produtosExists.setQuantidade(produtos.getQuantidade());
            }

            repository.save(produtosExists);

        }else {
            throw new Exception("Produto não está cadastrado, verifique o ID!!");
        }
    }
}
