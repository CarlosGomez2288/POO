/**
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
 * y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
 * que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
 * través de los métodos set, se guardará la frase y la longitud de manera automática según
 * la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
 * a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
 * ingresada.
 * b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
 * ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
 * c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
 * contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
 * d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
 * e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
 * compone la clase con otra nueva frase ingresada por el usuario.
 * f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
 * una nueva frase ingresada por el usuario y mostrar la frase resultante.
 * g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
 * encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
 * frase resultante.
 * h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
 * ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Cadena;

import Entidad.Cadena;
import ServiCadena.ServiCaden;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in).useDelimiter("\n");
        String confi = "", letra;
        ServiCaden sc = new ServiCaden();
        Cadena cade = sc.nuevaFrase();
        do {
            System.out.println("▄▄▄▄▄▄▄▄▄▄");
            System.out.println("█ MENÚ FRASE █");
            System.out.println("▀▀▀▀▀▀▀▀▀▀");
            System.out.println();
            System.out.println("1] Contar vocales.");
            System.out.println("2] Invertir frase.");
            System.out.println("3] Nº de veces que se repite una letra.");
            System.out.println("4] Comparar longitudes con otra frase.");
            System.out.println("5] Unir frases.");
            System.out.println("6] Reemplazar.");
            System.out.println("7] Contiene letra.");
            System.out.println("8] Salir.");
            System.out.println();
            System.out.print("» ");
            int oper = dat.nextInt();
            System.out.println();

            switch (oper) {
                case 1:
                    sc.mostrarvocales(cade);
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Frase invertida: " + sc.invertirFrase(cade));
                    System.out.println();
                    System.out.println("Preciose intro para continuar...");
                    dat.next();
                    break;
                case 3:
                    System.out.print("» Ingrese una letra: ");
                    String letraP = dat.next();
                    System.out.print("La veces que se repitio " + letraP + " es: "
                            + sc.vecesRepetido(cade, letraP));
                    System.out.println();
                    System.out.println("Preciose intro para continuar...");
                    dat.next();
                    break;
                case 4:
                    System.out.print("» Ingrese Frase: ");
                    String frase = dat.next();
                    if (sc.MétodocompararLongitud(cade, frase)) {
                        System.out.print("La longitud son iguales.");
                    } else {
                        System.out.print("La longitud no son igual.");
                    }
                    System.out.println();
                    System.out.println("Preciose intro para continuar...");
                    dat.next();
                    break;
                case 5:
                    System.out.print("Ingrese una Frase: ");
                    String fraseU = dat.next();
                    sc.unirFrases(cade, fraseU);
                    break;
                case 6:
                    System.out.println("ingresar letra a buscar");
                    String letrab = dat.next();
                    System.out.println("Ingresar a reemplazar");
                    String letraR = dat.next();
                    System.out.println(sc.Reemplzar(cade, letrab, letraR));
                   break;
                case 7:
                    System.out.println("Ingrese la letra a buscar: ");
                    String letraB = dat.next();
                    if (sc.contiene(cade, letraB)) {
                        System.out.println("La letra " + letraB + " si se encontro en el texto:");
                    } else {
                        System.out.println("La letra " + letraB + " no se encontro en el texto:");
                    }
                    System.out.println();
                    System.out.println("Preciose intro para continuar...");
                    dat.next();
                    break;
                case 8:
                    System.out.println("¿Seguro que quieres salir? [y/n]");
                    confi = dat.next();
                    break;
                default:
                    System.out.println("Error, valor ingresado invalido.");
                    System.out.println();
                    System.out.println("Preciose intro para continuar...");
                    dat.next();
                    break;
            }

        } while (!confi.equalsIgnoreCase("y"));

    }

}
