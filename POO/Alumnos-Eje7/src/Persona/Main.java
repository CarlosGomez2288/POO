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
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
 * los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
 * sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
 * mayor de edad.
 * Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
 * distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
 * cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
 * también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package Persona;

import Entidad.Persona;
import ServiPersona.serviPersona;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        serviPersona sp = new serviPersona();

        int PIdea = 0, pNoideal = 0, speso = 0;
        int mayor = 0, menor = 0;
        System.out.print("Cuantas Personas quieres crear: ");
        int cantP = dat.nextInt();

        for (int i = 0; i < cantP; i++) {
            Persona perso = sp.crearPersona();
            System.out.println("PERSONA: " + cantP);

            switch (sp.calcularIMC(perso)) {
                case -1:
                    pNoideal++;
                    break;
                case 0:
                    PIdea++;
                    break;
                case 1:
                    speso++;
                    break;
            }
            
            if(sp.esMayorDeEdad(perso) == true){
                mayor++;
            } else {
                menor++;
            }
        }
       
        System.out.println("INFORME PERSONA");
        
            System.out.println();
            System.out.println("• Porcentajes según IMC. ");
            System.out.println("·Bajo el ideal: "+((int) (pNoideal * 100 / cantP))+"%");
            System.out.println("·Ideal: "+((int) (PIdea * 100 / cantP))+"%");
            System.out.println("·Encima del ideal: "+((int) (speso * 100 / cantP))+"%");
            System.out.println();
            System.out.println("• Porcentaje según edad. ");
            System.out.println("·Mayores de 18: "+((int) (mayor * 100 / cantP))+"%");
            System.out.println("·Menores de 18: "+((int) (menor * 100 / cantP))+"%");
    }
    
}
