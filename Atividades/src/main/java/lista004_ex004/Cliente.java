package lista004_ex004;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Frete> fretes;

    public Cliente(){
        this.fretes = new ArrayList<Frete>();
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

    public ArrayList<Frete> getFretes() {
        return fretes;
    }

    public void setFretes(ArrayList<Frete> fretes) {
        this.fretes = fretes;
    }
    public void adicionar(Frete frete){
        this.fretes.add(frete);
    }

    public int getNumFretes(){
        return this.fretes.size();
    }
}
