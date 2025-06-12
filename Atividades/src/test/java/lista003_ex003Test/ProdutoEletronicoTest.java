package lista003_ex003Test;
import lista003_ex003.ProdutoEletronico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoEletronicoTest {
    @Test
    public void deveCalcularPreco(){
        ProdutoEletronico produto = new ProdutoEletronico("bateria", 100);
        assertEquals(90, produto.calcularPreco());
    }
}
