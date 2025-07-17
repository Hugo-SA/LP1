package lista004_ex002;

public class ContaCorrenteEspecial extends Conta{
    private double saldoDisponivel;
    private double limiteCredito;

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        if(saldoDisponivel < 0){
            throw new IllegalArgumentException("valor inválido");
        }
        this.saldoDisponivel = saldoDisponivel;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        if(limiteCredito < 0){
            throw new IllegalArgumentException("limite inválido");
        }
        this.limiteCredito = limiteCredito;
    }
    @Override
    public double consultaSaldo() {
        return (saldoDisponivel + limiteCredito);
    }

}
