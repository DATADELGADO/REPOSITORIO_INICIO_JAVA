package matriz;

import java.util.Scanner;

public class MatrizPiramide {

    public static void main(String[] args) {
        { //ejemplo 1
            int esp = 11;
            int as = 1;
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= esp; j++) {
                    System.out.print(" ");
                }
                for (int x = 1; x <= as; x++) {
                    System.out.print("*");
                }
                System.out.println();
                esp = esp - 1;
                as = as + 2;
            }

        } //fin ejemplo 1

        { //ejemplo 2
            int esp = 10;
            int as = 1;
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= esp; j++) {
                    System.out.print(" ");
                }
                for (int x = 1; x <= as; x++) {
                    System.out.print("* ");
                }
                System.out.println();
                esp = esp - 1;
                as = as + 1;
            }

        } //fin ejemplo 2

        {//ejemplo 5
            int esp1 = 2;
            int as1 = 9;
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= esp1; j++) {
                    System.out.print(" ");
                }
                for (int x = 1; x <= as1; x++) {
                    System.out.print("* ");
                }
                System.out.println();
                esp1 = esp1 + 1;
                as1 = as1 - 1;
            }
        } //fin ejemplo 5

        {//ejemplo 3
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese el lado: ");

            int la = sc.nextInt();
            for (int i = 1; i <= la; i++) {
                for (int j = 1; j <= la; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        } //fin ejemplo 3

        {//ejemplo 4
            int esp = 10;
            int as = 1;
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= esp; j++) {
                    System.out.print(" ");
                }
                for (int x = 1; x <= as; x++) {
                    System.out.print("* ");
                }
                System.out.println();
                esp = esp - 1;
                as = as + 1;
            }
        }//fin ejemplo 4

       
    }
    }


