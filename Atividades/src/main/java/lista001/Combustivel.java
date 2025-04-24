package lista001;

public class Combustivel {
    private float km;
    private float combustivelGasto;

    public float getCombustivelGasto() {
        return combustivelGasto;
    }

    public void setCombustivelGasto(float combustivelGasto) {
        this.combustivelGasto = combustivelGasto;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }
    public float Media(){
        return km / combustivelGasto;
    }
}
