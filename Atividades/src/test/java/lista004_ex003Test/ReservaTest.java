package lista004_ex003Test;

import lista004_ex003.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReservaTest {
    @Test
    void deveRetornarUmaReserva(){
        Hospede hospede = new Hospede();
        Reserva reserva = new Single();
        hospede.adicionar(reserva);
        assertEquals(1, hospede.getNumReservas());
    }
    @Test
    void deveRetornarMaisdeUmaReserva(){
        Hospede hospede = new Hospede();
        Reserva reserva = new Single();
        Reserva reserva2 = new Duplo();
        hospede.adicionar(reserva);
        hospede.adicionar(reserva2);
        assertEquals(2, hospede.getNumReservas());
    }
    @Test
    void deveRetornarNenhumaReserva(){
        Hospede hospede = new Hospede();
        assertEquals(0, hospede.getNumReservas());
    }
    @Test
    void deveRetornarValorTotalCadaReserva(){
        Hospede hospede = new Hospede();
        Single reserva1 = new Single();
        Duplo reserva2 = new Duplo();
        Triplo reserva3 = new Triplo();
        hospede.adicionar(reserva1);
        hospede.adicionar(reserva2);
        hospede.adicionar(reserva3);
        reserva1.setNumDias(2);
        reserva2.setNumDias(2);
        reserva2.setNumRefeicoes(3);
        reserva3.setNumDias(2);
        reserva3.setNumRefeicoes(3);
        assertEquals(100.0,reserva1.ValorReserva());
        assertEquals(190,reserva2.ValorReserva());
        assertEquals(230,reserva3.ValorReserva());
    }
    @Test
    public void deveRetornarErroDias(){
        Hospede hospede = new Hospede();
        Single reserva1 = new Single();
        try{
            hospede.adicionar(reserva1);
            reserva1.setNumDias(-1);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("dias errado", e.getMessage());
        }
    }
    @Test
    public void deveRetornarValorReservas(){
        Hospede hospede = new Hospede();
        Single reserva1 = new Single();
        Duplo reserva2 = new Duplo();
        Triplo reserva3 = new Triplo();
        hospede.adicionar(reserva1);
        hospede.adicionar(reserva2);
        hospede.adicionar(reserva3);
        reserva1.setNumDias(2);
        reserva2.setNumDias(2);
        reserva2.setNumRefeicoes(3);
        reserva3.setNumDias(2);
        reserva3.setNumRefeicoes(3);
        assertEquals(520, hospede.calcularFolhaPagamento());
    }
}
