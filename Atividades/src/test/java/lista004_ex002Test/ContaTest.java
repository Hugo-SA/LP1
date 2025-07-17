package lista004_ex002Test;

import lista004_ex002.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class ContaTest{
    @Test
    void deveRetornarZeroContas(){
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.quantidadeContas());
    }
    @Test
    void deveRetornarUmaConta(){
        Cliente cliente = new Cliente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        cliente.adicionarConta(contaPoupanca);
        assertEquals(1, cliente.quantidadeContas());
    }
    @Test
    void deveRetornarMaisDeUmaConta(){
        Cliente cliente = new Cliente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        cliente.adicionarConta(contaPoupanca);
        ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial();
        cliente.adicionarConta(contaCorrenteEspecial);
        assertEquals(2, cliente.quantidadeContas());
    }
    @Test
    void deveCalcularSaldoContas(){
        Cliente cliente = new Cliente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        cliente.adicionarConta(contaPoupanca);
        ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial();
        cliente.adicionarConta(contaCorrenteEspecial);
        ContaCorrenteNormal contaCorrenteNormal = new ContaCorrenteNormal();
        cliente.adicionarConta(contaCorrenteNormal);
        contaCorrenteNormal.setSaldoDisponivel(100);
        contaCorrenteEspecial.setSaldoDisponivel(100);
        contaCorrenteEspecial.setLimiteCredito(100);
        contaPoupanca.setSaldoDisponivel(100);
        assertEquals(400, cliente.calcularconta());
    }
    @Test
    void deveRetornarListaNumContas() {
        ContaPoupanca conta1 = new ContaPoupanca();
        conta1.setNum(12);
        ContaCorrenteNormal conta2 = new ContaCorrenteNormal();
        conta2.setNum(24);
        ContaCorrenteEspecial conta3 = new ContaCorrenteEspecial();
        conta3.setNum(36);
        Cliente cliente = new Cliente();
        cliente.adicionarConta(conta1);
        cliente.adicionarConta(conta2);
        cliente.adicionarConta(conta3);
        ArrayList<Integer> infosBancarias = new ArrayList<Integer>();
        infosBancarias.add(12);
        infosBancarias.add(24);
        infosBancarias.add(36);
        assertEquals(infosBancarias, cliente.obterNumContas());
    }
}