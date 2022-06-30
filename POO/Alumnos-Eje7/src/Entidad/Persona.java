package Entidad;

public class Persona {

    private String nombre, sexo;
    private int edad;
    private double peso, altura;

    /*Constructor*/
    public Persona() {
         
    }

    public Persona(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
       
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    /*Setter and Getter*/

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
   
    
}
