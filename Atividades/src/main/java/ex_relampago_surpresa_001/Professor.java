package ex_relampago_surpresa_001;

public class Professor extends Pessoa {

    private String titulacao;

    public Professor(String nome) {
        super(nome);
    }

    public String getTitulacao() {
        return this.titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String obterDados() {
        return "Nome: " + this.getNome() + " - Titulacao: " + this.titulacao;
    }
}