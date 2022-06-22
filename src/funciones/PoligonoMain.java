package funciones;

import libreria.MisFunciones;

public class PoligonoMain {

    public static void main(String[] args) {

        Poligono[] vector = new Poligono[100];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = new Poligono(Poligono.numeroAleatorioLados(),Poligono.numeroAleatorioLongilado());

        }
        System.out.printf("%10s%10s%20s%10s%10s\n", "N", "LADOS", "TIPODEPOLIGONO", "LONGITUD", "PERIMETRO");
        System.out.printf("%10s%10s%20s%10s%10s\n", "-", "-----", "--------------", "--------", "---------");

        Poligono x = null;
        for (int i = 0; i < vector.length; i++) {
            x = vector[i];
            System.out.printf("%10d%10d%20s%10.2f%10.2f\n", (i + 1), x.getCantilados(), x.tipoPoligono() ,x.getLongilado(), x.perimetro());

        }

    }

}
