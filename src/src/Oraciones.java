package src;

import java.util.Scanner;

public class Oraciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ca;
        System.out.println("ingrese la cadena de texto");
        ca = sc.nextLine(); // esto es para leer oraciones separadas por espacio y el espapcio te lo cuenta
        System.out.println("tamaño de la palabra:" + ca.length());

        for (int i = 0; i < ca.length(); i++) {
            System.out.println(ca.charAt(i));
        }

    }
}
