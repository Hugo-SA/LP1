package lista004_ex002;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private int codigo;
    private List<Conta> contas = new ArrayList<>();

    public Cliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void adicionarConta(Conta conta) {
        if (!contas.contains(conta)) {
            contas.add(conta);
        }
    }
}
