package lista003_ex002Test;
import lista003_ex002.Gerente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GerenteTest{
    @Test
    public void deveRetornarSalarioMensal(){
        Gerente funcionario = new Gerente(3036);
        funcionario.setBonusFixo(100);
        assertEquals(3136, funcionario.calcularPagamento());
    }
    @Test
    public void deveLancarBonusInvalido(){
        try{
            Gerente funcionario = new Gerente(1);
            funcionario.setBonusFixo(-1);
        }
        catch (IllegalArgumentException e){
            assertEquals("bonus fixo invalido", e.getMessage());
        }
    }

}
