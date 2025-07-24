package lista004_ex004Test;

import lista004_ex004.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class FreteTest {
    @Test
    public void deveRetornarFreteigualaZero(){
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.getNumFretes());
    }
    @Test
    public void deveRetornarFreteigualaum(){
        Cliente cliente = new Cliente();
        FreteNormal frete = new FreteNormal();
        cliente.adicionar(frete);
        assertEquals(1, cliente.getNumFretes());
    }
    @Test
    public void deveRetornarFreteigualadois(){
        Cliente cliente = new Cliente();
        FreteNormal frete = new FreteNormal();
        FreteEspecial frete2 = new FreteEspecial();
        cliente.adicionar(frete2);
        cliente.adicionar(frete);
        assertEquals(2, cliente.getNumFretes());
    }
    @Test
    public void deveRetornarCalculoValorFretes(){
            Cliente cliente = new Cliente();
            FreteNormal frete1 = new FreteNormal();
            FreteEspecial frete2 = new FreteEspecial();
            FreteUrgente frete3 = new FreteUrgente();
            cliente.adicionar(frete1);
            frete1.setTaxa(50);
            cliente.adicionar(frete2);
            frete2.setTaxaEntrega(10);
            frete2.setValor(50);
            cliente.adicionar(frete3);
            frete3.setQuantItem(5);
            frete3.setTaxaEntrega(10);
            frete3.setValor(50);
            assertEquals(220, cliente.calcularFretamento());
    }
    @Test
    public void deveRetornarListaFretes(){
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal();
        FreteEspecial frete2 = new FreteEspecial();
        FreteUrgente frete3 = new FreteUrgente();
        cliente.adicionar(frete1);
        frete1.setNumFrete(01);
        cliente.adicionar(frete2);
        frete2.setNumFrete(02);
        cliente.adicionar(frete3);
        frete3.setNumFrete(03);
        ArrayList<Integer> Fretes = new ArrayList<Integer>();
        Fretes.add(01);
        Fretes.add(02);
        Fretes.add(03);
        assertEquals(Fretes, cliente.obterListaFretes());
    }
    @Test
    public void deveCalcularFretamento(){
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal();
        FreteEspecial frete2 = new FreteEspecial();
        FreteUrgente frete3 = new FreteUrgente();
        cliente.adicionar(frete1);
        frete1.setTaxa(50);
        cliente.adicionar(frete2);
        frete2.setTaxaEntrega(10);
        frete2.setValor(50);
        cliente.adicionar(frete3);
        frete3.setQuantItem(5);
        frete3.setTaxaEntrega(10);
        frete3.setValor(50);
        assertEquals(220, cliente.calcularFretamento());
    }
}
