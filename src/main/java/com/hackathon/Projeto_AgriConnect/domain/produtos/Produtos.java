package com.hackathon.Projeto_AgriConnect.domain.produtos;

import com.hackathon.Projeto_AgriConnect.domain.agricultor.Agricultor;
import com.hackathon.Projeto_AgriConnect.domain.contaAgricultor.contaAgricultor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name="produtos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="preco")
    private float preco;

    @Column(name="quantidade")
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "agricultor_id")
    private Agricultor agricultor;
}
