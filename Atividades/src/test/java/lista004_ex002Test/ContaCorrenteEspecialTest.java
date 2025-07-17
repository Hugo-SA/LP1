package lista004_ex002Test;

import lista004_ex002.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ContaCorrenteEspecialTest {
    @Test
    void deveAdicionarCCE(){
        Cliente cliente = new Cliente();
        ContaCorrenteEspecial cce = new ContaCorrenteEspecial();
        cliente.adicionarConta(cce);
        assertEquals(1, cliente.quantidadeContas());
    }
    @Test
    void deveCalcularValorSaldoContaPoupanca(){
        Cliente cliente = new Cliente();
        ContaCorrenteEspecial cce = new ContaCorrenteEspecial();
        cliente.adicionarConta(cce);
        cce.setSaldoDisponivel(100);
        cce.setLimiteCredito(100);
        assertEquals(200, cce.consultaSaldo());
    }
    @Test
    void deveRetornarErroSaldoNegativo(){
        Cliente cliente = new Cliente();
        ContaCorrenteEspecial cce = new ContaCorrenteEspecial();
        cliente.adicionarConta(cce);
        try{
            cce.setSaldoDisponivel(-1);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("valor inválido",e.getMessage());
        }
    }
    @Test
    void deveRetornarErroLimiteNegativo(){
        Cliente cliente = new Cliente();
        ContaCorrenteEspecial cce = new ContaCorrenteEspecial();
        cliente.adicionarConta(cce);
        try{
            cce.setLimiteCredito(-1);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("limite inválido",e.getMessage());
        }
    }
}
