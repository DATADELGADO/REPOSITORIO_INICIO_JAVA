package Condicional_multiple;

import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("indique el dia de la semana: ");
        String dia = sc.next().toLowerCase(); //esto es para poner todo en minuscula
        int numero = 0;
        switch (dia) {
            case "lunes":
                numero = 1;
                break;
            case "martes":
                numero = 2;
                break;

            case "miercoles":
                numero = 3;
                break;

            case "jueves":
                numero = 4;
                break;

            case "viernes":
                numero = 5;
                break;

            case "sabado":
                numero = 6;
                break;

            case "domingo":
                numero = 7;
                break;

            default:
                System.out.println("ENTRADA INCORRECTA");

        }
        if (numero > 0) {
            System.out.println("Numero: " + numero);
        }
    }

}
