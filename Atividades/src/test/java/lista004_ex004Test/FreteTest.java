package lista004_ex004Test;

import lista004_ex004.*;
import org.junit.jupiter.api.Test;

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
    public void deveCalcularValorFretes(){
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
        assertEquals(50,frete1.calculoFrete());
        assertEquals(60, frete2.calculoFrete());
        assertEquals(110, frete3.calculoFrete());
    }
    @Test
    public void deveRetornarErroValor(){
        Cliente cliente = new Cliente();
        FreteUrgente frete = new FreteUrgente();
        try{
            cliente.adicionar(frete);
            frete.setValor(-10);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("valor invalido",e.getMessage());
        }
    }
    @Test
    public void deveRetornarErroTaxa(){
        Cliente cliente = new Cliente();
        FreteUrgente frete = new FreteUrgente();
        try{
            cliente.adicionar(frete);
            frete.setTaxaEntrega(-10);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("taxa invalida",e.getMessage());
        }
    }
    @Test
    public void deveRetornarErroQuantItem(){
        Cliente cliente = new Cliente();
        FreteUrgente frete = new FreteUrgente();
        try{
            cliente.adicionar(frete);
            frete.setQuantItem(-10);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("quantidade invalida",e.getMessage());
        }
    }
}
