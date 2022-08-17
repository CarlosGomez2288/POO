package Aanimal;

import Animal.Entity.Animal;
import Animal.Entity.Caballo;
import Animal.Entity.Gato;
import Animal.Entity.Perro;

public class Main {

    public static void main(String[] args) {
        //Declaracion del Perro
        Animal perro = new Perro("Stick", "Carnivoro", 15, "Doberman");
        perro.alimentar();
        Animal perro2 = new Perro("Tobby", "Croquetas", 10, "Caniche");
        perro2.alimentar();

        //Declaracion del Gato
        Animal gato = new Gato("Pelusa", "Galletas", 4, "Siames");
        gato.alimentar();
        
        //Declaracion del Caballo
        Animal cab = new Caballo("Jose", "pAsto", 8, "Siames");
        cab.alimentar();
    }
}
