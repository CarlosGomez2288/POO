/**
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
 * numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
 * operaciones asociadas a dicha clase son:
 * a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
 * b) Agregar los métodos getters y setters correspondientes
 * c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
 * d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
 * y se la sumara a saldo actual.
 * e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
 * restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
 * saldo actual en 0.
 * f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
 * usuario no saque más del 20%.
 * g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
 * h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Cejero;

import Entidad.Cuenta;
import Serviciios.ServiCuenta;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String confi = "", oper;
        Scanner dat = new Scanner(System.in).useDelimiter("\n");
        ServiCuenta sc = new ServiCuenta();
        Cuenta cta = sc.crearCuenta();

        do {
            System.out.println("▄▄▄▄▄▄▄▄▄▄");
            System.out.println("█ MENÚ CAJERO █");
            System.out.println("▀▀▀▀▀▀▀▀▀▀");
            System.out.println();
            System.out.println("1] Ingresar dinero.");
            System.out.println("2] Retirar dinero.");
            System.out.println("3] Extracción rápida.");
            System.out.println("4] Consultar saldo.");
            System.out.println("5] Consultar datos.");
            System.out.println("6] Salir.");
            System.out.println();
            System.out.print("» ");
            oper = dat.next();

            switch (oper) {
                case "1":
                    sc.Ingresar(cta);
                    break;
                case "2":
                    sc.Retirar(cta);
                    break;
                case "3":
                    sc.RetiroRapido(cta);
                    break;
                case "4":
                    sc.ConsultaSaldo(cta);
                    break;
                case "5":
                    sc.ConsultaDatos(cta);
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
