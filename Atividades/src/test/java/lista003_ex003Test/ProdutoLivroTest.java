package lista003_ex003Test;
import lista003_ex003.ProdutoLivro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoLivroTest {
    @Test
    public void deveCalcularPreco(){
        ProdutoLivro produto = new ProdutoLivro("Piada", 100);
        assertEquals(70, produto.calcularPreco());
    }
}

