package lista001Test;
import lista001.Energia;
import lista001.Imc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ImcTest {
    Imc imc;
    @BeforeEach
    public void setUp() {
        imc = new Imc() ;
    }
    @Test
    public void deveCalcularImc(){
        imc.setAltura(1.70);
        imc.setPeso(76);
        imc.setSexo('F');
        assertEquals(26.29757785467128, imc.valorImc());
        assertEquals("Marginalmente acima do peso", imc.condicaoCorrespondente());
    }
}
