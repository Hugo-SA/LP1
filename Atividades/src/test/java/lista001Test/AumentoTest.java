import lista001.Aumento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AumentoTest {
    Aumento aumento;

    @BeforeEach
    public void setUp() {
        aumento = new Aumento() ;
    }
    @Test
    public void deveCalcularPorcentagem() {
        aumento.setSalario(100);
        aumento.setPorcentagem(5);
        assertEquals(5, aumento.PorcentagemAumento());
        assertEquals(105, aumento.calcularAumento());
    }
}
