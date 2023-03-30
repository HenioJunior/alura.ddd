package br.com.escola.dominio.aluno;

import br.com.escola.dominio.Evento;

import java.time.LocalDateTime;

public class AlunoMatriculado implements Evento {

    private final CPF cpfDoAluno;
    private final LocalDateTime momento;

    public AlunoMatriculado(CPF cpfDoAluno) {
        this.cpfDoAluno = cpfDoAluno;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime getMomento() {
        return this.momento;
    }

    public CPF getCpfDoAluno() {
        return cpfDoAluno;
    }
}
