package br.com.escola.gamificacao.dominio.selo;

import br.com.escola.adademico.dominio.aluno.CPF;

import java.util.List;

public interface RepositorioDeSelos {

    void adicionar(Selo selo);

    List<Selo> selosDoAlunoDeCpf(CPF cpf);
}
