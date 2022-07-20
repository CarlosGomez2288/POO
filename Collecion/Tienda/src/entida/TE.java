package entida;

public class TE {

    private Integer precio;
    private String prod;

    /*CONTRUCTORS*/
    public TE(String prod, Integer precio) {
        this.precio = precio;
        this.prod = prod;
    }

    /*METHOD SETTER AND GETTER*/
    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    @Override
    public String toString() {
        return "TE{" + "precio=" + precio + ", prod=" + prod + '}';
    }

}
