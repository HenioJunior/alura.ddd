package br.com.escola.dominio.aluno;

import br.com.escola.dominio.Evento;
import br.com.escola.dominio.Ouvinte;

import java.time.format.DateTimeFormatter;

public class LogDeAlunoMatriculado extends Ouvinte {

    public void reageAo(Evento evento) {
        String momentoFormatado = evento.getMomento()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        System.out.printf("Aluno com o CPF %s foi matriculado em %s: %n",
                ((AlunoMatriculado)evento).getCpfDoAluno(),
                momentoFormatado);
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}
