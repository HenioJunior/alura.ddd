package br.com.escola;

import br.com.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.escola.dominio.PublicadorDeEventos;
import br.com.escola.dominio.aluno.LogDeAlunoMatriculado;
import br.com.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {

    public static void main(String[] args) {
        String nome = "Alex Green";
        String cpf = "123.456.789-00";
        String email = "alex@email.com";

        PublicadorDeEventos publicador = new PublicadorDeEventos();
        publicador.adicionar(new LogDeAlunoMatriculado());

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicador);
        matricular.executa(new MatricularAlunoDto(nome, cpf, email));

    }
}
