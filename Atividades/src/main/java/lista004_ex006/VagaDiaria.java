package lista004_ex006;

public class VagaDiaria extends Vaga{
    private int dias;
    private String placa;

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    @Override
    public float valorAluguel() {
        return getDias() * 10;
    }
}
