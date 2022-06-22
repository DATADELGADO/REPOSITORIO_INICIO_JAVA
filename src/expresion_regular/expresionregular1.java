package expresion_regular;

import java.util.Scanner;

public class expresionregular1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");//UTF-8

        String scadena;
        String erl = "[a-zA-Z\u00F1\u00D1]|[áéíóúÁÉÍÓÚ]";
        String erv = "[aeiouAEIOUáéíóúÁÉÍÓÚ]";

        do {
            System.out.print("Ingrese cadena?: ");
            String cadena = sc.next();
            String letra = cadena.charAt(0) + "";
            if (cadena.matches(erl)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        } while (true);
    }

}
