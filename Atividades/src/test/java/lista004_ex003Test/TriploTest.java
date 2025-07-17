package lista004_ex003Test;

import lista004_ex003.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TriploTest {
    @Test
    void deveRetornarUmaReserva(){
        Hospede hospede = new Hospede();
        Triplo triplo = new Triplo();
        hospede.adicionar(triplo);
        assertEquals(1, hospede.getNumReservas());
    }
    @Test
    public void deveRetornarErroZeroDias(){
        Hospede hospede = new Hospede();
        Triplo triplo = new Triplo();
        hospede.adicionar(triplo);
        try{
            triplo.setNumDias(0);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("dias invalidos",e.getMessage());
        }
    }
    @Test
    public void deveRetornarErroDias(){
        Hospede hospede = new Hospede();
        Triplo triplo = new Triplo();
        hospede.adicionar(triplo);
        try{
            triplo.setNumDias(-1);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("dias invalidos",e.getMessage());
        }
    }
    @Test
    public void deveRetornarErroRefeicoes(){
        Hospede hospede = new Hospede();
        Triplo triplo = new Triplo();
        hospede.adicionar(triplo);
        try{
            triplo.setNumRefeicoes(-1);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("numero de refeicoes invalido",e.getMessage());
        }
    }
    @Test
    public void deveRetornarCalculoReservaDuplo(){
        Hospede hospede = new Hospede();
        Triplo triplo = new Triplo();
        hospede.adicionar(triplo);
        triplo.setNumRefeicoes(1);
        triplo.setNumDias(1);
        assertEquals(110, triplo.ValorReserva());
    }
}
