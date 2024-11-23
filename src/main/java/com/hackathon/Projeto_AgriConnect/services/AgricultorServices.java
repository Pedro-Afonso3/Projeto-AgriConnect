package com.hackathon.Projeto_AgriConnect.services;

import com.hackathon.Projeto_AgriConnect.domain.agricultor.Agricultor;
import com.hackathon.Projeto_AgriConnect.domain.contaAgricultor.contaAgricultor;
import com.hackathon.Projeto_AgriConnect.repository.AgricultorRepository;
import com.hackathon.Projeto_AgriConnect.repository.ContaAgricultorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgricultorServices {

    @Autowired
    AgricultorRepository repository;

    public void insertAgricultor(Agricultor agricultor){
        repository.save(agricultor);
    }
}