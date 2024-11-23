package com.hackathon.Projeto_AgriConnect.controller;

import com.hackathon.Projeto_AgriConnect.domain.transportador.Transportador;
import com.hackathon.Projeto_AgriConnect.services.transportadorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/transportador")
public class transportadorController {

    @Autowired
    transportadorServices transportadorServices;

    @GetMapping
    public ResponseEntity<Iterable<Transportador>> showAllTransportadores(){
        return ResponseEntity.ok(transportadorServices.showAllTransportadores());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Transportador>> showAllTransportadores(Long id){
        return ResponseEntity.ok(transportadorServices.showTransportadoresById(id));
    }

    @PostMapping
    public ResponseEntity<Transportador> insertTransportadores(@RequestBody Transportador transportador){
        transportadorServices.insertTransportador(transportador);
        return ResponseEntity.ok(transportador);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transportador> updateTransportadores(@PathVariable Long id,@RequestBody Transportador transportador){
        transportadorServices.updateTransportador(id,transportador);
        return ResponseEntity.ok(transportador);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Transportador> deleteTransportador(@PathVariable Long id){
        transportadorServices.deleteTransportador(id);
        return ResponseEntity.ok().build();
    }

}
