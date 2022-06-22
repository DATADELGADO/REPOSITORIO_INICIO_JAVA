package colecciones;

import java.util.ArrayList;
import java.util.List;

public class Coleccion1 {

    public static void main(String[] args) {
        int[] x = new int[100];
        Triangulo[] y = new Triangulo[100];

        ArrayList<Triangulo> triangulo_a1 = new ArrayList<Triangulo>();

        for (int i = 0; i < 100; i++) {
            Triangulo c = new Triangulo(i);
            triangulo_a1.add(c);
        }

        List<String> nombreclientes_a1 = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {

            nombreclientes_a1.add("nombre" + i);

        }

        for (int i = 0; i < nombreclientes_a1.size(); i++) {
            String n = nombreclientes_a1.get(i);
            System.out.println(n);
        }

    }
}
