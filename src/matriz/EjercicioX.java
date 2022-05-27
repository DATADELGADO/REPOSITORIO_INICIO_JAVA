package matriz;

public class EjercicioX {

    public static void main(String[] args) {
        int esp = 1, esp1 = 17, esp2 = 9, esp3 = 1;
        for (int i = 1; i <= 19; i++) {
            if (i <= 10) {
                for (int j = 1; j <= esp; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int e = 1; e <= esp1; e++) {
                    System.out.print(" ");
                }
                if (i < 10) {
                    System.out.print("*");
                }
                esp = esp + 1;
                esp1 = esp1 - 2;
                System.out.println();
            } else if (i > 10) {
                for (int j = 1; j <= esp2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int e = 1; e <= esp3; e++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                esp2 = esp2 - 1;
                esp3 = esp3 + 2;
                System.out.println();
            }
        }
    }
}
