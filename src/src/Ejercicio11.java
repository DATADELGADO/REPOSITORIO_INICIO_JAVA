package src;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("ingrese el valor A: ");
        a = sc.nextInt();
        System.out.println("ingrese el valor B: ");
        b = sc.nextInt();
        System.out.println("ingrese el valor C: ");
        c = sc.nextInt();

        if (a < b && b < c) {
            System.out.print(c + " " + b + " " + a);
        } else if (a > b && b > c) {
            System.out.print(a + " " + b + " " + c);
        } else if (a < b && b > c) {
            System.out.print(b + " " + c + " " + a);
        } else if (b < a && a < c) {
            System.out.print(c + " " + a + " " + b);
        } else if (b > a && a > c) {
            System.out.print(b + " " + a + " " + c);
        } else if (b < a && a > c) {
            System.out.print(a + " " + c + " " + b);
        }

    }

}
