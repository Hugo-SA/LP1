package lista001;

public class Energia {
    private String nome;
    private double quilowatt;
    private double valorkw;
    private float icms;

    public double getQuilowatt() {
        return quilowatt;
    }

    public float getIcms() {
        return icms;
    }

    public void setIcms(float icms) {
        this.icms = icms;
    }

    public void setQuilowatt(double quilowatt) {
        this.quilowatt = quilowatt;
    }

    public double getValorkw() {
        return valorkw;
    }

    public void setValorkw(double valorkw) {
        this.valorkw = valorkw;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public double Valor() {

        return this.quilowatt * this.valorkw;
    }
    public double ValorFinal() {
        return this.Valor() * (1 + this.icms/100);
    }
}
