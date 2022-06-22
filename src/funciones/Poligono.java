package funciones;

public class Poligono {

    private int cantilados;
    private double longilado;

    public Poligono() {
    }

    public Poligono(int cantilados, double longilado) {
        this.cantilados = cantilados;
        this.longilado = longilado;
    }

    public int getCantilados() {
        return cantilados;
    }

    public void setCantilados(int cantilados) {
        this.cantilados = cantilados;
    }

    public double getLongilado() {
        return longilado;
    }

    public void setLongilado(double longilado) {
        this.longilado = longilado;
    }

    @Override
    public String toString() {
        return "Poligono{" + "cantilados=" + cantilados + ", longilado=" + longilado + '}';
    }

    public double perimetro() {
        double peri = this.cantilados * this.longilado;
        return peri;
    }

    public String tipoPoligono() {
        String nombre = "";
        if (this.cantilados == 3) {
            nombre = "TRIANGULO";
        }
        if (this.cantilados == 4) {
            nombre = "CUADRADO";
        }
        if (this.cantilados == 5) {
            nombre = "PENTAGONO";
        }
        if (this.cantilados == 6) {
            nombre = "HEXAGONO";
        }
        if (this.cantilados == 7) {
            nombre = "HEPTAGONO";
        }
        if (this.cantilados == 8) {
            nombre = "OCTAGONO";
        }
        if (this.cantilados == 9) {
            nombre = "NONAGONO";
        }
        if (this.cantilados == 10) {
            nombre = "DECAGONO";
        }

        return nombre;
    }

    public static int numeroAleatorioLados() {
        return (int) (Math.random() * 8 + 3);
    }

    public static int numeroAleatorioLongilado() {
        return (int) (Math.random() * 16 + 5);
    }
}
