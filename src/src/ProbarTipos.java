package src;

public class ProbarTipos {

    public static void main(String[] args) {
        double x = 2.345252525;
        int y = (int) x;
        double z = x - y;
        double m = (int) (x * 100);
        double t = ((int) (x * 100)) / ((double) 100);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("m = " + m);
        System.out.println("t = " + t);

    }

}
