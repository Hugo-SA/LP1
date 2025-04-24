package lista001Test;

import lista001.Salario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SalarioTest {
    Salario salario;
    @BeforeEach
    public void setUp() {
        salario = new Salario() ;
    }

    @Test
    public void deveSomarNotas() {
        salario.setBruto(1000);
        salario.setHorasExtras(5);
        salario.setValorHoraExtra(10);
        salario.setInss(8);
        assertEquals(966, salario.calcularLiquido());
    }
}
