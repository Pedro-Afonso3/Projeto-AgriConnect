package com.hackathon.Projeto_AgriConnect.services;

import com.hackathon.Projeto_AgriConnect.domain.contaAgricultor.contaAgricultor;
import com.hackathon.Projeto_AgriConnect.repository.ContaAgricultorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class contaAgricultorServices {

    @Autowired
    ContaAgricultorRepository repository;

    public void insertConta(contaAgricultor contaAgricultor){
        repository.save(contaAgricultor);
    }

    public Iterable<contaAgricultor> showContas(){
        return repository.findAll();
    }

    public void deleteConta(Long id){
        repository.deleteById(id);
    }

    public void updateConta(Long id,contaAgricultor contaAgricultor){
        Optional<contaAgricultor> contaAgricultor1 =repository.findById(id);
        if(contaAgricultor1.isPresent()){
            contaAgricultor contaAgricultorExisting = contaAgricultor1.get();

            if(contaAgricultor.getLogin() != null){
                contaAgricultorExisting.setLogin(contaAgricultor.getLogin());
            }

            if(contaAgricultor.getSenha() != null){
                contaAgricultorExisting.setSenha(contaAgricultor.getSenha());
            }

            repository.save(contaAgricultor);
        }else{
            System.out.println("Usuario não existe!!!");
        }
    }
}
