package br.com.escola.adademico;

import br.com.escola.adademico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.escola.adademico.dominio.PublicadorDeEventos;
import br.com.escola.adademico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.escola.adademico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.escola.adademico.aplicacao.aluno.matricular.MatricularAluno;

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
