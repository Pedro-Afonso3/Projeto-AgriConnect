package com.hackathon.Projeto_AgriConnect.repository;

import com.hackathon.Projeto_AgriConnect.domain.entregas.Entregas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntregasRepository extends JpaRepository<Entregas, Long> {
}
