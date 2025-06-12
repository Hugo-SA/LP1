package lista003_ex005Test;

import lista003_ex005.ProdutoEletronico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoEletronicoTest {
    @Test
    public void deveRetornarValorComDescontoMaximo(){
        ProdutoEletronico produto = new ProdutoEletronico("relé", 50, 10);
        produto.setQuantidadeComprada(10);
        assertEquals(450, produto.calcularPreco());
    }
    @Test
    public void deveRetornarValorComDescontoParcial(){
        ProdutoEletronico produto = new ProdutoEletronico("relé", 50, 10);
        produto.setQuantidadeComprada(9);
        assertEquals(427.5f, produto.calcularPreco());
    }
    @Test
    public void deveRetornarValorSemDesconto(){
        ProdutoEletronico produto = new ProdutoEletronico("relé", 50, 10);
        produto.setQuantidadeComprada(4);
        assertEquals(200, produto.calcularPreco());
    }
    @Test
    public void deveRetornarErroQuantidade(){
        try{
            ProdutoEletronico produto = new ProdutoEletronico("relé", 50, 10);
            produto.setQuantidadeComprada(0);
            fail();
        }catch ( IllegalArgumentException e){
            assertEquals("quantidade invalida", e.getMessage());
        }
    }
}

