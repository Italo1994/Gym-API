package com.api.academia.records;

import com.api.academia.entity.Aluno;

public record AlunoResponseDTO(Long id, String nome, int idade, long cpf, long telefone, String dataNascimento, String email, int matricula, String objetivo, String dataAdmissao, String tipoPlano, boolean resultadoAvaliacaoMedica, boolean mensalidadeEmDia) {
    public AlunoResponseDTO(Aluno aluno) {
        this(aluno.getId(), aluno.getNome(), aluno.getIdade(), aluno.getCpf(), aluno.getTelefone(), aluno.getDataNascimento(), aluno.getEmail(), aluno.getMatricula(), aluno.getObjetivo(), aluno.getDataAdmissao(), aluno.getTipoPlano(), aluno.isResultadoAvaliacaoMedica(), aluno.isMensalidadeEmDia());
    }
}
