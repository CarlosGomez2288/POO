package Raza;

import Entidad.Raza;
import Service.ServiRaza;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ServiRaza sr = new ServiRaza();
        ArrayList<Raza> perro = sr.Crear();
        sr.mostrar(perro);
        sr.Eliminar(perro);
    }
}
