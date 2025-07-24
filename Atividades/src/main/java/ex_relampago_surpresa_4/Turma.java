package ex_relampago_surpresa_4;

import java.util.ArrayList;

public class Turma {
    private Professor professor;
    private Disciplina disciplina;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Curso curso;

    public Turma(Professor professor, Disciplina disciplina, Curso curso) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.curso = curso;
        curso.adicionarTurma(this);
    }

    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
            if (!aluno.getTurmas().contains(this)) {
                aluno.adicionarTurma(this);
            }
        }
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public ArrayList<String> obterListaAlunos() {
        ArrayList<String> AlunosTurma = new ArrayList<String>();
        for (Aluno aluno : alunos) {
            AlunosTurma.add(aluno.getNome());
        }
        return AlunosTurma;
    }
}
