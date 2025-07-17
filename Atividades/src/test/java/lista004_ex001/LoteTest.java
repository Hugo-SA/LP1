package lista004_ex001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoteTest {
    @Test
    public void deveRetornarCalculoValor(){
        Lote lote = new Lote();
        lote.setMetragemTerreno(50);
        assertEquals(1500.0, lote.calcularValor());
    }
    @Test
    public void metragemInvalida(){
        try{
            Lote lote = new Lote();
            lote.setMetragemTerreno(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("metragem invalida", e.getMessage());
        }
    }

}
