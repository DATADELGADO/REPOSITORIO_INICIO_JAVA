package practicando;

import practicando.examen.salon;

public class ClaseDentroDeOtraClase {

    public static void main(String[] args) {
        examen mi = new examen();
        mi.imprimir();
        int c = mi.suma(2, 5, "franco");

        System.out.println(c);
        double r = mi.retornaRaizCuadrada(16);
        System.out.println(r);

        /*ClaseExterna objetoExterno=new ClaseExterna();
          ClaseExterna.ClaseInterna objetoInterno= objetoExterno.new ClaseInterna();*/
        examen salon1 = new examen();
        examen.salon salon2 = salon1.new salon("Steven");

        System.out.println(salon2.gettera());

    }

}

class examen {

    public void imprimir() {
        System.out.println("steven en su moto");
    }

    public int suma(int a, int b, String g) {
        return a * b;
    }

    public double retornaRaizCuadrada(double a) {
        double r = Math.sqrt(a);
        return r;
    }

    public salon objeto() {
        return new salon("Steven");
    }

    public class salon {

        private String a;

        public salon(String pa) {
            a = pa;
        }

        public String gettera() {
            return a;
        }
    }

}
