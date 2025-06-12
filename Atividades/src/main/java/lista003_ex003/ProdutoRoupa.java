package lista003_ex003;

public class ProdutoRoupa extends Produto{
    public ProdutoRoupa(String nome, float precoBase){
        super(nome, precoBase);
    }

    @Override
    public float calcularPreco() {
        float desconto = getPrecoBase() * 0.20f;
        return getPrecoBase() - desconto;
    }
}
