package lista004_ex006;

public class VagaMensal extends Vaga{
    private int meses;
    private String placa;

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    @Override
    public float valorAluguel() {
        return getMeses() * 150;
    }
}
