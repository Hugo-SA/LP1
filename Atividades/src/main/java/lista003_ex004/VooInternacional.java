package lista003_ex004;

public class VooInternacional extends Voo{
    private float fatorPrecoVooInternacional;
    private float conversao;

    public float getConversao() {
        return conversao;
    }

    public void setConversao(float conversao) {
        this.conversao = conversao;
    }

    public VooInternacional(String origem, String destino, float distancia, float datavoo) {
        super(origem, destino, distancia, datavoo);
        this.conversao = conversao;
        this.fatorPrecoVooInternacional = fatorPrecoVooInternacional;
    }

    public float getFatorPrecoVooInternacional() {
        return fatorPrecoVooInternacional;
    }

    public void setFatorPrecoVooInternacional(float fatorPrecoVooInternacional) {
        this.fatorPrecoVooInternacional = fatorPrecoVooInternacional;
    }

    @Override
    public float calcularPreco() {
        return (getDistancia() * getFatorPrecoVooInternacional()) * getConversao();
    }
}
