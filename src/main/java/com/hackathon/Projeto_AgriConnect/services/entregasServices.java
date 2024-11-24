package com.hackathon.Projeto_AgriConnect.services;

import java.util.Optional;


import com.hackathon.Projeto_AgriConnect.domain.agricultor.Agricultor;
import com.hackathon.Projeto_AgriConnect.domain.transportador.Transportador;
import com.hackathon.Projeto_AgriConnect.repository.AgricultorRepository;
import com.hackathon.Projeto_AgriConnect.repository.TransportadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.hackathon.Projeto_AgriConnect.domain.entregas.Entregas;
import com.hackathon.Projeto_AgriConnect.repository.EntregasRepository;

@Service
public class entregasServices {
  @Autowired
  private EntregasRepository entregasRepository;

  @Autowired
  AgricultorRepository agricultorRepository;

  @Autowired
  TransportadorRepository transportadorRepository;

  public Optional<Entregas> findById(Long id) {
    Optional<Entregas> result = entregasRepository.findById(id);
    return result;
  }

  public Iterable<Entregas> showAll(){
    return entregasRepository.findAll();
  }

  public void insertEntregas(Entregas entregas){
    entregasRepository.save(entregas);
  }

  public Agricultor salvarAgricultor(Agricultor agricultor) {
    return agricultorRepository.save(agricultor);
  }

  public Transportador salvarTransportador(Transportador transportador) {
    return transportadorRepository.save(transportador);
  }

  /*public List<Entregas> obterEntregasPorAgricultor(Long agricultorId) {
    Agricultor agricultor = agricultorRepository.findById(agricultorId).orElse(null);
    return agricultor != null ? agricultor.getEntregas() : null;
  }*/

  public List<Entregas> obterEntregasPorTransportador(Long transportadorId) {
    Transportador transportador = transportadorRepository.findById(transportadorId).orElse(null);
    return transportador != null ? transportador.getEntregas() : null;
  }

  public void deleteEntregas(Long id){
    entregasRepository.deleteById(id);
  }

  public void updateEntregas(Long id,Entregas entregas) throws Exception {
    Optional<Entregas> entregas1 = entregasRepository.findById(id);

    if (entregas1.isPresent()) {
      Entregas entregasExists = entregas1.get();

      if (entregas.getNomeProduto() != null) {
        entregasExists.setNomeProduto(entregas.getNomeProduto());
      }
      if (entregas.getQuantidade() != null) {
        entregasExists.setQuantidade(entregas.getQuantidade());
      }
      if (entregas.getAgricultor() != null) {
        entregasExists.setAgricultor(entregas.getAgricultor());
      }
      if (entregas.getTransportador() != null) {
        entregasExists.setTransportador(entregas.getTransportador());
      }
      if (entregas.getStatus() != null) {
        entregasExists.setStatus(entregas.getStatus());
      }
      if (entregas.getCep() != null) {
        entregasExists.setCep(entregas.getCep());
      }
      if (entregas.getEstado() != null) {
        entregasExists.setEstado(entregas.getEstado());
      }
      if (entregas.getUf() != null) {
        entregasExists.setUf(entregas.getUf());
      }
      if (entregas.getBairro() != null) {
        entregasExists.setBairro(entregas.getBairro());
      }
      if (entregas.getComplemento() != null) {
        entregasExists.setComplemento(entregas.getComplemento());
      }
      if (entregas.getLocalidade() != null) {
        entregasExists.setLocalidade(entregas.getLocalidade());
      }
      if (entregas.getLogradouro() != null) {
        entregasExists.setLogradouro(entregas.getLogradouro());
      }


      entregasRepository.save(entregasExists);
    }else {
      throw  new Exception("Entrega não encontrada");
    }


  }
}
