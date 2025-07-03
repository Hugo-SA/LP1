package lista004_ex001;

import java.util.ArrayList;
import java.util.List;

public class Contribuinte {
    private int codigo;
    private String nome;
    private List<Imovel> imoveis = new ArrayList<>();

    public Contribuinte(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public void adicionarImovel(Imovel imovel) {
        if(!imoveis.contains(imovel)){
            imoveis.add(imovel);
        }
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

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }
}
