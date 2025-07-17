package lista004_ex002;

public abstract class Conta {
    private int num;

    public abstract double consultaSaldo();

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
