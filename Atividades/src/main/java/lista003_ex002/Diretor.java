package lista003_ex002;

public class Diretor extends Funcionario{
    private float lucroEmpresa;
    private float porcentagem_ppl;

    public float getLucroEmpresa() {
        return lucroEmpresa;
    }

    public void setLucroEmpresa(float lucroEmpresa) {
        if(lucroEmpresa < 0){
            throw new IllegalArgumentException("valor invalido");
        }
        this.lucroEmpresa = lucroEmpresa;
    }

    public float getPorcentagem_ppl() {
        return porcentagem_ppl;
    }

    public void setPorcentagem_ppl(float porcentagem_ppl) {
        if(porcentagem_ppl < 0 || porcentagem_ppl > 100){
            throw new IllegalArgumentException("porcentagem invalida");
        }
        this.porcentagem_ppl = porcentagem_ppl;
    }

    public Diretor(float salarioMensal) {
        super(salarioMensal);
    }


    @Override
    public float calcularPagamento() {
        return (lucroEmpresa*(porcentagem_ppl/100)) + getSalarioMensal();
    }
}
