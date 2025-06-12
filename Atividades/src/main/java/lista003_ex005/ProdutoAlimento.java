package lista003_ex005;

public class ProdutoAlimento extends Produto{
    private int quilosComprados;

    public float getQuilosComprados() {
        return quilosComprados;
    }

    public void setQuilosComprados(int quilosComprados) {
        if(quilosComprados <= 0){
            throw new IllegalArgumentException("quantidade errada");
        }
        this.quilosComprados = quilosComprados;
    }

    public ProdutoAlimento(String nome, float precoPorQuilo, int quilosEmEstoque) {
        super(nome, precoPorQuilo, quilosEmEstoque);
    }


    @Override
    public float calcularPreco() {
        if (quilosComprados > getQuantidadeEstoque()) {
            throw new IllegalArgumentException("Estoque insuficiente de alimento");
        }
        abaixarEstoque(quilosComprados);
        return getPrecoUnitario() * quilosComprados;
    }

}
