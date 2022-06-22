package coleccion_treeset;

import java.util.TreeSet;

public class Principal2 {

    public static void main(String[] args) {
        TreeSet<Integer> numero_ts = new TreeSet<Integer>();
        for (int i = 0; i < 300; i++) {
            numero_ts.add(aleatorio());
        }
        int c = 0;
        for (Integer x : numero_ts) {
            System.out.println("(" + (++c) + ")" + x);
        }
    }

    public static int aleatorio() {
        return (int) (Math.random() * 901 + 100);
    }

}
