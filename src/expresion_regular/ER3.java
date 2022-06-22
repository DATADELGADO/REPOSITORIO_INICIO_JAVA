
package expresion_regular;

import java.util.Scanner;


public class ER3 {

   
    public static void main(String[] args) {
        {
           Scanner sc = new Scanner(System.in);
        String sn1, sn2;
        double n1, n2, r;
        boolean correcto;
        String er = "([0-9]+\\.[0-9]+)||[0-9]"; //esto significa real o entero
        do {
            System.out.println("Ingrese numero real 1? ");
            sn1 = sc.next();
            correcto = sn1.matches(er);
            if (!correcto) {
                System.out.print("numero no valido");
            }
        } while (correcto == false);
        }
        
        
        
        {
            
           Scanner sc = new Scanner(System.in);
        String sn1, sn2;
        double n1, n2, r;
        boolean correcto;
        String er = "(20)[0-4][0-9](2050)"; //validar una cadena del 2000 al 2050
        do {
            System.out.println("Ingrese numero real 1? ");
            sn1 = sc.next();
            correcto = sn1.matches(er);
            if (!correcto) {
                System.out.println("numero no valido");
            }
        } while (correcto == false);
        
        
        
        
        }
    }
    
}
