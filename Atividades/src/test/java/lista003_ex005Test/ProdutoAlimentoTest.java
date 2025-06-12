package lista003_ex005Test;

import lista003_ex005.ProdutoAlimento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ProdutoAlimentoTest {
    @Test
    public void deveRetornarValorComDescontoMaximo(){
        ProdutoAlimento produto = new ProdutoAlimento("arroz", 50, 10);
        produto.setQuilosComprados(10);
        assertEquals(500, produto.calcularPreco());
    }
    @Test
    public void deveRetornarValorComDescontoParcial(){
        ProdutoAlimento produto = new ProdutoAlimento("arroz", 50, 10);
        produto.setQuilosComprados(9);
        assertEquals(450.0f, produto.calcularPreco());
    }
    @Test
    public void deveRetornarValorSemDesconto(){
        ProdutoAlimento produto = new ProdutoAlimento("arroz", 50, 10);
        produto.setQuilosComprados(4);
        assertEquals(200, produto.calcularPreco());
    }
    @Test
    public void deveRetornarErroQuantidade(){
        try{
            ProdutoAlimento produto = new ProdutoAlimento("arroz", 50, 10);
            produto.setQuilosComprados(0);
            fail();
        }catch ( IllegalArgumentException e){
            assertEquals("quantidade errada", e.getMessage());
        }
    }
}