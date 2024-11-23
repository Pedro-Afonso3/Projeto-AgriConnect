package com.hackathon.Projeto_AgriConnect.domain.entregas;

import com.hackathon.Projeto_AgriConnect.domain.agricultor.Agricultor;
import com.hackathon.Projeto_AgriConnect.domain.transportador.Transportador;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Optional;

@Entity
@Table(name="entregas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entregas {

    @Id
    @GeneratedValue(Optional<Entregas> resultstrategy = GenerationType.UUID)
    private String id;

    @Column(name="produto")
    private String produto;

    @Column(name="quantidade")
    private Integer quantidade;


    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;

    @OneToOne
    @JoinColumn(name = "agricultor_id")
    private Agricultor agricultor;

    @OneToOne
    @JoinColumn(name = "transportador_id")
    private Transportador transportador;
}
