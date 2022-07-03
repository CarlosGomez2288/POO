/**
 * Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
 * (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
 * métodos:
 * • Agregar un método de creación del objeto que respete la siguiente firma:
 * crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
 * usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
 * fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 * • Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
 * en cuenta que para conocer la edad de la persona también se debe conocer la fecha
 * actual.
 * • Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
 * edad y retorna true en caso de que el receptor tenga menor edad que la persona que
 * se recibe como parámetro, o false en caso contrario.
 * • Metodo mostrarPersona(): este método muestra la persona creada en el método
 * anterior.
 */
package Serivce;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class ServicePer {

    Scanner dat = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        System.out.println("PERSONAS");
        System.out.print(">> Ingresar Nombre: ");
        String nombre = dat.next();
        System.out.println("FECHA NACIMIENTO");
        System.out.print(">> Ingresar dia: ");
        int dia = dat.nextInt();
        System.out.print(">> Ingresar mes: ");
        int mes = dat.nextInt() - 1;
        System.out.print(">> Ingresar año: ");
        int anio = dat.nextInt() - 1900;
        System.out.println();
        Date fecha = new Date(anio, mes, dia);
        return new Persona(nombre, fecha);
    }

    public int calcularEdad(Persona per) {
        Date fechaA = new Date();
        int edad = fechaA.getYear() - per.getFechaN().getYear() -1;
        if(fechaA.getMonth() >= per.getFechaN().getMonth()){
            if (fechaA.getDay() <= per.getFechaN().getDate()) {
                edad++;
            }
        }
        return edad;
    }

    public boolean menorQue(int edad1, int edad2) {
        if (edad1 < edad2) {
            return true;
        } else {
            return false;
        }
    }
    
    public void mostrarPersona(Persona per){
        System.out.println("Nombre: "+ per.getNombre());
        System.out.println("Fecha de Nacimiento: " + per.getFechaN());
        System.out.println(per.getFechaN().getDate());
    }
}
