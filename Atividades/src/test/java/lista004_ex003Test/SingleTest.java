package lista004_ex003Test;

import lista004_ex003.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class SingleTest {
    @Test
    void deveRetornarUmaReserva(){
        Hospede hospede = new Hospede();
        Single single = new Single();
        hospede.adicionar(single);
        assertEquals(1, hospede.getNumReservas());
    }
    @Test
    public void deveRetornarErroZeroDias(){
        Hospede hospede = new Hospede();
        Single single = new Single();
        hospede.adicionar(single);
        try{
            single.setNumDias(0);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("dias errado",e.getMessage());
        }
    }
    @Test
    public void deveRetornarErroDias(){
        Hospede hospede = new Hospede();
        Single single = new Single();
        hospede.adicionar(single);
        try{
            single.setNumDias(-1);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("dias errado",e.getMessage());
        }
    }
}
