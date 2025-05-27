package lista003_ex005Test;

import lista003_ex005.ProdutoRoupa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ProdutoRoupaTest {
    @Test
    public void deveRetornarValorComDescontoMaximo(){
        ProdutoRoupa produto = new ProdutoRoupa("camisa", 50, 10);
        produto.setQuantidadeComprada(10);
        assertEquals(450, produto.calcularPreco());
    }
    @Test
    public void deveRetornarValorComDescontoParcial(){
        ProdutoRoupa produto = new ProdutoRoupa("camisa", 50, 10);
        produto.setQuantidadeComprada(9);
        assertEquals(427.5f, produto.calcularPreco());
    }
    @Test
    public void deveRetornarValorSemDesconto(){
        ProdutoRoupa produto = new ProdutoRoupa("camisa", 50, 10);
        produto.setQuantidadeComprada(4);
        assertEquals(200, produto.calcularPreco());
    }
    @Test
    public void deveRetornarErroQuantidade(){
        try{
            ProdutoRoupa produto = new ProdutoRoupa("camisa", 50, 10);
            produto.setQuantidadeComprada(0);
            fail();
        }catch ( IllegalArgumentException e){
            assertEquals("quantidade invalida", e.getMessage());
        }
    }
}