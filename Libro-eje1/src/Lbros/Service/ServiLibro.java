/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Lbros.Service;

import Lbros.Entidad.Libros;
import java.util.Scanner;

public class ServiLibro {
    
    public Libros cargarLibros(){
        Scanner dat = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresar Titulo de Libro");
        String titulo = dat.next();
        
        System.out.println("Ingresar numero de ISBN");
        int ISBN = dat.nextInt();
        
        System.out.println("Ingresar Autor del Libros");
        String autor = dat.next();
        
        System.out.println("Ingresar numero de paginas");
        int numeropag = dat.nextInt();
        
        return new Libros(ISBN, titulo, autor,  numeropag);
    }
    
    
}
