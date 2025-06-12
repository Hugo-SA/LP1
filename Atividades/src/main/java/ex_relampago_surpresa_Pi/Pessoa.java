package ex_relampago_surpresa_Pi;

public class Pessoa {
    private Escolaridade escolaridade;

    public Escolaridade getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getNomeEscolaridade() {
        if (this.escolaridade == null) {
            return "Pessoa sem escolaridade";
        }
        else {
            return this.escolaridade.getNome();
        }
    }
}
