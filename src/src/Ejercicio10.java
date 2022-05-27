package src;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double su, au;
        System.out.println("ingrese el sueldo del trabajador?: ");
        su = sc.nextDouble();
        if (su < 1000) {
            au = su * 1.17;
            System.out.println("su nuevo sueldo es: " + au);

        } else {
            au = su * 1.12;
            System.out.println("su nuevo sueldo es: " + Math.round(au*100)/100);
        }
    }

}
