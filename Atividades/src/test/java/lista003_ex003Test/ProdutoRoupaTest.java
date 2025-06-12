package lista003_ex003Test;
import lista003_ex003.ProdutoRoupa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoRoupaTest {
    @Test
    public void deveCalcularPreco(){
        ProdutoRoupa produto = new ProdutoRoupa("camisa", 100);
        assertEquals(80, produto.calcularPreco());
    }
}
