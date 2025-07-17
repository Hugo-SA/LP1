package lista004_ex002Test;

import lista004_ex002.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ContaCorrenteNormalTest {
    @Test
    void deveAdicionarCCN(){
        Cliente cliente = new Cliente();
        ContaCorrenteNormal ccn = new ContaCorrenteNormal();
        cliente.adicionarConta(ccn);
        assertEquals(1, cliente.quantidadeContas());
    }
    @Test
    void deveCalcularValorSaldoContaPoupanca(){
        Cliente cliente = new Cliente();
        ContaCorrenteNormal ccn = new ContaCorrenteNormal();
        cliente.adicionarConta(ccn);
        ccn.setSaldoDisponivel(100);
        assertEquals(100, ccn.consultaSaldo());
    }
    @Test
    void deveRetornarErroSaldoNegativo(){
        Cliente cliente = new Cliente();
        ContaCorrenteNormal ccn = new ContaCorrenteNormal();
        cliente.adicionarConta(ccn);
        try{
            ccn.setSaldoDisponivel(-1);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("valor inválido",e.getMessage());
        }
    }
}
