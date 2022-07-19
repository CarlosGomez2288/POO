package Pelicula;

import Entidad.PeliculaE;
import Service.serviPeli;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto, tendremos una clase Pelicula con el título, director y duración de
 * la película (en horas). Implemente las clases y métodos necesarios para esta
 * situación, teniendo en cuenta lo que se pide a continuación: En el servicio
 * deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
 * todos sus datos y guardándolos en el objeto Pelicula. Después, esa Pelicula
 * se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear
 * otra Pelicula o no. Después de ese bucle realizaremos las siguientes
 * acciones:
 *
 * • Mostrar en pantalla todas las películas. • Mostrar en pantalla todas las
 * películas con una duración mayor a 1 hora. • Ordenar las películas de acuerdo
 * a su duración (de mayor a menor) y mostrarlo en pantalla. • Ordenar las
 * películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
 * pantalla. • Ordenar las películas por título, alfabéticamente y mostrarlo en
 * pantalla. • Ordenar las películas por director, alfabéticamente y mostrarlo
 * en pantalla.
 *
 * @author carlo
 */
public class Main {
    
    public static void main(String[] args) {
        String confi = " ";
        Scanner dat = new Scanner(System.in);
        serviPeli sp = new serviPeli();
        ArrayList<PeliculaE> mo = new ArrayList();
        
        do {
            PeliculaE a = sp.cargar();
            mo.add(a);
            System.out.println("¿Deseas ingresar otra pelicula? [Y/N]");
            confi = dat.next();
        } while (!confi.equalsIgnoreCase("n"));
        
        System.out.println("•Pelicula:");
        sp.mostar(mo);
        System.out.println();
        System.out.println("•Pelicula mayor a 1hrs: ");
        sp.masDeUnaHora(mo);
         System.out.println();
        System.out.println("•Pelicula ordenada de mayor a menor: ");
        Collections.sort(mo, serviPeli.ordenarPorDuracion);
        sp.mostar(mo);
        System.out.println("•Pelicula ordenada de memor a mayor: ");
        Collections.reverse(mo);
        sp.mostar(mo);
        System.out.println("•Pelicula ordenada por titulo: ");
        Collections.sort(mo, serviPeli.ordenTitulo);
        sp.mostar(mo);
        System.out.println("•Pelicula ordenada por Director: ");
        Collections.sort(mo, serviPeli.ordenDire);
        sp.mostar(mo);
    }
}
