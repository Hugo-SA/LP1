package lista002Test;
import lista002.ContaBancaria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ContaBancariaTest {
    ContaBancaria contaBancaria;
    @BeforeEach
    public void setUp() {
        contaBancaria = new ContaBancaria();
    }
    @Test
    public void deveCalcularDeposito() {
        assertEquals(100, contaBancaria.depositar(100));
    }
    @Test
    public void deveCalcularSaque() {
        contaBancaria.setSaldo(200);
        assertEquals(100, contaBancaria.saque(100));
    }
    //fazer testes erros
}
