package ex_relampago_surpresa_001;

public class AlunoEnsinoMedio extends Aluno {

    public AlunoEnsinoMedio(String nome) {
        super(nome);
    }

    public float obterLimiteAprovacao() {
        return 6.0f;
    }
}