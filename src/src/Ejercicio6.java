package src;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ca;

        //esto es para repetir algo el do-while
        do {
            System.out.print("ingrese la cadena: ");

            ca = sc.nextLine();
            System.out.print("Longitud: " + ca.length());

            if (ca.length() > 0) {
                for (int i = 0; i < ca.length(); i++) {
                    if (i % 2 == 0) {
                        System.out.print(ca.charAt(i));

                    }

                }

            } else {
                System.out.println("debe ingresar una cadena");

            }
        } while (ca.length() <= 0); // esta es la dondicion del do

    }
}
