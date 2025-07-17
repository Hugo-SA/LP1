package lista004_ex002Test;

import lista004_ex002.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ContaPoupancaTest {
    @Test
    void deveAdicionarContaPoupanca(){
        Cliente cliente = new Cliente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        cliente.adicionarConta(contaPoupanca);
        assertEquals(1, cliente.quantidadeContas());
    }
    @Test
    void deveCalcularValorSaldoContaPoupanca(){
        Cliente cliente = new Cliente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        cliente.adicionarConta(contaPoupanca);
        contaPoupanca.setSaldoDisponivel(100);
        assertEquals(100, contaPoupanca.consultaSaldo());
    }
    @Test
    void deveRetornarErroSaldoNegativo(){
        Cliente cliente = new Cliente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        cliente.adicionarConta(contaPoupanca);
        try{
            contaPoupanca.setSaldoDisponivel(-1);
            fail();
        }catch(IllegalArgumentException e){
        assertEquals("valor inválido",e.getMessage());
        }
    }
}
