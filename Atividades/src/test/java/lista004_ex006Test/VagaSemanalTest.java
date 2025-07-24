package lista004_ex006Test;

import lista004_ex006.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class VagaSemanalTest {
    @Test
    public void deveRetornarErroValor(){
        Cliente cliente = new Cliente();
        VagaSemanal vaga1 = new VagaSemanal();
        try{
            vaga1.setSemanas(0);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("numero invalido",e.getMessage());
        }
    }
    @Test
    public void deveRetornarErroValorNegativo(){
        Cliente cliente = new Cliente();
        VagaSemanal vaga1 = new VagaSemanal();
        try{
            vaga1.setSemanas(-1);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("numero invalido",e.getMessage());
        }
    }
    @Test
    public void deveCalcularValorTotal(){
        Cliente cliente = new Cliente();
        VagaSemanal vaga1 = new VagaSemanal();
        vaga1.setSemanas(2);
        assertEquals(80, vaga1.valorAluguel());
    }
}
