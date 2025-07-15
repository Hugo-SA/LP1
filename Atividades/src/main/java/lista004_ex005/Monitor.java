package lista004_ex005;

public class Monitor extends Manutencao{
    private float maodeObra;

    public float getMaodeObra() {
        return maodeObra;
    }

    public void setMaodeObra(float maodeObra) {
        this.maodeObra = maodeObra;
    }

    @Override
    public double calculaValor() {
        return 0;
    }
}
