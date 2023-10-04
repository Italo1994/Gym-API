package com.api.academia.controller;

import com.api.academia.entity.Aluno;
import com.api.academia.records.AlunoResponseDTO;
import com.api.academia.repository.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<AlunoResponseDTO> getAll() {
        List<AlunoResponseDTO> listaAlunos = alunoRepository.findAll().stream().map(AlunoResponseDTO::new).toList();
        return listaAlunos;
    }
}
