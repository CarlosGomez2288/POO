package service;

import entida.TE;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class ST {

    
    Scanner dat;

    public ST() {
        
        this.dat = new Scanner(System.in).useDelimiter("\n");
    }

    public TE cargar() {
        System.out.print("Ingresar producto: ");
        String produc = dat.next();

        System.out.print("Ingresar precio: ");
        Integer precio = dat.nextInt();

        return new TE(produc, precio);
    }

    public void add(HashMap<String, Integer> products) {
        System.out.println("1) AÑADIR PRODUCTO.");
        System.out.println();
        TE p = cargar();
        products.put(p.getProd(), p.getPrecio());
    }

    public void modificarPrecio(HashMap<String, Integer> products) {
        System.out.println("2) MODIFICAR PRECIO DE UN PRODUCTO.");
        System.out.println();
        System.out.print("» Nombre de producto: ");
        String nameProd = dat.next();
        boolean find = false;
        for (String name : products.keySet()) {
            if (name.equals(nameProd)) {
                find = true;
                System.out.print("» Precio nuevo: $");
                Integer price = dat.nextInt();
                products.remove(name);
                products.put(nameProd, price);
            }
        }
        System.out.println();
        if (!find) {
            System.out.println("No existe el producto ingresado.");
            System.out.print("Presione intro para seguir...");
            try {
                System.in.read();
            } catch (IOException e) {
            }
        }
    }
    public void elimarproducto(HashMap<String, Integer> products){
        System.out.println("3) ELIMINAR  UN PRODUCTO.");
        System.out.println();
        System.out.print("» Nombre de producto: ");
        String produc = dat.next();
        boolean find = false;
        for(String aux: products.keySet()){
            if(aux.equals(aux)){
                find = true;
                products.remove(produc);
            }
        }
        System.out.println();
        if (!find) {
            System.out.println("No existe el producto ingresado.");
            System.out.print("Presione intro para seguir...");
            try {
                System.in.read();
            } catch (IOException e) {
            }
        }
    }
    public void mostrarProductos(HashMap<String, Integer> products) {
        System.out.println("4) MOSTRAR PRODUCTOS. ");
        System.out.println();
        if(!products.isEmpty()) {
            for(Map.Entry<String, Integer> prod: products.entrySet()) {
                System.out.println("{Nombre: " + prod.getKey() + "; Precio: $"+prod.getValue()+"}");
            }
        } else {
            System.out.println("No hay productos por mostrar.");
        }
        System.out.println();
        System.out.print("Presione intro para seguir...");
        try{System.in.read();}
        catch(IOException e){}
    }
    
}
