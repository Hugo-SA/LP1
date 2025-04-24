package lista001;

public class Imc {
    private char sexo;
    private double peso;
    private double altura;
    private String condicao;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public double valorImc() {

        return this.peso / (this.altura * this.altura);
    }
    public String condicaoCorrespondente() {
        double imc = valorImc();

        if (sexo == 'F' || sexo == 'f') {
            if (imc < 19.1) {
                condicao = "Abaixo do peso";
            } else if (imc < 25.8) {
                condicao = "No peso normal";
            } else if (imc < 27.3) {
                condicao = "Marginalmente acima do peso";
            } else if (imc < 32.3) {
                condicao = "Acima do peso ideal";
            } else {
                condicao = "Obeso";
            }
        } else if (sexo == 'M' || sexo == 'm') {
            if (imc < 20.7) {
                condicao = "Abaixo do peso";
            } else if (imc < 26.4) {
                condicao = "No peso normal";
            } else if (imc < 27.8) {
                condicao = "Marginalmente acima do peso";
            } else if (imc < 31.1) {
                condicao = "Acima do peso ideal";
            } else {
                condicao = "Obeso";
            }
        } else {
            condicao = "Sexo inválido. Use 'M' ou 'F'.";
        }

        return condicao;

    }
}
