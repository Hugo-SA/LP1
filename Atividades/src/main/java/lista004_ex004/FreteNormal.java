package lista004_ex004;

public class FreteNormal extends Frete{
    private float taxa;

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        if(taxa <=0){
            throw new IllegalArgumentException("valor invalido");
        }
        this.taxa = taxa;
    }

    @Override
    public double calculoFrete() {

        return taxa;
    }
}
