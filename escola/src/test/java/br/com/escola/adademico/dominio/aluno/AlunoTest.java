package br.com.escola.adademico.dominio.aluno;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void setUp() {
        this.aluno = new Aluno(new CPF("123.456.789-00"), "Bob Green", new Email("bob@email.com"));

    }

    @Test
    @DisplayName("Deveria permitir adicionar telefone")
    void adicionarTelefone() {
        aluno.adicionarTelefone("43", "99999-9999");

        assertEquals(1, aluno.getTelefones().size());
    }

    @Test
    @DisplayName("Deveria permitir adicionarDoistelefones")
    void adicionarDoisTelefones() {
        aluno.adicionarTelefone("43", "99999-9999");
        aluno.adicionarTelefone("43", "99999-9900");

        assertEquals(2, aluno.getTelefones().size());
    }

    @Test
    @DisplayName("Não deveria permitir adicionar tres telefones")
    void adicionarTelefoneComException() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.aluno.adicionarTelefone("43", "99999-9999");
            this.aluno.adicionarTelefone("43", "99999-9999");
            this.aluno.adicionarTelefone("43", "99999-9999");
        });
    }
}