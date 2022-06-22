package libreria;

import java.util.Scanner;

public class MisFunciones {

    public static double entrada() {
        Scanner sc = new Scanner(System.in);
        String er = "([0-9]+\\.[0-9]+)||[0-9]+";
        String scenti;
        double dcenti;
        boolean correcto;
        do {
            System.out.print("ingrese grados centigrados?: ");
            scenti = sc.next();
            correcto = scenti.matches(er);
            if (!correcto) {
                System.out.println("error vuelva a ingresar el codigo");
            }
        } while (!correcto);
        dcenti = Double.parseDouble(scenti);
        return dcenti;

    }

    public double entrada1() {
        Scanner sc = new Scanner(System.in);
        String er = "([0-9]+\\.[0-9]+)||[0-9]+";
        String scenti;
        double dcenti;
        boolean correcto;
        do {
            System.out.print("ingrese grados centigrados?: ");
            scenti = sc.next();
            correcto = scenti.matches(er);
            if (!correcto) {
                System.out.println("error vuelva a ingresar el codigo");
            }
        } while (!correcto);
        dcenti = Double.parseDouble(scenti);
        return dcenti;

    }

    public static int convertirCF(int c) {
        int f = (int) (c * 1.8) + 32;
        return f;
    }

    public static int retornaGradoCentigradoAleatorio() {
        return (int) (Math.random() * 100 + 1);
    }

    public static int[] retornaVectorF(int[] vectorC) {
        int[] vectorF = new int[vectorC.length];
        for (int i = 0; i < vectorC.length; i++) {
            vectorF[i] = convertirCF(vectorC[i]);

        }
        return vectorF;
    }

    public static int[][] retornaMatrizF(int[][] matrizC) {
        int[][] matrizF = new int[matrizC.length][matrizC[0].length];
        for (int f = 0; f < matrizC.length; f++) {
            for (int c = 0; c < matrizC[0].length; c++) {
                matrizF[f][c] = convertirCF(matrizC[f][c]);
            }
        }
        return matrizF;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static void sumar2(double n1, double n2) {
        System.out.println("Suma: " + (n1 + n2));
    }

}
