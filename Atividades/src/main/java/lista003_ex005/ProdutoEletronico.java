package lista003_ex005;

public class ProdutoEletronico extends Produto{
    private int quantidadeComprada;

    public ProdutoEletronico(String nome, float precoUnitario, int quantidadeEstoque) {
        super(nome, precoUnitario, quantidadeEstoque);
        this.quantidadeComprada = quantidadeComprada;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        if(quantidadeComprada <= 0){
            throw new IllegalArgumentException("quantidade invalida");
        }
        this.quantidadeComprada = quantidadeComprada;
    }

    @Override
    public float calcularPreco() {
        if(quantidadeComprada == getQuantidadeEstoque()){
            return   getPrecoUnitario() - (getPrecoUnitario() * 0.10f);
        }
        if(quantidadeComprada >= (getQuantidadeEstoque()/2) ){
            return getPrecoUnitario() - (getPrecoUnitario() *0.05f);
        }
        return getPrecoUnitario();
    }
}
