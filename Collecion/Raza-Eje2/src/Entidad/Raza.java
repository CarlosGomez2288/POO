package Entidad;

import java.util.ArrayList;

public class Raza {

   
    String raza;

    /*CONSTRUCTORS*/
    public Raza(String raza) {
        this.raza = raza;
    }


    

    /*SETTER AND GETTER*/

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Raza{" + "raza=" + raza + '}';
    }
   

   
}
