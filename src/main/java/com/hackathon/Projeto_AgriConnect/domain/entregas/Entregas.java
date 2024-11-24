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
import java.util.UUID;

@Entity
@Table(name="entregas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entregas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nomeProduto")
    private String nomeProduto;

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

    @Column(name="status")
    private String status;

    @OneToOne
    @JoinColumn(name = "agricultor_id")
    private Agricultor agricultor;

    @OneToOne
    @JoinColumn(name = "transportador_id")
    private Transportador transportador;
}
