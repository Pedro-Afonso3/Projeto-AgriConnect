package com.hackathon.Projeto_AgriConnect.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackathon.Projeto_AgriConnect.domain.agricultor.Agricultor;
import com.hackathon.Projeto_AgriConnect.domain.contaAgricultor.contaAgricultor;
import com.hackathon.Projeto_AgriConnect.repository.AgricultorRepository;
import com.hackathon.Projeto_AgriConnect.services.AgricultorServices;
import com.hackathon.Projeto_AgriConnect.services.contaAgricultorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import com.google.gson.Gson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


@RestController("/agricultor")
public class agricultorController {

    @Autowired
    AgricultorServices agricultorServices;

    @Autowired
    contaAgricultorServices contaAgricultorServices;

    @PostMapping("/insertAgricultor")
    public ResponseEntity<Agricultor> insertAgricultor(@RequestBody Agricultor agricultor) throws IOException {
        URL url = new URL("https://viacep.com.br/ws/" + agricultor.getCep() + "/json/");

        StringBuilder jsonCep = new StringBuilder();
        try (InputStream is = url.openStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"))) {

            String line;
            while ((line = br.readLine()) != null) {
                jsonCep.append(line);
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        Agricultor dadosCep = objectMapper.readValue(jsonCep.toString(), Agricultor.class);

        // Atualiza os dados do agricultor com os dados do CEP
        agricultor.setCep(dadosCep.getCep());
        agricultor.setLogradouro(dadosCep.getLogradouro());
        agricultor.setComplemento(dadosCep.getComplemento());
        agricultor.setBairro(dadosCep.getBairro());
        agricultor.setLocalidade(dadosCep.getLocalidade());
        agricultor.setUf(dadosCep.getUf());
        agricultor.setEstado(dadosCep.getEstado());
        agricultor.setRegiao(dadosCep.getRegiao());
        if (agricultor.getContaAgricultor() != null && agricultor.getContaAgricultor().getId() == null) {
            contaAgricultorServices.insertConta(agricultor.getContaAgricultor()); }

        // Insere o agricultor
        agricultorServices.insertAgricultor(agricultor);

        return ResponseEntity.ok(agricultor);
    }

}



