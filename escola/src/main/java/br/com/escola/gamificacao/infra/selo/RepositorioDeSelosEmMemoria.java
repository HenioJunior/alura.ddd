package br.com.escola.gamificacao.infra.selo;

import br.com.escola.shared.dominio.CPF;
import br.com.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.escola.gamificacao.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    private List<Selo> selos  = new ArrayList<>();

    @Override
    public void adicionar(Selo selo) {
        selos.add(selo);
    }

    @Override
    public List<Selo> selosDoAlunoDeCpf(CPF cpf) {
        return selos.stream()
                .filter(s -> s.getCpfDoAluno().equals(cpf.getNumero()))
                .collect(Collectors.toList());
    }
}
