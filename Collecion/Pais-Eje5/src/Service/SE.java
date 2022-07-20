package Service;

import Entidad.PE;
import java.util.ArrayList;

import java.util.Collections;

import java.util.HashSet;
import java.util.Iterator;

import java.util.Scanner;

public class SE {

    private HashSet<PE> pais;
    private Scanner dat;

    public SE() {
        this.pais = new HashSet();
        this.dat = new Scanner(System.in).useDelimiter("\n");
    }

    public PE crear() {
        System.err.println("AVERTENCIA NO SE PERMITE PAIS REPETIDOS...");
        System.out.println();
        System.out.println("Ingrear el pais: ");
        String pais = dat.next();

        return new PE(pais);
    }

    public void añadido(PE p) {
        pais.add(p);
    }

    public void fabrica() {
        String confi = " ";
        do {
            PE pais = crear();
            añadido(pais);
            System.out.println("¿Deseas ingresar otro pais? [Y/N]");
            confi = dat.next();
        } while (!confi.equalsIgnoreCase("n"));
    }

    public void mostrar() {
        System.out.print("PAIS:");

        pais.forEach((pa) -> {
            System.out.print(pa);
        });
        System.out.println();

    }

    public void ordenar() {
        ArrayList<PE> lista = new ArrayList(pais);

        Collections.sort(lista, PE.ordenName);

        System.out.println("PAIS ORDENADOS");
        System.out.print("PAIS:");
        for (PE string : lista) {
            System.out.print(string);
        }
    }

    public void eliminarPais() {
        boolean find = false;
        Iterator<PE> it = pais.iterator();
        System.out.println();
        System.out.print("» Ingrese un país: ");
        String name = dat.next();
        while (it.hasNext()) {
            if (it.next().getPai().equals(name)) {
                it.remove();
                find = true;
            }
        }
        if (!find) {
            System.out.println("No se encontró el país ingresado.");
        }
        mostrar();
    }
}
