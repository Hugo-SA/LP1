package lista001;

public class Salario {
    private String nome;
    private float bruto;
    private float inss;
    private float horasExtras;
    private float valorHoraExtra;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getBruto() {
        return bruto;
    }

    public void setBruto(float bruto) {
        if (bruto < 0) {
            throw new IllegalArgumentException("Salario bruto invalido");
        }
        this.bruto = bruto;
    }

    public float getInss() {
        return inss;
    }

    public void setInss(float inss) {
        if (inss < 0 || inss > 100) {
            throw new IllegalArgumentException("Porcentagem inss invalida");
        }
        this.inss = inss;
    }

    public float getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(float horasExtras) {
        if (horasExtras < 0) {
            throw new IllegalArgumentException("hora extra invalida");
        }
        this.horasExtras = horasExtras;
    }

    public float getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(float valorHoraExtra) {
        if (valorHoraExtra < 0) {
            throw new IllegalArgumentException("valor da hora extra invalida");
        }
        this.valorHoraExtra = valorHoraExtra;
    }

    public float horaExtra() {

        return this.valorHoraExtra * this.horasExtras;
    }
    public float valorInss() {

        return (this.bruto + horaExtra()) * (this.inss / 100);
    }
    public float calcularLiquido() {

        return (this.horaExtra() + this.bruto) - valorInss() ;
    }

}
