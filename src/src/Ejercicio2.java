package src;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double g, f, x;

        System.out.print("que quiere transformar? 1-C a F    2-F a C ");
        x = sc.nextDouble();

        if (x == 1) {
            System.out.print("ingrese los grados centigrados: ");
            g = sc.nextDouble();
            f = (9 / 5) * g + 32;
            System.out.print("de C A F: " + f);
        } else if (x == 2) {
            System.out.print("ingrese los grados farenheint: ");
            f = sc.nextDouble();
            g = ((f - 32) / (1.8));
            System.out.print("de F A C: " + g);
        } else {
            System.out.print("la opcion no existe");
        }
    }

}
