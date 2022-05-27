package src;

import java.util.Scanner;

public class BucleWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        {//ejemplo1
            double n;
            int i = 1;
            System.out.print("ingrese n: ");
            n = sc.nextDouble();

            while (i <= n) {
                System.out.print(i);
                i++;
            }
        }

        {//ejemplo2
            int n;
            int i = 1;
            System.out.print("ingrese n: ");
            n = sc.nextInt();

            while (i <= n) {
                System.out.print(i);
                i++;
                if (i == (n + 1)) {
                    break;
                }
            }
        }

    }

}
