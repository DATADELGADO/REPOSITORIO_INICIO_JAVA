package src;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        double r, a, p;

        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese el radio? ");
        r = sc.nextDouble();
        a = Math.PI * Math.pow(r, 2); //esto es el cuadrado
        p = Math.PI * 2 * r;

        System.out.println("Area     : " + ((int) (a * 100)) / (double) 100 + " cm2");
        System.out.println("Perimetro: " + ((int) (p * 100)) / (double) 100 + " cm");

    }

}
