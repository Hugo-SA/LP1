package lista003_ex005;

public class ProdutoRoupa extends Produto{
    private int quantidadeComprada;
    private float etiqueta;
    private float desconto;

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        if(quantidadeComprada <= 0){
            throw new IllegalArgumentException("quantidade invalida");
        }
        this.quantidadeComprada = quantidadeComprada;
    }

    public float getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(float etiqueta) {
        this.etiqueta = getPrecoUnitario();
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public ProdutoRoupa(String nome, float precoUnitario, int quantidadeEstoque) {
        super(nome, precoUnitario, quantidadeEstoque);
    }

    @Override
    public float calcularPreco() {
        if(quantidadeComprada == getQuantidadeEstoque()){
            desconto = 0.10f;
        }
        else if(quantidadeComprada >= (getQuantidadeEstoque()/2) ){
            desconto = 0.05f;
        }
        else{
            desconto = 0.0f;
        }
        abaixarEstoque(quantidadeComprada);
        return (getPrecoUnitario() *(1 - desconto)) * quantidadeComprada;
    }
}
