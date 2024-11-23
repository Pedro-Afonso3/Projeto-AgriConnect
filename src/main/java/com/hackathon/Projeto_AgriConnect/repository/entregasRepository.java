package com.hackathon.Projeto_AgriConnect.repository;

import com.hackathon.Projeto_AgriConnect.domain.entregas.Entregas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface entregasRepository extends JpaRepository<Entregas, UUID> {
}
