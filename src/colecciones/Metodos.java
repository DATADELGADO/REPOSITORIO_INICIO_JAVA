package colecciones;

public class Metodos {

    public static String nombreAleatorio() {
        String[] nombre = {"Luis", "Miguel", "Carmen", "Carlos", "Arturo"};
        int aleatorio = (int) (Math.random() * 5);
        return nombre[aleatorio];
    }

    public static double estaturaAleatorio() {
        double[] estatura = {1.65, 1.66, 1.67, 1.68, 1.69, 1.70, 1.72, 1.72, 1.73};

        int aleatorio = (int) (Math.random() * 9);
        return estatura[aleatorio];
    }

    public static int edad() {
        int aleatorio = (int) (Math.random() * 31 + 15);
        int edad = aleatorio;
        return edad;
    }
}
