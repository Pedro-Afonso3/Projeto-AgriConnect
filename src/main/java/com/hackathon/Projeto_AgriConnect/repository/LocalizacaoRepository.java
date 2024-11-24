package com.hackathon.Projeto_AgriConnect.repository;

import com.hackathon.Projeto_AgriConnect.domain.localizacao.Localizacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalizacaoRepository extends JpaRepository<Localizacao, Long> {
}
