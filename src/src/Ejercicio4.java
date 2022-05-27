package src;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ca;
        System.out.println("ingrese la cadena de texto");
        ca = sc.next(); // esto es para palabras que no esten separadas por espacios
        System.out.println("tamaño de la palabra:" + ca.length());

        for (int i = 0; i < ca.length(); i++) {
            System.out.println(ca.charAt(i));

        }

    }

}
