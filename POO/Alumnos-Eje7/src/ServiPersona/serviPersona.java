
package ServiPersona;

import Entidad.Persona;
import java.util.Scanner;

public class serviPersona {
    Scanner dat = new Scanner(System.in).useDelimiter("\n");
    boolean val = false;
   
    public Persona crearPersona() {
        Persona perso = new Persona();
        System.out.print("Ingresar Nombre: ");
        String nombre = dat.next();
        do {
            System.out.println("Ingresar Sexo: [M-> Masculino | F-> Femenino | O-> Otros]");
            String sex = dat.next();
            if (!sex.equalsIgnoreCase("m") && !sex.equalsIgnoreCase("f")) {
                System.out.print("Valor ingresado incorrecto: ");
                System.out.println();
                System.out.println("Presione intro para seguir...");
                dat.next();
            } else {
                perso.setSexo(sex);
                val = true;
            }
        } while (val == false);

        System.out.print("Ingresar Edad: ");
        int edad = dat.nextInt();
        System.out.print("Ingresar Peso en kg: ");
        double peso = dat.nextDouble();
        System.out.print("Ingresar Altura en m: ");
        double altura = dat.nextDouble();

        perso.setNombre(nombre);
        perso.setPeso(peso);
        perso.setEdad(edad);
        perso.setAltura(altura);

        return perso;
    }
    
    public int calcularIMC(Persona perso){
        int ret;
        int peso = (int) (perso.getPeso() / Math.pow(perso.getAltura(), 2));
        
        if(peso <20){
            ret = -1;
        }else if((peso >= 20) && peso <=25){
          
                ret= 0;
           
        } else {
            ret = 1;
        }
        
        return ret;
    }
    
    public boolean esMayorDeEdad(Persona perso){
        return perso.getEdad() >= 18;
    }
    
}
