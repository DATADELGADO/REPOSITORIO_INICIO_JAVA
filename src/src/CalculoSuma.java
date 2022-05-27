package src.Tipos;

import java.util.Scanner; //libreria

public class CalculoSuma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, s;
        System.out.print("ingresar el numero 1?");
        n1 = sc.nextDouble();
        System.out.print("ingresar el numero 2?");
        n2 = sc.nextDouble();
        s = n1 + n2;
        System.out.println("el resultado es: " + s);
        

    }

}
