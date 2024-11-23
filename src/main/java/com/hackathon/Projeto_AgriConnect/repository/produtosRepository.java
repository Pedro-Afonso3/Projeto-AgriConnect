package com.hackathon.Projeto_AgriConnect.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.Projeto_AgriConnect.domain.produtos.ProdutosAgricultor;
@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosAgricultor, UUID> {

}