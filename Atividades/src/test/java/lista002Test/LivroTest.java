package lista002Test;
import lista002.Livro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class LivroTest {
    Livro livro;

    @BeforeEach
    public void setUp() {
        livro = new Livro();
    }
    @Test
    public void deveAbrirLivro(){
        livro.abrir();
        assertEquals(true, livro.getAberto());
    }

    @Test
    public void deveFecharLivro(){
        livro.abrir();
        livro.fechar();
        assertEquals(false, livro.getAberto());
    }
    @Test
    public void deveAvancarPagina(){
        livro.setNumero_paginas(10);
        livro.setPaginaAtual(9);
        livro.avancarPagina();
        assertEquals(10, livro.getPaginaAtual());
    }
    @Test
    public void deveRetrocederPagina(){
        livro.setNumero_paginas(10);
        livro.setPaginaAtual(10);
        livro.retroceder_pagina();
        assertEquals(9, livro.getPaginaAtual());
    }
    @Test
    public void deveMarcarPagina(){
        livro.setNumero_paginas(10);
        livro.setPaginaAtual(9);
        assertEquals(9, livro.marcar_pagina(livro.getPaginaAtual()));
    }

    @Test
    public void deveFecharErrado(){
        try{
            livro.fechar();
            fail();
        }
        catch (IllegalArgumentException e) {
                assertEquals("livro já está fechado", e.getMessage());
        }
    }
    @Test
    public void deveAbrirErrado(){
        try{
            livro.abrir();
            livro.abrir();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("livro ja esta aberto", e.getMessage());
        }
    }
    @Test
    public void deveMarcarPaginaErrada(){
        try{
            livro.setNumero_paginas(10);
            livro.marcar_pagina(11);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("nao e possivel marcar essa pagina", e.getMessage());
        }
    }
    @Test
    public void deveAvancarPaginaErrado(){
        try{
            livro.setNumero_paginas(10);
            livro.setPaginaAtual(10);
            livro.avancarPagina();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("nao possui mais páginas para avançar.", e.getMessage());
        }
    }
    @Test
    public void deveRetrocederPaginaErrado(){
        try{
            livro.setNumero_paginas(10);
            livro.setPaginaAtual(1);
            livro.retroceder_pagina();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("nao e possivel retroceder esta pagina.", e.getMessage());
        }
    }
    @Test
    public void deveMarcarPaginaErrado(){
        try{
            livro.setNumero_paginas(10);
            livro.setPaginaAtual(-20);
            livro.marcar_pagina(livro.getPaginaAtual());
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("nao e possivel marcar essa pagina", e.getMessage());
        }
    }
    @Test
    public void deveColocarPaginaErrado(){
        try{
            livro.setNumero_paginas(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("numero de paginas não pode ser menor ou igual a 0", e.getMessage());
        }
    }
    //fazer testes pro caso do livro estar fechado em todos os casos


}
