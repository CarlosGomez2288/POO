/**
 * e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
 * compone la clase con otra nueva frase ingresada por el usuario.
 * f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
 * una nueva frase ingresada por el usuario y mostrar la frase resultante.
 * g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
 * encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
 * frase resultante.
 * h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
 * ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package ServiCadena;

import Entidad.Cadena;
import java.util.Scanner;

public class ServiCaden {

    Scanner dat = new Scanner(System.in);

    public Cadena nuevaFrase() {
        System.out.print("Ingresar una frase: ");
        String frase = dat.next();

        return new Cadena(frase);
    }

    public void mostrarvocales(Cadena cad) {
        String v = "AEIOU", letra;
        int cantV = 0;
        for (int i = 0; i < cad.getLongitud() - 1; i++) {
            letra = cad.getFrase().substring(i, i + 1);
            for (int j = 0; j < v.length(); j++) {
                if (letra.equalsIgnoreCase(v.substring(j, j + 1))) {
                    cantV++;
                    break;
                }
            }
        }
        System.out.print("La cantidad de vocales es: " + cantV);
        Salto();
    }

    public String invertirFrase(Cadena cad) {
        String frase_in = "";
        for (int i = cad.getLongitud(); i > 0; i--) {
            frase_in += cad.getFrase().substring(i - 1, i);
        }
        return frase_in;
    }

    public int vecesRepetido(Cadena cad, String letra) {
        int cantC = 0;
        for (int i = 0; i < cad.getLongitud() - 1; i++) {
            String caracter = cad.getFrase().substring(i, i + 1);
            if (caracter.equalsIgnoreCase(letra)) {
                cantC++;
            }
        }
        return cantC;
    }
    
    public boolean  MétodocompararLongitud(Cadena cad, String frase2){
        boolean igual  = frase2.length() == cad.getLongitud();
        return igual;
    }
    public void Salto() {
        System.out.println();
        System.out.println("Preciose intro para continuar...");
        dat.next();
    }
}
