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
package Servicios;

import Entidad.Cafetera;

import java.util.Scanner;

public class ServiNespre {

    Scanner dat = new Scanner(System.in).useDelimiter("\n");

    /*METHODS*/
    public Cafetera crearCafetera() {
        System.out.print("NESPRESSO");
        System.out.println();
        System.out.print("Ingresar Capacida Maxima en ml de la cafetera: ");
        int capMax = dat.nextInt();
        Salto();

        return new Cafetera(capMax, 0);
    }

    public void llenarCafetera(Cafetera cafe) {
        cafe.setCantiActual(cafe.getCapaMaxima());
    }

    public void ServirTaza(Cafetera cafe) {
        if (cafe.getCantActual() != 0) {
            System.out.print("Ingrese el tamaño de la taza en ml: ");
            int tamTaza = dat.nextInt();

            if (tamTaza < cafe.getCantActual()) {
                cafe.setCantiActual(cafe.getCantActual() - tamTaza);
                tamTaza = 0;
            } else {
                tamTaza -= cafe.getCantActual();
                cafe.setCantiActual(0);
            }

            if (tamTaza == 0) {
                System.out.print("La taza se lleno");
                Salto();
            } else {
                System.out.println("La taza no se lleno. Puede servirse: " + tamTaza + "ml mas.");
                Salto();
            }
        } else {
            System.out.println();
            System.out.print("La cafetera se encuentra vacia, se lleve se llenar primero");
            Salto();
        }
    }

    public void Vaciar(Cafetera cafe) {
        cafe.setCantiActual(0);
        System.out.println("La cafetera se ha vaciado corectamente.");
        Salto();
    }

    public void Agregar(Cafetera cafe) {
        int caf_disp = (int) (cafe.getCapaMaxima() - cafe.getCantActual());
        System.out.print("Ingrese la cantida de Cafe agregar:" + "[" + caf_disp + "] ml disponible: ");
        int cafeAgre = dat.nextInt();

        if (cafeAgre <= caf_disp) {
            cafe.setCantiActual(cafe.getCantActual() + cafeAgre);
            System.out.println("Se agrego el cafe a la cafetera.");
            Salto();
        } else {
            cafe.setCantiActual(cafe.getCapaMaxima());
            cafeAgre -= caf_disp;
            System.out.println("La cafetera se lleno, sobraron: " + cafeAgre + "ml");
            Salto();
        }
    }

    public void Estado(Cafetera cafe) {
        int caf_disp = (int) (cafe.getCapaMaxima() - cafe.getCantActual());
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄");
        System.out.println("█ Cafe NESPRESO █");
        System.out.println("▀▀▀▀▀▀▀▀▀▀▀");
        System.out.println("• Cantidad de café [ml]: " + cafe.getCantActual());
        System.out.println("• Capacidad disponible: " + caf_disp);
        Salto();
    }

    public void Salto() {
        System.out.println();
        System.out.println("Presione intro para seguir...");
        dat.next();
    }
}
