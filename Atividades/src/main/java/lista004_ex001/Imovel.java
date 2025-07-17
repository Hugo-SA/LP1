package lista004_ex001;

public abstract class Imovel {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract double calcularValor();
}
