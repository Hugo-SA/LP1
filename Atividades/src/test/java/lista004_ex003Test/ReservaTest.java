package lista004_ex003Test;

import lista004_ex003.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
    @Test
    public void deveRetornarListaResevas(){
        Hospede hospede = new Hospede();
        Single reserva1 = new Single();
        reserva1.setNumQuarto(10);
        Duplo reserva2 = new Duplo();
        reserva2.setNumQuarto(71);
        Triplo reserva3 = new Triplo();
        reserva3.setNumQuarto(49);
        hospede.adicionar(reserva1);
        hospede.adicionar(reserva2);
        hospede.adicionar(reserva3);
        ArrayList<Integer> Quartos = new ArrayList<Integer>();
        Quartos.add(10);
        Quartos.add(71);
        Quartos.add(49);
        assertEquals(Quartos, hospede.obterNumContas());
    }
}
