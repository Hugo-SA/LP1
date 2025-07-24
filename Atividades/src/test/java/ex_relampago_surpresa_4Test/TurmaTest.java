package ex_relampago_surpresa_4Test;

import ex_relampago_surpresa_4.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TurmaTest {
   /* @Test
    public void VerificarAluno(){
        Curso curso = new Curso("Letras");
        Professor professor = new Professor("Prof. Bento");
        Disciplina disciplina = new Disciplina("Literatura");
        Turma turma = new Turma(professor, disciplina, curso);
        Aluno aluno1 = new Aluno("Ana", curso);
        turma.adicionarAluno(aluno1);
        assertEquals("Ana", turma.obterListaAlunos());
    }*/
    @Test
    public void verificarListaAlunos(){
        Curso curso = new Curso("Letras");
        Professor professor = new Professor("Prof. Bento");
        Disciplina disciplina = new Disciplina("Literatura");
        Turma turma = new Turma(professor, disciplina, curso);

        Aluno aluno1 = new Aluno("Ana", curso);
        Aluno aluno2 = new Aluno("Bruno", curso);
        Aluno aluno3 = new Aluno("Carla", curso);

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);
        ArrayList<String> alunosTurma = new ArrayList<String>();
        alunosTurma.add("Ana");
        alunosTurma.add("Bruno");
        alunosTurma.add("Carla");
        assertEquals(alunosTurma, turma.obterListaAlunos());
    }
    @Test
    public void deveRemoverAluno() {
        Curso curso = new Curso("Letras");
        Professor professor = new Professor("Prof. Bento");
        Disciplina disciplina = new Disciplina("Literatura");
        Turma turma = new Turma(professor, disciplina, curso);

        Aluno aluno1 = new Aluno("Ana", curso);
        turma.removerAluno(aluno1);
        assertFalse(turma.getAlunos().contains("Ana"));
    }
    @Test
    public void deveVerProfessor(){
        Curso curso = new Curso("Letras");
        Professor professor = new Professor("Prof. Bento");
        Disciplina disciplina = new Disciplina("Literatura");
        Turma turma = new Turma(professor, disciplina, curso);
        assertEquals("Prof. Bento", professor.getNome());
    }
}
