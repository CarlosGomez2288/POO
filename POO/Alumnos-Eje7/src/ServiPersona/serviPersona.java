/**
 * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
 * ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
 * atributo, puede hacerlo. Los métodos que se implementarán son:
 * • Un constructor por defecto.
 * • Un constructor con todos los atributos como parámetro.
 * • Métodos getters y setters de cada atributo.
 * • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
 * usuario y después se le asignan a sus respectivos atributos para llenar el objeto
 * Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
 * Si no es correcto se deberá mostrar un mensaje
 * • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
 * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
 * que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
 * fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
 * está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
 * fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
 * función devuelve un 1.
 * • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
 * un booleano.
 */
package ServiPersona;

import Entidad.Persona;

import java.util.Scanner;


public class serviPersona {
    Scanner dat = new Scanner(System.in).useDelimiter("\n");
    
    Persona crearPersona(Persona perso){
        System.out.println("Ingresar Nombre: ");
        String nombre = dat.next();
        System.out.println();
        System.out.println("Ingresar Sexi: [M-> Masculino | F-> Femenino | O-> Otros]");
        String sex = dat.next();
            
    }
}
