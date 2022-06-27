package Servicios;

import Entidad.Operacion;
import java.util.Scanner;

public class ServicioOper {

    Scanner dat = new Scanner(System.in).useDelimiter("\n");

    public Operacion crearOperacion() {

        System.out.println("ingrear numero 1: ");
        float num1 = dat.nextFloat();
        System.out.println("ingrear numero 2: ");
        float num2 = dat.nextFloat();

        return new Operacion(num1, num2);
    }

    public float Sumar(Operacion oper) {
        float sum;

        sum = oper.getNum1() + oper.getNum2();

        return sum;
    }

    public float Resta(Operacion oper) {
        float rest;

        rest = oper.getNum1() - oper.getNum2();

        return rest;
    }

    public float Multiplicacion(Operacion oper) {
        float multi;
        if (oper.getNum1() != 0 && oper.getNum2() != 0) {
            multi = oper.getNum1() * oper.getNum2();
            return multi;
        } else {
            return 0;
        }
    }

    public float Dividir(Operacion oper) {
        float dividir;
        if (oper.getNum1() != 0 && oper.getNum2() != 0) {
            dividir = oper.getNum1() / oper.getNum2();
            return dividir;
        } else {
            return 0;
        }
    }
}
