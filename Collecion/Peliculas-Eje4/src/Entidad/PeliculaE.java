
package Entidad;

import java.util.Comparator;

public class PeliculaE {
    private String titulo, director;
    private Integer duracion;
    
    /*CONSTRUCTORS*/
    public PeliculaE(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    
    /*METHOD SETTER AND GETTER*/
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula:[" + "Titulo=" + titulo + ", Director=" + director + ", Duracion=" + duracion + "min"+']';
    }
    
    
}
