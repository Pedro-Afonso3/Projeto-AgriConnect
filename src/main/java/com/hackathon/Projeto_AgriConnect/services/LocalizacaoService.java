package com.hackathon.Projeto_AgriConnect.services;



import com.hackathon.Projeto_AgriConnect.domain.localizacao.Localizacao;
import com.hackathon.Projeto_AgriConnect.repository.LocalizacaoRepository;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalizacaoService {

    @Autowired
    private LocalizacaoRepository localizacaoRepository;

    public Localizacao salvarLocalizacao(String nome, double latitude, double longitude) {
        GeometryFactory geometryFactory = new GeometryFactory();
        Point point = geometryFactory.createPoint(new Coordinate(longitude, latitude));
        Localizacao localizacao = new Localizacao();
        localizacao.setNome(nome);
        localizacao.setGeom(point);
        return localizacaoRepository.save(localizacao);
    }

    public List<Localizacao> obterTodasLocalizacoes() {
        return localizacaoRepository.findAll(); }
}
