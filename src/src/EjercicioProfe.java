package src;

import java.util.Scanner;

public class EjercicioProfe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud, limite;
        String cadena;
        System.out.println("Ingrese un número capicua? ");
        cadena = sc.next();
        longitud = cadena.length();
        limite = longitud / 2;
        boolean bandera = false;
        for (int i = 0, j = longitud - 1; i < limite; i++, j--) {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                bandera = true;
                break;
            }

            //System.out.println(cadena.charAt(i) + "  " + cadena.charAt(j));
        }
        if (bandera == false) {
            System.out.println("SI CAPICUA");
        } else {
            System.out.println("NO CAPICUA");
        }

        //System.out.println(longitud + "   " + limite);
    }
}
