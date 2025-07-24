package lista004_ex004Test;

import lista004_ex004.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FreteUrgenteTest {

    @Test
    public void deveRetornarUmFreteNormal(){
        Cliente cliente = new Cliente();
        FreteUrgente frete1 = new FreteUrgente();
        cliente.adicionar(frete1);
        assertEquals(1, cliente.getNumeroFretes());
    }
    @Test
    public void deveRetornarErroTaxaZero(){
        Cliente cliente = new Cliente();
        FreteUrgente frete1 = new FreteUrgente();
        try{
            frete1.setTaxaEntrega(0);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("taxa invalida", e.getMessage());
        }
    }
    @Test
    public void deveRetornarErroTaxaNegativa(){
        Cliente cliente = new Cliente();
        FreteUrgente frete1 = new FreteUrgente();
        try{
            frete1.setTaxaEntrega(-1);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("taxa invalida", e.getMessage());
        }
    }
    @Test
    public void deveTestarValorNegativo(){
        Cliente cliente = new Cliente();
        FreteUrgente frete1 = new FreteUrgente();
        try{
            frete1.setValor(-1);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("valor invalido", e.getMessage());
        }
    }
    @Test
    public void deveTestarValorZero(){
        Cliente cliente = new Cliente();
        FreteUrgente frete1 = new FreteUrgente();
        frete1.setValor(0);
        assertEquals(0, frete1.getValor());
    }
    @Test
    public void deveCalcularFrete() {
        Cliente cliente = new Cliente();
        FreteUrgente frete1 = new FreteUrgente();
        frete1.setTaxaEntrega(20);
        frete1.setValor(10);
        frete1.setQuantItem(5);
        cliente.adicionar(frete1);
        assertEquals(80, frete1.calculoFrete());
    }
}
