package com.hackathon.Projeto_AgriConnect.controller;


import com.hackathon.Projeto_AgriConnect.domain.localizacao.Localizacao;
import com.hackathon.Projeto_AgriConnect.services.LocalizacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localizacao")
public class LocalizacaoController {

    @Autowired
    private LocalizacaoService localizacaoService;

    @PostMapping("/salvar")
    public ResponseEntity<Localizacao> salvarLocalizacao(@RequestParam String nome, @RequestParam double latitude, @RequestParam double longitude) {
        Localizacao localizacao = localizacaoService.salvarLocalizacao(nome, latitude, longitude);
        return ResponseEntity.ok(localizacao);
    }

    @GetMapping("/todas") public ResponseEntity<List<Localizacao>> obterTodasLocalizacoes() {
        List<Localizacao> localizacoes = localizacaoService.obterTodasLocalizacoes();
        return ResponseEntity.ok(localizacoes); }
}
