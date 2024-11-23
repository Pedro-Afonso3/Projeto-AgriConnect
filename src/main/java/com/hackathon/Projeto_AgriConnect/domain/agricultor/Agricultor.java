package com.hackathon.Projeto_AgriConnect.domain.agricultor;

import com.hackathon.Projeto_AgriConnect.domain.produtos.Produtos;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="agricultor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agricultor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name="nome")
    private String nome;

    @Column(name="localizacao")
    private String localizacao; //TODO: procurar endereço via CEP

    @Column(name="produtosDisponiveis")
    @OneToMany
    private List<Produtos> produtosDisponiveisComQtd;

}
