
package Entidad;

import java.util.ArrayList;

public class Alumno {
    private  ArrayList<Integer> notas = new ArrayList();
    private String nombre;
    
    /*CONSTRUCTORS*/
    public Alumno(){
        
    }
    public Alumno(String nombre, ArrayList<Integer> notas) {
       this.nombre = nombre;
       this.notas = notas;
    }
    
    /*METHOD SETTER AND GETTER*/
    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
