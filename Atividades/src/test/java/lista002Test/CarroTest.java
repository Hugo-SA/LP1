package lista002Test;
import lista002.Carro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CarroTest {
    Carro carro;

    @BeforeEach
    public void setUp() {
        carro = new Carro();
    }

    @Test
    public void deveCalcularVelocidadeAtual() {
        assertEquals(100, carro.Acelerar(100));
        assertEquals(50, carro.Frear(200));
    }
    @Test
    public void deveTestarFreagemNegativa() {
        carro.setVelocidade_atual(100);
        try {
            carro.Frear(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("A quantidade de km para frear não pode ser negativa.", e.getMessage());
        }
    }
    @Test
    public void deveTestarVelocidadeNegativa(){
        carro.setVelocidade_atual(100);
        try {
            carro.Frear(101);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("A velocidade atual é menor do que a quantidade para frear.", e.getMessage());
        }
    }
}