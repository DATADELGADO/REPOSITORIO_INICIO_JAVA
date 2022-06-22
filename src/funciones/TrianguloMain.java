package funciones;

import libreria.MisFunciones;

public class TrianguloMain {

    public static void main(String[] args) {
        /*Triangulo trian1 = new Triangulo(10, 20);
        System.out.println("Area Triangulo: " + trian1.area());*/

        Triangulo[] vector = new Triangulo[10];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = new Triangulo(MisFunciones.retornaGradoCentigradoAleatorio(), MisFunciones.retornaGradoCentigradoAleatorio());

        }
        System.out.printf("%10s%10s%10s%10s\n", "N", "BASE", "ALTURA", "AREA");
        System.out.printf("%10s%10s%10s%10s\n", "-", "----", "------", "----");

        Triangulo x = null;
        for (int i = 0; i < vector.length; i++) {
            x = vector[i];
            System.out.printf("%10d%10.2f%10.2f%10.2f\n", (i + 1), x.getBase(), x.getAltura(), x.area());

        }
    }

}
