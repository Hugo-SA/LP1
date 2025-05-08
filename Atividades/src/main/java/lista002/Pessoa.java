package lista002;

public class Pessoa {
    private String nome;
    private float idade;
    private float altura;
    private float peso;

    public Pessoa(){
        this.idade = 0;
        this.altura = 0.00f;
        this.peso = 0.00f;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getIdade() {
        return idade;
    }

    public void setIdade(float idade) {
        if (idade < 0){
            throw new IllegalArgumentException("idade invalida");
        }
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura < 0){
            throw new IllegalArgumentException("altura invalida");
        }
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if(peso < 0){
            throw new IllegalArgumentException("peso invalido");
        }
        this.peso = peso;
    }

    public float envelhecer(){
        return idade ++;
    }
    public void crescer(){
        if(idade >= 21){
            throw new IllegalArgumentException("pessoa nao cresce mais");
        }
         altura += 0.01f;
    }
    public float ganharPeso(float kg){
        if(kg < 0){
            throw new IllegalArgumentException("nao se pode ganhar massa negativa");
        }
        return peso += kg;
    }
    public float perderPeso(float kg){
        if(kg < 0){
            throw new IllegalArgumentException("nao se pode perder massa negativa");
        }
        return peso-= kg;
    }
}
