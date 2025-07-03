package lista004_ex001;

public class Casa extends Imovel{
    private double metragemTerrenoCasa;
    private double metragemConstrucao;

    public double getMetragemConstrucao() {
        return metragemConstrucao;
    }

    public void setMetragemConstrucao(double metragemConstrucao) {
        if(metragemConstrucao <= 0){
            throw new IllegalArgumentException("metragem construcao errada");
        }
        this.metragemConstrucao = metragemConstrucao;
    }

    public double getMetragemTerrenoCasa() {
        return metragemTerrenoCasa;
    }

    public void setMetragemTerrenoCasa(double metragemTerrenoCasa) {
        if(metragemTerrenoCasa <= 0){
            throw new IllegalArgumentException("metragem terreno invalida");
        }
        this.metragemTerrenoCasa = metragemTerrenoCasa;
    }

    @Override
    public double calcularValor() {
        return (getMetragemTerrenoCasa()*30.0) + (getMetragemConstrucao() * 50.0);
    }
}
