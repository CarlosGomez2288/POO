package Entidad;

public class Cafetera {

    private double capacidaMaxima;
    private double cantidaActual;

    /*CONSTRUCTORS*/
    public Cafetera() {
    }

    public Cafetera(double capacidaMaxima, double cantidaActual) {
        this.capacidaMaxima = capacidaMaxima;
        this.cantidaActual = cantidaActual;
    }

    /*Setter and Getter*/
    public void setCapaMaxima(double capaMaxima) {
        this.capacidaMaxima = capaMaxima;
    }

    public void setCantiActual(double cantiActual) {
        this.cantidaActual = cantiActual;
    }

    public double getCapaMaxima() {
        return capacidaMaxima;
    }

    public double getCantActual() {
        return cantidaActual;
    }

}
