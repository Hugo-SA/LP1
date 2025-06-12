package lista003_ex002Test;
import lista003_ex002.Diretor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiretorTest {
    @Test
    public void deveCalcularSalarioMensalDiretor(){
        Diretor funcionario = new Diretor(8000);
        funcionario.setLucroEmpresa(100000);
        funcionario.setPorcentagem_ppl(1);
        assertEquals(9000,funcionario.calcularPagamento());
    }
    @Test
    public void deveLancarExcecaoValorInvalido(){
        try{
            Diretor funcionario = new Diretor(1);
            funcionario.setLucroEmpresa(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("valor invalido", e.getMessage());
        }
    }
    @Test
    public void deveLancarExcecaoPorcentagemNegativaInvalida(){
        try{
            Diretor funcionario = new Diretor(1);
            funcionario.setPorcentagem_ppl(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("porcentagem invalida", e.getMessage());
        }
    }
    @Test
    public void deveLancarExcecaoPorcentagemInvalida(){
        try{
            Diretor funcionario = new Diretor(1);
            funcionario.setPorcentagem_ppl(102);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("porcentagem invalida", e.getMessage());
        }
    }
}
