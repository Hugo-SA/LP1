package lista001Test;
import lista001.Combustivel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombustivelTest {
    Combustivel combustivel;
    @BeforeEach
    public void setUp() {
        combustivel = new Combustivel() ;
    }
    @Test
    public void deveCalcularMedia(){
        combustivel.setCombustivelGasto(10);
        combustivel.setKm(200);
        assertEquals(20, combustivel.Media());
    }
}
