package lista004_ex004Test;

import lista004_ex004.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FreteNormalTest {
    @Test
    public void deveRetornarUmFreteNormal(){
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal();
        frete1.setTaxa(20);
        cliente.adicionar(frete1);
        assertEquals(1, cliente.getNumeroFretes());
    }
    @Test
    public void deveRetornarErroTaxaZero(){
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal();
        try{
            frete1.setTaxa(0);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("valor invalido", e.getMessage());
        }
    }
    @Test
    public void deveRetornarErroTaxaNegativa(){
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal();
        try{
            frete1.setTaxa(-1);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("valor invalido", e.getMessage());
        }
    }
    @Test
    public void deveCalcularFrete() {
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal();
        frete1.setTaxa(20);
        cliente.adicionar(frete1);
        assertEquals(20, frete1.calculoFrete());
    }
}
