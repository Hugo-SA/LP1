package lista004_ex001;

public abstract class Imovel {
    private Contribuinte proprietario;
    public Imovel(Contribuinte proprietario){
        this.proprietario = proprietario;
        proprietario.adicionarImovel(this);
    }

    public Contribuinte getProprietario() {
        return proprietario;
    }

    public void setProprietario(Contribuinte proprietario) {
        this.proprietario = proprietario;
    }
    public abstract double calcularValor();
}
