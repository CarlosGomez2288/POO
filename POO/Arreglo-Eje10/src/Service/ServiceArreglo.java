package Service;

import Entidad.Arreglo;

public class ServiceArreglo {

    Arreglo array = new Arreglo();
    double[] arra_A = new double[50];
    double[] arra_B = new double[20];
    double aux = 0;

    public Arreglo crearArreglo() {
        //Arreglo A
        for (int i = 0; i < 50; i++) {
            arra_A[i] = (int) (Math.random() * 10);
        }
        System.out.println("ARREGLO A");
        Mostrar(arra_A);

        for (int i = 0; i < 49; i++) {//Ordenamiento del Arreglo
            for (int j = 0; j < 49; j++) {
                if (arra_A[j] > arra_A[j + 1]) {
                    aux = arra_A[j];
                    arra_A[j] = arra_A[j + 1];
                    arra_A[j + 1] = aux;
                }
            }
        }
        System.out.println("Arreglo A ordenado");
        Mostrar(arra_A);
        array.setArra_A(arra_A);

        //Arreglo B 
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                arra_B[i] = arra_A[i];
            } else {
                arra_B[i] = 0.5;
            }
        }
        array.setArra_B(arra_B);

        System.out.println("ARREGLO B");
        Mostrar(arra_B);

        return array;
    }

    public void Mostrar(double[] arr) {
        int cant = 0;
        for (double elem : arr) {
            cant++;
        }
        for (int i = 0; i < cant - 1; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println();
    }
}
