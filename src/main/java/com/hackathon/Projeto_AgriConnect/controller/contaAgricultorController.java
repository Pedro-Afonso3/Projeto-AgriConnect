package com.hackathon.Projeto_AgriConnect.controller;

import com.hackathon.Projeto_AgriConnect.domain.contaAgricultor.contaAgricultor;
import com.hackathon.Projeto_AgriConnect.services.contaAgricultorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contaAgricultor")
public class contaAgricultorController {
    @Autowired
    contaAgricultorServices contaAgricultorServices;

    @PostMapping
    public ResponseEntity<contaAgricultor> insertLogin(@RequestBody contaAgricultor contaAgricultor){
        contaAgricultorServices.insertConta(contaAgricultor);
        return ResponseEntity.ok(contaAgricultor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<contaAgricultor> updateLogin(@PathVariable Long id, @RequestBody contaAgricultor contaAgricultor){
        contaAgricultorServices.updateConta(id,contaAgricultor);
        return ResponseEntity.ok(contaAgricultor);
    }
}
