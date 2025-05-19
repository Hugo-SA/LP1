package lista002;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private int ano_publicacao;
    private int numero_paginas;
    private boolean aberto;
    private int paginaAtual;

    public Livro(){
        this.aberto = false;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

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
        if(this.aberto == true){
            throw new IllegalArgumentException("livro ja esta aberto");
        }
        this.aberto = true;
        this.paginaAtual = 1;
    }
    public void fechar(){
        if(! this.aberto){
            throw new IllegalArgumentException("livro já está fechado");
        }
        this.aberto = false;
    }
    public int marcar_pagina(int pagina){
        if (pagina < 0 || pagina > numero_paginas ){
            throw new IllegalArgumentException("nao e possivel marcar essa pagina");
        }
        return pagina;
    }
    public int retroceder_pagina(){
        if (paginaAtual <= 1 || paginaAtual > numero_paginas ){
            throw new IllegalArgumentException("nao e possivel retroceder esta pagina.");
        }
        return paginaAtual--;
        }
    public int avancarPagina(){
        if(paginaAtual == numero_paginas){
            throw new IllegalArgumentException("nao possui mais páginas para avançar.");
        }
        return paginaAtual++;
    }
}

