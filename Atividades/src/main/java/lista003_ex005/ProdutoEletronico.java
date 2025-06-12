package lista003_ex005;

public class ProdutoEletronico extends Produto{
    private int quantidadeComprada;
    private float desconto;

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
            desconto = 0.10f;
        }
        else if(quantidadeComprada >= (getQuantidadeEstoque()/2) ){
            desconto = 0.05f;
        }
        else if(quantidadeComprada < (getQuantidadeEstoque()/2) ){
            desconto = 0.0f;
        }
        abaixarEstoque(quantidadeComprada);
        return (getPrecoUnitario() *(1 - desconto)) * quantidadeComprada;
    }
}
