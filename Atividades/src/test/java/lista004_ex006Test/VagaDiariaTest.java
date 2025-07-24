package lista004_ex006Test;

import lista004_ex004.*;
import lista004_ex006.VagaDiaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class VagaDiariaTest {
    @Test
    public void deveRetornarErroValor(){
        Cliente cliente = new Cliente();
        VagaDiaria vaga1 = new VagaDiaria();
        try{
            vaga1.setDias(0);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("dias invalidos",e.getMessage());
        }
    }
    @Test
    public void deveRetornarErroValorNegativo(){
        Cliente cliente = new Cliente();
        VagaDiaria vaga1 = new VagaDiaria();
        try{
            vaga1.setDias(-1);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("dias invalidos",e.getMessage());
        }
    }
    @Test
    public void deveCalcularValorTotal(){
        Cliente cliente = new Cliente();
        VagaDiaria vaga1 = new VagaDiaria();
        vaga1.setDias(2);
        assertEquals(20, vaga1.valorAluguel());
    }
}
