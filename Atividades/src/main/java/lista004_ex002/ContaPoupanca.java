package lista004_ex002;

public class ContaPoupanca extends Conta{
    private double saldoDisponivel;

    public ContaPoupanca(int num, Cliente titular, double saldoDisponivel) {
        super(num, titular);
        this.saldoDisponivel = saldoDisponivel;
    }
    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    @Override
    public double consultaSaldo() {
        return saldoDisponivel;
    }
}
