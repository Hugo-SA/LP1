package lista004_ex006;

public class VagaSemanal extends Vaga{
    private int semanas;
    private String placa;

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    @Override
    public float valorAluguel() {
        return getSemanas() * 40;
    }
}
