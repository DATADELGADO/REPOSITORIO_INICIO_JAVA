package ejercicios;

import java.util.ArrayList;

public class Ejercicio15Main {

    public static void main(String[] args) {

        {//ejemplo tradicional
            Paella[] x = new Paella[3];

            for (int i = 0; i < x.length; i++) {
                x[i] = new Paella((int) (Paella.entradaC()), Paella.entradaA(), Paella.entradaG());
            }
            System.out.printf("%15s%15s%15s%20s%20s%20s%20s%15s\n", "COMENSALES", "CANT.ARROZ", "CANT.GAMBAS", "PRECIO/KG ARROZ", "PRECIO/KG GAMBAS", "SUBTOTAL ARROZ", "SUBTOTAL GAMBAS", "TOTAL");
            System.out.printf("%15s%15s%15s%20s%20s%20s%20s%15s\n", "----------", "----------", "-----------", "---------------", "----------------", "--------------", "---------------", "-----");
            for (int i = 0; i < x.length; i++) {
                x[i].respuesta();

            }

        }//fin ejemplo tradicional

        {//ejemplo forEach
            Paella[] x = new Paella[3];

            for (int i = 0; i < x.length; i++) {
                x[i] = new Paella((int) (Paella.entradaC()), Paella.entradaA(), Paella.entradaG());
            }
            System.out.printf("%15s%15s%15s%20s%20s%20s%20s%15s\n", "COMENSALES", "CANT.ARROZ", "CANT.GAMBAS", "PRECIO/KG ARROZ", "PRECIO/KG GAMBAS", "SUBTOTAL ARROZ", "SUBTOTAL GAMBAS", "TOTAL");
            System.out.printf("%15s%15s%15s%20s%20s%20s%20s%15s\n", "----------", "----------", "-----------", "---------------", "----------------", "--------------", "---------------", "-----");
            for (Paella i : x) {
                i.respuesta();

            }

        }//fin ejemplo forEach

        {//ejemplo ArrayList
            ArrayList<Paella> x = new ArrayList<Paella>();

            for (int i = 0; i < 3; i++) {
                x.add(new Paella((int) (Paella.entradaC()), Paella.entradaA(), Paella.entradaG()));
            }
            System.out.printf("%15s%15s%15s%20s%20s%20s%20s%15s\n", "COMENSALES", "CANT.ARROZ", "CANT.GAMBAS", "PRECIO/KG ARROZ", "PRECIO/KG GAMBAS", "SUBTOTAL ARROZ", "SUBTOTAL GAMBAS", "TOTAL");
            System.out.printf("%15s%15s%15s%20s%20s%20s%20s%15s\n", "----------", "----------", "-----------", "---------------", "----------------", "--------------", "---------------", "-----");
            for (Paella i : x) {
                i.respuesta();

            }

        }//fin ejemplo ArrayList

    }

}
