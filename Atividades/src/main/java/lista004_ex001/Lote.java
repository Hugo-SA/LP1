package lista004_ex001;

public class Lote extends Imovel{
    private double metragemTerreno;
    public Lote(Contribuinte proprietario, double metragemTerreno){
        super(proprietario);
        this.metragemTerreno = metragemTerreno;
    }
    @Override
    public double calcularValor(){
        return metragemTerreno * 30.0;
    }

    public double getMetragemTerreno() {
        return metragemTerreno;
    }

    public void setMetragemTerreno(double metragemTerreno) {
        this.metragemTerreno = metragemTerreno;
    }
}
