/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/
package tienda;


import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import service.ST;

public class Main {

    public static void main(String[] args) {
        ST st = new ST();
        String resp, confi = " ";
        HashMap<String, Integer> pro = new HashMap();
        Scanner dat = new Scanner(System.in);

        do {
            System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄");
            System.out.println("█ MENÚ DE TIENDA █");
            System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀");
            System.out.println();
            System.out.println("1) Añadir nuevo producto.");
            System.out.println("2) Eliminar un producto.");
            System.out.println("3) Modificar precio de un producto.");
            System.out.println("4) Mostrar productos.");
            System.out.println("5) Salir.");
            System.out.println();

            resp = dat.next();
            System.out.println();

            switch (resp) {
                case "1":
                    st.add(pro);
                    break;
                case "2":
                    if (!pro.isEmpty()) {
                        st.elimarproducto(pro);
                    } else {
                        System.out.println("No tiene productos para eliminar.");
                    }
                    System.out.print("Presione intro para seguir...");
                    try {
                        System.in.read();
                    } catch (IOException e) {
                    }

                    break;
                case "3":
                    if (!pro.isEmpty()) {
                        st.modificarPrecio(pro);
                    } else {
                        System.out.println("No tiene productos para modificar.");
                        System.out.print("Presione intro para seguir...");
                        try {
                            System.in.read();
                        } catch (IOException e) {
                        }
                    }
                    break;
                case "4":
                    st.mostrarProductos(pro);
                    break;
                case "5":
                    System.out.print("¿Está seguro? [S/N]: ");
                    confi = dat.next();
                    break;
                default:
                    System.out.println("Error: opción ingresada no válida.");
                    System.out.print("Presione intro para seguir...");
                    try {
                        System.in.read();
                    } catch (IOException e) {
                    }
            }
        } while (!confi.equalsIgnoreCase("s"));
    }

}
