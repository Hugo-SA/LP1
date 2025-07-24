package ex_relampago_surpresa_4;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    private Curso curso;
    private ArrayList<Turma> turmas = new ArrayList<>();

    public Aluno(String nome, Curso curso) {
        super(nome);
        this.curso = curso;
        curso.adicionarAluno(this);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }


    public void adicionarTurma(Turma turma) {
        if (!turmas.contains(turma)) {
            turmas.add(turma);
            turma.adicionarAluno(this);
        }
    }
    public void removerTurma(Turma turma) {
        turmas.remove(turma);
    }
}
