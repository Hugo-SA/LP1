package lista004_ex001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ApartamentoTest {
    @Test
    public void deveRetornarErroMetragem() {
        Contribuinte contribuinte = new Contribuinte();
        Apartamento apartamento = new Apartamento();
        try {
            apartamento.setMetragemApartamento(0);
        } catch (IllegalArgumentException e) {
            assertEquals("voce esta sendo enganado bobao", e.getMessage());
        }
    }

    @Test
    public void deveRetornarCalculoValor() {
        Contribuinte contribuinte = new Contribuinte();
        Apartamento apartamento = new Apartamento();
        apartamento.setAndar(5);
        apartamento.setMetragemApartamento(10);
        assertEquals(200, apartamento.calcularValor());
    }

    @Test
    public void deveRetornarCalculoValorAndarZero() {
        Contribuinte c = new Contribuinte();
        Apartamento apartamento = new Apartamento();
        apartamento.setMetragemApartamento(10);
        apartamento.setAndar(0);
        assertEquals(400, apartamento.calcularValor());
    }
}
