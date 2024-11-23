package com.hackathon.Projeto_AgriConnect.repository;

import com.hackathon.Projeto_AgriConnect.domain.agricultor.Agricultor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface agricultorRepository extends JpaRepository<Agricultor, UUID> {
}
