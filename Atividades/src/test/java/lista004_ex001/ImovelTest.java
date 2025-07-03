package lista004_ex001;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class ImovelTest {

    @Test
    public void deveRetornarNumeroImoveis() {
        Contribuinte contribuinte = new Contribuinte();
        assertEquals(0, contribuinte.getNumeroImoveis());
    }
    @Test
    public void deveRetornarMaisDeUmImovel(){
        Contribuinte contribuinte = new Contribuinte();
        Imovel imovel = new Casa();
        Imovel imovel2 = new Apartamento();
        contribuinte.adicionarImovel(imovel);
        contribuinte.adicionarImovel(imovel2);
        assertEquals(2, contribuinte.getNumeroImoveis());
    }
    @Test
    public void deveAdicionarImovel() {
        Contribuinte contribuinte1 = new Contribuinte();
        Imovel imovel = new Casa();
        contribuinte1.adicionarImovel(imovel);
        assertEquals(1, contribuinte1.getNumeroImoveis());
    }
    @Test
    public void deveRemoverImovel(){
        Contribuinte contribuinte1 = new Contribuinte();
        Imovel imovel = new Casa();
        contribuinte1.adicionarImovel(imovel);
        contribuinte1.adicionarImovel(imovel);
        contribuinte1.retirarImovel(imovel);
        assertEquals(1,contribuinte1.getNumeroImoveis());
    }
    @Test
    public void deveRetornarErroRemoverImovel(){
        Contribuinte contribuinte1 = new Contribuinte();
        Imovel imovel = new Casa();
        try {
            contribuinte1.retirarImovel(imovel);
        }catch (IllegalArgumentException e){
            assertEquals("nao possui imoveis para remover", e.getMessage());
        }
    }
}