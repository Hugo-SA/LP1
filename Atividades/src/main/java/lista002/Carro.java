package lista002;

public class Carro {
    private String marca;
    private String modelo;
    private float ano;
    private float velocidade_atual;
    private boolean estado;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getAno() {
        return ano;
    }

    public void setAno(float ano) {
        this.ano = ano;
    }

    public float getVelocidade_atual() {
        return velocidade_atual;
    }

    public void setVelocidade_atual(float velocidade_atual) {
        if (velocidade_atual < 0) {
            this.velocidade_atual = 0;
        } else {
            this.velocidade_atual = velocidade_atual;
        }
    }


    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public float Acelerar(float km){
        if (km < 0) {
           return this.velocidade_atual = 0;
        } else {
            return this.velocidade_atual += km;
        }
    }
    public float Frear(float km){
        if (km < 0) {
            throw new IllegalArgumentException("A quantidade de km para frear não pode ser negativa.");
        }
        if (velocidade_atual < km) {
            throw new IllegalArgumentException("A velocidade atual é menor do que a quantidade para frear.");
        }
        return this.velocidade_atual -= km;
    }
    public void desligar() {
        estado = false;
        velocidade_atual = 0;
    }
    public void ligar() {
        estado = true;
    }
}
