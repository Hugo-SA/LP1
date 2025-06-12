package lista003_ex002;

public class FuncionarioComum extends Funcionario{

    public FuncionarioComum(float salarioMensal) {
        super(salarioMensal);
    }

    @Override
    public float calcularPagamento() {
        return getSalarioMensal();
    }
}
