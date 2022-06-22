package practicando;

import java.util.Scanner;

public class PorcentajeDescontado {

    public static void main(String[] args) {
        System.out.println("TARIFA DE COSTE? ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("PRECIO PAGADO? ");
        Scanner sc1 = new Scanner(System.in);

        double b = sc1.nextDouble();

        System.out.println(descuento(a, b) + " %");
    }

    public static double descuento(double a, double b) {

        return (1 - b / a) * 100;

    }

}
