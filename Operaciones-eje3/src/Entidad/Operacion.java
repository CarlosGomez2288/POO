package Entidad;

public class Operacion {

    private float num1, num2;

    /*Contructor*/
    public Operacion(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    /*Setter and Getter*/
    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public float getNum2() {
        return num2;
    }

}
