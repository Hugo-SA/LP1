package lista004_ex001;

public class Lote extends Imovel{
    private double metragemTerreno;

    @Override
    public double calcularValor(){
        return metragemTerreno * 30.0;
    }

    public double getMetragemTerreno() {
        return metragemTerreno;
    }

    public void setMetragemTerreno(double metragemTerreno) {
        if(metragemTerreno <= 0){
            throw new IllegalArgumentException("metragem invalida");
        }
        this.metragemTerreno = metragemTerreno;
    }
}
