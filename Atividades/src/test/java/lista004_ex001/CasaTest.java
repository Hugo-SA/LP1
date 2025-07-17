package lista004_ex001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasaTest {
    @Test
    public void deveRetornarCalculoValor() {
        Casa casa = new Casa();
        casa.setMetragemConstrucao(40);
        casa.setMetragemTerrenoCasa(20);
        assertEquals(2600.0, casa.calcularValor());
    }

    @Test
    public void deveRetornarErroMetragemTerreno() {
        Casa casa = new Casa();
        try {
            casa.setMetragemTerrenoCasa(0);
        } catch (IllegalArgumentException e) {
            assertEquals("metragem terreno invalida", e.getMessage());
        }
    }
    @Test
    public void deveRetornarErroMetragemConstrucao(){
        Casa casa = new Casa();
        try{
            casa.setMetragemConstrucao(-2);
        }catch(IllegalArgumentException e){
            assertEquals("metragem construcao errada", e.getMessage());
        }
    }
}