package Entidad;

public class Arreglo {

    private double[] arra_A = new double[50];
    private double[] arra_B = new double[20];

    /*CONSTRUCTORS*/
    public Arreglo(double[] arra_A, double[] arra_B) {
        this.arra_A = arra_A;
        this.arra_B = arra_B;
    }

    public Arreglo() {

    }

    /*Setter and Getter*/
    public void setArra_A(double[] arra_A) {
        this.arra_A = arra_A;
    }

    public void setArra_B(double[] arra_B) {
        this.arra_B = arra_B;
    }

    public double[] getArra_A() {
        return arra_A;
    }

    public double[] getArra_B() {
        return arra_B;
    }

}
