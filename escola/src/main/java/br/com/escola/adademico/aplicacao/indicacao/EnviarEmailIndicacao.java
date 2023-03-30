package br.com.escola.adademico.aplicacao.indicacao;

import br.com.escola.adademico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);
}
