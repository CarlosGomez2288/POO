package Service;

import Entidad.Raza;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiRaza {

    Scanner dat = new Scanner(System.in).useDelimiter("\n");
    ArrayList raza2 = new ArrayList();
    Raza raz  = new Raza();
    
    public Raza Crear() {
        String confi = " ";
        String raza;

        do {            
            System.out.println("Ingresar una raza");
            raza = dat.nextLine();
            raza2.add(raza);
            
            System.out.println("deseas Seguir ingresando [Y/N]");
            confi = dat.nextLine();
        } while (!confi.equalsIgnoreCase("n"));
        raz.setRaza(raza2);
        return new Raza(raza2);
    }

    
    public void Mostrar() {
        raz.getRaza().forEach((aux) -> {
            System.out.println(aux);
        });
    }
}
