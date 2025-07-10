package lista004_ex003;

public class Duplo extends Reserva{
    private int numDias;
    private int numRefeicoes;

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        if(numDias <= 0){
            throw new IllegalArgumentException("dias invalido");
        }
        this.numDias = numDias;
    }

    public int getNumRefeicoes() {
        return numRefeicoes;
    }

    public void setNumRefeicoes(int numRefeicoes) {
        if(numRefeicoes < 0){
            throw new IllegalArgumentException("numero invalido");
        }
        this.numRefeicoes = numRefeicoes;
    }

    @Override
    public double ValorReserva() {
        return (80.0*numDias) +(10.0*numRefeicoes);
    }
}
