
package Animal.Entity;


public final class Caballo  extends Animal{
    public Caballo(String nombre, String comidad, int edad, String raza){
        super(nombre, comidad, edad, raza);
    }
    
    @Override
    public void alimentar(){
        System.out.println("El Caballo");
        super.alimentar();
    }
}
