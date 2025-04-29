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
    @Test
    public void deveTestarContaBancariaNegativa(){
        try {
            contaBancaria.setSaldo(-100);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("O saldo deve ser maior do que zero.", e.getMessage());
        }
    }
    @Test
    public void deveTestarDepositoNegativo(){
        try {
            contaBancaria.depositar(-100);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("O valor do depósito deve ser maior do que zero.", e.getMessage());
        }
    }
    @Test
    public void deveTestarSaqueNegativo(){
        try {
            contaBancaria.saque(-100);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("O valor do saque deve ser maior do que zero.", e.getMessage());
        }
    }
    @Test
    public void deveTestarSaqueInvalido(){
        contaBancaria.setSaldo(100);
        try {
            contaBancaria.saque(101);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("O valor do saque deve ser menor ou igual ao valor do saldo da conta.", e.getMessage());
        }
    }
}
