package ex_relampago_surpresa_PiTest;

import ex_relampago_surpresa_Pi.Professor;
import ex_relampago_surpresa_Pi.Escolaridade;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ProfessorTest {

    @Test
    void deveRetornarNomeEscolaridade() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Doutorado");
        Professor professor = new Professor();
        professor.setEscolaridade(escolaridade);
        assertEquals("Doutorado", professor.getNomeEscolaridade());
    }

    @Test
    void deveRetornarPessoaSemEscolaridade() {
        Professor professor = new Professor();
        assertEquals("Pessoa sem escolaridade", professor.getNomeEscolaridade());

    }

}