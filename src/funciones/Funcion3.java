package funciones;

import libreria.MisFunciones;

public class Funcion3 {

    public static void main(String[] args) {
        int[][] matrizC = new int[3][4];

        for (int f = 0; f < matrizC.length; f++) {
            for (int c = 0; c < matrizC[0].length; c++) {
                matrizC[f][c] = MisFunciones.retornaGradoCentigradoAleatorio();
                System.out.printf("%5d  ", matrizC[f][c]);
            }
            System.out.println();
        }

        int[][] matrizF = MisFunciones.retornaMatrizF(matrizC);

        for (int f = 0; f < matrizC.length; f++) {
            for (int c = 0; c < matrizC[0].length; c++) {
                System.out.printf("%10d   ", matrizF[f][c]);
            }
            System.out.println();
        }

    }

}
