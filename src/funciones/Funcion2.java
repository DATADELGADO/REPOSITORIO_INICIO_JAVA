package funciones;

import libreria.MisFunciones;

public class Funcion2 {

    public static void main(String[] args) {
//implementar un metodo que reciba un vector de grados centigrados de tamaño 10
//y sus valores son aleatorios

        {//ejemplo 1
            int[] vector = new int[10];
            int f = 0;
            for (int i = 0; i < vector.length; i++) {
                vector[i] = MisFunciones.retornaGradoCentigradoAleatorio();
                System.out.println("C " + vector[i]);
                f = MisFunciones.convertirCF(vector[i]);
                System.out.println("CF: " + f);
            }
        }//fin

        {//ejemplo 2
            int[] vectorC = new int[10];
            int f = 0;
            for (int i = 0; i < vectorC.length; i++) {
                vectorC[i] = MisFunciones.retornaGradoCentigradoAleatorio();
            }

            int[] vectorF = MisFunciones.retornaVectorF(vectorC);

            System.out.printf("%10s%10s\n", "CENTI", "FARE");
            for (int i = 0; i < vectorC.length; i++) {
                System.out.printf("%10d%10d\n", vectorC[i], vectorF[i]);
            }

        }//fin

    }

}
