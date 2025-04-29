package lista002;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private int ano_publicacao;
    private int numero_paginas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        if(numero_paginas <= 0){
            throw new IllegalArgumentException("numero de paginas não pode ser menor ou igual a 0");
        }
        this.numero_paginas = numero_paginas;

    }
    public void abrir(){
        String mensagem;
        mensagem = "livro aberto";
    }
    public void fechar(){
        String mensagem;
        mensagem = "livro fechado";
    }
    public float marcar_pagina(int paginaAtual){
        if (paginaAtual < 0 || paginaAtual > numero_paginas ){
            throw new IllegalArgumentException("não é possível marcar essa página")
        }
        return paginaAtual;
    }
    public float retroceder_pagina(int paginaAtual){
        if (paginaAtual <= 1 || paginaAtual > numero_paginas ){
            throw new IllegalArgumentException("não é possivel retroceder esta página.");
        }
        return paginaAtual - 1;
        }
}
