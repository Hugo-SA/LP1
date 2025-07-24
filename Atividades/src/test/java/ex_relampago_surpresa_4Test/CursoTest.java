package ex_relampago_surpresa_4Test;

import ex_relampago_surpresa_4.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CursoTest {
    @Test
    public void deveVerificarListaDeAlunosEmTurmaDeCurso(){
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

        for (Aluno aluno : turma.getAlunos()) {
            assertTrue(curso.getAlunos().contains(aluno));
        }
    }
    @Test
    public void deveVerificarListaAlunosEmCurso(){
        Curso curso = new Curso("Letras");
        Professor professor = new Professor("Prof. Bento");
        Disciplina disciplina = new Disciplina("Literatura");
        Turma turma = new Turma(professor, disciplina, curso);

        Aluno aluno1 = new Aluno("Ana", curso);
        Aluno aluno2 = new Aluno("Bruno", curso);
        Aluno aluno3 = new Aluno("Carla", curso);

        curso.adicionarAluno(aluno1);
        curso.adicionarAluno(aluno2);
        curso.adicionarAluno(aluno3);
        ArrayList<String> alunosCurso = new ArrayList<String>();
        alunosCurso.add("Ana");
        alunosCurso.add("Bruno");
        alunosCurso.add("Carla");
        assertEquals(alunosCurso, curso.obterListaAlunosCurso());
    }
    @Test
    public void deveRemoverTurmaCurso(){
        Curso curso = new Curso("Letras");
        Professor professor = new Professor("Prof. Bento");
        Disciplina disciplina = new Disciplina("Literatura");
        Turma turma = new Turma(professor, disciplina, curso);
        curso.adicionarTurma(turma);
        assertTrue(curso.getTurmas().contains(turma));
        curso.removerTurma(turma);
        assertFalse(curso.getTurmas().contains(turma));
    }

    @Test
    public void deveRemoverAlunoCurso(){
        Curso curso = new Curso("Letras");
        Aluno aluno1 = new Aluno("Huguinho", curso);
        curso.adicionarAluno(aluno1);
        assertTrue(curso.getAlunos().contains(aluno1));
        curso.removerAluno(aluno1);
        assertFalse(curso.getAlunos().contains(aluno1));
    }
    @Test
    public void deveVerificarDisciplinasEmUmCurso(){
        Curso curso = new Curso("Letras");
        Professor professor1 = new Professor("Prof. Bento");
        Disciplina disciplina1 = new Disciplina("Literatura");
        Turma turma1 = new Turma(professor1, disciplina1, curso);
        Professor professor2 = new Professor("Prof. Huguinho");
        Disciplina disciplina2 = new Disciplina("Futebol 2");
        Turma turma2 = new Turma(professor2, disciplina2, curso);
        Professor professor3 = new Professor("Prof. João");
        Disciplina disciplina3 = new Disciplina("Artes");
        Turma turma = new Turma(professor3, disciplina3, curso);
        ArrayList<Turma> quantidadeTurmasNoCurso = curso.getTurmas();
        assertEquals(3, quantidadeTurmasNoCurso.size());
    }
}
