
package Entidad;

public class Cadena {
    String frase;
    int longitud;
    
    /*CONSTRUCTORS*/
    public Cadena(){}
    
    public Cadena(String frase){
        this.frase = frase;
        longitud = frase.length();
    }
    
    /*Setter and Getter*/
    public void setFrase(String frase){
        this.frase = frase;
    }
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }
    
    public String getFrase(){
        return frase;
    }
    public int getLongitud(){
        return longitud;
    }
}
