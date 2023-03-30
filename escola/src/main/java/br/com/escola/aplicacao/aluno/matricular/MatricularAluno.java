package br.com.escola.aplicacao.aluno.matricular;

import br.com.escola.dominio.PublicadorDeEventos;
import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.AlunoMatriculado;
import br.com.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;
    private final PublicadorDeEventos publicador;

    public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicador) {
        this.repositorio = repositorio;
        this.publicador = publicador;
    }

    public void executa(MatricularAlunoDto dados) {
        Aluno novo = dados.criarAluno();
        repositorio.matricularAluno(novo);

        AlunoMatriculado evento = new AlunoMatriculado(novo.getCpf());
        publicador.publicar(evento);

    }
}
