package lista004_ex002;

public abstract class Conta {
    private int num;
    private Cliente titular;

    public Conta(int num, Cliente titular) {
        this.num = num;
        this.titular = titular;
    }

    public abstract double consultaSaldo();

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
