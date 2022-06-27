package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

public class ServiRectangulo {

    Scanner dat = new Scanner(System.in);

    /*Methods*/
    public Rectangulo crearRectangulo() {

        System.out.println("Ingresar base");
        int base = dat.nextInt();
        System.out.println("Ingresar altura");
        int altura = dat.nextInt();

        return new Rectangulo(base, altura);
    }

    public int Superficie(Rectangulo rectan) {
        int superfi;
        superfi = rectan.getBase() * rectan.getAltura();
        return superfi;
    }

    public int Perimetro(Rectangulo rectan) {
        int perime;
        perime = (rectan.getBase() + rectan.getAltura()) * 2;
        return perime;
    }

    public void Dibujar(Rectangulo rectan) {
        System.out.println("Rectangulo: ");
        int alt = rectan.getAltura();
        int base = rectan.getBase();

        for (int fila = 1; fila <= alt; fila++) {
            for (int columna = 1; columna <= base; columna++) {
                if ((fila == 1) || (fila == alt) || (columna == 1) || (columna == base)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
