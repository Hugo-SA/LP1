package lista004_ex005Test;

import lista004_ex005.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManutencaoTest {
    @Test
    public void deveRetornarManutencaoigualaZero(){
        ClienteManutencao cliente = new ClienteManutencao();
        assertEquals(0, cliente.getNumManutencoes());
    }
    @Test
    public void deveRetornarManutencaoigualaum(){
        ClienteManutencao cliente = new ClienteManutencao();
        Monitor manutencao = new Monitor();
        cliente.adicionarManutencao(manutencao);
        assertEquals(1, cliente.getNumManutencoes());
    }
    @Test
    public void deveRetornarManutencaoigualadois(){
        ClienteManutencao cliente = new ClienteManutencao();
        Monitor manutencao = new Monitor();
        Monitor manutencao2 = new Monitor();
        cliente.adicionarManutencao(manutencao);
        cliente.adicionarManutencao(manutencao2);
        assertEquals(2, cliente.getNumManutencoes());
    }
    @Test
    public void deveCalcularValorManutencoes(){
        ClienteManutencao cliente = new ClienteManutencao();
        Monitor manutencao = new Monitor();
        CPU manutencao2 = new CPU();
        Impressora manutencao3 = new Impressora();
        cliente.adicionarManutencao(manutencao);
        cliente.adicionarManutencao(manutencao2);
        manutencao.setMaodeObra(50);
        cliente.adicionarManutencao(manutencao3);
        manutencao2.setMaodeObra(10);
        manutencao2.setValorTrocas(50);
        manutencao3.setMaodeObra(20);
        manutencao3.setValorTrca(60);
        assertEquals(50, manutencao.calculaValor());
        assertEquals(60, manutencao2.calculaValor());
        assertEquals(110, manutencao3.calculaValor());
    }
}
