package com.hackathon.Projeto_AgriConnect.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hackathon.Projeto_AgriConnect.domain.entregas.Entregas;
import com.hackathon.Projeto_AgriConnect.services.entregasServices;

@RestController
@RequestMapping(value = "/entregas")
public class entregasController {

  @Autowired
  private entregasServices EntregasServices;

  @GetMapping
  public ResponseEntity<Optional<Entregas>> findByIdEntregas(@PathVariable Long id){
    Optional<Entregas> result = EntregasServices.findById(id);
    return ResponseEntity.ok(result);
  }

  @PostMapping
  public ResponseEntity<Entregas> insertEntregas(@RequestBody Entregas entregas){
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
