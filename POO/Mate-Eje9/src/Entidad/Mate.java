
package Entidad;

public class Mate {
    double num1, num2;
    
    /*CONSTRUCTORS*/
    public Mate(){
    }
    
    public Mate(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    /*Setter and Getter*/
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
}
