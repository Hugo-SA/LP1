package lista004_ex003;

public class Triplo extends Reserva{
    private int numDias;
    private int numRefeicoes;

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        if(numDias <= 0){
            throw new IllegalArgumentException("dias invalidos");
        }
        this.numDias = numDias;
    }

    public int getNumRefeicoes() {
        return numRefeicoes;
    }

    public void setNumRefeicoes(int numRefeicoes) {
        if(numRefeicoes < 0 ){
            throw new IllegalArgumentException("numero de refeicoes invalido");
        }
        this.numRefeicoes = numRefeicoes;
    }

    @Override
    public double ValorReserva() {
        return (100.0*numDias) + (10.0*numRefeicoes);
    }
}
