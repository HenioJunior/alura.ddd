package br.com.escola.adademico.dominio.aluno;

import br.com.escola.shared.dominio.CPF;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricularAluno(Aluno aluno);

    Aluno buscarPorCPF(CPF cpf);

    List<Aluno> listarTodosAlunosMatriculados();
}
