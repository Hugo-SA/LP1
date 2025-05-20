package ex_relampago_surpresa_001Test;
import ex_relampago_surpresa_001.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarDadosProfessor() {
        Professor professor = new Professor("Sandro");
        professor.setTitulacao("Doutor");
        assertEquals("Nome: Sandro - Titulacao: Doutor", professor.obterDados());
    }

}