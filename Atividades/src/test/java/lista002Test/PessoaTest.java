package lista002Test;
import lista002.Pessoa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PessoaTest {
    Pessoa pessoa;

    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    public void deveTestarEnvelhecer(){
        pessoa.setIdade(30);
        pessoa.envelhecer();
        assertEquals(31, pessoa.getIdade());
    }
    @Test
    public void deveTestarCrescer(){
        pessoa.setIdade(20);
        pessoa.setAltura(1.75f);
        pessoa.crescer();
        assertEquals(1.76f, pessoa.getAltura());
    }
    @Test
    public void deveTestarGanharPeso(){
        pessoa.setPeso(50.0f);
        pessoa.ganharPeso(20.0f);
        assertEquals(70.0f, pessoa.getPeso());
    }


    @Test
    public void deveTestarIdadeErrada(){
        try{
            pessoa.setIdade(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("idade invalida", e.getMessage());
        }
    }
    @Test
    public void deveTestarAlturaErrada(){
        try{
            pessoa.setAltura(-0.1f);
        }
        catch (IllegalArgumentException e){
            assertEquals("altura invalida", e.getMessage());
        }
    }
    @Test
    public void deveTestarPesoErrado(){
        try{
            pessoa.setPeso(-0.1f);
        }
        catch (IllegalArgumentException e){
            assertEquals("peso invalido", e.getMessage());
        }
    }
    @Test
    public void deveTestarCrescerErrado(){
        try{
            pessoa.setIdade(21);
            pessoa.crescer();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("pessoa nao cresce mais", e.getMessage());
        }
    }
    @Test
    public void deveTestarGanharMassaNegativa(){
        try{
            pessoa.ganharPeso(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("nao se pode ganhar massa negativa", e.getMessage());
        }
    }@Test
    public void deveTestarPerderMassaNegativa(){
        try{
            pessoa.perderPeso(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("nao se pode perder massa negativa", e.getMessage());
        }
    }

}
