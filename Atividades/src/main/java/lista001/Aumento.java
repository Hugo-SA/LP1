package lista001;

public class Aumento {

    private String nome;
    private float salario;
    private float porcentagem;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getPorcentagem() {
        return this.porcentagem;
    }

    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }
    public float PorcentagemAumento() {
        return this.salario * (this.porcentagem / 100);
    }
    public float calcularAumento() {
        return this.PorcentagemAumento() + salario;
    }

}
