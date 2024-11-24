package com.hackathon.Projeto_AgriConnect.services;

import com.hackathon.Projeto_AgriConnect.domain.agricultor.Agricultor;
import com.hackathon.Projeto_AgriConnect.domain.contaAgricultor.contaAgricultor;
import com.hackathon.Projeto_AgriConnect.repository.AgricultorRepository;
import com.hackathon.Projeto_AgriConnect.repository.ContaAgricultorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AgricultorServices {

    @Autowired
    AgricultorRepository repository;

    public void insertAgricultor(Agricultor agricultor){
        repository.save(agricultor);
    }

    public void updateAgricultor(Long id,Agricultor agricultor) throws Exception {
        Optional<Agricultor> agricultor1 = repository.findById(id);
        if(agricultor1.isPresent()){
            Agricultor agricultorExists = agricultor1.get();

            if(agricultor.getNome() != null){
                agricultorExists.setNome(agricultor.getNome());
            }
            if(agricultor.getCep() != null){
                agricultorExists.setCep(agricultor.getCep());
            }
            if(agricultor.getEstado() != null){
                agricultorExists.setEstado(agricultor.getEstado());
            }
            if(agricultor.getUf() != null){
                agricultorExists.setUf(agricultor.getUf());
            }
            if(agricultor.getBairro() != null){
                agricultorExists.setBairro(agricultor.getBairro());
            }
            if(agricultor.getComplemento() != null){
                agricultorExists.setComplemento(agricultor.getComplemento());
            }
            if(agricultor.getLocalidade() != null){
                agricultorExists.setLocalidade(agricultor.getLocalidade());
            }
            if(agricultor.getLogradouro() != null){
                agricultorExists.setLogradouro(agricultor.getLogradouro());
            }
            if(agricultor.getProdutos() != null){
                agricultorExists.setProdutos(agricultor.getProdutos());
            }
            if(agricultor.getRegiao() != null){
                agricultorExists.setRegiao(agricultor.getRegiao());
            }

            repository.save(agricultorExists);

        }else{
            throw new Exception("Agricultor não encontrada, confira corretamente o Id");
        }
    }

    public void deleteAgricultor(Long id){
        repository.deleteById(id);
    }

    public Iterable<Agricultor> showAgricultores(){
        return repository.findAll();
    }

    public Optional<Agricultor> showAgricultoresById(Long id){
        return repository.findById(id);
    }
}
