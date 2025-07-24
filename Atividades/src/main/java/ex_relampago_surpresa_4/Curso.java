package ex_relampago_surpresa_4;

import java.util.ArrayList;

public class Curso {
    private ArrayList<Turma> turmas = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private String nomeCurso;

    public Curso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }
    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
        }
    }
    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }
    public void adicionarTurma(Turma turma) {
        if (!turmas.contains(turma)) {
            turmas.add(turma);
        }
    }

    public void removerTurma(Turma turma) {
        turmas.remove(turma);
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public ArrayList<String> obterListaAlunosCurso() {
        ArrayList<String> AlunosCurso = new ArrayList<String>();
        for (Aluno aluno : alunos) {
            AlunosCurso.add(aluno.getNome());
        }
        return AlunosCurso;
    }
}
