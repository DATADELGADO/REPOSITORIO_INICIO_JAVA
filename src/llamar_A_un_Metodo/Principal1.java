package llamar_A_un_Metodo;

public class Principal1 {

    public static void main(String[] args) {
        double n1 = 45.3;
        double n2 = 10;
        double r = sumar(n1, n2);
        System.out.println("Suma: " + r);
        System.out.println("Suma: " + sumar(n1, n2)); // llamar a una funcion dentro de la misma clase
        System.out.println("Suma: " + MisMetodos.sumar(n1, n2)); //llamar una funcion de otra clase dentro del mismo paquete
        System.out.println("Suma: " + libreria.MisFunciones.sumar(n1, n2)); // llamar una funcion de otra clase de otro paquete

        sumar2(n1, n2); //esto es metodo void no retorna nada y hay que invocarlo si o si
        MisMetodos.sumar2(n1, n2);
        libreria.MisFunciones.sumar(n1, n2);

        ejercicio16();

    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static void sumar2(double n1, double n2) {
        System.out.println("Suma: " + (n1 + n2));
    }

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

}
