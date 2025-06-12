package lista003_ex004Test;

import lista003_ex004.VooInternacional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VooInternacionalTest {
    @Test
    public void DeveCalcularVooDomestico(){
        VooInternacional Voo = new VooInternacional("Brasil", "Argentina", 2000, 20052025);
        Voo.setFatorPrecoVooInternacional(20);
        Voo.setConversao(10);
        assertEquals(400000, Voo.calcularPreco());
    }
}
