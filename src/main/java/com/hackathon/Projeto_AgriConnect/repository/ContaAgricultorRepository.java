package com.hackathon.Projeto_AgriConnect.repository;

import com.hackathon.Projeto_AgriConnect.domain.contaAgricultor.contaAgricultor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaAgricultorRepository extends JpaRepository<contaAgricultor, Long> {
}
