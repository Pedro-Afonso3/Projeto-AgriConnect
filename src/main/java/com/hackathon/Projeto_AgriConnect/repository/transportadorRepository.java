package com.hackathon.Projeto_AgriConnect.repository;

import com.hackathon.Projeto_AgriConnect.domain.transportador.Transportador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface transportadorRepository extends JpaRepository<Transportador, UUID> {
}
