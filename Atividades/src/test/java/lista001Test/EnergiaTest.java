package lista001Test;
import lista001.Energia;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnergiaTest {
    Energia energia;
    @BeforeEach
    public void setUp() {
        energia = new Energia() ;
    }
    @Test
    public void deveCalcularValorEnergia(){
        energia.setQuilowatt(100);
        energia.setValorkw(0.12);
        energia.setIcms(18);
        assertEquals(12, energia.Valor());
        assertEquals(14.16, energia.ValorFinal());

    }
}
