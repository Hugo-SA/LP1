package lista003_ex002Test;
import lista003_ex002.FuncionarioComum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioComumTest {
    @Test
    public void deveRetornarSalarioMensal(){
        FuncionarioComum funcionario = new FuncionarioComum(1518);
        assertEquals(1518, funcionario.calcularPagamento());
    }

}
