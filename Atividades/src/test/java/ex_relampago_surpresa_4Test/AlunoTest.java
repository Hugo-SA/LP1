package ex_relampago_surpresa_4Test;

import ex_relampago_surpresa_4.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {
    @Test
    public void deveRemoverAlunoDeTurma(){
        Curso curso = new Curso("BSI");
        Aluno aluno = new Aluno("Hugo", curso);
        Professor professor = new Professor("Marco");
        Disciplina disciplina = new Disciplina("LPI");
        Turma turma = new Turma(professor, disciplina, curso);
        aluno.removerTurma(turma);
        assertFalse(aluno.getTurmas().contains(turma));
    }
    @Test
    public void deveAdicionarAlunoEmTurma(){
        Curso curso = new Curso("BSI");
        Aluno aluno = new Aluno("Hugo", curso);
        Professor professor = new Professor("Marco");
        Disciplina disciplina = new Disciplina("LPI");
        Turma turma = new Turma(professor, disciplina, curso);
        aluno.adicionarTurma(turma);
        assertTrue(aluno.getTurmas().contains(turma));
    }
}
