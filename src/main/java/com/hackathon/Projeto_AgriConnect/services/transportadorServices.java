package com.hackathon.Projeto_AgriConnect.services;

import com.hackathon.Projeto_AgriConnect.domain.transportador.Transportador;
import com.hackathon.Projeto_AgriConnect.repository.TransportadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class transportadorServices {

    @Autowired
    TransportadorRepository repository;

    public Iterable<Transportador> showAllTransportadores(){
        return repository.findAll();
    }

    public Optional<Transportador> showTransportadoresById(Long id){
        return repository.findById(id);
    }

    public void insertTransportador(Transportador transportador){
        repository.save(transportador);
    }

    public void updateTransportador(Long id,Transportador transportador){
        Optional<Transportador> transportador1 = repository.findById(id);
        if(transportador1.isPresent()){
            Transportador transportadorExists =transportador1.get();

            if(transportador.getNome() != null){
                transportadorExists.setNome(transportador.getNome());
            }

            if(transportador.getVeiculo() != null){
                transportadorExists.setVeiculo(transportador.getVeiculo());
            }

            if(transportador.getCapacidade() != null){
                transportadorExists.setCapacidade(transportador.getCapacidade());
            }

            if(transportador.getAreaCobertura() != null){
                transportadorExists.setAreaCobertura(transportador.getAreaCobertura());
            }

            repository.save(transportador);
        }else{
            throw new RuntimeException("Transportador não encontrado");
        }
    }

    public void deleteTransportador(Long id){
        repository.deleteById(id);
    }

}
