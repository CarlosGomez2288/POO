
package Lbros.Entidad;
public class Libros {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numerpag;
    
    /*CONSTUCTOR*/
    public  Libros(int ISBN, String titulo, String autor, int numeropag){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numerpag = numeropag;
    }
    public Libros(){
        
    }
    /*Setter and Getter*/

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumerpag() {
        return numerpag;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumerpag(int numerpag) {
        this.numerpag = numerpag;
    }

    @Override
    public String toString() {
        return "Libro " + "\n"+ "ISBN: " + ISBN +"\n"+ "Titulo: " + titulo +"\n"+
                "Autor: " + autor + "\n"+ "Numeros Paginas: " + numerpag;
    }
    
    
    
    
}
