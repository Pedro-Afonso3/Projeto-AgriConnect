package com.hackathon.Projeto_AgriConnect.domain.agricultor;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hackathon.Projeto_AgriConnect.domain.contaAgricultor.contaAgricultor;
import com.hackathon.Projeto_AgriConnect.domain.produtos.ProdutosAgricultor;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class Agricultor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nome")
    private String nome;



    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;


    @Column(name="produtosDisponiveis")
    @OneToMany(cascade = CascadeType.ALL)
    private List<ProdutosAgricultor> produtosDisponiveis;

    @OneToOne
    @JoinColumn(name = "contaAgricultor_id")
    private contaAgricultor contaAgricultor;

}
