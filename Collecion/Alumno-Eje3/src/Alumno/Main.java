/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
 * alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
 * con sus 3 notas.
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
 * toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
 * pregunta al usuario si quiere crear otro Alumno o no.
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
 * final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
 * del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
 * promedio final, devuelto por el método y mostrado en el main.
 */
package Alumno;

import Entidad.Alumno;
import Service.ServiAlumno;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String confi = " ";
        Scanner dat = new Scanner(System.in);
        ServiAlumno sa = new ServiAlumno();
        ArrayList<Alumno> alu = new ArrayList();
        
        do {            
            
            alu.add(sa.cargar());
            System.out.println("¿Quieres decir agregando Alumno [Y/N]?");
            confi = dat.nextLine();
        } while (!confi.equalsIgnoreCase("n"));
        System.out.println();
        do {    
             sa.notaFinal(alu);
            System.out.println("¿Quieres seguir con el promedio [Y/N]?");
            confi = dat.nextLine();
        } while (!confi.equalsIgnoreCase("n"));
    }
}
