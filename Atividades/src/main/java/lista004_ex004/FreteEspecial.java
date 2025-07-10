package lista004_ex004;

public class FreteEspecial extends Frete{
    private float taxaEntrega;
    private float Valor;

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
        return getValor() + getTaxaEntrega();
    }
}
