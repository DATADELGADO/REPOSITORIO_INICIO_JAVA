package ejercicios;

public class MisEjercicios {

    public static void ejercicio16() {
        int a = 5;
        System.out.println((a % 2 == 0) ? "PAR" : "IMPAR");  //verdadero : falso
    }

    public static void ejercicio17() {
        int n = 2000;
        int semanas = n / 168;
        int rs = n % 168;
        int dias = rs / 24;
        int rd = rs % 24;
        int horas = rd;
        System.out.println(semanas + " Semanas");
        System.out.println(dias + " Días");
        System.out.println(horas + " Horas");

    }

    public static void ejercicio17_1() {

        int h = 1000;

        int s = h / 168;
        int d = h % 168 / 24;
        int ho = h % 24;

        System.out.println(h + " horas equivalen a");
        System.out.println(s + " Semanas ");
        System.out.println(d + " Días ");
        System.out.println(ho + " Horas ");

    }

    public static void ejercicio17_2() {
        System.out.printf("%5s%14s%10s%10s%10s\n", "N", "CANTIDAD H", "SEMANAS", "DIAS", "HORAS");
        System.out.printf("%5s%14s%10s%10s%10s\n", "-", "----------", "-------", "----", "-----");

        for (int i = 0; i < 100; i++) {
            int aleatorio = (int) (Math.random() * 4001 + 1000);
            Ejercicio17_3 objeto = new Ejercicio17_3(aleatorio);
            int[] x = objeto.getSemanasDiasHoras();
            System.out.printf("%5d%14d%10s%10s%10s\n", (i + 1), aleatorio, x[0], x[1], x[2]);

        }
    }

}
