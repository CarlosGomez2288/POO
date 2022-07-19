package Entidad;

import java.util.ArrayList;

public class Raza {

    private ArrayList<String> raza = new ArrayList();
    String ra;

    /*CONSTRUCTORS*/
    public Raza() {}

    public Raza(ArrayList raza) {
        this.raza = raza;
    }

    

    /*SETTER AND GETTER*/
    public void setRaza(ArrayList<String> raza) {
        this.raza = raza;
    }

    public ArrayList<String> getRaza() {
        return raza;
    }

}
