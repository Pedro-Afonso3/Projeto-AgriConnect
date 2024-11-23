package com.hackathon.Projeto_AgriConnect.repository;

import com.hackathon.Projeto_AgriConnect.domain.produtos.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface produtosRepository extends JpaRepository<Produtos, Long> {
}
