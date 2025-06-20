package lista003_ex003;

public abstract class Produto {
    private String nome;
    private float precoBase;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        if(precoBase <= 0){
            throw new IllegalArgumentException("preco invalido");
        }
        this.precoBase = precoBase;
    }

    public Produto(String nome, float precoBase){
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();
}
