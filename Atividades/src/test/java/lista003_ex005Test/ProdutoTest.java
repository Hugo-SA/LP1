package lista003_ex005Test;

import lista003_ex005.ProdutoEletronico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {
    @Test
    public void DeveRetornarErroNome(){
        try{
            ProdutoEletronico produto = new ProdutoEletronico("relé", 1, 10);
            produto.setNome("");
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("nome invalido", e.getMessage());
        }
    }
    @Test
    public void deveRetornarErroPrecoUnitario(){
        try{
            ProdutoEletronico produto = new ProdutoEletronico("relé", 1, 10);
            produto.setPrecoUnitario(0);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("preco unitario invalido", e.getMessage());
        }
    }
    @Test
    public void deveRetornarErroEstoque(){
        try{
            ProdutoEletronico produto = new ProdutoEletronico("relé", 1, 10);
            produto.setQuantidadeEstoque(-1);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("quantidade invalida", e.getMessage());
        }
    }

}
