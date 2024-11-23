package com.hackathon.Projeto_AgriConnect.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.hackathon.Projeto_AgriConnect.domain.entregas.Entregas;
import com.hackathon.Projeto_AgriConnect.domain.produtos.Produtos;
import com.hackathon.Projeto_AgriConnect.repository.EntregasRepository;

@Service
public class entregasServices {
  private EntregasRepository entregasRepository;

  public Optional<Entregas> findById(Long id) {
    Optional<Entregas> result = entregasRepository.findById(id);
    return result;
  }

}
