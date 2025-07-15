package lista004_ex006;

import java.util.ArrayList;

public class Cliente {

    private int codigo;
    private String nome;
    private ArrayList<Vaga> vagas;

    public Cliente(){
        this.vagas = new ArrayList<Vaga>();
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

    public ArrayList<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(ArrayList<Vaga> vagas) {
        this.vagas = vagas;
    }
    public void adicionarVaga(Vaga vaga){
        this.vagas.add(vaga);
    }

    public int getNumVagas(){
        return this.vagas.size();
    }
    public float calcularQuantVagas() {
        float valor;
        float orcamento = 0.0f;
        for (Vaga vaga : this.vagas) {
            valor = vaga.valorAluguel();
            orcamento += valor;
        }
        return orcamento;
    }

}
