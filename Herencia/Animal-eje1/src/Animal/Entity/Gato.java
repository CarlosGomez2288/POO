
package Animal.Entity;

public class Gato extends Animal{
    public Gato(String nombre, String comidad, int edad, String raza) {
        super(nombre, comidad, edad, raza);
    }
    
    @Override
    public void alimentar(){
        System.out.println("El Gato");
        super.alimentar();
    }
}
