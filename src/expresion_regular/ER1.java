package expresion_regular;

import java.util.Scanner;

public class ER1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sn1, sn2;
        double n1, n2, r;
        boolean correcto;
        String er = "[0-9]+\\.[0-9]+";
        do {
            System.out.println("Ingrese numero real 1? ");
            sn1 = sc.next();
            correcto = sn1.matches(er);
            if (!correcto) {
                System.out.print("numero no valido");
            }
        } while (correcto == false);

        do {
            System.out.println("Ingrese numero real 2? ");
            sn2 = sc.next();
            correcto = sn2.matches(er);
            if (!correcto) {
                System.out.print("numero no valido");
            }
        } while (correcto == false);
        n1 = Double.parseDouble(sn1);
        n2 = Double.parseDouble(sn2);
        r = n1 + n2;
        System.out.println("suma: "+ r);

    }

}
