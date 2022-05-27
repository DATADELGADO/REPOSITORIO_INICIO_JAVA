package Condicional_multiple;

import java.util.Scanner;

public class Switch4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("indique una letra: ");
        String letra = sc.next().toLowerCase();
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("es vocal");
                break;
            case "q":
            case "w":
            case "r":
            case "t":
            case "y":
            case "p":
            case "s":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "ñ":
            case "z":
            case "x":
            case "c":
            case "v":
            case "b":
            case "n":
            case "m":
                System.out.println("es consonante");
                break;
            default:
                System.out.println("ENTRADA INCORRECTA");

        }

    }

}
