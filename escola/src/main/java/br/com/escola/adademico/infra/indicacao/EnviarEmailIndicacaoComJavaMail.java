package br.com.escola.adademico.infra.indicacao;

import br.com.escola.adademico.dominio.aluno.Aluno;
import br.com.escola.adademico.aplicacao.indicacao.EnviarEmailIndicacao;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno indicado) {
        //lógica de envio de emails com a lib JAVA Mail
    }
}
