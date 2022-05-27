package Condicional_multiple;

import java.util.Scanner;

public class Switch4otro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una letra ? ");
        String letra = sc.next().toLowerCase();
        char x = letra.charAt(0);
        String er0 = "[A-Za-z]|[\u00f1]";  //letra = a
        String er1 = "[abc]";
        String er2 = "[0-9]";
        String cadena = "";
        boolean y = letra.matches(er0);
        if (y == true) {
            switch (letra) {
                    
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    cadena = "vocal";
                    break;

                default:
                    cadena = "consonante";

            }
            System.out.println(cadena);

        }else{
            System.out.println("no es una letra");
        }
    }
}
