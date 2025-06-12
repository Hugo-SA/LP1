package lista003_ex003;

public class ProdutoEletronico extends Produto {
    public ProdutoEletronico(String nome, float precoBase){
        super(nome, precoBase);
    }

    @Override
    public float calcularPreco() {
        float desconto = getPrecoBase() * 0.10f;
        return getPrecoBase() - desconto;
    }
}
