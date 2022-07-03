/**
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
 * clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
 * Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
 * usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
 * deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
 * puede conseguir instanciando un objeto Date con constructor vacío.
 * Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
 * Ejemplo fecha actual: Date fechaActual = new Date();
 */
package Date;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        int anio, mes, dia;
        Date fechaActual = new Date();
        System.out.print("Ingresar dia: ");
        dia = dat.nextInt();
        System.out.print("Ingresar mes: ");
        mes = dat.nextInt() - 1;
        System.out.print("Ingresar añio: ");
        anio = dat.nextInt() - 1900;

        Date fecha = new Date(anio, mes, dia);
        int fechaF = fechaActual.getYear() - fecha.getYear();

        System.out.println(fecha);
        System.out.println(fechaActual);
        System.out.println("Hay una diferencia de: " + fechaF);
    }

}
