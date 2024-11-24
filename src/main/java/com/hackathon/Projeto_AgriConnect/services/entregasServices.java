package com.hackathon.Projeto_AgriConnect.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.hackathon.Projeto_AgriConnect.domain.entregas.Entregas;
import com.hackathon.Projeto_AgriConnect.domain.produtos.ProdutosAgricultor;
import com.hackathon.Projeto_AgriConnect.repository.EntregasRepository;

@Service
public class entregasServices {
  private EntregasRepository entregasRepository;

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
