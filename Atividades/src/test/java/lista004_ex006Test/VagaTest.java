package lista004_ex006Test;

import lista004_ex006.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VagaTest {
    @Test
    public void deveRetornarigualaZero(){
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.getNumVagas());
    }
    @Test
    public void deveRetornarigualaum(){
        Cliente cliente = new Cliente();
        VagaDiaria diaria = new VagaDiaria();
        cliente.adicionarVaga(diaria);
        assertEquals(1, cliente.getNumVagas());
    }
    @Test
    public void deveRetornarigualadois(){
        Cliente cliente = new Cliente();
        VagaDiaria diaria = new VagaDiaria();
        cliente.adicionarVaga(diaria);
        VagaMensal mensal = new VagaMensal();
        cliente.adicionarVaga(mensal);
        assertEquals(2, cliente.getNumVagas());
    }
    @Test
    public void deveCalcularValorVaga(){
        Cliente cliente = new Cliente();
        VagaDiaria diaria = new VagaDiaria();
        cliente.adicionarVaga(diaria);
        diaria.setDias(2);
        assertEquals(20, diaria.valorAluguel());
        VagaMensal mensal = new VagaMensal();
        cliente.adicionarVaga(mensal);
        mensal.setMeses(2);
        assertEquals(300, mensal.valorAluguel());
        VagaSemanal semanal = new VagaSemanal();
        cliente.adicionarVaga(semanal);
        semanal.setSemanas(2);
        assertEquals(8, semanal.valorAluguel());
    }
}
