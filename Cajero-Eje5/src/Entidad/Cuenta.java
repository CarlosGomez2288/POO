package Entidad;

public class Cuenta {

    private int numeroC, saldoAc, interes;
    private long dni;

    /*Constructors*/
    public Cuenta() {
    }

    public Cuenta(int numeroC, long dni, int saldoA, int interes) {
        this.numeroC = numeroC;
        this.saldoAc = saldoA;
        this.dni = dni;
        this.interes = interes;
    }

    /*Setter and Getter*/
    public void setNumeroC(int numeroC) {
        this.numeroC = numeroC;
    }

    public void setSaldoC(int saldoC) {
        this.saldoAc = saldoC;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public int getNumeroC() {
        return numeroC;
    }

    public int getSaldoC() {
        return saldoAc;
    }

    public long getDni() {
        return dni;
    }

    public int getInteres() {
        return interes;
    }
}
