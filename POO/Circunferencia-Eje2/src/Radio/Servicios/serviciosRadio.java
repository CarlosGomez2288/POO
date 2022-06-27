/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
 * tipo real. A continuación, se deben crear los siguientes métodos:
 * a) Método constructor que inicialice el radio pasado como parámetro.
 * b) Métodos get y set para el atributo radio de la clase Circunferencia.
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
 * objeto.
 * d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
 * e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package Radio.Servicios;

import Radio.Entidad.circunferencia;
import Radio.radio;

import java.util.Scanner;

public class serviciosRadio {
    double pi = 3.14;
    Scanner dat = new Scanner(System.in);
    
    
    
    public circunferencia crearCircunferencia() {
        System.out.println("Ingresar radio");
        double radio = dat.nextDouble();
        
        return new circunferencia(radio);
    }
    
   public double Area(circunferencia circ){
       double area, rad;
       rad  = circ.getRadio();
       
       area = pi * Math.pow(rad, 2);
       return area;
   }
   
   public double Perimetro(circunferencia circ){
       double perime, rad;
       rad  = circ.getRadio();
       
       perime = 2*pi * rad;
       return perime;
   }
}
