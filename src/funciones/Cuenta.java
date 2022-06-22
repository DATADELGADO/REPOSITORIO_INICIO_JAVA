package funciones;

public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta() {
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;

        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "El titular " + this.titular + " tiene " + this.cantidad + " euros en su cuenta";
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = this.cantidad + cantidad;
        }else {
            this.cantidad = this.cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad < this.cantidad) {
            this.cantidad = this.cantidad - cantidad;
        } else {
            this.cantidad = 0;
        }

    }

}
