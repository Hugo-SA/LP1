package lista004_ex006Test;

import lista004_ex006.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
    public void deveCalcularOrcamentoEstacionamento(){
        Cliente cliente = new Cliente();
        VagaDiaria diaria = new VagaDiaria();
        cliente.adicionarVaga(diaria);
        diaria.setDias(2);
        VagaMensal mensal = new VagaMensal();
        cliente.adicionarVaga(mensal);
        mensal.setMeses(2);
        VagaSemanal semanal = new VagaSemanal();
        cliente.adicionarVaga(semanal);
        semanal.setSemanas(2);
        assertEquals(400, cliente.calcularValorTotal());
    }
    @Test
    public void deveRetornarListaFretes(){
        Cliente cliente = new Cliente();
        VagaDiaria diaria = new VagaDiaria();
        cliente.adicionarVaga(diaria);
        diaria.setNum(01);
        VagaMensal mensal = new VagaMensal();
        cliente.adicionarVaga(mensal);
        mensal.setNum(200);
        VagaSemanal semanal = new VagaSemanal();
        cliente.adicionarVaga(semanal);
        semanal.setNum(384948);
        ArrayList<Integer> Fretes = new ArrayList<Integer>();
        Fretes.add(01);
        Fretes.add(200);
        Fretes.add(384948);
        assertEquals(Fretes, cliente.obterNumVagas());
    }

}
