package com.hackathon.Projeto_AgriConnect.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.Projeto_AgriConnect.domain.entregas.Entregas;
import com.hackathon.Projeto_AgriConnect.services.entregasServices;

@RestController
@RequestMapping(value = "/agris")
public class entregasController {

  @Autowired
  private entregasServices serviciEntregasServices;

  @GetMapping(value = "/{id}")
  public Optional<Entregas> findByEntregas(@PathVariable Long id){
    Optional<Entregas> result = serviciEntregasServices.findById(id);
    return result;
  }

}
