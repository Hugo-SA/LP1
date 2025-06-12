package lista003_ex003;

public class ProdutoLivro extends Produto{
    public ProdutoLivro(String nome, float precoBase){
        super(nome, precoBase);
    }

    @Override
    public float calcularPreco() {
        float desconto = getPrecoBase() * 0.30f;
        return getPrecoBase() - desconto;
    }
}
