package Cadena;

import Entidad.Cadena;
import ServiCadena.ServiCaden;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in).useDelimiter("\n");
        String confi = "";
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
            System.out.println("4] Comparar longitudes con otra frase ingresada.");
            System.out.println("5] Unir frases.");
            System.out.println("6] Contiene letra ingresada.");
            System.out.println("7] Salir.");
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
                    String letra = dat.next();
                    System.out.print("La veces que se repitio " + letra + " es: "
                            + sc.vecesRepetido(cade, letra));
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
                    break;
                case 6:
                    
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
