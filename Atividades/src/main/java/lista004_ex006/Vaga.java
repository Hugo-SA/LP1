package lista004_ex006;

public abstract class Vaga {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public abstract float valorAluguel();
}
