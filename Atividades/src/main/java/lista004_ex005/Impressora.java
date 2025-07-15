package lista004_ex005;

public class Impressora extends Manutencao{
    private float maodeObra;
    private float valorTrca;

    public float getMaodeObra() {
        return maodeObra;
    }

    public void setMaodeObra(float maodeObra) {
        this.maodeObra = maodeObra;
    }

    public float getValorTrca() {
        return valorTrca;
    }

    public void setValorTrca(float valorTrca) {
        this.valorTrca = valorTrca;
    }

    @Override
    public double calculaValor() {
        return getMaodeObra() + getValorTrca();
    }
}
