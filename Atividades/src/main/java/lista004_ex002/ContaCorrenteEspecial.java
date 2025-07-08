package lista004_ex002;

public class ContaCorrenteEspecial extends Conta{
    private double saldoDisponivel;
    private double limiteCredito;

    public ContaCorrenteEspecial(int numero, Cliente titular, double saldoDisponivel, double limiteCredito) {
        super(numero, titular);
        this.saldoDisponivel = saldoDisponivel;
        this.limiteCredito = limiteCredito;
    }
    @Override
    public double consultaSaldo() {
        return saldoDisponivel + limiteCredito;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
