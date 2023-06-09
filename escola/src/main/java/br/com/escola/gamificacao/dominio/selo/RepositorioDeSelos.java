package br.com.escola.gamificacao.dominio.selo;

import br.com.escola.shared.dominio.CPF;

import java.util.List;

public interface RepositorioDeSelos {

    void adicionar(Selo selo);

    List<Selo> selosDoAlunoDeCpf(CPF cpf);
}
