package lista003_ex003Test;
import lista003_ex003.ProdutoLivro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

public class ProdutoTest {
    @Test
    public void deveRetornarErro(){
        try{
            ProdutoLivro produto = new ProdutoLivro("nome", -100);
            produto.setPrecoBase(0);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("preco invalido", e.getMessage());
        }
    }
}
