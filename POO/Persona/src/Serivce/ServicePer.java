
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
        int edad = fechaA.getYear() - per.getFechaN().getYear();
        if(fechaA.getMonth() <= per.getFechaN().getMonth()){
            if (fechaA.getDay() <= per.getFechaN().getDate()) {
                edad--;
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
