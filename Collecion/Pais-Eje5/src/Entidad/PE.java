
package Entidad;

import java.util.Comparator;



public class PE {
  
    String pai; 
    
    /*CONSTUCTORS*/

    public PE() {
    }

    public PE(String pai) {
        this.pai = pai;
        
    }
    /*METHOD SETTER AND GETTER*/
    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    @Override
    public String toString() {
        return "[" + pai + ']';
    }
    
    public static Comparator<PE> ordenName = new Comparator<PE>() {
        @Override
        public int compare(PE p1, PE p2) {
            return p1.getPai().compareTo(p2.getPai());
        }
    };
    
}
