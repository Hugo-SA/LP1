package lista004_ex002;

import java.util.ArrayList;
public class Cliente {
    private String nome;
    private int codigo;
    private ArrayList<Conta> contas;

    public Cliente() {
        this.contas = new ArrayList<Conta>();
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

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
    public int quantidadeContas(){
        return this.contas.size();
    }

    public void adicionarConta(Conta conta) {
        if (!contas.contains(conta)) {
            contas.add(conta);
        }
    }
    public double calcularconta() {
        double saldo;
        double totalConta = 0.0f;
        for (Conta conta : this.contas) {
            saldo = conta.consultaSaldo();
            totalConta += saldo;
        }
        return totalConta;
    }
    public ArrayList<Integer> obterNumContas() {
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (Conta conta : this.contas) {
            num.add(conta.getNum());
        }
        return num;
    }

}
