
package Radio;

import Radio.Entidad.circunferencia;
import Radio.Servicios.serviciosRadio;


public class radio {

    public static void main(String[] args) {

        serviciosRadio sr = new serviciosRadio();

        circunferencia cir = sr.crearCircunferencia();

        System.out.println("Area: " + sr.Area(cir));
        System.out.println("Perimetro: " + sr.Perimetro(cir));
       
    }
}
