package lista004_ex002Test;

import lista004_ex002.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class ContaTest{

    @Test
    void testCriacaoClienteEGetters() {
        Cliente c = new Cliente(10, "Ana");
        assertEquals(10, c.getCodigo());
        assertEquals("Ana", c.getNome());
        assertNotNull(c.getContas());
        assertTrue(c.getContas().isEmpty());
    }

    @Test
    void testAssociacaoClienteConta() {
        Cliente c = new Cliente(20, "Pedro");
        ContaCorrenteNormal cc = new ContaCorrenteNormal(1001, c, 500.0);

        List<Conta> contas = c.getContas();
        assertEquals(1, contas.size());
        assertTrue(contas.contains(cc));
    }

    @Test
    void testContaCorrenteNormalSaldo() {
        Cliente c = new Cliente(30, "Lucas");
        ContaCorrenteNormal cc = new ContaCorrenteNormal(1002, c, 200.0);

        assertEquals(200.0, cc.consultaSaldo());
        assertEquals(200.0, cc.getSaldoDisponivel());
    }

    @Test
    void testContaCorrenteEspecialSaldo() {
        Cliente c = new Cliente(31, "Julia");
        ContaCorrenteEspecial ce = new ContaCorrenteEspecial(1003, c, 300.0, 150.0);

        assertEquals(450.0, ce.consultaSaldo()); // saldo + limite
        assertEquals(300.0, ce.getSaldoDisponivel());
        assertEquals(150.0, ce.getLimiteCredito());
    }

    @Test
    void testContaPoupancaSaldo() {
        Cliente c = new Cliente(32, "Carlos");
        ContaPoupanca cp = new ContaPoupanca(1004, c, 800.0);

        assertEquals(800.0, cp.consultaSaldo());
        assertEquals(800.0, cp.getSaldoDisponivel());
    }

    @Test
    void testConsultaDeContasPorCliente() {
        Cliente c = new Cliente(40, "Lia");
        ContaCorrenteNormal cc = new ContaCorrenteNormal(2001, c, 100.0);
        ContaPoupanca cp = new ContaPoupanca(2002, c, 500.0);

        List<Conta> contas = c.getContas();
        assertEquals(2, contas.size());
        assertTrue(contas.contains(cc));
        assertTrue(contas.contains(cp));
    }
}