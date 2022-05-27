package src;

import java.util.Scanner;

public class ValidadNota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.print("ingrese la nota?");
        n = sc.nextDouble();
        if (n >= 0 && n < 5) {
            System.out.println("Desaprobado");

        } else if (n >= 5 && n <= 10) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Nota no valida");

        }
    }
}