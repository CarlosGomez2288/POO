
package Animal.Entity;

public final class Perro extends Animal {
    
    public Perro(String nombre, String comidad, int edad, String raza) {
        super(nombre, comidad, edad, raza);
    }
    
    @Override
    public void alimentar(){
        System.out.println("El Perro");
        super.alimentar();
    }
}
