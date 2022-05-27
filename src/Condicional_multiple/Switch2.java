package Condicional_multiple;

import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("indique el dia de la semana: ");
        int dia = sc.nextInt();
        String cadena = "";
        switch (dia) {
            case 1:
                cadena = "lunes";
                break;
            case 2:
                cadena = "martes";

                break;

            case 3:
                cadena = "miercoles";

                break;

            case 4:
                cadena = "jueves";

                break;

            case 5:
                cadena = "viernes";

                break;

            case 6:
                cadena = "sabado";

                break;

            case 7:
                cadena = "domingo";

                break;

            default:
                System.out.println("ENTRADA INCORRECTA");

        }
        if (dia>=1&&dia<=7) {
            System.out.println("dia: " + cadena);
        }
    }

}
