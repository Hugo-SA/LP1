package lista004_ex003;

public class Single extends Reserva{
    private int numDias;

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        if(numDias <= 0){
            throw new IllegalArgumentException("dias errado");
        }
        this.numDias = numDias;
    }

    @Override
    public double ValorReserva() {
        return numDias * 50.0;
    }
}
