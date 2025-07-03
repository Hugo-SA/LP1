package lista004_ex001;

public class Casa extends Imovel{
    private double metragemTerrenoCasa;
    private double metragemConstrucao;

    public Casa(Contribuinte proprietario, double metragemTerrenoCasa, double metragemConstrucao){
        super(proprietario);
        this.metragemTerrenoCasa = metragemTerrenoCasa;
        this.metragemConstrucao = metragemConstrucao;
    }

    public double getMetragemConstrucao() {
        return metragemConstrucao;
    }

    public void setMetragemConstrucao(double metragemConstrucao) {
        this.metragemConstrucao = metragemConstrucao;
    }

    public double getMetragemTerrenoCasa() {
        return metragemTerrenoCasa;
    }

    public void setMetragemTerrenoCasa(double metragemTerrenoCasa) {
        this.metragemTerrenoCasa = metragemTerrenoCasa;
    }

    @Override
    public double calcularValor() {
        return ;
    }
}
