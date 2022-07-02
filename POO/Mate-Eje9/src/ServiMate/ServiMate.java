package ServiMate;

import Entidad.Mate;

public class ServiMate {

    public static double devolverMayor(Mate opers) {
        return Math.max(opers.getNum1(), opers.getNum2());
    }

    public static int calcularPot(Mate opers) {
        int pot = 1;
        int bas = (int) Math.round(devolverMayor(opers));
        int exp = (int) Math.round(Math.min(opers.getNum1(), opers.getNum2()));
        for (int i = 0; i < exp; i++) {
            pot = pot * bas;
        }
        if (exp == 0) {
            pot = 1;
        }
        return pot;
    }

    public static double calcularRaiz(Mate opers) {
        double men = Math.abs(Math.min(opers.getNum1(), opers.getNum2()));
        return Math.sqrt(men);
    }

    public static void mostrarOperandos(Mate opers) {
        System.out.println("OPERANDOS. ");
        System.out.println();
        System.out.println("Número 1: " + opers.getNum1());
        System.out.println("Número 2: " + opers.getNum2());
        System.out.println();
    }
}
