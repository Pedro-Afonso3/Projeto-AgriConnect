package com.hackathon.Projeto_AgriConnect.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackathon.Projeto_AgriConnect.domain.agricultor.Agricultor;
import com.hackathon.Projeto_AgriConnect.domain.transportador.Transportador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hackathon.Projeto_AgriConnect.domain.entregas.Entregas;
import com.hackathon.Projeto_AgriConnect.services.entregasServices;

@RestController
@RequestMapping(name = "/entregas")
public class entregasController {

  @Autowired
  private entregasServices EntregasServices;

  @GetMapping("/{id}")
  public ResponseEntity<Optional<Entregas>> findByIdEntregas(@PathVariable Long id){
    Optional<Entregas> result = EntregasServices.findById(id);
    return ResponseEntity.ok(result);
  }

  @PostMapping("/agricultor/salvar")
  public ResponseEntity<Agricultor> salvarAgricultor(@RequestBody Agricultor agricultor) {
    Agricultor salvo = EntregasServices.salvarAgricultor(agricultor);
    return ResponseEntity.ok(salvo);
  }

  @PostMapping("/transportador/salvar")
  public ResponseEntity<Transportador> salvarTransportador(@RequestBody Transportador transportador) {
    Transportador salvo = EntregasServices.salvarTransportador(transportador);
    return ResponseEntity.ok(salvo);
  }

  @PostMapping("/insertEntregas")
  public ResponseEntity<Entregas> insertEntregas(@RequestBody Entregas entregas) throws JsonProcessingException, MalformedURLException {
    URL url = new URL("https://viacep.com.br/ws/" + entregas.getCep() + "/json/");

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
    Entregas dadosCep = objectMapper.readValue(jsonCep.toString(), Entregas.class);

    // Atualiza os dados do agricultor com os dados do CEP
    entregas.setCep(dadosCep.getCep());
    entregas.setLogradouro(dadosCep.getLogradouro());
    entregas.setComplemento(dadosCep.getComplemento());
    entregas.setBairro(dadosCep.getBairro());
    entregas.setLocalidade(dadosCep.getLocalidade());
    entregas.setUf(dadosCep.getUf());
    entregas.setEstado(dadosCep.getEstado());
    entregas.setRegiao(dadosCep.getRegiao());

    EntregasServices.insertEntregas(entregas);

    return ResponseEntity.ok(entregas);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Entregas> updateEntregas(@PathVariable Long id,@RequestBody Entregas entregas) throws Exception {
    EntregasServices.updateEntregas(id,entregas);
    return ResponseEntity.ok(entregas);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Entregas> deleteEntregas(@PathVariable Long id){
    EntregasServices.deleteEntregas(id);
    return ResponseEntity.ok().build();
  }



}
