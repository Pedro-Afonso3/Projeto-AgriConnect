package com.hackathon.Projeto_AgriConnect.controller;

import com.hackathon.Projeto_AgriConnect.domain.contaAgricultor.contaAgricultor;
import com.hackathon.Projeto_AgriConnect.services.contaAgricultorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
