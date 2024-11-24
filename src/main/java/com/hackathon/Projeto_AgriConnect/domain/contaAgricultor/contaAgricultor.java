package com.hackathon.Projeto_AgriConnect.domain.contaAgricultor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="contaAgricultor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class contaAgricultor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="login")
    private String login;

    @Column(name="senha")
    private String senha;

    @Column(name="email")
    private String email;

}
