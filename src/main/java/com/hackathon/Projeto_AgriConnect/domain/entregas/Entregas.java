package com.hackathon.Projeto_AgriConnect.domain.entregas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="entregas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entregas {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name="produto")
    private String produto;

    @Column(name="quantidade")
    private Integer quantidade;

    @Column(name="dataHoraEntrega")
    private LocalDateTime dataHoraEntrega;

    @Column(name="localEntrega")
    private String localEntrega;
}
