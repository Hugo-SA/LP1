package lista003_ex004Test;

import lista003_ex004.VooDomestico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VooDomesticoTest {
    @Test
    public void DeveCalcularVooDomestico(){
        VooDomestico Voo = new VooDomestico("Brasil", "Argentina", 2000, 20052025);
        Voo.setFatorPrecoVooDomestico(20);
        assertEquals(40000, Voo.calcularPreco());
    }
}
