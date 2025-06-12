package lista003_ex005;

public abstract class Produto {
    private String nome;
    private float precoUnitario;
    private int quantidadeEstoque;

    public Produto(String nome, float precoUnitario, int quantidadeEstoque) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("nome invalido");
        }
        this.nome = nome;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if(precoUnitario <= 0){
            throw new IllegalArgumentException("preco unitario invalido");
        }
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if(quantidadeEstoque < 0){
            throw new IllegalArgumentException("quantidade invalida");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public void abaixarEstoque(int quantidade){
        if(quantidade > quantidadeEstoque){
            throw new IllegalArgumentException("estoque insuficiente");
        }
        quantidadeEstoque -= quantidade;
    }
    public abstract float calcularPreco();
}
