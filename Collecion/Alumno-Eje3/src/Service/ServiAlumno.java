package Service;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServiAlumno {

    Scanner dat = new Scanner(System.in);

    public Alumno cargar() {
        ArrayList<Integer> nota = new ArrayList();
        Integer not;
        System.out.print("Ingresar nombre del alumno: ");
        String nombre = dat.next();

        for (int i = 0; i < 3; i++) {
            System.out.print("•Nota " + (i + 1) + " : ");
            not = dat.nextInt();
            nota.add(not);
        }
        return new Alumno(nombre, nota);
    }

    public void notaFinal(ArrayList<Alumno> alu) {
        Iterator<Alumno> it1 = alu.iterator();
        boolean s = false;
        String confi = " ";

        int sum = 0;
        double prome = 0;
        System.out.print("ingresar nombre: ");
        String name = dat.next();

        while (it1.hasNext()) {
            Alumno aux = it1.next();

            if (aux.getNombre().equals(name)) {
                s = true;
                Iterator<Integer> it2 = aux.getNotas().iterator();
                while (it2.hasNext()) {
                    sum = sum + it2.next();
                }
            }

        }
        if (s) {
            System.out.println();
            prome = (int) sum / 3;
            System.out.print("El promedio final es: " + prome);
        } else {
            System.out.println();

            System.out.print("No se encontro el alumno ingresado: ");
        }

    }

}
