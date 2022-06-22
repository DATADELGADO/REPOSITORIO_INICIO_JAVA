package ejercicios;

import java.util.Scanner;

public class Paella {

    private int cantidadPersonas;
    private double precioArroz;
    private double precioGmbas;

    public Paella() {
    }

    public Paella(int cantidadPersonas, double precioArroz, double precioGmbas) {
        this.cantidadPersonas = cantidadPersonas;
        this.precioArroz = precioArroz;
        this.precioGmbas = precioGmbas;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public double getPrecioArroz() {
        return precioArroz;
    }

    public void setPrecioArroz(double precioArroz) {
        this.precioArroz = precioArroz;
    }

    public double getPrecioGmbas() {
        return precioGmbas;
    }

    public void setPrecioGmbas(double precioGmbas) {
        this.precioGmbas = precioGmbas;
    }

    @Override
    public String toString() {
        return "Entrada{" + "cantidadPersonas=" + cantidadPersonas + ", precioArroz=" + precioArroz + ", precioGmbas=" + precioGmbas + '}';
    }

    public static double entradaC() {
        System.out.print("Ingrese cantidad de comensales?: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static double entradaA() {
        System.out.print("Ingrese el precio por kilo del arroz?: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static double entradaG() {
        System.out.print("Ingrese el precio por kilo de las gambas?: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public void respuesta() {
        double cantidadArroz = this.cantidadPersonas * (0.5 / 4);
        double cantidadGambas = this.cantidadPersonas * (0.25 / 4);
        double precioA = this.precioArroz * cantidadArroz;
        double precioG = this.precioGmbas * cantidadGambas;
        double total = precioA + precioG;

        System.out.printf("%15d%15.2f%15.2f%20.2f%20.2f%20.2f%20.2f%15.2f\n", cantidadPersonas, cantidadArroz, cantidadGambas, precioArroz, precioGmbas, precioA, precioG, total);

    }

}
