package lista004_ex003;

public abstract class Reserva {
    private int numQuarto;

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public abstract double ValorReserva();

}
