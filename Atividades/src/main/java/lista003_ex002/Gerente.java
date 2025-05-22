package lista003_ex002;

public class Gerente extends Funcionario{
    private float bonusFixo;

    public float getBonusFixo() {
        return bonusFixo;
    }

    public void setBonusFixo(float bonusFixo) {
        if(bonusFixo > 0){
            throw new IllegalArgumentException("bonus fixo invalido");
        }
        this.bonusFixo = bonusFixo;
    }

    public Gerente(float salarioMensal) {
        super(salarioMensal);
    }

    @Override
    public float calcularPagamento() {
        return getSalarioMensal() + bonusFixo;
    }
}
