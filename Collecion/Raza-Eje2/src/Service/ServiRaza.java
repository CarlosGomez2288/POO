package Service;

import Entidad.Raza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServiRaza {

    Scanner dat = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Raza> Crear() {
        ArrayList<Raza> raza2 = new ArrayList();
        String confi = " ";
        String raza;
        Raza perro;
        do {
            System.out.println("Ingresar una raza");
            raza = dat.nextLine();

            System.out.println("deseas Seguir ingresando [Y/N]");
            confi = dat.nextLine();
            perro = new Raza(raza);
            raza2.add(perro);
        } while (!confi.equalsIgnoreCase("n"));

        return raza2;
    }

    /*METHOD ELIMINAR*/
    public void Eliminar(ArrayList<Raza> Perros) {
        Iterator<Raza> it = Perros.iterator();
        System.out.println("Ingresar la raza a buscar");
        String raza = dat.next();

        while (it.hasNext()) {
            Raza next = it.next();
            if (next.getRaza().equals(raza)) {
                it.remove();
            }
        }
        System.out.println();
        System.out.println("Se elimino correctamente...");
        mostrar(Perros);
    }

    /*METHOD MOSTRAR*/
    public void mostrar(ArrayList<Raza> Perros) {
        Perros.forEach((perro) -> {
            System.out.println(perro.getRaza());
        });
    }
}
