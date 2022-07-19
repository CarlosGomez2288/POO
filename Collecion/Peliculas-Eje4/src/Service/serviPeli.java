package Service;

import Entidad.PeliculaE;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class serviPeli {

    Scanner dat = new Scanner(System.in).useDelimiter("\n");
    ArrayList<PeliculaE> peli = new ArrayList();
    PeliculaE pelic;

    public PeliculaE cargar() {
        String titu, dire;
        Integer dura;

        System.out.println("PELICULA");
        System.out.print("Ingresa titulo: ");
        titu = dat.next();
        System.out.println();
        System.out.print("Ingresa Director: ");
        dire = dat.next();
        System.out.println();
        System.out.print("Ingresa Duracion en min: ");
        dura = dat.nextInt();

        return new PeliculaE(titu, dire, dura);
    }

    public void mostar(ArrayList<PeliculaE> movie) {
        Iterator<PeliculaE> it = movie.iterator();
        while (it.hasNext()) {
            PeliculaE next = it.next();
            System.out.println(next);
        }
    }

    public void masDeUnaHora(ArrayList<PeliculaE> movies) {
        for (PeliculaE movy : movies) {
            if (movy.getDuracion() > 60) {
                System.out.println(movy);
            }
        }
    }
    public static Comparator<PeliculaE> ordenarPorDuracion = new Comparator<PeliculaE>() {
        @Override
        public int compare(PeliculaE mov1, PeliculaE mov2) {
            return mov2.getDuracion().compareTo(mov1.getDuracion());
        }
    };

    public static Comparator<PeliculaE> ordenTitulo = new Comparator<PeliculaE>() {

        @Override
        public int compare(PeliculaE mov1, PeliculaE mov2) {
            return mov1.getTitulo().compareTo(mov2.getTitulo());
        }
    };
    
    public static Comparator<PeliculaE> ordenDire = new Comparator<PeliculaE>() {

        @Override
        public int compare(PeliculaE mov1, PeliculaE mov2) {
            return mov1.getDirector().compareTo(mov2.getDirector());
        }
    };
}
