package lista004_ex002;

public class ContaCorrenteNormal extends Conta{
    private double saldoDisponivel;

    public ContaCorrenteNormal(int numero, Cliente titular, double saldoDisponivel) {
        super(numero, titular);
        this.saldoDisponivel = saldoDisponivel;
    }

    @Override
    public double consultaSaldo() {
        return saldoDisponivel;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }
}
