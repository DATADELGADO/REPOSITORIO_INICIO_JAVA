package src;

public class Vector4 {

    public static void main(String[] args) {

        int n = (int) (Math.random() * 6 + 5);
        int[] v = new int[n];
        int mayor = -99999;
        int menor = 99999;
        System.out.println("el tamaño del vector es: " + n);

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100 + 1);
            System.out.println("v[" + i + "]: " + v[i]);
            if (v[i] >= mayor) {
                mayor = v[i];
            }
            else if (v[i] <= menor) {
                menor = v[i];

            }
        }

        System.out.println("el mayor es: " + mayor);
        System.out.println("el menor es: " + menor);

    }

}
