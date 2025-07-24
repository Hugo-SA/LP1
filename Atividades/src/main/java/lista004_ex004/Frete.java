package lista004_ex004;

public abstract class Frete {
    private int numFrete;

    public int getNumFrete() {
        return numFrete;
    }

    public void setNumFrete(int numFrete) {
        this.numFrete = numFrete;
    }

    public abstract double calculoFrete();

}
