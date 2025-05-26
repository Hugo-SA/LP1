package lista003_ex004;

public abstract class Voo {
    private String origem;
    private String destino;
    private float distancia;
    private float datavoo;

    public Voo(String origem, String destino, float distancia, float datavoo) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.datavoo = datavoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        if (origem == null || origem.trim().isEmpty()) {
            throw new IllegalArgumentException("origem invalida");
        }
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        if (destino == null || destino.trim().isEmpty()) {
            throw new IllegalArgumentException("destino invalido");
        }
        this.destino = destino;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        if(distancia <= 0){
            throw new IllegalArgumentException("distancia invalida");
        }
        this.distancia = distancia;
    }

    public float getDatavoo() {
        return datavoo;
    }

    public void setDatavoo(float datavoo) {
        if(datavoo <= 0){
            throw new IllegalArgumentException("datavoo invalida");
        }
        this.datavoo = datavoo;
    }
    public abstract float calcularPreco();
}
