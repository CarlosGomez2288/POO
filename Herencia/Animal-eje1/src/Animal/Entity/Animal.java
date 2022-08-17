
package Animal.Entity;

/**
 *
 * @author carlo
 */
public abstract class Animal {
    protected String nombre, comidad, raza;
    protected int edad;
    
    //contructors
    public Animal(String nombre, String comidad, int edad, String raza){
        this.nombre = nombre;
        this.comidad = comidad;
        this.edad = edad;
        this.raza = raza;
    }
    
    //METHOD
    public void alimentar(){
        System.out.println( this.nombre + " me estoy alimentando de " + this.comidad);
    }
    
}
