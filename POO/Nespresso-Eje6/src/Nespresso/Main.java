/**
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
 * (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
 * actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
 * • Constructor predeterminado o vacío
 * • Constructor con la capacidad máxima y la cantidad actual
 * • Métodos getters y setters.
 * • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
 * • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
 * tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
 * cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
 * método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
 * cuanto quedó la taza.
 * • Método vaciarCafetera(): pone la cantidad de café actual en cero.
 * • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
 * recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Nespresso;

import Entidad.Cafetera;
import Servicios.ServiNespre;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        String oper, confi = "";

        ServiNespre sn = new ServiNespre();
        Cafetera caf = sn.crearCafetera();

        do {
            int porc_caf = (int) ((caf.getCantActual() * 100) / caf.getCapaMaxima());
            System.out.println("▄▄▄▄▄▄▄▄▄▄▄");
            System.out.println("█ Cafe NESPRESO █");
            System.out.println("▀▀▀▀▀▀▀▀▀▀▀");
            System.out.println();
            System.out.print("Capacida Ocupada: " + porc_caf);
            System.out.println();
            System.out.println("1] Llenar Cafetera.");
            System.out.println("2] Servir Taza.");
            System.out.println("3] Vaciar Cafetera.");
            System.out.println("4] Agregar Cafe.");
            System.out.println("5] Estado de Cafetera.");
            System.out.println("6] Salir.");
            System.out.println();
            oper = dat.next();

            switch (oper) {
                case "1":
                    sn.llenarCafetera(caf);
                    break;
                case "2":
                    sn.ServirTaza(caf);
                    break;
                case "3":
                    sn.Vaciar(caf);
                    break;
                case "4":
                    sn.Agregar(caf);
                    break;
                case "5":
                    sn.Estado(caf);
                    break;
                case "6":
                    System.out.print("¿Está seguro que desea salir? [y/n]: ");
                    confi = dat.next();
                    break;
                default:
                    System.out.println("Error: opción ingresada no válida.");
                    System.out.println("Presione intro para seguir...");
                    dat.next();
            }
        } while (!confi.equalsIgnoreCase("y"));
    }
}
