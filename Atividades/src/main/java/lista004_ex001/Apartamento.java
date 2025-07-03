package lista004_ex001;

public class Apartamento extends Imovel{
    private double metragemApartamento;
    private int andar;

    public double getMetragemApartamento() {
        return metragemApartamento;
    }

    public void setMetragemApartamento(double metragemApartamento) {
        if(metragemApartamento <= 0){
            throw new IllegalArgumentException("voce esta sendo enganado bobao");
        }
        this.metragemApartamento = metragemApartamento;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    @Override
    public double calcularValor() {
        double valor = getMetragemApartamento() * 40.0;
        if(andar>0){
            valor *= (1-0.10*andar);
        }
        return valor;
    }
}
