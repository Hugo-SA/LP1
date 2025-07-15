package lista004_ex005;

import java.util.ArrayList;

public class ClienteManutencao {
    private int codigo;
    private String nome;
    private ArrayList<Manutencao> manutencoes;
    public ClienteManutencao(){
        this.manutencoes = new ArrayList<Manutencao>();
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

    public ArrayList<Manutencao> getManutencoes() {
        return manutencoes;
    }

    public void setManutencoes(ArrayList<Manutencao> manutencoes) {
        this.manutencoes = manutencoes;
    }
    public void adicionarManutencao(Manutencao manutencao){
        this.manutencoes.add(manutencao);
    }

    public int getNumManutencoes(){
        return this.manutencoes.size();
    }
    public double calcularValorManutencao() {
        double valor;
        double orcamento = 0.0f;
        for (Manutencao manutencao : this.manutencoes) {
            valor = manutencao.calculaValor();
            orcamento += valor;
        }
        return orcamento;
    }
}
