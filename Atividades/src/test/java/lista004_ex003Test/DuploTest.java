package lista004_ex003Test;

import lista004_ex003.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class DuploTest {
    @Test
    void deveRetornarUmaReserva(){
        Hospede hospede = new Hospede();
        Duplo duplo = new Duplo();
        hospede.adicionar(duplo);
        assertEquals(1, hospede.getNumReservas());
    }
    @Test
    public void deveRetornarErroZeroDias(){
        Hospede hospede = new Hospede();
        Duplo duplo = new Duplo();
        hospede.adicionar(duplo);
        try{
            duplo.setNumDias(0);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("dias invalido",e.getMessage());
        }
    }
    @Test
    public void deveRetornarErroDias(){
        Hospede hospede = new Hospede();
        Duplo duplo = new Duplo();
        hospede.adicionar(duplo);
        try{
            duplo.setNumDias(-1);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("dias invalido",e.getMessage());
        }
    }
    @Test
    public void deveRetornarErroRefeicoes(){
        Hospede hospede = new Hospede();
        Duplo duplo = new Duplo();
        hospede.adicionar(duplo);
        try{
            duplo.setNumRefeicoes(-1);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("numero invalido",e.getMessage());
        }
    }
    @Test
    public void deveRetornarCalculoReservaDuplo(){
        Hospede hospede = new Hospede();
        Duplo duplo = new Duplo();
        hospede.adicionar(duplo);
        duplo.setNumRefeicoes(1);
        duplo.setNumDias(1);
        assertEquals(90, duplo.ValorReserva());
    }
}
