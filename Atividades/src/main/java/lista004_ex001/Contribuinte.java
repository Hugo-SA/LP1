package lista004_ex001;

import java.util.ArrayList;
public class Contribuinte {
    private int codigo;
    private String nome;
    private ArrayList<Imovel> imoveis;

    public Contribuinte(){
        this.imoveis = new ArrayList<Imovel>();
    }
    public void adicionarImovel(Imovel imovel){
        this.imoveis.add(imovel);
    }
    public void retirarImovel(Imovel imovel){
        if(getNumeroImoveis() == 0){
            throw new IllegalArgumentException("nao possui imoveis para remover");
        }
        this.imoveis.remove(imovel);
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroImoveis(){
        return this.imoveis.size();
    }
    public double calcularValor() {
        double preco;
        double totalImoveis = 0.00f;
        for (Imovel imovel : this.imoveis) {
            preco = imovel.calcularValor();
            totalImoveis += preco;
        }
        return totalImoveis;
    }
}
