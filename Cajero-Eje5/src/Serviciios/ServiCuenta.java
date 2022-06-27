
package Serviciios;

import Entidad.Cuenta;
import java.util.Scanner;

public class ServiCuenta {

    Scanner dat = new Scanner(System.in).useDelimiter("\n");

    /*METHODS*/
    public Cuenta crearCuenta() {
        System.out.print("CUENTA BANCARIA");
        System.out.println();
        System.out.print("» Ingresar numero de cuenta: ");
        int numeroC = dat.nextInt();
        System.out.print("» Ingresar numero de DNI del Cliente: ");
        long dni = dat.nextLong();
        System.out.print("» Ingresar saldo de la cuenta: $");
        int saldoC = dat.nextInt();
        System.out.print("¿La cuenta tiene intereses [y/n]?");
        String conf = dat.next();
        int interes;
        if (conf.equalsIgnoreCase("y")) {
            System.out.print("» Ingresar intereses: $");
            interes = dat.nextInt();
        } else {
            interes = 0;
        }
        Salto();
        return new Cuenta(numeroC, dni, saldoC, interes);

    }

    public void Ingresar(Cuenta cuenta) {
        System.out.print("Monto a ingresar: $");
        double ingresar = dat.nextDouble();
        System.out.println("Has ingresado: $" + ingresar);
        Salto();

        cuenta.setSaldoC(cuenta.getSaldoC() + (int) ingresar);
    }

    public void Retirar(Cuenta cuenta) {
        System.out.println();
        System.out.print("Monto a retirar: $");
        double retirar = dat.nextDouble();
        if (cuenta.getSaldoC() < (int) retirar) {
            System.err.println("Saldo insuficiente");
            Salto();
        } else {
            cuenta.setSaldoC(cuenta.getSaldoC() - (int) retirar);
            System.out.println("Has Retirado: $" + retirar);
            Salto();
        }

    }

    public void RetiroRapido(Cuenta cuenta) {
        System.out.print("Solo se le permite retirar el 20% de su sueldo disponible: $" + cuenta.getSaldoC());
        System.out.println();
        System.out.print("Ingrese monto a retira...");
        int retiroRapi = dat.nextInt();

        if (retiroRapi <= (cuenta.getSaldoC() * 0.2)) {
            cuenta.setSaldoC(cuenta.getSaldoC() - retiroRapi);
            System.out.print("Has Retirado: $" + retiroRapi);
            Salto();
        } else {
            System.out.print("Su saldo es: $" + cuenta.getSaldoC());
            System.out.println();
            System.out.print("El 20% de su saldo es: $" + cuenta.getSaldoC() * 0.2);
            Salto();
        }
    }

    public void ConsultaSaldo(Cuenta cuenta) {
        System.out.println();
        System.out.print("Su saldo es:$" + cuenta.getSaldoC());
        Salto();
    }

    public void ConsultaDatos(Cuenta cuenta) {
        System.out.println();
        System.out.println("DATOS DE LA CUENTA.");
        System.out.println();
        System.out.println("Nº Cuenta: " + cuenta.getNumeroC());
        System.out.println("DNI Cliente: " + cuenta.getDni());
        System.out.println("Saldo: $" + cuenta.getSaldoC());
        System.out.println("Interés: $" + cuenta.getInteres());
        Salto();
    }

    public void Salto() {
        System.out.println();
        System.out.println("Presione intro para seguir...");
        dat.next();
    }
}
