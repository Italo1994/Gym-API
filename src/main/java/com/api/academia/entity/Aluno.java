package com.api.academia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "alunos")
@Entity(name = "alunos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Aluno extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int matricula;

    private String objetivo;

    @Column(name = "dataadmissao")
    private String dataAdmissao;

    @Column(name = "tipoplano")
    private String tipoPlano;

    @Column(name = "resultadoavaliacaomedica")
    private boolean resultadoAvaliacaoMedica;

    @Column(name = "mensalidadeemdia")
    private boolean mensalidadeEmDia;
}
