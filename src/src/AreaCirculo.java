package src;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {
        double r, a;

        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese el radio? ");
        r = sc.nextDouble();
        a = Math.PI * Math.pow(r, 2); //esto es el cuadrado
        System.out.println("el area del circulo es: " + a);
        System.out.println("el area del circulo es: " + ((int) (a * 100)) / (double) 100);  //esto es para sacar solo los dos decimales

    }

}
