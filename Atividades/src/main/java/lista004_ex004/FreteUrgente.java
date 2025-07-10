package lista004_ex004;

public class FreteUrgente extends Frete{
    private float taxaEntrega;
    private float Valor;
    private float quantItem;

    public float getQuantItem() {
        return quantItem;
    }

    public void setQuantItem(float quantItem) {
        if(quantItem<0){
            throw new IllegalArgumentException("quantidade invalida");
        }
        this.quantItem = quantItem;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float valor) {
        if(valor <= 0){
            throw new IllegalArgumentException("valor invalido");
        }
        Valor = valor;
    }

    public float getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(float taxaEntrega) {
        if(taxaEntrega <= 0){
            throw new IllegalArgumentException("taxa invalida");
        }
        this.taxaEntrega = taxaEntrega;
    }

    @Override
    public double calculoFrete() {
        return getValor() + getTaxaEntrega() + (10*getQuantItem());
    }
}
