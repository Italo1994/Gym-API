package com.api.academia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

//@Entity(name = "alunos")
@Table(name = "alunos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
    private String nome;

    private int idade;

    private long cpf;

    private long telefone;

    @Column(name = "datanascimento")
    private String dataNascimento;

    private String email;
}
