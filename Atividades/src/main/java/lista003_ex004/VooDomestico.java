package lista003_ex004;

public class VooDomestico extends Voo {
    private float fatorPrecoVooDomestico;

    public float getFatorPrecoVooDomestico() {
        return fatorPrecoVooDomestico;
    }

    public void setFatorPrecoVooDomestico(float fatorPrecoVooDomestico) {
        this.fatorPrecoVooDomestico = fatorPrecoVooDomestico;
    }

    public VooDomestico(String origem, String destino, float distancia, float datavoo) {
        super(origem, destino, distancia, datavoo);
        this.fatorPrecoVooDomestico = fatorPrecoVooDomestico;
    }

    @Override
    public float calcularPreco() {
        return getDistancia() * getFatorPrecoVooDomestico();
    }

}
