package lista003_ex004Test;

import lista003_ex003.ProdutoLivro;
import lista003_ex004.Voo;
import lista003_ex004.VooDomestico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VooTest {
    @Test
    public void origemInvalida(){
        try{
            VooDomestico voo = new VooDomestico("", "Argentina", 3000, 20052025);
            voo.setOrigem(" ");
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("origem invalida", e.getMessage());
        }
    }
    @Test
    public void destinoInvalido(){
        try{
            VooDomestico voo = new VooDomestico("Brasil", "", 3000, 20052025);
            voo.setDestino(" ");
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("destino invalido", e.getMessage());
        }
    }
    @Test
    public void deveRetornarErroDistancia(){
        try{
            VooDomestico voo = new VooDomestico("Brasil", "Argentina", 0, 20052025);
            voo.setDistancia(0);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("distancia invalida", e.getMessage());
        }
    }
    @Test
    public void deveRetornarErroDataVoo(){
        try{
            VooDomestico voo = new VooDomestico("Brasil", "Argentina", 2000, 0);
            voo.setDatavoo(0);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("datavoo invalida", e.getMessage());
        }
    }

}
