package lista004_ex003;

import java.util.ArrayList;

public class Hospede {
    private float codigo;
    private String nome;
    private ArrayList<Reserva> reservas;

    public Hospede() {
        this.reservas = new ArrayList<Reserva>();
    }

    public float getCodigo() {
        return codigo;
    }

    public void setCodigo(float codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void adicionar(Reserva reserva){
        this.reservas.add(reserva);
    }

    public int getNumReservas(){
        return this.reservas.size();
    }
}
