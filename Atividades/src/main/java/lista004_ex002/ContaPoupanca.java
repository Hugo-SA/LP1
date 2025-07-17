package lista004_ex002;

public class ContaPoupanca extends Conta{
    private double saldoDisponivel;

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        if(saldoDisponivel < 0){
            throw new IllegalArgumentException("valor inválido");
        }
        this.saldoDisponivel = saldoDisponivel;
    }

    @Override
    public double consultaSaldo() {
        return saldoDisponivel;
    }
}
