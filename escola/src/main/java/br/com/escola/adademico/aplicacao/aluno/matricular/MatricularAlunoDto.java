package br.com.escola.adademico.aplicacao.aluno.matricular;

import br.com.escola.adademico.dominio.aluno.Aluno;
import br.com.escola.shared.dominio.CPF;
import br.com.escola.adademico.dominio.aluno.Email;

public class MatricularAlunoDto {
    String nomeAluno;
    String cpf;
    String emailAluno;

    public MatricularAlunoDto(String nomeAluno, String cpf, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpf = cpf;
        this.emailAluno = emailAluno;
    }

    public Aluno criarAluno() {
        return new Aluno(new CPF(this.cpf), nomeAluno, new Email(this.emailAluno));
    }
}
