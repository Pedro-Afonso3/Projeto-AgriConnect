package com.hackathon.Projeto_AgriConnect.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.Projeto_AgriConnect.domain.produtos.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, UUID> {

}