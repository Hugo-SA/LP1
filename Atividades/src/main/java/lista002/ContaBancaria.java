package lista002;

public class ContaBancaria {
    private String titular;
    private float numero_conta;
    private float saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(float numero_conta) {
        this.numero_conta = numero_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("O saldo deve ser maior ou igual a zero.");
        }
        this.saldo = saldo;
    }
    public float depositar(float valor){
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior do que zero.");
        }
        return this.saldo += valor;
    }
    public float saque(float valor){
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior do que zero.");
        }
        if (saldo < valor){
            throw new IllegalArgumentException("O valor do saque deve ser menor ou igual ao valor do saldo da conta.");
        }
        return this.saldo -= valor;
    }
}
