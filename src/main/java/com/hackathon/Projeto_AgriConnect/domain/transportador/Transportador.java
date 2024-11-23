package com.hackathon.Projeto_AgriConnect.domain.transportador;

import com.hackathon.Projeto_AgriConnect.domain.agricultor.Agricultor;
import com.hackathon.Projeto_AgriConnect.domain.contaAgricultor.contaAgricultor;
import com.hackathon.Projeto_AgriConnect.domain.entregas.Entregas;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="transportador")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transportador {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name="nome")
    private String nome;

    @Column(name="veiculo")
    private String veiculo;

    @Column(name="capacidade")
    private Integer capacidade;

    @Column(name="areaCobertura")
    private float areaCobertura ;

    @OneToOne
    @JoinColumn(name = "entregas_id")
    private Entregas entregas;
}
