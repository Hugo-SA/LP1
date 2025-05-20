package ex_relampago_surpresa_001;

public class AlunoGraduacao extends Aluno {

    public AlunoGraduacao(String nome) {
        super(nome);
    }

    public float obterLimiteAprovacao() {
        return 7.0f;
    }
}